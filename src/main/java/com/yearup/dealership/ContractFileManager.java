package com.yearup.dealership;

import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    private String filePath = "src/main/resources/contracts.txt";

    public void saveContract(Contract contract) {
        String filePath = "contracts.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath, true);

            String lineToWrite;


            if (contract instanceof SalesContract) {
                lineToWrite = String.format("Sale|%s|%s|%s|%s|%f|%f|%b\n",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        contract.getVehicleSold(),
                        contract.getTotalPrice(),
                        ((SalesContract) contract).getProcessingFee(),
                        ((SalesContract) contract).isWantToFinance());
            } else if (contract instanceof LeaseContract) {
                lineToWrite = String.format("Lease|%s|%s|%s|%s|%f|%f\n",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        contract.getVehicleSold(),
                        contract.getTotalPrice(),
                        ((LeaseContract) contract).getLeaseFee());
            } else {

                return;
            }

            fileWriter.write(lineToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the FileWriter outside the try-catch block.
        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





}
