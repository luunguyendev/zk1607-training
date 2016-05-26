package com.springweb.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.springweb.domain.Expense;
import com.springweb.domain.ExpenseDetail;

public class ExpenseController {
	
	public static void main(String[] args) {
		Expense expense = createExpenseData();
		List<ExpenseDetail> listExpenseDetail = createListExpenseDetailData();
		fillData(expense, listExpenseDetail);
	}
	
	private static void fillData(Expense expense, List<ExpenseDetail> listExpenseDetail) {
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		XSSFSheet spreadsheet = null;
		try {
			fis = new FileInputStream(new File("D:/Expense-Report.xlsx"));
			workbook = new XSSFWorkbook(fis);
			spreadsheet = workbook.getSheetAt(0);
			XSSFRow row3 = spreadsheet.getRow(3);
			row3.getCell(2).setCellValue(expense.getPurpose());
			row3.getCell(7).setCellValue(expense.getStatementNumber());
			row3.getCell(12).setCellValue(expense.getPayFrom());
			XSSFRow row4 = spreadsheet.getRow(4);
			row4.getCell(12).setCellValue(expense.getPayTo());
			XSSFRow row6 = spreadsheet.getRow(6);
			row6.getCell(2).setCellValue(expense.getName());
			row6.getCell(6).setCellValue(expense.getPosition());
			row6.getCell(11).setCellValue(expense.getSsn());
			XSSFRow row7 = spreadsheet.getRow(7);
			row7.getCell(2).setCellValue(expense.getDepartment());
			row7.getCell(6).setCellValue(expense.getManager());
			row7.getCell(11).setCellValue(expense.getEmployeeId());
			XSSFRow row27 = spreadsheet.getRow(27);
			row27.getCell(2).setCellValue(expense.getApproveName());
			row27.getCell(8).setCellValue(expense.getNotes());
			XSSFRow row28 = spreadsheet.getRow(28);
			
			for (int i = 0; i < 15; i++) {
				int rowNumber = i + 10;
				XSSFRow rowDetail = spreadsheet.getRow(rowNumber);
				rowDetail.getCell(1).setCellValue(listExpenseDetail.get(i).getDate());
				rowDetail.getCell(2).setCellValue(listExpenseDetail.get(i).getAccount());
				rowDetail.getCell(3).setCellValue(listExpenseDetail.get(i).getDescription());
				rowDetail.getCell(4).setCellValue(listExpenseDetail.get(i).getHotelFee());
				rowDetail.getCell(5).setCellValue(listExpenseDetail.get(i).getTransportFee());
				rowDetail.getCell(6).setCellValue(listExpenseDetail.get(i).getFuelFee());
				rowDetail.getCell(7).setCellValue(listExpenseDetail.get(i).getMealsFee());
				rowDetail.getCell(8).setCellValue(listExpenseDetail.get(i).getPhoneFee());
				rowDetail.getCell(10).setCellValue(listExpenseDetail.get(i).getEntertainmentFee());
				rowDetail.getCell(11).setCellValue(listExpenseDetail.get(i).getMiscFee());
			}
			
			FileOutputStream out = new FileOutputStream(new File("D:/Writesheet.xlsx"));
			workbook.write(out);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (null != workbook) {
				try {
					workbook.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static Expense createExpenseData() {
		Expense expense = new Expense();
		expense.setPurpose("Mục Đích");
		expense.setStatementNumber("SN01");
		expense.setPayFrom(new Date());
		expense.setPayTo(new Date());
		expense.setName("Tên");
		expense.setDepartment("Bộ phận");
		expense.setPosition("Vị trí");
		expense.setManager("Quản lý");
		expense.setSsn("ssn");
		expense.setEmployeeId("E01");
		expense.setApproveName("luunt");
		expense.setNotes("Ghi chú");
		return expense;
	}
	
	private static List<ExpenseDetail> createListExpenseDetailData() {
		List<ExpenseDetail> listExpenseDetail = new ArrayList<ExpenseDetail>();
		for (int i = 0; i < 15; i++) {
			ExpenseDetail expenseDetail = new ExpenseDetail();
			expenseDetail.setDate(new Date());
			expenseDetail.setAccount("Tài khoản");
			expenseDetail.setDescription("Mô tả");
			expenseDetail.setHotelFee(new Double(1.0));
			expenseDetail.setTransportFee(new Double(2.0));
			expenseDetail.setFuelFee(new Double(3.0));
			expenseDetail.setMealsFee(new Double(4.0));
			expenseDetail.setPhoneFee(new Double(5.0));
			expenseDetail.setEntertainmentFee(new Double(6.0));
			expenseDetail.setMiscFee(new Double(7.0));
			listExpenseDetail.add(expenseDetail);
		}
		return listExpenseDetail;
	}
}
