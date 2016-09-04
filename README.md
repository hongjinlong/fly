# fly


waht is the funny thing you doing...



git操作参考：


1.git clone新项目		git clone git clone github.com/hongjinlong/fly.git
2.git添加新文件和文件夹	
					git add .  （强当前文件夹下面的内容添加到本地仓库）
					git commit -m "init project" （提交到本地参考的head版本，引号里面的是注释）
3.项目提交服务器			git push -u origin master


项目合并			git merge origin master
git项目关联		git remote add origin github.com/hongjinlong/fly.git
查看关联是否成功		git remote -v		
查看当前项目的状态	git status		

问题：
1.提交问题：本地代码改变后无法 git pull	
	解决： 用 git stash 命令隐藏当前本地改变	再 git pull 在此基础上更改 
	再用git unstash可以恢复本地隐藏
	
	
	
	
创建maven工程无法创建src/main/java资源文件夹
  
  	第一种方法： 打开项目的classpath文件， 会出现path属性为：src/main/java的classpathentry节点，这时删除我们需要新建的的节点就可以，比如 <classpathentry kind="src" path="src/main/java"/>。在Java Resources下重新建立src/main/java文件夹，就不会出现问题了。
  	第二种方法：这是最便利的一种。在项目上右键选择properties，然后点击java build path，在Librarys下，编辑JRE System Library，选择workspace default jre就可以了。
	
	
	
创建Web工程，使用eclipse创建maven web工程 

1.
	右键项目,选择Project Facets,点击Convert to faceted from 
2.
	更改Dynamic Web Module的Version为2.5.(3.0为Java7的,Tomcat6不支持). 
	如果提示错误,可能需要在Java Compiler设置Compiler compliance level 为1.6 .
	或者需要在此窗口的Java的Version改成1.6. 
3.
	点击下面的Further configuration available…，弹出Modify Faceted Project窗口 
	此处是设置web.xml文件的路径,输入src/main/webapp. 
	Generate web.xml deployment descriptor自动生成web.xml文件,可选可不选. 
4.
	点击OK 
5.
	设置部署程序集(Web Deployment Assembly) 
6.
	在右键项目打开此窗口.在左侧列表中会出现一个Deployment Assembly,点击进去后 
7.
	删除test的两项,因为test是测试使用,并不需要部署. 
8.
	设置将Maven的jar包发布到lib下. 
	Add -> Java Build Path Entries -> Maven Dependencies -> Finish 

完成后有: 
/src/main/webapp    / 
/src/main/java      /WEB-INF/classes 
/src/main/resources /WEB-INF/classes 
Maven Dependencies  /WEB-INF/lib 
好了，这样就把一个maven项目转化成web项目了。
	
	