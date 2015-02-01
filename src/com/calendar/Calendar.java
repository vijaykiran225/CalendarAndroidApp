package com.calendar;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.DatePicker;


public class Calendar extends Activity {
    /** Called when the activity is first created. */
   
	int day;
	int month;
	int year;
	String s;
       int day1,mon1,year1;
   String setDates(int gotyear,int gotmonth,int gotday)
	   {
	   Calendar[] v=new Calendar[31];
	   for(int i=0;i<v.length;i++)
	   {
		   v[i]=new Calendar();
	   }
	   // adding comment to check rebase
	  	v[0].day=15;
		v[0].month=8;
		v[0].year=1947;
		v[0].s="Independence day of India";
		v[1].day=26;
		v[1].month=1;
		v[1].year=1950;
		v[1].s="Republic day of india";
		v[2].day=8;
		v[2].month=3;
		v[2].year=1911;
		v[2].s="International Womens day";
		v[3].day=1;
		v[3].month=6;
		v[3].year=1925;
		v[3].s="International childrens day";
		v[4].day=7;
		v[4].month=4;
		v[4].year=1948;
		v[4].s="World Health day";
		v[5].day=28;
		v[5].month=2;
		v[5].year=1987;
		v[5].s="National science day";
		v[6].day=1;
		v[6].month=5;
		v[6].year=1889;
		v[6].s="International labour day";
		v[7].day=8;
		v[7].month=5;
		v[7].year=1948;
		v[7].s="World Red Cross day";
		v[8].day=11;
		v[8].month=5;
		v[8].year=1999;
		v[8].s="National technological day";
		v[9].day=12;
		v[9].month=5;
		v[9].year=1953;
		v[9].s="International Nurses day";
		v[10].day=17;
		v[10].month=5;
		v[10].year=1969;
		v[10].s="World Telecommunication Day";
		v[11].day=27;
		v[11].month=5;
		v[11].year=1973;
		v[11].s="World Bio diversity day";
		v[12].day=24;
		v[12].month=5;
		v[12].year=1958;
		v[12].s="World Common Wealth day";
		v[13].day=5;
		v[13].month=6;
		v[13].year=1973;
		v[13].s="World Environmental day";
		v[14].day=11;
		v[14].month=7;
		v[14].year=1987;
		v[14].s="world Poppulation day";
		v[15].day=5;
		v[15].month=10;
		v[15].year=1994;
		v[15].s="Teachers day";
		v[16].day=26;
		v[16].month=11;
		v[16].year=1973;
		v[16].s="world Environmental Protection Day";
		v[17].day=1;
		v[17].month=12;
		v[17].year=1988;
		v[17].s="World Aids Day";
		v[18].day=10;
		v[18].month=12;
		v[18].year=1948;
		v[18].s="World Human Rights Day";
		v[19].day=14;
		v[19].month=12;
		v[19].year=1991;
		v[19].s="National Energy Conservation Day";
		v[20].day=14;
        v[20].month=2;
        v[20].year=498;
        v[20].s="Valentines Day";
        v[21].day=22;
        v[21].month=3;
        v[21].year=1948;
        v[21].s="World Forestry Day";
        v[22].day=23;
        v[22].month=4;
        v[22].year=1923;
        v[22].s="World Books and Copyrights Day";
        v[23].day=31;
        v[23].month=5;
        v[23].year=1988;
        v[23].s="World Tobacco Day";
        v[24].day=15;
        v[24].month=9;
        v[24].year=1870;
        v[24].s="World Engineers Day";
        v[25].day=16;
        v[25].month=9;
        v[25].year=1995;
        v[25].s="World Ozone day";
        v[26].day=2;
        v[26].month=10;
        v[26].year=1869;
        v[26].s="International Non Violence Day";
        v[27].day=4;
        v[27].month=10;
        v[27].year=1931;
        v[27].s="World Animal Welfare Day";
        v[28].day=16;
        v[28].month=10;
        v[28].year=1981;
        v[28].s="World Food Day";
        v[29].day=21;
        v[29].month=11;
        v[29].year=1936;
        v[29].s="World Television Day";
        v[30].day=9;
        v[30].month=12;
        v[30].year=1966;
        v[30].s="Girl Child Day";

	  
		  for(int i=0;i<=30;i++)
		   {
			   if((gotday==v[i].day)&&(gotmonth==v[i].month))
			   {
				   if(gotyear>=v[i].year)
				   {
					  return (v[i].s+"  on "+gotday+"-"+gotmonth+"-"+gotyear);
				   }
			   }
		   }
		   String vvv="Nothing special on "+gotday+"-"+gotmonth+"-"+gotyear;
		   return vvv;
		   
	   }
       
       @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.def);
        final DatePicker d=(DatePicker) findViewById(R.id.DatePick);
        final Button c=(Button) findViewById(R.id.typed);
        //d.init(year, monthOfYear, dayOfMonth, onDateChangedListener)        TextView tv=new TextView(this);
       final EditText e=(EditText) findViewById(R.id.yeartype);
       // tv.setVisibility(BIND_AUTO_CREATE);
        c.setHighlightColor(color.white);
        final   TextView t=(TextView) findViewById(R.id.result);
    //    t.setTextColor(Color.MAGENTA);
   //  e.setBackgroundColor(Color.TRANSPARENT);
     e.setTextColor(Color.MAGENTA);
    e.setHighlightColor(Color.MAGENTA);
       // CharSequence s=c.getText();
    c.setTextColor(Color.MAGENTA);
    button.setTextColor(Color.MAGENTA);
        c.setOnClickListener(new OnClickListener(){
        	@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			
			
				 
					String s=e.getText().toString();
				//	s.clear();
					
					s.toCharArray();
					int v=0;
					for(int i=0;i<4;i++)
					{
					char temp=s.charAt(i);
					
					switch(temp)
					{
					case 48:v=(v*10)+0;break;
					case 49:v=(v*10)+1;break;
					case 50:v=(v*10)+2;break;
					case 51:v=(v*10)+3;break;
					case 52:v=(v*10)+4;break;
					case 53:v=(v*10)+5;break;
					case 54:v=(v*10)+6;break;
					case 55:v=(v*10)+7;break;
					case 56:v=(v*10)+8;break;
					case 57:v=(v*10)+9;break;
					}
					}
					//v=(v*10)+s.charAt(1);
					//v=(v*10)+s.charAt(2);
					//v=(v*10)+s.charAt(3);
					//t.setText("  v is "+v);
					year1=v;
					 day1=d.getDayOfMonth();
	        		   mon1=d.getMonth();
	        		   mon1++;
	        		   String ret=setDates(year1, mon1, day1);
	        		   t.setText("\n\n"+ret);
	        		   int x=execute();
	         		  switch(x)
	         			{
	         			case 0: Toast.makeText(Calendar.this, R.string.Sunday, Toast.LENGTH_LONG).show();break;
	         			case 1: Toast.makeText(Calendar.this, R.string.Monday, Toast.LENGTH_LONG).show();break;
	         			case 2: Toast.makeText(Calendar.this, R.string.Tuesday, Toast.LENGTH_LONG).show();break;
	         			case 3: Toast.makeText(Calendar.this, R.string.Wednesday, Toast.LENGTH_LONG).show(); break;
	         			case 4: Toast.makeText(Calendar.this, R.string.Thursday, Toast.LENGTH_LONG).show();break;
	         			case 5: Toast.makeText(Calendar.this, R.string.Friday, Toast.LENGTH_LONG).show(); break;
	         			case 6: Toast.makeText(Calendar.this, R.string.Saturday, Toast.LENGTH_LONG).show(); break;
	         			default:Toast.makeText(Calendar.this, R.string.vk, 20).show();
	         			}
					//
				 }
			}

			);
        button.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		   
        		   day1=d.getDayOfMonth();
        		   mon1=d.getMonth();
        		   mon1++;
        		   year1=d.getYear();
        		   String ret=setDates(year1, mon1, day1);
        		  int x=execute();
        		  switch(x)
        			{
        			case 0: Toast.makeText(Calendar.this, R.string.Sunday, Toast.LENGTH_SHORT).show();break;
        			case 1: Toast.makeText(Calendar.this, R.string.Monday, Toast.LENGTH_SHORT).show();break;
        			case 2: Toast.makeText(Calendar.this, R.string.Tuesday, Toast.LENGTH_SHORT).show();break;
        			case 3: Toast.makeText(Calendar.this, R.string.Wednesday, Toast.LENGTH_SHORT).show(); break;
        			case 4: Toast.makeText(Calendar.this, R.string.Thursday, Toast.LENGTH_SHORT).show();break;
        			case 5: Toast.makeText(Calendar.this, R.string.Friday, Toast.LENGTH_SHORT).show(); break;
        			case 6: Toast.makeText(Calendar.this, R.string.Saturday, Toast.LENGTH_SHORT).show(); break;
        			
        			}
        	//	  CharSequence s=e.getText();
        		
        	     //   t.setText("year is "+year1+"  month is "+mon1+"  day is "+day1+ret);
        		  t.setText("\n\n"+ret);
        	     //  if(year>=1912)
        		//  Toast.makeText(vijay.this, R.string.vk, Toast.LENGTH_SHORT).show();
        	  }});
        //button.setVisibility(BIND_AUTO_CREATE);
    }
    static int dayOffset(int x)
	{
		
		return (x%7);
	}
	static int monthOffset(int x)
	{
		switch(x)
		{
		case 1: return 0;
		case 2:return 3;
		case 3:return 3;
		case 4:return 6;
		case 5:return 1;
		case 6:return 4;
		case 7:return 6;
		case 8:return 2;
		case 9:return 5;
		case 10:return 0;
		case 11:return 3;
		case 12:return 5;
		}
		return 0;
	}
	static int yearOffset(int x,int month,int day)
	{
		int a=0;
				
		x=x%100;
		//System.out.println(x);
		a=x+(x/4);
		
		if(a>7)
		{
			a=a%7;
		}
		if(month<=2)
		{
			if(day<=29)
			{
				a=a-1;
			}
		}
		
		return a;
	}
	static int centuryOffset(int x)
	{
		int a;
		int b=x/4;
		b=(b+1)*4;
	//	System.out.println(b);
		b--;
		a=(b-x);
		a=a%4;
		a=a*2;
		return a;
	}
	
	  int execute() {
		// TODO Auto-generated method stub
		int x;
		int a=0;
		
		int century=year1/100;
		
		x=centuryOffset(century);
		//System.out.println("century is "+x);
		a=a+x;
		x=yearOffset(year1,mon1,day1);
		//System.out.println("Year is "+x);
		a=a+x;
		x=monthOffset(mon1);
	//	System.out.println("Month is "+x);
		a=a+x;
		x=dayOffset(day1);
	//	System.out.println("day is "+x);
		a=a+x;
	//	System.out.println("a is "+a);
		if(a>=7)
		{
			a=a%7;
		}
	//	System.out.println("final day is "+month(a));
		return a;
		
	}}
       //
        	  
          
