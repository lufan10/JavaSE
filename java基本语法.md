#今日内容
	* 1.基本的入口语法
	* 2.注释、变量命名和变量
	* 3.运算符
	* 4.流程控制语句
	* 5.函数
	* 6.异常处理

## 基本的入口语法
	package 包名;
	public class 类名 {
	    public static void main(String[] args) {

	        System.out.println("Hello World!");
	
	    }
	}

## 注释、变量命名
	* 注释
		* 双斜杠为单行注释
		* /*- 注释内容-*/为多行注释
		* 斜杠星星回车为DOC文档注释(写在class或方法上方)
		* 多行快速注释的快捷键：ctrl+/
	* 变量命名＿
		①：关键字不能用作变量名，变量名/对象名不得重复
		②：首次必须声明变量吿/对象名的类型
		③：采用驼峰式命名变量名/对象吿 例如：myAge、myAgeName

## 变量：指一小块存储数据的内存空间
	#语法格式：
		* 变量数据类 变量名=初始值; 
		* 变量数据类 变量名; 
		* 访问修饰符 变量数据类 变量名; 
		* static 变量数据类 变量名; 
	# 变量的作用域
		* 定义在类中的变量作用范围是整个类。
   		* 如果在类中的变量和在方法内部的变量重名，优先打印方法内部的变量
   		* 定义在方法内部的变量，作用范围只在方法内部，外部无法访问
   		* 自定义的方法需要在main方法或在Junit单元测试中打印
##运算符：
	#1.一元运算符：
		*++ -- +(正号) -(负号)
		*++(--)在前，先自增(自减)，然后才运算   
			例如 int m=3;
		        int b=++m;
		        System.out.println(m); // 4
		        System.out.println(b); // 4
		*++(--)在后，先赋值运算，后自增(自减)
			例如 int m=3;
		        int b=m++;
		        System.out.println(m); // 3
		        System.out.println(b); // 4
	#2.算术运算符：
		 + - * / %(取余)
			例如：	int a=3;
					int b=2;
					System.out.println(a+b); //5
					System.out.println(a%b); //1
	#3.赋值运算符：
		 = += —=
	
	#4.比较运算符：返回类型是boolean  true/false
		 > < >= <= == 

	#5.逻辑运算符：
		* &&： 与 一假全假
		* ||：或 一真全真
		* ！：非 非真则假，非假则真

## 流程控制语句：
	# 选择结构：
		#1.if结构:
			简单if结构:判断同一种参数的相反情况
				if---else   	
			多重if结构：判断同一种参数的多种不同情况，非同一种参数而不入(另写一组简单if结构)
				if--if else   
			嵌套if结构：if--if else
								
		
		#2.switch:
			*switch(变量){
				case 值：
				//代码
				break;
			}
			* 在java中，switch语句可以接收的数据类型：byte int shor char,枚举，String
			
	# 循环结构	
		# while:
			*while(条件){
				//代码
			}
	 	# for:
			*for(int i=1,i<=100,i++){
				//代码
		}
	# 停止循环：为了获取一次所需求的数据而停止当前循环
		* break：首次获取所需求的数据后，永远的终止了继续下一次循环

## 函数：
	* 定义
		* 空参静态方法：
			* 访问修饰符 static 返回类 方法名(){ //方法体 }
		* 有参静态方法
			* 访问修饰符 static 返回类 方法名(类名 变量/对象名,---){ //方法体 }
		* 非静态方法
			* 访问修饰符  返回类 方法名(){ //方法体 }
		* 抽象方法
			* 访问修饰符 abstract 返回类 方法名(); //无方法体
	* 访问修饰符
		* public 公共的
		* private 私有的
		* protected 受保护的
		* friendly 未定义修饰符
	* 返回值类型(返回类)
		* 无返回类：void---------使用情况：只需要结果
		* 有返回类：-------------使用情况：需要对结果再进行其它操作
			* Object---是所有类的父类
				* 变量数据类
				* 对象类
				* -----
			* 方法体中必须有return关键字
				* return+输出参数;
	* 方法名与方法体：采用驼峰式命名，其方法名与方法体相呼应。
	* 参数：
		* 是对变量值/常量的封装，
		* 写参数时需要对参数声明其类型
		* 多个参数用","隔开		 

	* 调用方法：
		* 在本类中调用
			* 方法名();
		* 不在一个包中的调用，需导包，需要创建类的对象。
			* 对象名.方法名(); //针对非静态方法
				* 判断方法是否有返回值，有则创建返回类的对象。
				* 判断方法是否要传参，若有则按形参顺序传参。
				* 判断方法是否有异常，若有则要用try/catch包围或添加到方法签名。

			* 类名.方法名(); //针对静态方法
		# 递归：调用方法本身

## 异常处理
		1.用try/catch-finally包围
		2.添加异常到方法签名:其形式是 方法名()+throws+异常签名{}
		3.自定义抛出异常:throw
			例如： public void pwd(){
				        Scanner s=new Scanner(System.in);
				        System.out.println("请输入你设置的密码（长度必须为6位）：");
				        String pwd=s.next();
						if (pwd.length()==6){
				            System.out.println("密码设置成功！");
						}else {
				            System.out.println("密码设置失败（长度必须为6位）！");
				
				            try {
				                throw new Exception("密码长度必须为6位");//自定义异常
				            } catch (Exception e) {
				                e.printStackTrace();
				            }
				        }
					}

		4.Exception:异常层次结构的父类

/**
 *   程序调试
 *   1.确定断点 并运行(shift+window):double money=1.0;
 *   2.打开调试器窗口：shift+f9
 *   3.多次步过：f8
 */ 
		double money=1.0;
        for (int i=1;i<10;i++){
            money *= 1.5;
        }
        System.out.println("50年后，我有"+money+"万");