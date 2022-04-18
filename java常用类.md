## 1.变量数据类
	* 基本数据类型：保存在栈区，创建一个固定空间保存的基本数据类型
		①：数值型：
			* int(整型 占4个字节)、long(长整型)、short(短整型)、byte(字节型 占1个字节)
			* double(双精度 占8个字节)、float(单精度)
      		②：非数值型：char(字符型)、boolean(布尔值 true/false 占1个字节)
	* 随便写的整数、小数字面值默认什么类型？
		⚫ 23 ，默认是int类型 , 加上L/l就是long类型的数据了。
		⚫ 23.8，默认是double类型，加上F/f就是float类型了。

    * 引用数据类型 ：保存在堆区，创建一个可变空间保存的引用数据类型
	    * String(字符串) 
		    * 创建：String s="";
		    * 方法：
			    * "实参".equals(s); //返回一个boolean类型，判断字符串相等
			    * s.length(); //返回一个int类型,获取总共有多少个字符
			    * s.contains("a"); //返回一个boolean类型，用于判断s是否包含a
		    * 拼接：
			    * String s= ""+"";
			    * String s= ""+a+"";
		    * 正则表达式：
			    * 规则：
				    * 原子(匹配内容：用"\\+代号"转义表示)+元字符(匹配方式：用"{}"表示)
					    * \\w 匹配任意字母、数字和下划线
					    * [\u4e00-\u9fa5] 匹配中文字符
					    * {n} 匹配n个字符
					    * {n,m} 在n<=字符个数<=m范围之间(n和m其中一个可以省略，表示正无穷和负无穷)
			    * 创建
				    * 导入jar包  Sysprep.jar
				    * 静态方法无需创建，直接用类名RegExp调用
			    * 方法
				    * RegExp.mate("正则表达式", "字符串"); //字符串必须符合正则表达式的规则。
				    * RegExp.mateMany("正则表达式", "字符串"); //多组匹配
	    * null(空值)
		    *  null可以赋值给引用变量，不能将null赋值给基本类型变量
		    *  可以使用== 或者 != 操作来比较null值 ---解决空指针异常
	    *  包装类：将基本数据类型当作对象使用
		    *  Integer、Long、Short、Byte
		    *  Double、Float
		    *  Character、Boolean
		    
    * 数据类型转换：
	    * 1.整数转字符串：
		    * String s=12+"";
		* 2.字符串转整数：
			* Integer.parseInt(s); //返回一个int类型
		* 3.强制类型转换：
			* (要转换的数值类型)其他类型常量; //返回一个要转换的类型
	    * 为什么要进行类型转换？
		⚫ 存在不同类型的变量赋值给其他类型的变量
	    * 自动类型转换是什么样的？
		⚫ 类型范围小的变量，可以直接赋值给类型范围大的变量
		⚫ 最终类型由表达式中的最高类型决定。
		⚫ byte short char是直接转换成int类型参与运算的。
	    * 强制类型转换有哪些需要注意的？
		⚫ 可能出现数据丢失。
		⚫ 小数强制转换成整数是直接截断小数保留整数。
## 数组概念：
	* 用来存储相同的数据类型或对象类的一个容器
 	* 索引(下标)：对数组进行编号，从0开始。如：变量名[0]=元素1
 	* 数组的遍历：用循环的方式取出数组中每一个元素
	* 1.创建：
		* 基本数据类/对象类[] 变量名/对象名={元素1,元素2、、、、}；不变的静态初始化
		* 基本数据类/对象类[] 变量名/对象=new 数类/对象类[常量]; 可变空间的动态初始化

	* 2.方法：
		* 变量名/对象名.length; //返回一个int类型，获取数组长度(元素的总个数)
		* 变量名/对象名.length-1; //返回一个int类型，获取最大索引值。
		* 变量名/对象名[下标];  //返回一个int类型,获取下标为xx对应的元素。

	* 3.遍历：
			 	for (Object obj : 变量名/对象名) {
            		System.out.println(obj);
        		}

## 二维数组(多层嵌套数组)
	* 1.创建：
			* int[][] a=new int[3][2];//分配3个外层空间和2个内层空间
       		* int[][] b= {{2,3},{4,5},{6,7}};//声明二维数组

	* 2.方法：
		* 变量名[外层下标][内层下标];//返回一个int类型,获取下标为xx对应的元素
		* 变量名.length; //返回一个int类型，获取二维数组外层空间长度

	* 3.嵌套遍历：
		* for(int[]ints:b) {
				for(int x:ints) {
					System.out.println(x);
				}
		  }


## 集合概念：用来存储对象的容器，其对象只能是实体类或基本数据类型的包装类。

## ArrayList集合类：

	* 1.创建：  ArrayList<Object> al = new ArrayList<>(); //全局式泛型类集合
			* ArrayList<实体类/包装类...> al=new ArrayList<>(); //局部式泛型集合
	* 2.方法：
		* al.add(new 实体类()/包装类); 
			* //添加实体类或包装类对象
			# //当为全局式泛型类集合时，添加的多组对象元素类型可以不同。
			#  //当为局部式泛型集合时，添加的多组对象元素类型必须一致。
		* al.get(index); //返回一个实体类或包装类，通过索引获取对象元素
		* al.size(); //返回一个int类型，集合有多少个对象。
		* al.remove(stu2);   //移除某一个对象元素：
		* al.clear();  //清除集合的所有对象
		* al.isEmpty(); //返回一个boolean类型，判断集合是否为空
		* al.contains(stu3); //返回一个boolean类型，判断集合是否添加有对象stu3

	* 3.遍历：
		 for (Object obj : al) {
            System.out.println(obj);
        }

## HashSet、TreeSet集合类：TreeSet可实现数字(或字母)的升序排列
	* 1.创建：
			* HashSet<Object> hs=new HashSet(); //泛型集合
			* TreeSet<Object> ts=new TreeSet();
	* 2.方法：
		# 无get()方法
		* al.add();
		* al.size(); //返回一个int类型，集合有多少个对象。
		* al.remove(stu2);   //移除某一个对象元素：
		* al.clear();  //清除集合的所有对象
		* al.isEmpty(); //返回一个boolean类型，判断集合是否为空
		* al.contains(stu3); //返回一个boolean类型，判断集合是否添加有对象stu3
	* 3.遍历：
		 for (Object obj : al) {
            System.out.println(obj);
        }

## HashMap集合类
	* 1.创建：
			 HashMap<Object,Object> hm = new HashMap<>();
	* 2.方法：
		* hm.put(key,value);//添加字符串形式的键值对元素
		* hm.remove(key);//删除元素
		* hm.size();	//返回一个int类型，集合有多少个对象。
		* hm.isEmpty(); //返回一个boolean类型，判断集合是否为空
		* hm.containsKey(key||value);//返回一个boolean类型，判断是否包含key或value

	* 3.遍历键与值：
		*  for (Object key : hm.keySet()) {
           	 	System.out.println(key);
				String[] values = hm.get(key);
        		for (Object value : values) {
            		System.out.println(value);
				}
				System.out.println("==========");
        	}

##	迭代器遍历
	 *  使用Iterator迭代器遍历序列（其序列可以是不同类型的）静态的方法
	 *  用for-each 循环遍历序列（其序列必须是同类型的）
	 *  用for 循环遍历序列（针对序列的索引进行的）	
	 *  例如： public static void main(String[] args) {
			        HashSet hs=new HashSet();
			
			        hs.add("鲁凡");
			        hs.add(3);
			        hs.add("迪迦");
			        hs.add(5);
			
			
			        Iterator it=hs.iterator();
			//       hs.remove(3); //删除元素
			        System.out.println(hs.size());
			        while (it.hasNext()) {  //判断下一个是否有元素存在，若存在执行，否则中止程序
			            System.out.println(it.next()); //打印下一个元素
			        }
			
			    }
## System类：
	* 创建：静态方法无需创建直接用类名调用
	* 方法：
		* System.out.println(a); //打印输出变量a
		* System.exit(0); //强制退出java程序
## Scanner类：接收键盘输入
	* 创建：
		* Scanner s = new Scanner(System.in);
		
	* 方法：
		* s.next();      	//返回一个String类型，接收字符串类型的输入
		* s.nextInt();  	//返回一个int类型接收,整型类型的输入
		* s.nextDouble(); 	//返回一个double类型,接收浮点型类型的输入

## Random类：生成随机数
    * 创建：
	    *  Random r = new Random();
	* 方法：
		* r.nextDouble(); //返回一个double类型,随机生成0~1的浮点数
		* r.nextInt(10)+1;  //返回一个int类型,指定生成1~10的随机整

##  Arrays类：处理数组
	* 创建：静态方法无需创建直接用类名调用
	* 方法：
		* Arrays.sort(a);//对数组a进行升序
			*  for(int i=a.length-1;i>=0;i--) {//降序循环
		            System.out.println(a[i]);
		        }
		* Arrays.toString(a); /返回一个String类型，将数组a转字符串

## ArrayChanges类:数组中元素的增删
	* 1.导入自定义jar包 Sysprep.jar
	* 2.创建： ArrayChanges ac= new  ArrayChanges();
	* 3.方法：
		* ac.setA(new int[]{数值1,数值2,---}) //设置int型数组的初始值
		* ac.setB(new String[]{"","",""-----}) //设置String型数组的初始值
		* ac.AddInt(下标值,要添加的数值); 
		* ac.AddStr(下标值,要添加的字符串);
		* ac.removeInt(下标值); //删除对应int型数组下标值的元素对象
		* ac.removeStr(下标值); //删除对应String型数组下标值的元素对象
	
		

## Math类：数学对象
	* 创建：静态方法无需创建直接用类名调用
	* 方法：//所有方法都返回一个double类型
		* Math.random(); //获取0-1的随机数 ，随机数的扩大：*10
		* Math.abs(a); //求a的绝对值
		* Math.sqrt(a); //求a的平方根
		* Math.round(a); //四舍五入
		* Math.max(a,b); //较大值
		* Math.min(a,b); //较小值
	*  //解决摄入性误差
		System.out.println("摄入性误差："+15.7/3);
        DecimalFormat df=new DecimalFormat("0.00");
        String s=df.format(a/b);
        System.out.println(s);

## BigInteger类：超大整数类
	* 创建： BigInteger b1=new BigInteger("4444444444");
        	BigInteger b2=new BigInteger("3222222222");
	* 方法：//所有方法都返回一个BigInteger类型
		* b1.add(b2); // b1+b2
		* b1.subtract(b2); // b1-b2
		* b1.multiply(b2); // b1*b2
		* b1.divide(b2); // b1/b2
		* b1.remainder(b2); // b1/b2的余数

## BigDecimal类：超大-小数类
	* 创建：   BigDecimal b1=new BigDecimal("10.3");
        	  BigDecimal b2=new BigDecimal("3.0");
	* 方法：//所有方法都返回一个BigDecimal类型
		* b1.add(b2); // b1+b2
		* b1.subtract(b2); // b1-b2
		* b1.multiply(b2); // b1*b2
		* b1.divide(b2); // b1/b2 除不尽会报错
			* 解决方法：
				# b1.divide(b2,5,BigDecimal.ROUND_HALF_EVEN); //四舍五入保留5位小数
		* b1.remainder(b2); // b1/b2的余数

# 时间类：
	# Time类：
		* 导入自定义jar包 Sysprep.jar
		* 创建：  Time t = new Time();
		* 方法：
			* t.time();//获取详细当前时间(年月日 时分秒)
			* t.setTime("指定的时间");//获取指定的时间
			* t.timing("定时任务内容","指定的时间"); //在指定的时间执行的任务
	# Date类：
		* 创建： Date date = new Date();
			 System.out.println(date); //获取当前时间(星期 月 日 时分秒 年) 
		* 方法 
			* date.getTime(); //返回一个long类型，获取现在距离1970时间的毫秒值
	# DateFormat类：
		* 创建：静态方法无需创建直接用类名调用
		* 方法：
			* DateFormat.getDateInstance().format(new Date()); //返回一个String类型，获取当前时间(年月日)
			*  DateFormat.getDateTimeInstance().format(new Date()); //返回一个String类型，获取详细当前时间(年月日 时分秒)

	# SimpleDateFormat类：可以自定义设置时间格式
		* 创建： SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		* 方法：
			* sdf.format(new Date());//返回一个String类型，获取详细当前时间(年月日 时分秒)
			* sdf.parse("指定的时间"); //返回一个Date类型，获取指定的时间

## Timer类：定时器
	* 创建：	Timer timer=new Timer();
	        TimerTask task=new TimerTask() {
	            @Override
	            public void run() {
	                System.out.println("定时任务被执行！");
	            }
	        };
	* 方法：
		* timer.schedule(task,1000);  //一段时间后执行的定时任务：
		* timer.schedule(task,3000,1000); //delay秒后，以period秒的速度重复执行的定时任务：
		* timer.schedule(task,sdf.parse("指定的时间")); //固定时间点执行的定时任务：

## 枚举类
	* 概念：让一个类仅有固定个数的私有对象。
	* 创建一个枚举类：public enum 类名 {
						RED(101,"红色"),GREEN(102,"黄色"),BLUE(103,"蓝色");
						private int id;
						private String name;
						private Color(int id, String name) {
					        this.id = id;
					        this.name = name;
					    }
						public int getId() {
					        return id;
					    }
						public String getName() {
					        return name;
					    }

					}
	* 调用枚举类
		* 类名.RED.getName(); //返回一个类型，

## 对象克隆-----让对象的意义更加的灵活
	* 导入jar包 Sysprep.jar
	* 创建：
		*    Stu stu = new Stu();
	* 方法：Stu man=stu.clone(); //	对stu对象进行克隆--成man对象

## BufferedImage类：图片
	* 1.创建：
		* BufferedImage image = new BufferedImage(宽,高,BufferedImage.TYPE_INT_RGB);
	* 2.美化图片的方法：
		* Graphics g=image.getGraphics(); // 获取画笔对象
		* g.setColor(Color.颜色名); //设置当前画笔颜色
		* g.fillRect(0,0,宽,高); //执行填充
		* g.drawRect(0,0,宽-1,高-1); //画边框
		* g.drawString("字符",x坐标值,y坐标值); //写字
		* g.drawLine(x1,y1,x2,y2); //画线 从始点坐标(x1,y1） 到  终点坐标(x2,y2)
