package myhadoop;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import myhadoop.mappers.WordCountMapper;
import myhadoop.reducer.WordCountReducer;

//	MapReduce Driver Class
/*
 * 1. job 객체를 생성
 * 2. job 객체에 리듀스 실행 정보 설정
 * 3. map reduce 작업 수행
 */
public class WordCount {

	public static void main(String[] args) throws Exception {
		// 파라미터 체크 , 부족하면 종료
		if (args.length !=2) {
			System.err.println("Usage: WordCount <input> <output>");
			System.exit(2);
		}

		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "WordCount");
		
		// 실행을 위한 class 등록
		job.setJarByClass(WordCount.class);
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		//입출력 포맷 등록
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		//출력의 키와 값의 타입 등록 : (단어, 합)
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		//입출력 경로를 등록
		FileInputFormat.addInputPath(job, new Path(args[0]));	// 입력 소스 경로
		FileOutputFormat.setOutputPath(job, new Path(args[1]));	// 입력 소스 경로
		
		//수행
		job.waitForCompletion(true);
		
		
	}

}
