package com.cygnet.datavisualization.Config.CsvReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVWithScanner {
	public void read() throws IOException {


		Scanner scanner = new Scanner(new File("C:\\Users\\Dhruv-pc\\Desktop\\CYGNET\\datav\\datavisualization\\src\\main\\java\\com\\cygnet\\datavisualization\\Config\\CsvReader\\\\AAPL.csv"));
		Scanner dataScanner = null;
		int index = 0;
		List<Stock> stockList = new ArrayList<>();

		while (scanner.hasNextLine()) {
			dataScanner = new Scanner(scanner.nextLine());
			dataScanner.useDelimiter(",");
			Stock stock = new Stock();

			while (dataScanner.hasNext()) {
				String data = dataScanner.next();
				if (index == 0)
					stock.setDates(data);
				else if (index == 1)
					stock.setOpen(data);
				else if (index == 2)
					stock.setHigh(data);
				else if (index == 3)
					stock.setLow(data);
				else if (index == 4)
					stock.setClose(data);
				else if (index == 5)
					stock.setAdj_close(data);
				else if (index == 6)
					stock.setVolume(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			stockList.add(stock);
		}

		scanner.close();



        System.out.println(stockList);

	}

		


}
