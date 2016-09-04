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
	
	