/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zyx.filter.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 频率过滤器
 */
public class TFrequencyFilter implements org.apache.thrift.TBase<TFrequencyFilter, TFrequencyFilter._Fields>, java.io.Serializable, Cloneable, Comparable<TFrequencyFilter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFrequencyFilter");

  private static final org.apache.thrift.protocol.TField DURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("duration", org.apache.thrift.protocol.TType.I64, (short)11);
  private static final org.apache.thrift.protocol.TField TIME_UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("time_unit", org.apache.thrift.protocol.TType.I32, (short)12);
  private static final org.apache.thrift.protocol.TField TIMES_FIELD_DESC = new org.apache.thrift.protocol.TField("times", org.apache.thrift.protocol.TType.I32, (short)13);
  private static final org.apache.thrift.protocol.TField IS_NATRUE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_natrue", org.apache.thrift.protocol.TType.BOOL, (short)14);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFrequencyFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFrequencyFilterTupleSchemeFactory());
  }

  public long duration; // required
  /**
   * 时限（量）
   * 
   * @see TTimeUnit
   */
  public TTimeUnit time_unit; // required
  /**
   * 时限（单位）
   */
  public int times; // required
  /**
   * 时限内能出现的次数
   */
  public boolean is_natrue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DURATION((short)11, "duration"),
    /**
     * 时限（量）
     * 
     * @see TTimeUnit
     */
    TIME_UNIT((short)12, "time_unit"),
    /**
     * 时限（单位）
     */
    TIMES((short)13, "times"),
    /**
     * 时限内能出现的次数
     */
    IS_NATRUE((short)14, "is_natrue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 11: // DURATION
          return DURATION;
        case 12: // TIME_UNIT
          return TIME_UNIT;
        case 13: // TIMES
          return TIMES;
        case 14: // IS_NATRUE
          return IS_NATRUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DURATION_ISSET_ID = 0;
  private static final int __TIMES_ISSET_ID = 1;
  private static final int __IS_NATRUE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.IS_NATRUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DURATION, new org.apache.thrift.meta_data.FieldMetaData("duration", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME_UNIT, new org.apache.thrift.meta_data.FieldMetaData("time_unit", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTimeUnit.class)));
    tmpMap.put(_Fields.TIMES, new org.apache.thrift.meta_data.FieldMetaData("times", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_NATRUE, new org.apache.thrift.meta_data.FieldMetaData("is_natrue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFrequencyFilter.class, metaDataMap);
  }

  public TFrequencyFilter() {
  }

  public TFrequencyFilter(
    long duration,
    TTimeUnit time_unit,
    int times)
  {
    this();
    this.duration = duration;
    setDurationIsSet(true);
    this.time_unit = time_unit;
    this.times = times;
    setTimesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFrequencyFilter(TFrequencyFilter other) {
    __isset_bitfield = other.__isset_bitfield;
    this.duration = other.duration;
    if (other.isSetTime_unit()) {
      this.time_unit = other.time_unit;
    }
    this.times = other.times;
    this.is_natrue = other.is_natrue;
  }

  public TFrequencyFilter deepCopy() {
    return new TFrequencyFilter(this);
  }

  @Override
  public void clear() {
    setDurationIsSet(false);
    this.duration = 0;
    this.time_unit = null;
    setTimesIsSet(false);
    this.times = 0;
    setIs_natrueIsSet(false);
    this.is_natrue = false;
  }

  public long getDuration() {
    return this.duration;
  }

  public TFrequencyFilter setDuration(long duration) {
    this.duration = duration;
    setDurationIsSet(true);
    return this;
  }

  public void unsetDuration() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  /** Returns true if field duration is set (has been assigned a value) and false otherwise */
  public boolean isSetDuration() {
    return EncodingUtils.testBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  public void setDurationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DURATION_ISSET_ID, value);
  }

  /**
   * 时限（量）
   * 
   * @see TTimeUnit
   */
  public TTimeUnit getTime_unit() {
    return this.time_unit;
  }

  /**
   * 时限（量）
   * 
   * @see TTimeUnit
   */
  public TFrequencyFilter setTime_unit(TTimeUnit time_unit) {
    this.time_unit = time_unit;
    return this;
  }

  public void unsetTime_unit() {
    this.time_unit = null;
  }

  /** Returns true if field time_unit is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_unit() {
    return this.time_unit != null;
  }

  public void setTime_unitIsSet(boolean value) {
    if (!value) {
      this.time_unit = null;
    }
  }

  /**
   * 时限（单位）
   */
  public int getTimes() {
    return this.times;
  }

  /**
   * 时限（单位）
   */
  public TFrequencyFilter setTimes(int times) {
    this.times = times;
    setTimesIsSet(true);
    return this;
  }

  public void unsetTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMES_ISSET_ID);
  }

  /** Returns true if field times is set (has been assigned a value) and false otherwise */
  public boolean isSetTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMES_ISSET_ID);
  }

  public void setTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMES_ISSET_ID, value);
  }

  /**
   * 时限内能出现的次数
   */
  public boolean isIs_natrue() {
    return this.is_natrue;
  }

  /**
   * 时限内能出现的次数
   */
  public TFrequencyFilter setIs_natrue(boolean is_natrue) {
    this.is_natrue = is_natrue;
    setIs_natrueIsSet(true);
    return this;
  }

  public void unsetIs_natrue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_NATRUE_ISSET_ID);
  }

  /** Returns true if field is_natrue is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_natrue() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_NATRUE_ISSET_ID);
  }

  public void setIs_natrueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_NATRUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DURATION:
      if (value == null) {
        unsetDuration();
      } else {
        setDuration((Long)value);
      }
      break;

    case TIME_UNIT:
      if (value == null) {
        unsetTime_unit();
      } else {
        setTime_unit((TTimeUnit)value);
      }
      break;

    case TIMES:
      if (value == null) {
        unsetTimes();
      } else {
        setTimes((Integer)value);
      }
      break;

    case IS_NATRUE:
      if (value == null) {
        unsetIs_natrue();
      } else {
        setIs_natrue((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DURATION:
      return Long.valueOf(getDuration());

    case TIME_UNIT:
      return getTime_unit();

    case TIMES:
      return Integer.valueOf(getTimes());

    case IS_NATRUE:
      return Boolean.valueOf(isIs_natrue());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DURATION:
      return isSetDuration();
    case TIME_UNIT:
      return isSetTime_unit();
    case TIMES:
      return isSetTimes();
    case IS_NATRUE:
      return isSetIs_natrue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFrequencyFilter)
      return this.equals((TFrequencyFilter)that);
    return false;
  }

  public boolean equals(TFrequencyFilter that) {
    if (that == null)
      return false;

    boolean this_present_duration = true;
    boolean that_present_duration = true;
    if (this_present_duration || that_present_duration) {
      if (!(this_present_duration && that_present_duration))
        return false;
      if (this.duration != that.duration)
        return false;
    }

    boolean this_present_time_unit = true && this.isSetTime_unit();
    boolean that_present_time_unit = true && that.isSetTime_unit();
    if (this_present_time_unit || that_present_time_unit) {
      if (!(this_present_time_unit && that_present_time_unit))
        return false;
      if (!this.time_unit.equals(that.time_unit))
        return false;
    }

    boolean this_present_times = true;
    boolean that_present_times = true;
    if (this_present_times || that_present_times) {
      if (!(this_present_times && that_present_times))
        return false;
      if (this.times != that.times)
        return false;
    }

    boolean this_present_is_natrue = true && this.isSetIs_natrue();
    boolean that_present_is_natrue = true && that.isSetIs_natrue();
    if (this_present_is_natrue || that_present_is_natrue) {
      if (!(this_present_is_natrue && that_present_is_natrue))
        return false;
      if (this.is_natrue != that.is_natrue)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TFrequencyFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDuration()).compareTo(other.isSetDuration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDuration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.duration, other.duration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime_unit()).compareTo(other.isSetTime_unit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_unit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_unit, other.time_unit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimes()).compareTo(other.isSetTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.times, other.times);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_natrue()).compareTo(other.isSetIs_natrue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_natrue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_natrue, other.is_natrue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TFrequencyFilter(");
    boolean first = true;

    sb.append("duration:");
    sb.append(this.duration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_unit:");
    if (this.time_unit == null) {
      sb.append("null");
    } else {
      sb.append(this.time_unit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("times:");
    sb.append(this.times);
    first = false;
    if (isSetIs_natrue()) {
      if (!first) sb.append(", ");
      sb.append("is_natrue:");
      sb.append(this.is_natrue);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'duration' because it's a primitive and you chose the non-beans generator.
    if (time_unit == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_unit' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'times' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFrequencyFilterStandardSchemeFactory implements SchemeFactory {
    public TFrequencyFilterStandardScheme getScheme() {
      return new TFrequencyFilterStandardScheme();
    }
  }

  private static class TFrequencyFilterStandardScheme extends StandardScheme<TFrequencyFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFrequencyFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 11: // DURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.duration = iprot.readI64();
              struct.setDurationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // TIME_UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time_unit = TTimeUnit.findByValue(iprot.readI32());
              struct.setTime_unitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // TIMES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.times = iprot.readI32();
              struct.setTimesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 14: // IS_NATRUE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_natrue = iprot.readBool();
              struct.setIs_natrueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetDuration()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTimes()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'times' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFrequencyFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DURATION_FIELD_DESC);
      oprot.writeI64(struct.duration);
      oprot.writeFieldEnd();
      if (struct.time_unit != null) {
        oprot.writeFieldBegin(TIME_UNIT_FIELD_DESC);
        oprot.writeI32(struct.time_unit.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMES_FIELD_DESC);
      oprot.writeI32(struct.times);
      oprot.writeFieldEnd();
      if (struct.isSetIs_natrue()) {
        oprot.writeFieldBegin(IS_NATRUE_FIELD_DESC);
        oprot.writeBool(struct.is_natrue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFrequencyFilterTupleSchemeFactory implements SchemeFactory {
    public TFrequencyFilterTupleScheme getScheme() {
      return new TFrequencyFilterTupleScheme();
    }
  }

  private static class TFrequencyFilterTupleScheme extends TupleScheme<TFrequencyFilter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFrequencyFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.duration);
      oprot.writeI32(struct.time_unit.getValue());
      oprot.writeI32(struct.times);
      BitSet optionals = new BitSet();
      if (struct.isSetIs_natrue()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIs_natrue()) {
        oprot.writeBool(struct.is_natrue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFrequencyFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.duration = iprot.readI64();
      struct.setDurationIsSet(true);
      struct.time_unit = TTimeUnit.findByValue(iprot.readI32());
      struct.setTime_unitIsSet(true);
      struct.times = iprot.readI32();
      struct.setTimesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.is_natrue = iprot.readBool();
        struct.setIs_natrueIsSet(true);
      }
    }
  }

}
