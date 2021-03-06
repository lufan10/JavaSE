## 概念：
	* 1.对象的定义：属性和方法是对象的基本构成,是真实存在的具体实例。
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
	* 5.对象内存图：
		* 首先在方法区依次加载class文件/main方法/其他方法，
		* 其次将main方法提取到栈内存中运行并分配变量空间。
		* 又将在堆内存中new出来的对象空间交给栈区的变量空间并让栈区变量空间指向对象空间地址。
		* 在堆区对象空间内又有指向成员变量的属性空间和方法引用地址并链接方法区中的其他方法。
	* 6.垃圾回收:
		* 当堆内存中的类对象或数组对象，没有被任何变量引用（指向）时，就会被判定为内存中的“垃圾”
		*  Java存在自动垃圾回收器，会定期进行清理。
## 构造器
	1.构造器的作用？
		⚫ 初始化类的对象，并返回对象的地址。
	2.构造器有几种，各自的作用是什么？
		⚫ 无参数构造器：初始化的对象时，成员变量的数据均采用默认值。
		⚫ 有参数构造器：在初始化对象的时候，同时可以为对象进行赋值。
	3.构造器有哪些注意事项？
		⚫ 任何类定义出来，默认就自带了无参数构造器，写不写都有。
		⚫ 一旦定义了有参数构造器，无参数构造器就没有了，此时就需要自己写无参数构造器了。

## this关键字
	* 作用：出现在成员方法、构造器中代表当前对象的地址，用于访问当前对象的成员变量、成员方法。
	* 实列：
	public class Car {
		String name;
		double price;
		public void goWith(String name){
			System.out.println(this.name + "正在和" + name + "一起比赛！！");
		}
	}


## 类的封装：-----对属性进行控制管理<<<<<形成一个标准JavaBean
	* 1.描述私有的成员变量
	* 2.构造成员变量的构造方法和无参构造方法
	* 3.setter/getter方法：暴露其取值和赋值
	* 4.to String方法:重写了Object类中to String方法,以便返回对象的内容而非地址
	* 5.成员方法

## 将Sysprep项目打包成.jar文件的方法：
	 *	在eclipse中右键项目名--Export--Java--JAR file--next--保存位置--ok
	 *  Sysprep.jar文件的应用方法：
	 *  在idea中右键章节模块名--新建--目录--lib
	 *  将Sysprep.jar文件复制到lib目录下
	 *  右键Sysprep.jar文件--添加为库：就能调用Sysprep.jar文件中类的属性和方法。
	 
## 成员变量和局部变量的区别：
	区别 			成员变量 		                          局部变量
	类中位置不同 		  类中，方法外 		                    常见于方法中
	初始化值不同 		有默认初始化值 		            没有，使用之前需要完成赋值
	内存位置不同 		堆内存 			                          栈内存
	生命周期不同 		随着对象的创建而存在，随着对象的消失而消失        随着方法的调用而存在，随着方法的运行结束而消失
	作用域                                                               在所归属的大括号中
## 静态关键字：static
	* 作用：
		* static是静态的意思，可以修饰成员变量和成员方法。
		* static修饰成员变量表示该成员变量只在内存中只存储一份，可以被共享访问、修改。
	* static修饰成员变量的内存原理:堆区的对象成员变量指向堆区的静态成员变量。
	* static修饰成员方法的内存原理:栈区的变量指向堆区对象空间地址，堆区的方法引用指向对应方法区的方法。
	* 定义工具类:
		* 建议工具类的构造器私有化处理。
		* 工具类不需要创建对象
	* static访问注意实现：
		1.静态方法只能访问静态的成员，不可以直接访问实例成员。
		2.实例方法可以访问静态的成员，也可以访问实例成员。
		3.静态方法中是不可以出现this关键字的。 
## static应用知识：代码块
	* 代码块概述
		代码块是类的5大成分之一（成员变量、构造器，方法，代码块，内部类），定义在类中方法外。
		在Java类下，使用 { } 括起来的代码被称为代码块 。
	* 静态代码块: 
		格式：static{}
		特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
		使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。
		
## static应用知识：单例设计模式
	* 饿汉单例设计模式:在用类获取对象的时候，对象已经提前为你创建好了。
	* 实列：public class SingleInstance { 
			//定义一个静态变量存储一个对象即可 :属于类，与类一起加载一次  
			public static SingleInstance instance = new SingleInstance ();  
			//单例必须私有构造器* 
			private SingleInstance (){      
				System.out.println("创建了一个对象"); 
			}
		}
	* 懒汉单例设计模式:在真正需要该对象的时候，才去创建一个对象(延迟加载对象)。
	* 实列：public class SingleInstance{  
			/** 定义一个静态变量存储一个对象即可 :属于类，与类一起加载一次 */
			public static SingleInstance instance ; // null
			/** 单例必须私有构造器*/   
			private SingleInstance(){}    
			/** 必须提供一个方法返回一个单例对象  */  
			public static SingleInstance getInstance(){   
				...    
				return ...;  
			}
		}

## 类的继承：
	* 继承：编写父类：定义公共属性和方法
	* 编写子类特有的属性和方法，并继承父类（无private）属性和方法
	* 继承的特点:
		1.子类可以继承父类的属性和行为，但是子类不能继承父类的构造器。
		2.Java是单继承模式：一个类只能继承一个直接父类。
		3.Java不支持多继承、但是支持多层继承。
	* 在子类方法中访问成员（成员变量、成员方法）满足：就近原则
	* 方法重写：子父的方法同名，子类对其具体化。
		* 建议重写方法都加@Override注解，代码安全，优雅！
		* 重写方法有哪些基本要求？
			1.重写方法的名称和形参列表应该与被重写方法一致。
			2.私有方法不能被重写。
			3.子类重写父类方法时，访问权限必须大于或者等于父类被重写的方法的权限

	
	*   extents关键字：子类继承父类  例如：public class Dog extents Animal{}
	

	*   super关键字：
		* 子类访问父类的成员:
			格式：super.父类成员变量/父类成员方法
		* 手动调用父类的构造方法，形成子类的构造方法。 例如：
			*   public Dog(String name, int age, String color, String type) {
			*         super(name, age, color, type);
			*   }
		* this.属性/方法：调用本类的属性/方法
		* this(...)和super(…)使用注意点：
			子类通过 this (...）去调用本类的其他构造器，本类其他构造器会通过 super 去手动调用父类的构造器，最终还是会调用父类构造器的。
			注意：this(…) super(…) 都只能放在构造器的第一行，所以二者不能共存在同一个构造器中。

	*   枚举的概述:是Java中的一种特殊类其作用："是为了做信息的标志和信息的分类"。
		* 定义枚举类的格式：
		 修饰符 enum 枚举名称{
            		第一行都是罗列枚举类实例的名称。
			}
		* 实列：enum Season{ 
				SPRING , SUMMER , AUTUMN , WINTER;
			}
		* 枚举的特征：
			枚举类都是继承了枚举类型：java.lang.Enum
			枚举都是最终类，不可以被继承。
			构造器都是私有的，枚举对外不能创建对象。
			枚举类的第一行默认都是罗列枚举对象的名称的。
			枚举类相当于是多例模式。

	*   final关键字：
			*   1.写在修饰符前，其父类不能被继承；其方法不被子类重写。
			*   2. 写在变量类前，其变量的值不能改变。

	*   Object类：是所有类的最终父类，所有类都默认的继承Object类
	*
	*   抽象类：只有方法签名，没有方法体，使用了abstract修饰

		* 父类被抽象化了，不能实列化对象，只能被子类继承。
			* 例如：public abstract class Animal{}
		* 父类定义了抽象方法后，子类(没有被抽象时)必须实现方法重写 
			* 例如：public abstract void eat();

	*  接口类：更抽象，体现规范思想。
	
		*  1.属性：全局静态常量
		*  2.方法：必须是public抽象方法
		*  3.无构造方法且不能实例化对象
		*  子类继承接口类 例如：public class cellPhone implements Mp3,Mp4{}
		*  多继承：interface A extends 接口B,接口C{} 
		
		* 接口的格式如下：
			public interface 接口名 {
			       // 常量
			       // 抽象方法
			} 
			
		* 新增接口方法：
			* 默认方法：default void run(){}
			* 静态方法：用接口名调用   static void inAdd(){}
			* 私有方法：在接口内部调用 private void go(){}


## 类的多态：同类型的对象，调用同一个行为，表现出不同的行为特征。
	* 多态的常见形式:
		父类类型 对象名称 = new 子类构造器;
		接口     对象名称 = new 实现类构造器;	
	* 多态下引用数据类型的类型转换:
		自动类型转换（从子到父)：Animal a=new Dog();
		强制类型转换吗（从父到子): Dog d =(Dog)a;
	* 强制类型转换能解决什么问题？强制类型转换需要注意什么。
		 1.可以转换成真正的子类类型，从而调用子类独有功能。
		 2.有继承关系/实现的2个类型就可以进行强制转换，编译无问题。
		 3.Animal animal = new Tortoise();//转型后的类型和对象真实类型不是同一种类型,出现异常 ClassCastException
		   Dog d = (Dog)a; 
		 4.Java建议强转转换前使用instanceof判断当前对象的真实类型，再进行强制转换
			if(animal instanceof Tortoise){
			//判断关键字左边的变量指向的对象的真实类型，是否是右边的类型或者是其子类类型，是则返回true，反之。
			//正常强转
			}else{
			//转换异常 animal instanceof Dog
			}
			
## 内部类
	* 形式：public class People{
			// 内部类
			public class Heart{
			}
		}
	* 内部类的使用场景:
		当一个事物的内部，还有一个部分需要一个完整的结构进行描述，
		而这个内部的完整的结构又只为外部事物提供服务，那么整个内部的完整结构可以选择使用内部类来设计。

	* 内部类的作用：
		内部类通常可以方便访问外部类的成员，包括私有的成员。
		内部类提供了更好的封装性，内部类本身就可以用private protectecd等修饰，封装性可以做更多控制。

## 匿名内部类：本质上是一个没有名字的局部内部类，定义在方法中、代码块中、调用方法的参数中等。

	* 格式：
	new 类|抽象类名|或者接口名() {
		重写方法;
	};
	Animal a = new Animal() {
		public void run() {
		}
	};
	a. run();
## Lambda表达式:简化函数式接口的匿名内部类的写法。其写法必须是接口的匿名内部类，接口中只能有一个抽象方法。
	* 先编写出匿名内部类，根据idea工具中异常提示自动修复生成Lamaba表达式
	* 格式：
	(匿名内部类被重写方法的形参列表) -> {
	被重写方法的方法体代码。
	}
	注：-> 是语法形式，无实际含义
	* lambda表达式的重要特征:
		1.可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
		2.可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
		3.可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
		4.可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定表达式返回了一个数值。
	* 体验Lambda表达式
		// 1. 不需要参数,返回值为 5  
		() -> 5   或   () ->System.out.print("hello world");  

		// 2. 接收一个参数(数字类型),返回其2倍的值  
		x -> 2 * x  

		// 3. 接受2个参数(数字),并返回他们的差值  
		(x, y) -> x – y  或 (int x, int y) -> x-y 

		// 4. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
			(String s) -> System.out.print(s);
			* 简化：System.out::println  快捷键：soutc

		// 5. 接受一个 string 对象,返回name.startsWith("鲁")
		(String name) -> {return name.startsWith("鲁");}




































		
