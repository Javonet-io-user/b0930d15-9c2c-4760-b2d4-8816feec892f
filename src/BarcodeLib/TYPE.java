package BarcodeLib;

public enum TYPE {
  UNSPECIFIED(0L),
  UPCA(1L),
  UPCE(2L),
  UPC_SUPPLEMENTAL_2DIGIT(3L),
  UPC_SUPPLEMENTAL_5DIGIT(4L),
  EAN13(5L),
  EAN8(6L),
  Interleaved2of5(7L),
  Standard2of5(8L),
  Industrial2of5(9L),
  CODE39(10L),
  CODE39Extended(11L),
  Codabar(12L),
  PostNet(13L),
  BOOKLAND(14L),
  ISBN(15L),
  JAN13(16L),
  MSI_Mod10(17L),
  MSI_2Mod10(18L),
  MSI_Mod11(19L),
  MSI_Mod11_Mod10(20L),
  Modified_Plessey(21L),
  CODE11(22L),
  USD8(23L),
  UCC12(24L),
  UCC13(25L),
  LOGMARS(26L),
  CODE128(27L),
  CODE128A(28L),
  CODE128B(29L),
  CODE128C(30L),
  ITF14(31L),
  CODE93(32L),
  ;
  private long numVal;

  TYPE(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
