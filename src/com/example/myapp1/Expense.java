package com.example.myapp1;

import android.annotation.SuppressLint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
int id;
long date;
String name;
String spent_for;
String comment;
Float amt;

public Expense(){
	
}

public Expense(int tid,String tname,long tdate,String tspent_for,String tcomment,Float tamt){
	this.id = tid;
	this.date = tdate;
	this.name= tname;
	this.spent_for = tspent_for;
	this.comment = tcomment;
	this.amt = tamt;
}

public Expense(String tname,long tdate,String tspent_for,String tcomment,Float tamt){
	this.date = tdate;
	this.name= tname;
	this.spent_for = tspent_for;
	this.comment = tcomment;
	this.amt = tamt;
}

public String getName(){
	return this.name;
}

public int getId(){
	return this.id;
}

public long getDate(){
	return this.date;
}

public String getSpentFor(){
	return this.spent_for;
}

public String getComment(){
	return this.comment;
}

public Float getAmt(){
	return this.amt;
}

public static long toEpoch(String str_date){
	long epoch_date;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date gmt = new Date();
	try {
		gmt = formatter.parse(str_date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	epoch_date = gmt.getTime();
	return epoch_date;
}

public static String toDateString(long date){
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date gmt = new Date(date);
	String asString = formatter.format(gmt);
	return asString;
}

}
