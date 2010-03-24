package billtracker;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawn
 */
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BillTrackerTransaction
{
    String accountType;
    String accountNumber;
    Date transactionDate;
    int chequeNumber;
    String description1;
    String description2;
    double CAD$;


    public BillTrackerTransaction()
    {


        accountType = "";
        accountNumber = " ";
        transactionDate = new Date();
        chequeNumber = 0;
        description1 = " ";
        description2 = " ";
        CAD$ = 0.0;
    }

    public BillTrackerTransaction(String line )throws java.text.ParseException,
                                           NumberFormatException
    {
       String[] fields = line.split(",");
       String accountNumber = fields[0];
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/y");
       this.transactionDate = simpleDateFormat.parse(fields[2]);
       this.accountType = fields[0];
       this.accountNumber = fields[1];
       this.chequeNumber = Integer.parseInt(fields[3]);
       this.description1 = fields[4];
       this.description2 = fields[5];
       this.CAD$ = Double.parseDouble(fields[6]);

    }

}
