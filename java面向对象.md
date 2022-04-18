## 概念：
	* 1.对象的定义：属性和方法是对象的基本构成。
	* 2.类的定义：特定的对象具有的共同特征和行为。
	* 3.创建类的对象：
		* 类名 对象名=new 类名();
		# 静态方法无需创建类的对象，直接用类名调用方法即可。
	* 4.使用类的方法：
		* 对象名.方法名(); //针对非静态方法
			* 判断方法是否有返回值，有则创建返回类的对象。
			* 判断方法是否要传参，若有则按要求传参。
			* 判断方法是否有异常，若有则要用try/catch包围或添加到方法签名。

		* 类名.方法名(); //针对静态方法

## 类的封装：-----对属性进行控制管理
	* 1.描述私有的成员变量
	* 2.构造成员变量的构造方法和无参构造方法
	* 3.setter/getter方法
	* 4.to String方法
	* 5.成员方法

## 将Sysprep项目打包成.jar文件的方法：
	 *	在eclipse中右键项目名--Export--Java--JAR file--next--保存位置--ok
	 *  Sysprep.jar文件的应用方法：
	 *  在idea中右键章节模块名--新建--目录--lib
	 *  将Sysprep.jar文件复制到lib目录下
	 *  右键Sysprep.jar文件--添加为库：就能调用Sysprep.jar文件中类的属性和方法。

## 类的继承：
	* 继承：编写父类：定义公共属性和方法
	* 编写子类特有的属性和方法，并继承父类（无private）属性和方法
		
	* 方法重写：子父的方法同名，子类对其具体化。
	
		*   extents关键字：子类继承父类  例如：public class Dog extents Animal{}
		*   implements关键字：子类继承接口类 例如：public class cellPhone implements Mp3,Mp4{}
		
		*   super关键字：手动调用父类的构造方法，形成子类的构造方法。 例如：
				*   public Dog(String name, int age, String color, String type) {
				*         super(name, age, color, type);
				*   }
		*   final关键字：
					*   1.写在修饰符前，其父类不能被继承；其方法不被子类重写。
					*   2. 写在变量类前，其变量的值不能改变。
	
		*   Object类：是所有类的最终父类，所有类都默认的继承Object类
		*
		*   抽象类：
				* 父类被抽象化了，不能实列化对象，只能被子类继承。
					* 例如：public abstract class Animal{}
				* 父类定义了抽象方法后，子类(没有被抽象时)必须实现方法重写 
					* 例如：public abstract void eat();
		
		*  接口类：
			*  1.属性：全局静态常量
			*  2.方法：必须是public抽象方法
			*  3.无构造方法且不能实例化对象

## 类的多态：发送消息给某个对象，让该对象自行决定响应何种行为。
		Master master=new Master();
        Dog dog=new Dog();
        Cat cat=new Cat();//向上转型（子为父用）

        master.feed(dog);
        master.feed(cat);
		