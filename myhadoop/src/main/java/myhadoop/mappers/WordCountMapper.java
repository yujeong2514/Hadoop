package myhadoop.mappers;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//	매퍼는 Mapper 믈래스를 상송 받아야 한다
public class WordCountMapper 
	extends Mapper<LongWritable, //입력 키의 타입(데이터의 라인 넘버
					Text,    // 입력 값의 타입
					Text,    // 출력 값의 타입
					IntWritable>{  //  출력 값의 타입
	// I am going home
	//-> k: 0, v: I am going home -> 공백으로 분절
	//   출력 (I, 1), (am,1), (going, 1), (home, 1)
	private final static IntWritable outputValue = new IntWritable(1);
	private Text word = new Text();  //출력의 키로 사용할 각체
	
	// 실재 매핑 작업을 수행할 매서드
	@Override
	protected void map(LongWritable key, // 입력 키의 타입 (데이터의 라인 넘버)
			Text value, // 입력 값의 타입
			Context context)  //  Mapreduce 전채의 작업 흐름
			throws IOException, InterruptedException {
		//  k:0, v: I am going home
		//  value 를 분절
		StringTokenizer st = new StringTokenizer(value.toString());  //  입력 값을 공백 문자로 분절
		// 매핑의 출력 (단어, 1)
		while(st.hasMoreElements()) {
			word.set(st.nextToken());  //	키로 사용할 단어
			//  context 에 출력
			context.write(word, outputValue);  //	출력(단어, 1)
		}
	}
	
	

}
