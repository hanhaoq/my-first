package test1;

import java.util.Scanner;

public class X1 {
	
	public static void main(String[] args) {
		Scanner xx=new Scanner(System.in);
		System.out.println("中国建设银行欢迎你");
		int ymima=1234,xmima,y,c,i=1;
	    float x,residue = 1000,h,zhuan,getMoney;
	    char Y,N,answer;
	    while(i<=3)
		{
			System.out.println("请输入密码：");
			xmima=xx.nextInt();
			if (xmima==ymima) {
				System.out.println("欢迎使用中国建设银行自动取款机");
				System.out.println("1——查询");
				System.out.println("2——存款");
				System.out.println("3——取款");
				System.out.println("4——转账");
				System.out.println("5——退卡");
				System.out.println("请输入所选业务序号：");
				y=xx.nextInt();
				while(y!=5) {
				if (y==1) {
					System.out.println("您当前所剩余额为:"+residue+"元");
				}
				if (y==2) {
					System.out.println("请输入您所存金额:");
				x=xx.nextFloat();
				   if (x > 0 && x <= 10000) {
					   if (x % 100 == 0 ) {
						   residue += x;
					    System.out.println("存款成功!余额为:" + residue);
					   } 
						   
						   else {
					    float backMoney = x % 100;
					    if(x>0 && x<100) {
					    	System.out.println("对不起,该取款机暂不支持零钱存取!");
					    }
					    else {
					    residue = x + residue - backMoney;
					    System.out.println("存款成功!余额为￥" + residue);
					    System.out.println("请取走零钱:" + backMoney);
						   }
						   }
					   } else if (x > 10000) {
					   System.out.println("一次最多存入一万元,请分批存入!");
					   } else {
					   System.out.println("输入错误!");
					   }
				
				}
				if (y==3) {
					System.out.println("请输入您所取金额:");
				getMoney=xx.nextFloat();
				{
					if (getMoney > 0) {
						   if (getMoney <= residue ) {
						    if (getMoney % 100 == 0) {
						    System.out.println("请取走您的钞票!余额为:" + (residue - getMoney)+"元");
						    } else {
						    System.out.println("对不起,该取款机暂不支持零钱存取!");
						    }
						   } else {
						    System.out.println("对不起,余额不足!");
						   }
						   } else {
						   System.out.println("请输入正确的金额:");
						   }
				}
				}
				if (y==4) {
					System.out.println("请输入转账用户银行卡号:");
					h=xx.nextFloat();
					System.out.println("请输入转账金额:");
					zhuan=xx.nextFloat();
					residue=residue-zhuan;
					{
						if (zhuan > 0) {
							   if (zhuan <= residue ) {
								    System.out.println("转账成功！");
								    System.out.println("当前余额为:" + (residue - zhuan)+"元");
							   } else {
								   System.out.println("转账失败！");
							    System.out.println("对不起,当前余额不足，请注意及时充值!");
							   }
							   } else {
							   System.out.println("请输入正确的金额:");
							   }
					}
				}
				if (y>5||y<=0) {
					System.out.println("请输入正确序号");
				}
				System.out.println("是否继续进行业务:Y/N");
				 answer = xx.next().charAt(0);
				if(answer=='Y')
				{
				System.out.println("1——查询");
				System.out.println("2——存款");
				System.out.println("3——取款");
				System.out.println("4——转账");
				System.out.println("5——退卡");
				System.out.println("请输入所选业务序号：");
				y=xx.nextInt();
				}
				else if(answer=='N') {
					System.out.println("感谢您使用中国建设银行自动取款机");
				System.out.println("欢迎您下次光临");
					System.exit(0);
				}
				else {
					System.out.println("请按照要求重新输入，谢谢您的合作");
					answer = xx.next().charAt(0);
					while(answer !='Y'&&answer !='N') {
						System.out.println("请按照要求重新输入，谢谢您的合作");
						answer = xx.next().charAt(0);}
						if(answer=='Y')
						{
						System.out.println("1——查询");
						System.out.println("2——存款");
						System.out.println("3——取款");
						System.out.println("4——转账");
						System.out.println("5——退卡");
						System.out.println("请输入所选业务序号：");
						y=xx.nextInt();
						}
						else if(answer=='N') {
							System.out.println("感谢您使用中国建设银行自动取款机");
						System.out.println("欢迎您下次光临");
							System.exit(0);
						}
				}
				}
				if (y==5) {
					System.out.println("感谢您使用中国建设银行自动取款机");
					System.out.println("欢迎您下次光临");
					System.exit(0);
				}
			}
			else {
		    	  if (i <= 2) {
		    		   System.out.println("对不起，密码输入不正确，你还有" + (3 - i) + "次机会！");
		    		  } else {
		    		   System.out.println("对不起，您的卡已被锁定！");
		    		   System.out.println("请携带相关证件到柜台进行解锁认证");
		    		   System.exit(0);
		    		  }
		    		  }
			i++;

		}
	    
	}

}
