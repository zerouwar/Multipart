# maven multi-wars project
maven的一个多war结构项目，每一个模块都是一个war，适合团队开发和增量模型开发，另外因为模块之间耦合度很低，可以做到模块的热插拔（只需要在打包配置中取消打包就好）。
project本身只负责全局的依赖管理和作为install的目录。<br/>
## 每个模块的功能说明
*main-module*:负责项目的启动的核心环境的配置，例如spring配置等<br/>
***
*run-config*:不存放任何代码，只在pom.xml中配置打包和运行，这里需要用jrebel和jetty配合来支持开发，否则每次更改代码都需要install才能更新到改变，这样效率太低。<br/>
***
*demo-war*:用作演示的一个模块，这里有一个Controller，如果运行没问题，这个Controller应该是可用的。另外在main-module里面我引用了demo-war的controller，以演示模块之间如何引用。<br/>
***
## 运行注意
首次运行需要在project根目录下执行install安装到maven仓库中，然后到run-config模块下执行jetty:run，默认端口是8081，就可以用jetty插件运行了。但是这样做每次做出更改都必须到project根目录install一次，非常低效，因此用jrebel来做热部署，这样只需要install一次，以后都用jrebel运行。
