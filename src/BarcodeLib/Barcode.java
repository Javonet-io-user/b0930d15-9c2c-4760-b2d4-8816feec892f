package BarcodeLib;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import BarcodeLib.*;
import jio.System.Drawing.*;
import jio.System.IO.*;

public class Barcode {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRawData(java.lang.String value) {
    try {
      javonetHandle.set("RawData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRawData() {
    try {
      java.lang.String res = javonetHandle.get("RawData");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEncodedValue() {
    try {
      java.lang.String res = javonetHandle.get("EncodedValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCountry_Assigning_Manufacturer_Code() {
    try {
      java.lang.String res = javonetHandle.get("Country_Assigning_Manufacturer_Code");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncodedType(TYPE value) {
    try {
      javonetHandle.set("EncodedType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TYPE getEncodedType() {
    try {
      Object res = javonetHandle.<NEnum>get("EncodedType");
      if (res == null) return null;
      return TYPE.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getEncodedImage() {
    try {
      Object res = javonetHandle.<NObject>get("EncodedImage");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForeColor(Color value) {
    try {
      javonetHandle.set("ForeColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getForeColor() {
    try {
      Object res = javonetHandle.<NObject>get("ForeColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBackColor(Color value) {
    try {
      javonetHandle.set("BackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("BackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWidth(java.lang.Integer value) {
    try {
      javonetHandle.set("Width", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("Width");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHeight(java.lang.Integer value) {
    try {
      javonetHandle.set("Height", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getHeight() {
    try {
      java.lang.Integer res = javonetHandle.get("Height");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeLabel(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeLabel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeLabel() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeLabel");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public Barcode() {
    try {
      javonetHandle = Javonet.New("BarcodeLib.Barcode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Barcode(java.lang.String data) {
    try {
      javonetHandle = Javonet.New("BarcodeLib.Barcode", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Barcode(java.lang.String data, TYPE iType) {
    try {
      javonetHandle = Javonet.New("BarcodeLib.Barcode", data, NEnum.fromJavaEnum(iType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Barcode(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Image Encode(
      TYPE iType,
      java.lang.String StringToEncode,
      java.lang.Integer Width,
      java.lang.Integer Height) {
    try {
      Object res =
          javonetHandle.invoke("Encode", NEnum.fromJavaEnum(iType), StringToEncode, Width, Height);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Image Encode(
      TYPE iType,
      java.lang.String StringToEncode,
      Color ForeColor,
      Color BackColor,
      java.lang.Integer Width,
      java.lang.Integer Height) {
    try {
      Object res =
          javonetHandle.invoke(
              "Encode",
              NEnum.fromJavaEnum(iType),
              StringToEncode,
              ForeColor,
              BackColor,
              Width,
              Height);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Image Encode(
      TYPE iType, java.lang.String StringToEncode, Color ForeColor, Color BackColor) {
    try {
      Object res =
          javonetHandle.invoke(
              "Encode", NEnum.fromJavaEnum(iType), StringToEncode, ForeColor, BackColor);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Image Encode(TYPE iType, java.lang.String StringToEncode) {
    try {
      Object res = javonetHandle.invoke("Encode", NEnum.fromJavaEnum(iType), StringToEncode);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetImageData(SaveTypes savetype, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetImageData", NEnum.fromJavaEnum(savetype));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetImageData(Image img, SaveTypes savetype, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetImageData", img, NEnum.fromJavaEnum(savetype));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveImage(java.lang.String Filename, SaveTypes FileType) {
    try {
      javonetHandle.invoke("SaveImage", Filename, NEnum.fromJavaEnum(FileType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveImage(Stream stream, SaveTypes FileType) {
    try {
      javonetHandle.invoke("SaveImage", stream, NEnum.fromJavaEnum(FileType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CheckNumericOnly(java.lang.String Data) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BarcodeLib.Barcode").invoke("CheckNumericOnly", Data);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Image DoEncode(TYPE iType, java.lang.String data) {
    try {
      Object res =
          Javonet.getType("BarcodeLib.Barcode").invoke("DoEncode", NEnum.fromJavaEnum(iType), data);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Image DoEncode(
      TYPE iType, java.lang.String data, java.lang.Integer Width, java.lang.Integer Height) {
    try {
      Object res =
          Javonet.getType("BarcodeLib.Barcode")
              .invoke("DoEncode", NEnum.fromJavaEnum(iType), data, Width, Height);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Image DoEncode(
      TYPE iType, java.lang.String data, Color DrawColor, Color BackColor) {
    try {
      Object res =
          Javonet.getType("BarcodeLib.Barcode")
              .invoke("DoEncode", NEnum.fromJavaEnum(iType), data, DrawColor, BackColor);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Image DoEncode(
      TYPE iType,
      java.lang.String data,
      Color DrawColor,
      Color BackColor,
      java.lang.Integer Width,
      java.lang.Integer Height) {
    try {
      Object res =
          Javonet.getType("BarcodeLib.Barcode")
              .invoke(
                  "DoEncode", NEnum.fromJavaEnum(iType), data, DrawColor, BackColor, Width, Height);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
