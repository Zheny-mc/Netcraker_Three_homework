package ru.netcraker.ch3.p4;

public class SheetFormat {
    private Sheet sheetA0;
    private Sheet newSheet;

    public SheetFormat() {
        sheetA0 = new Sheet("A0", 1189, 841);
    }

    public Sheet getFormat(int num) {
        if (num > 0) {
            getFormat(num, sheetA0);
            newSheet.setName("A"+num);
        } else {
            throw new RuntimeException("num < 0");
        }
        return newSheet;
    }

    private void getFormat(int num, Sheet sheet) {
        if (num <= 0) {
            newSheet = sheet;
            return;
        }
        getFormat(num-1,
                new Sheet("A"+num, sheet.getWidth(), sheet.getHeight() / 2 ) );
    }

    //a0 = 1189 x 841
    //a1 = 841 x 549
    //a2 = 549 x 420
}
