package myhadoop.support;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

//	합둡에서 복합 키 사용을 위해 -> WritableComparable 인터페이스를 구현해야한다
public class DateKey implements  WritableComparable<DateKey> {
	//	원래 키: "2010, 1" -> 정렬이 어려운
	//	복합 키: ("2010", 1)
	//	필드
	private String year;	//	년도 정보
	private Integer month;	//	월 정보
	
	//	생성자 
	public DateKey() {
	}
	
	//	보조 생성자
	public DateKey(String year, Integer month) {
		this.year = year;
		this.month = month;
	}

	//Getter/Setter
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Override
	public int compareTo(DateKey o) {
		// 두 객페의 정렬을 위해 선후 관계를 정해주는 역할
		// 0 -> 순서가 같다
		// -1 -> 순서가 먼저다
		// 1 -> 순서가 나중이다
		int res = year.compareTo(o.year);
		
		if (res == 0) {
			//	year 정보의 순서가 같으므로
			//	month 정보의 선후 관계 판단해야한다
			res = month.compareTo(o.month);
		}
		return res;
	}
	
	@Override
	public void readFields(DataInput in) throws IOException {
		// 입력으로 부터 내부 필드에 정보를 받아들이기 위한 데이터 읽는 메서드 
		year = WritableUtils.readString(in);
		month = in.readInt();
		
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// 내부의 피드를 출력으로 전송하기 위한 매서드
		WritableUtils.writeString(out, year);
		out.writeInt(month);		
	}

	@Override
	public String toString() {
		return year + "," + month;
	}


	
	
	
}
