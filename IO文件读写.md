## 本地文件CRUD操作
	* 创建： File file=new File("文件路径");
	* 方法：
		* 1. file.createNewFile(); //创建文件(有后缀名)
		* 2. file.mkdir(); //创建文件夹
		* 3. file.delete()；  //删除当前文件(不是文件夹)
		* 4. file.renameTo(new File("新文件路径")); //对文件重命名
		* 3. file.exists();//返回一个boolean，判断当前文件是否存在
		* 4. file.isFile();//返回一个boolean，判断当前路径是不是文件
		* 5. isDirectory();//返回一个boolean，判断当前路径是不是文件夹
		* 6. file.getAbsolutePath();//返回一个字符串，获取文件的绝对路径(全称)
		* 7. Arrays.toString(file.list());//返回一个字符串，//获取当前文件夹下的所有列表内容(文件名称)
		* 8. file.listFiles(); //遍历获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回
## 字节流--读取：InputStream
	* 创建：FileInputStream fis=null;
			 fis=new FileInputStream(new File("读取路径"));
	* 方法： byte[] b=new byte[1024]; //准备byte数组存放读取到的文件
    	 	int len=fis.read(b);//读取一部分内容放进数组
			 while (len!=-1) {
	             
	            System.out.println(new String(b));//将数组转换成字符串
	            len = fis.read(b);
			 }
		* fis.available(); //返回一个int类型 ，获取文件长度
		* fis.close();
## 字节流--写入：OutputStream
	* 创建：FileOutputStream fos=null;
			String s="写入的内容";
			fos=new FileOutputStream("写入地址",true);//添加true可追加写入
	* 方法：  byte[] words=s.getBytes("utf-8"); //将要写入的字符串转换成字节数组
            fos.write(words,0,words.length);//写入文件
            fos.flush();//清空缓冲区数据，并强制写入
			fos.close();
	* 方法 
		* fos.write(s.getBytes("utf-8"));

## 字符流--读取: Reader
	* 创建：FileReader fr=null;
			fr=new FileReader(new File("读取路径"));
	* 方法1：
		  char[] c=new char[1024];
		  int len=fr.read(c);//返回一个整型，将读取内容存放到字符数组中
		  while (len!=-1){
                System.out.println(new String(c));
				len=fr.read();
		  }	
		  fr.close();
	* 方法2：从流对象中拿数据
		 String line=null;
		 while( (line=fr.readLine()) !=null ){
		 	System.out.println(line);
		 }
		 fr.close();
## 字符流--写入：Writer
	* 创建： FileWriter fw=null;
			fw=new FileWriter("写入地址",true);//添加true可追加写入
	* 方法：
			* fw.write("写入内容");//写入文件
	        * fw.flush();//清空缓冲区数据，并强制写入
	        * fw.close();









## 打印流--写入：
	* 创建：PrintWriter pw=null;
			pw=new PrintWriter(new FileWriter("写入的地址",true));
	* 方法：
		* pw.println("写入的数据"); //此方法有异常需要try-catch包围
		* pw.close(); // 在finally中释放资源

## 缓冲流--实现文件的复制与粘贴功能
		* 自定义方法：textFileMove()
		public static void textFileMove(String copyPath, String pastePath) throws IOException {
	        File file = new File(copyPath);
	        BufferedReader br = null;
	        BufferedWriter bw = null;
	
	        try {
	            br = new BufferedReader(new FileReader(file));
	            bw = new BufferedWriter(new FileWriter(pastePath));
	
	            for(String str = br.readLine(); str != null; str = br.readLine()) {
	                System.out.println(str);
	                bw.write(str + "\r\n");
	                bw.flush();
	            }
	        } catch (FileNotFoundException var9) {
	            var9.printStackTrace();
	        } finally {
	            br.close();
	            bw.close();
	        }

    	}

## 对象流--写入：
	* 创建： ObjectOutputStream oos=null;  //将对象信息写入到本地文件:
			oos=new ObjectOutputStream(new FileOutputStream("写入的数据"));
	* 方法:	
		* oos.writeObject(new ArrayList<>()); //写入对象集合,此方法有异常需要try-catch包围
		* oos.flush(); //刷新流。
		* oos.close(); // 在finally中释放资源

## 对象流--读取：
	* 创建： ObjectInputStream ois=null;   //将本地文件中的对象读出
			ois=new ObjectInputStream(new FileInputStream("读取路径"));
	* 方法：(ArrayList<Object>) ois.readObject();//返回一个集合对象，遍历即可读取所有对象
			* ois.close:// 在finally中释放资源
