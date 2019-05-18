package csvreader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

public class Main {

	public static void main(String[] args) throws IOException {
		// String docPath =
		// System.getProperty("user.home")+"/ecllipse-workspace/CSVReader";

		Path documentDirectory = Paths.get("/Users/johnpauljoseph/eclipse-workspace/CSVReader");

		String fileName = "sampleSmallFile.csv";

		Path csvPath = documentDirectory.resolve(fileName);

		System.out.println(csvPath);

		CSVParser csvParser = CSVParser.parse(csvPath, Charset.defaultCharset(),
				CSVFormat.DEFAULT.withHeader("Region", "Country", "Item Type", "Sales Channel", "Order Priority",
						"Order Date", "Order ID", "Ship Date", "Unit Sold", "Unit Price", "Unit Cost", "Total Revenue",
						"Total Cost", "Total Profit"));

		// csvParser.forEach(CSVRecord -> {
		// System.out.println(CSVRecord.toMap());
		// });

		Stream<CSVRecord> csvRecordStream = StreamSupport.stream(csvParser.spliterator(), false);

		// csvRecordStream.forEach(CSVRecord ->
		// System.out.println(CSVRecord.toMap()));

		// List<Map<String, String>> rowList = csvRecordStream.skip(1).map(CSVRecord ->
		// CSVRecord.toMap()).collect(Collectors.toList());
		// System.out.println(rowList);
		//
		// List of Objects of ShippingRecord
		List<ShippigRecord> shippingRecList = csvRecordStream.skip(1).map(CSVRecord::toMap)
				.map(row -> new ShippigRecord(row)).collect(Collectors.toList());

		// List of Objects of ShippingRecord
		System.out.println(shippingRecList);

	}

}
