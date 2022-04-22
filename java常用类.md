## 类的创建看构造器，类的功能看方法。

## 变量数据类
	* 基本数据类型：保存在栈区，创建一个固定空间保存的基本数据类型
		①：数值型：
			* int(整型 占4个字节)、long(长整型)、short(短整型)、byte(字节型 占1个字节)
			* double(双精度 占8个字节)、float(单精度)
      		②：非数值型：char(字符型)、boolean(布尔值 true/false 占1个字节)
	* 随便写的整数、小数字面值默认什么类型？
		⚫ 23 ，默认是int类型 , 加上L/l就是long类型的数据了。
		⚫ 23.8，默认是double类型，加上F/f就是float类型了。

    * 引用数据类型 ：保存在堆区，创建一个可变空间保存的引用数据类型
	    * String(字符串) ：
	    	    * 概述：
			    可以定义字符串变量指向字符串对象，
			    不可变字符串类型，它的对象在创建后不能被更改
		    * 字符串对象存在哪里？
		    	* 以""方式给出的字符串对象，在堆区的字符串常量池中存储。
		    * String是不可变字符串的原因？
			⚫ String变量每次的修改其实都是产生并指向了新的字符串对象。
			⚫ 原来的字符串对象都是没有改变的，所以称不可变字符串。

		    * 创建：
		    	 * String s="";
			 * String s1 = new String();
		    * 字符串对象的特点有哪些？
			⚫ 双引号创建的字符串对象，在字符串常量池中存储同一个。
			⚫ 通过new 构造器创建的字符串对象，在堆内存中分开存储。


		    * 方法：
			    * "实参".equals(s); //返回一个boolean类型，判断字符串相等
			    * s.equalsIgnoreCase;//忽略大小写比较字符串。返回一个boolean类型，判断字符串相等
			    * s.length(); //返回一个int类型,获取总共有多少个字符
			    * s.contains("a"); //返回一个boolean类型，用于判断s是否包含a
			    * s.charAt(int index); //返回一个char类型，获取某个索引位置处的字符
			    * s.toCharArray(); // 将当前字符串转换成字符数组返回
			    * s.substring(int beginIndex, int endIndex); //根据开始和结束索引进行截取，得到新的字符串（包前不包后）
			    * s.substring(int beginIndex); //从传入的索引处截取，截取到末尾，得到新的字符串

 
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
	    * StringBuilder类：是一个可变字符串类(对象容器)
	    	* 创建：
			StringBuilder sb = new StringBuilder(); //无参
			StringBuilder sb = new StringBuilder("初始值");//有参
		* 方法：
			sb.append("a").append("b").……; //添加数据并拼接，支持链式编程
			sb.length(); //返回对象内容的长度
			sb.reverse(); //将对象内容反转
			sb.to String();//实现把StringBuilder转换为String
		    
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
		
## Objects类
	* 创建：静态方法无需创建，直接用类名Objects调用即可。
	* 方法：
		Objects.equals(Object o1,Object 02); //返回一个boolean类型，判断内容相等且安全。
		Objects.isNull(Object obj); //返回一个boolean类型，判断对象变量是否为null，是则true。

## Stream流：用于简化集合和数组操作的API。
	* 创建：
		* 集合获取Stream流的方式:
			* 实现类的单列集合对象.stream(); //获取当前单列集合对象的Stream流
			* 实现类的双列集合对象.entrySet().stream(); //获取键值对，存储到set集合中去，获取双列集合Stream流

		* 数组获取Stream流的方式:
			* stream(数组名); //获取当前数组的Stream流

			* Stream.of(T……values); //获取当前数组/可变数据的Stream流
	* 方法：
		* filter(lambda表达式); //用于对流中的数据进行过滤
		* limit(long maxSize); //获取前几个元素
		* skip(long n); //跳过前几个元素
		* distinct(); //去除流中重复的元素。依赖(hashCode和equals方法)
		* concat(Stream a,Stream b); //合并a b流为一个流
	* 终结操作方法:
		* forEach(lambda表达式/快捷键 soutc); //遍历单列和双列集合均可。 
		* count();返回流中的元素个数。
		
	* 注意：
		1.中间方法也称为非终结方法，调用完成后返回新的Stream流可以继续使用，支持链式编程。
		2.在Stream流中无法直接修改集合、数组中的数据。
		3.终结操作方法，调用完成后流就无法继续使用了，原因是不会返回Stream了。
	* 收集Stream流:就是把Stream流操作后的结果数据转回到集合或者数组中去。
		* 收集到List集合： stream.collect(Collectors.toList()); //返回一个List集合
		* 收集到Set集合：  stream.collect(Collectors.toSet());  //返回一个Set集合
		* 收集到Map集合：  stream.collect(Collectors.toMap(Function keyMapper , Function valueMapper);  //返回一个Map集合	???????????

## 数组概念：
	* 用来存储相同的数据类型或对象类的内存区域（一个容器）
 	* 索引(下标)：对数组进行编号，从0开始。如：变量名[0]=元素1
	* 数组的基本原理: 数组变量名中存储的是数组在内存中的地址，数组是引用类型。
	* 数组一旦定义出来，程序执行的过程中，长度、类型就固定了。
	* 1.创建：
		* 基本数据类/对象类[] 变量名/对象名={元素1,元素2、、、、}；不变的静态初始化
		* 基本数据类/对象类[] 变量名/对象=new 数类/对象类[常量]; 可变空间的动态初始化
		* 两种数组定义时的特点和场景有什么区别:
			⚫ 当前已经知道存入的元素值，用静态初始化。
			⚫ 当前还不清楚要存入哪些数据，用动态初始化
		* 动态初始化数组后元素的默认值是什么样的？
			⚫ byte、short、int 、char、long类型数组元素的默认值都是0
			⚫ float、double类型数组元素的默认值都是0.0
			⚫ boolean类型数组元素的默认值是false、String类型数组元素的默认值是null


	* 2.方法：
		* 变量名/对象名.length; //返回一个int类型，获取数组长度(元素的总个数)
		* 变量名/对象名.length-1; //返回一个int类型，获取最大索引值。
		* 变量名/对象名[下标];  //返回一个int类型,获取下标为xx对应的元素。(取值)
		* 变量名/对象名[索引]=数据; //对动态数组内的元素赋值

	* 3.遍历：用循环的方式取出数组中每一个元素,搜索、数据统计等等都需要用到遍历。快捷键：iter/数组名.fori
			for (int i = 0; i < ages.length; i++) {
				System.out.println(ages[i]);
			}

			for (Object obj : 变量名/对象名) {
            			System.out.println(obj);
        		}
	* 4.元素交换的原理:
		* 盒子1(存储:22)   盒子2(存储:35)  盒子3(临时变量：)
		* 首先将盒子2中存储的35放到盒子3中： 盒子1(存储:22)   盒子2(存储:0)  盒子3(临时变量:35)
		* 其次将盒子1中存储的22放到盒子2中： 盒子1(存储:0)   盒子2(存储:22)  盒子3(临时变量：35)
		* 最后将盒子3中存储的35放到盒子1中： 盒子1(存储:35)   盒子2(存储:22)  盒子3(临时变量：0)
		
	* 5.数组排序:对数组中的元素，进行升序(由小到大)或者降序（由大到小）的操作。
		冒泡排序的思想: 每次从数组中找出最大值放在数组的后面去。

	* 6.数组使用常见问题:
		⚫ 问题1：如果访问的元素位置超过最大索引，执行时会出现ArrayIndexOutOfBoundsException(数组索引越界异常)
		⚫ 问题2：如果数组变量中没有存储数组的地址，而是null, 在访问数组信息时会出现NullPointerException(空指针异常)

## 集合概念：用来存储对象的容器，其对象只能是实体类或基本数据类型的包装类。
	* 数组和集合的元素存储的个数问题?
		⚫ 数组定义后类型确定，长度固定
		⚫ 集合类型可以不固定，大小是可变的。
	* 数组和集合适合的场景
		⚫ 数组适合做数据个数和类型确定的场景
		⚫ 集合适合做数据个数不确定，且要做增删元素的场景
	* 集合中存储的元素并不是对象本身，而是对象的地址。
	* 约定集合存储数据的类型，需要注意什么？
		集合支持泛型。
		集合和泛型不支持基本类型，只支持引用数据类型。

## 集合类体系结构：
	* Collection单列集合，每个元素（数据）只包含一个值。Collection集合的格式: [元素1,元素2,元素3..]
		* Collection是单列集合的祖宗接口，它的方法是全部单列集合都可以继承使用的。
		* List接口系列的实现类集合：添加的元素是有序、可重复、有索引。
			ArrayList： 底层是基于数组实现的，根据查询元素快，增删相对慢。
			LinkedList：底层基于双链表实现的，查询元素慢，增删首尾元素是非常快的。
		* Set接口系列的实现类集合：添加的元素是无序、不重复、无索引。
			HashSet: 无序基于哈希表的,增删改查都快
			LinkedHashSet: 有序基于哈希表和双链表,增删改查都快
			TreeSet：按照大小默认升序排序基于红黑树。后续也可以用List集合实现排序,可对对象进行排序
	* Collection集合的遍历方式
		方式一：迭代器 集合对象调用iterator()方法+快捷键：itit
		方式二：foreach/增强for循环-----> 快捷键：iter/fori
		方式三：lambda表达式，集合对象调用forEach(针对一个参数时使用快捷键：soutc)方法
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.forEach(s->System.out.println(s););  或    al.forEach(System.out::println);
	* Map双列集合，每个元素包含两个值（键值对）。Map集合的完整格式：{key1=value1 , key2=value2 , key3=value3 , ...}
		* Map是双列集合的祖宗接口，它的方法是全部双列集合都可以继承使用的。
		* 实现类：
			* HashMap:无序，不重复，无索引，值不做要求。基于哈希表。增删改查的性能都较好。
				* 子类实现类：
				LinkedHashMap :有序，不重复，无索引，值不做要求。
				底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
			* HashTable
				* 子类实现类: Properties
			* TreeMap:排序，不重复，无索引的，值不做要求。底层基于红黑树实现排序，增删改查性能较好
			* Attributes
	* Map集合遍历方式：
		方式一：键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值。---->快捷键：iter
		方式二：键值对的方式遍历，把“键值对“看成一个整体，难度较大。调用entrySet()方法--->快捷键：iter
			* 实列： for (Map.Entry<Object, Object> ooe : hm.entrySet()) {
				    System.out.println(ooe); // 输出结果：姓名=鲁凡
				    //System.out.println(ooe.getKey()+":"+ooe.getValue()); 输出结果：姓名:鲁凡
				}
		方式三：JDK 1.8开始之后的新技术：Lambda表达式。调用forEach方法
			* 实列： HashMap<String,String> hm = new HashMap<>();
				hm.put("姓名","鲁凡");
				hm.put("年龄","25");
				hm.forEach((k,v)-> System.out.println(k+":"+v));
	* 不可变集合：定义完成后不可以修改，或者添加、删除
		* 创建：List、Set、Map接口中，都存在of方法可以创建不可变集合
## 迭代器遍历
	 *  使用Iterator迭代器遍历序列（其序列可以是不同类型的）调用iterator()方法+快捷键：itit
	 *  用for-each 循环遍历序列（其序列必须是同类型的）快捷键：iter
	 *  用for 循环遍历序列（针对序列的索引进行的）快捷键：fori	
	 
## Collections集合工具类
	* Collections并不属于集合，是用来操作集合的工具类。只能针对于List集合排序。
	* 创建：静态方法无需创建，直接用Collections类名调用即可
	* 方法：
		* addAll(Collection<? super T> c, T... elements);  //给集合对象批量添加元素
		* 实列： ArrayList<String> al = new ArrayList<>();
			Collections.addAll(al,"鲁凡","迪迦","张三",……);
			for (String s : al) {
			    System.out.println(s);
			}
		* shuffle(List<?> list); //打乱List集合元素的顺序 Collection.shuffle(al);
		* sort(List<T> list); //将集合中元素按照默认规则(升序)排序
		* sort(List<T> list，Comparator<? super T> c); //将集合中元素按照指定规则排序

## ArrayList集合类：

	* 1.创建：  ArrayList<Object> al = new ArrayList<>(); //全局式泛型类集合
			* ArrayList<实体类/包装类...> al=new ArrayList<>(); //局部式泛型集合
	* 泛型概述
		* ArrayList<E>：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。
		* 泛型类的格式：修饰符 class 类名<泛型变量>{  }			   public class MyArrayList<T> {}
		* 泛型方法的格式：修饰符 <泛型变量> 方法返回值 方法名称(形参列表){}  public <T> void show(T t) {}
		* 泛型接口的格式：修饰符 interface 接口名称<泛型变量>{}  		public interface Data<E>{}
	* 2.方法：
		* al.add(new 实体类()/包装类); 
			* //添加实体类或包装类对象
			# //当为全局式泛型类集合时，添加的多组对象元素类型可以不同。
			#  //当为局部式泛型集合时，添加的多组对象元素类型必须一致。
		* al.set(int index,E element); //修改指定索引处的元素，返回被修改的元素
		* al.get(index); //返回一个实体类或包装类，通过索引获取对象元素
		* al.size(); //返回一个int类型，集合有多少个对象。
		* al.remove(stu2);   //移除某一个对象元素：
		* al.clear();  //清除集合的所有对象
		* al.isEmpty(); //返回一个boolean类型，判断集合是否为空
		* al.contains(stu3); //返回一个boolean类型，判断集合是否添加有对象stu3
		* al.toArray(); // 返回一个Object类的数组，把集合中的元素，存储到数组中
	
## LinkedList集合类的特有功能
	* 创建： LinkedList<Object> ll = new LinkedList<>();
	* 方法：
		* ll.addFirst(); //在该列表开头插入指定的元素
		* ll.addLast(); //将指定的元素追加到此列表的末尾
		* ll.getFirst(); //返回此列表中的第一个元素
		* ll.getLast(); //返回此列表中的最后一个元素
		* ll.removeLast(); //从此列表中删除并返回最后一个元素
		* ll.removeFirst(); //从此列表中删除并返回第一个元素
## HashMap集合类
	* 1.创建：
			 HashMap<Object,Object> hm = new HashMap<>();
	* 2.方法：
		* hm.put(key,value);//添加字符串形式的键值对元素
		* hm.remove(key);//删除元素
		* hm.size();	//返回一个int类型，集合有多少个对象。
		* hm.isEmpty(); //返回一个boolean类型，判断集合是否为空
		* hm.containsKey(key||value);//返回一个boolean类型，判断是否包含key或value
		* hm.keySet(); //获取所有键的集合
		* hm.get(key); //根据键获取值

## Properties集合类
	* 创建：
		Properties pro = new Properties(); //无参
		Properties pro = new Properties(Properties defaults);  //创建具有指定默认值的空属性列表。
	* 方法：
		* pro.getProperty(String key);//返回String类,使用此属性列表中指定的键搜索属性。
		* pro.list(PrintStream out); //将此属性列表打印到指定的输出流。 
		* pro.load(InputStream inStream); //从输入字节流读取属性列表（键和元素对）。 
	
## System类：
	* 创建：静态方法无需创建直接用类名调用
	* 方法：
		* System.out.println(a); //打印输出变量a
		* System.exit(0); //强制退出java程序
## Scanner类：接收键盘输入
	* 创建：
		* Scanner s = new Scanner(System.in);
		
	* 方法：在调用方法之前需要给出提示信息？
		* s.next();      	//返回一个String类型，接收字符串类型的输入
		* s.nextInt();  	//返回一个int类型接收,整型类型的输入
		* s.nextDouble(); 	//返回一个double类型,接收浮点型类型的输入

## Random类：生成随机数
    * 创建：
	    *  Random r = new Random();
	* 方法：
		* r.nextDouble(); //返回一个double类型,随机生成0~1的浮点数
		* r.nextInt(10)+1;  //返回一个int类型,指定生成1~10的随机整
    * Random生成随机数的特点: 包前不包后
    	⚫ nextInt(n)功能只能生成：0 – (n-1)之间的随机数。
    * Random生成区间随机数的技巧：减加法
    	* 例如： Random随机数如何生成 65 – 91之间的随机数？
		⚫ 65 – 91 => （0 - 26）+ 65
		⚫ int number = r.nextInt(27) + 65;

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
