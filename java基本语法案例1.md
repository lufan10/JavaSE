## 数值拆分
	* 需求：一个三位数，将其拆分为个位、十位、百位后，打印在控制台
	* 公式总结：
		个位 ：数值 % 10
		十位 ：数值 / 10 % 10
		百位 ：数值 / 10 / 10 % 10
		千位 ：数值 / 10 / 10 / 10 % 10;

## 案例 自增、自减拓展案例（有些面试题会出现）
	int c = 10;
	int d = 5;
	int rs3 = c++ + ++c - --d - ++d + 1 + c--;
	System.out.println(rs3);
	System.out.println(c);
	System.out.println(d);

## 案例 求三个整数的最大值
	* 需求：定义三个整数，找出最大值并打印在控制台。
	* 分析：
		① 用三元运算符获取前两个整数的最大值，并用临时变量保存起来。
		⚫ num1 > num2 ? num1 : num2;
		② 用三元运算符，让临时最大值，和第三个整数，进行比较，并记录结果。
		⚫ temp > num3 ? temp : num3;
		③ 输出结果

## 案例 考试奖励
	需求：键盘录入考试成绩，根据成绩所在的区间，程序打印出不同的奖励机制
	分析：
	① 键盘录入考试成绩
	② 由于奖励种类较多，属于多种判断，采用
	if...else...if格式实现
	③ 为每种判断设置对应的条件
	④ 为每种判断设置对应的奖励
	注意事项：正确数据、边界数据、错误数据

## 练习 密码校验
	* 需求: 键盘录入用户密码, 如果密码为 111111, 程序输出密码正确，否则输出密码有误
	* 分析：
		① 使用Scanner录入用户输入的密码，并使用变量接受
		② 使用 if...else 组织程序逻辑
## switch案例
	⚫ 周一：埋头苦干，解决bug 周五：今晚吃鸡
	⚫ 周二：请求大牛程序员帮忙 周六：与王婆介绍的小芳相亲
	⚫ 周三：今晚啤酒、龙虾、小烧烤 周日：郁郁寡欢、准备上班。
	⚫ 周四： 主动帮助新来的女程序解决bug

## switch穿透性案例(月份天数查看器)
	需求：用户输入月份可以展示该月份的天数。
		⚫ 1、3 、5、 7 、 8、 10、 12月份是 31天
		⚫ 2月份是闰年为29天、非闰年为28天。
		⚫ 4 、6 、9、 11月份 是30天

## 案例 求和
	需求：求1-5之间的数据和，并把求和结果在控制台输出。
	分析：
		① 定义for循环，使其能够依次产生：1、2、3、4、5。
		② 在循环外定义一个整数变量sum用于求和，循环每产生一个数，就累加到sum中去
		③ 循环结束后，输出求和变量即是结果。

## 案例 求奇数和
	需求：求1-10之间的奇数和，并把求和结果在控制台输出。
	方式一：
		① 定义for循环，使其能够依次产生：1、2、3、4、5… 10。
		② 循环每产生一个数据，都通过if判断其是否是奇数
		③ 在循环外定义一个整数变量sum，在if分支内来累加产生的奇数数据。
	方式二：
		① 定义for循环，使其能够依次产生：1、3、5 、7 、9。
		② 在循环外定义一个整数变量sum，循环每产生一个奇数就累加到sum

## 案例 水仙花数
	需求：在控制台输出所有的“水仙花数”，水仙花数必须满足如下2个要求：
		1. 水仙花数是一个三位数
		2. 水仙花数的个位、十位、百位的数字立方和等于原数

	分析：
		① 定义一个for循环从“100一直到999”。
		② 每次访问到数据后，提取该数据的：个位、十位、百位数字。
		③ 使用if判断：个位、十位、百位的数字立方和是否等于原数，等于则输出该数据。
	如果还要知道水仙花数的个数怎么办？
		⚫ 在循环外定义一个变量count用于记录水仙花数。
	 	⚫ 每输出水仙花数时，让count++。

## 案例 珠穆朗玛峰(世界最高峰8848.86米)
	需求：
	世界最高山峰是珠穆朗玛峰(8848.86米=8848860毫米)，假如我有一张足够大的纸，
	它的厚度是0.1毫米。请问，折叠多少次，可以折成珠穆朗玛峰的高度。
	1. 怎么解决此案例？
	① 定义变量存储珠穆朗玛峰的高度、纸张的高度。
	② 使用while循环，循环条件是（纸张厚度<山峰高度），内部控制纸张折叠，每折叠一
	次，纸张厚度为原来两倍，循环外定义计数变量，每折叠依次让该变量+1
	2. for和while使用总结
	① 其实whie能做的for都能实现
	② 但是如果一开始不知道循环次数的情况下，建议使用while循环解决更专业。

## 案例 密码验证
	需求：系统密码是520，请用户不断的输入密码验证，验证不对输出
	密码错误，验证成功输出欢迎进入系统，并停止程序。
	分析：
		① 使用while死循环，让用户不断输入数据
		② 与密码比对：验证不成功输出密码错误、
		③ 验证成功输出欢迎进入系统，并使用break结束当前循环的执行。

## 案例 循环嵌套
	需求：在控制台使用 * 打印出4行5列的矩形

## 案例 猜数字游戏
	需求：
		⚫ 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏。
	分析：
		① 随机生成一个1-100之间的数据
		② 使用死循环让用户不断提示用户猜测，猜大提示过大，猜小提示过小，猜中结束游戏

## 案例 数组遍历-求和
	需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
	分析：
		① 把这5个数据拿到程序中去 ---> 使用数组
		② 遍历数组中的每个数据，然后在外面定义求和变量把他们累加起来。
## 案例 数组元素求最大值
 颜值：15 颜值：9000 颜值：10000 颜值：20000 颜值：9500 颜值：-5
	① 把颜值数据拿到程序中去，用数组装起来。
	② 定义一个变量用于记录最大值，这个变量建议默认存储第一个元素值作为参照。
		int max = faceScores[0];
	③ 遍历数组的元素，如果该元素大于变量存储的元素，则替换变量存储的值为该元素。
	for (int i = 1; i < faceScores.length; i++) {
		if(faceScores[i] > max) {
		// 替换
		max = faceScores[i];
		}
	}

	④ 循环结束后输出最大值变量即可。

## 案例 猜数字游戏
	需求：
		开发一个幸运小游戏，游戏规则如下：
		游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
		➢ 未猜中提示：“未命中”，并继续猜测
		➢ 猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数据， 最
		终结束本游戏。
	分析
		① 随机生成5个1-20之间的数据存储起来 ---> 使用数组
		② 定义一个死循环，输入数据猜测，遍历数组，判断数据是否在数组中，如果在，进行对应提示并结束死
		循环；如果没有猜中，提示继续猜测直到猜中为止。

## 案例 随机排名
	需求
		某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
		请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
	22 33 35 13 88         13 35 88 33 22

	分析
		① 在程序中录入5名员工的工号存储起来 ---> 使用数组。
		② 依次遍历数组中的每个元素，随机一个索引数据，让当前元素与该索引位置处的元素进行交换。
## 案例  冒泡排序
	⚫ 从头开始两两比较，把较大的元素与较小的元素进行交换
	⚫ 每轮把当前最大的一个元素存入到数组当前的末尾
	冒泡排序的实现步骤。
	⚫ 定义一个外部循环控制总共需要冒几轮（数组的长度-1）
	⚫ 定义一个内部循环，控制每轮依次往后比较几个位置（数组长度-i-1）。
	⚫ 如果当前位置的元素值>后一个位置的元素值，两者交换。

## 案例 计算1-n的和返回
	 需求：定义一个方法，方法中计算出 1-n的和并返回。
	分析：
		1.根据格式编写方法 ----> 因n不固定，故方法需要声明形参接收；要返回结果，还需申明返回值类型。
		2.方法内部使用 for 循环计算出 1-n 的和并返回。
## 案例 判断整数是奇数还是偶数
	需求：拿一个整数，然后调用方法，把整数交给方法，在方法中输出该数为奇数还是偶数
	分析：
		1.根据格式编写方法 ----> 因要传入数据给方法，方法需要声明形参接收。
		2.方法内部使用if语句判断，并输出对应的结论。
## 案例 数组求最值改方法实现
	需求：
	把找出数组的最大值案例，改造成方法，可以支持返回任意整型数组的最大值数据。
	分析：
	1.根据格式编写方法
		⚫ 要返回最大值，需要申明返回值类型。
		⚫ 需要接收数组, 需要申明形参列表。
	2. 方法内部找出数组的最大值并返回。

## 案例 打印整型数组内容

	需求：
		设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
		“该数组内容为：[11, 22, 33, 44, 55]”
	分析：
		1、定义一个方法，要求该方法能够接收数组，并输出数组内容。 ---> 需要参数吗？需要返回值类型申明吗？
		2、定义一个静态初始化的数组，调用该方法，并传入该数组。

## 练习 从数组中查询指定元素的索引
需求：
设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中
不存在该元素则返回 -1。
分析：
1、定义方法，接收整型数组，查询的元素值，在方法体中完成元素查询的功能。---> 是否需要参数、返
回值类型？
2、定义数组，调用该方法，并指定要搜索的元素值，得到返回的结果输出。

## 练习 比较2个数组是否一样
需求：
如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
请使用方法完成：能够判断任意两个整型数组是否一样，并返回true或者false。
分析：
1、定义方法，接收2个整型数组，---> 是否需要参数、返回值类型？
2、在方法内部完成判断的逻辑，并返回布尔结果。
	