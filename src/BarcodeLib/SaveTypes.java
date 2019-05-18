package BarcodeLib;

public enum SaveTypes {
  JPG(0L),
  BMP(1L),
  PNG(2L),
  GIF(3L),
  TIFF(4L),
  UNSPECIFIED(5L),
  ;
  private long numVal;

  SaveTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
