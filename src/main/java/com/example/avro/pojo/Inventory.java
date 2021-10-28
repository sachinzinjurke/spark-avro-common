/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro.pojo;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Inventory extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1563240028594860289L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Inventory\",\"namespace\":\"com.example.avro.pojo\",\"fields\":[{\"name\":\"inventoryId\",\"type\":\"string\"},{\"name\":\"inventoryVersion\",\"type\":[\"int\",\"null\"],\"default\":null},{\"name\":\"processedTs\",\"type\":\"long\"},{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"inputSystemIsac\",\"type\":\"string\"},{\"name\":\"domainIsac\",\"type\":\"string\"},{\"name\":\"messageType\",\"type\":\"string\"},{\"name\":\"status\",\"type\":[\"string\",\"null\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Inventory> ENCODER =
      new BinaryMessageEncoder<Inventory>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Inventory> DECODER =
      new BinaryMessageDecoder<Inventory>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Inventory> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Inventory> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Inventory>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Inventory to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Inventory from a ByteBuffer. */
  public static Inventory fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence inventoryId;
  @Deprecated public java.lang.Integer inventoryVersion;
  @Deprecated public long processedTs;
  @Deprecated public java.lang.CharSequence source;
  @Deprecated public java.lang.CharSequence inputSystemIsac;
  @Deprecated public java.lang.CharSequence domainIsac;
  @Deprecated public java.lang.CharSequence messageType;
  @Deprecated public java.lang.CharSequence status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Inventory() {}

  /**
   * All-args constructor.
   * @param inventoryId The new value for inventoryId
   * @param inventoryVersion The new value for inventoryVersion
   * @param processedTs The new value for processedTs
   * @param source The new value for source
   * @param inputSystemIsac The new value for inputSystemIsac
   * @param domainIsac The new value for domainIsac
   * @param messageType The new value for messageType
   * @param status The new value for status
   */
  public Inventory(java.lang.CharSequence inventoryId, java.lang.Integer inventoryVersion, java.lang.Long processedTs, java.lang.CharSequence source, java.lang.CharSequence inputSystemIsac, java.lang.CharSequence domainIsac, java.lang.CharSequence messageType, java.lang.CharSequence status) {
    this.inventoryId = inventoryId;
    this.inventoryVersion = inventoryVersion;
    this.processedTs = processedTs;
    this.source = source;
    this.inputSystemIsac = inputSystemIsac;
    this.domainIsac = domainIsac;
    this.messageType = messageType;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return inventoryId;
    case 1: return inventoryVersion;
    case 2: return processedTs;
    case 3: return source;
    case 4: return inputSystemIsac;
    case 5: return domainIsac;
    case 6: return messageType;
    case 7: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: inventoryId = (java.lang.CharSequence)value$; break;
    case 1: inventoryVersion = (java.lang.Integer)value$; break;
    case 2: processedTs = (java.lang.Long)value$; break;
    case 3: source = (java.lang.CharSequence)value$; break;
    case 4: inputSystemIsac = (java.lang.CharSequence)value$; break;
    case 5: domainIsac = (java.lang.CharSequence)value$; break;
    case 6: messageType = (java.lang.CharSequence)value$; break;
    case 7: status = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'inventoryId' field.
   * @return The value of the 'inventoryId' field.
   */
  public java.lang.CharSequence getInventoryId() {
    return inventoryId;
  }

  /**
   * Sets the value of the 'inventoryId' field.
   * @param value the value to set.
   */
  public void setInventoryId(java.lang.CharSequence value) {
    this.inventoryId = value;
  }

  /**
   * Gets the value of the 'inventoryVersion' field.
   * @return The value of the 'inventoryVersion' field.
   */
  public java.lang.Integer getInventoryVersion() {
    return inventoryVersion;
  }

  /**
   * Sets the value of the 'inventoryVersion' field.
   * @param value the value to set.
   */
  public void setInventoryVersion(java.lang.Integer value) {
    this.inventoryVersion = value;
  }

  /**
   * Gets the value of the 'processedTs' field.
   * @return The value of the 'processedTs' field.
   */
  public java.lang.Long getProcessedTs() {
    return processedTs;
  }

  /**
   * Sets the value of the 'processedTs' field.
   * @param value the value to set.
   */
  public void setProcessedTs(java.lang.Long value) {
    this.processedTs = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public java.lang.CharSequence getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.CharSequence value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'inputSystemIsac' field.
   * @return The value of the 'inputSystemIsac' field.
   */
  public java.lang.CharSequence getInputSystemIsac() {
    return inputSystemIsac;
  }

  /**
   * Sets the value of the 'inputSystemIsac' field.
   * @param value the value to set.
   */
  public void setInputSystemIsac(java.lang.CharSequence value) {
    this.inputSystemIsac = value;
  }

  /**
   * Gets the value of the 'domainIsac' field.
   * @return The value of the 'domainIsac' field.
   */
  public java.lang.CharSequence getDomainIsac() {
    return domainIsac;
  }

  /**
   * Sets the value of the 'domainIsac' field.
   * @param value the value to set.
   */
  public void setDomainIsac(java.lang.CharSequence value) {
    this.domainIsac = value;
  }

  /**
   * Gets the value of the 'messageType' field.
   * @return The value of the 'messageType' field.
   */
  public java.lang.CharSequence getMessageType() {
    return messageType;
  }

  /**
   * Sets the value of the 'messageType' field.
   * @param value the value to set.
   */
  public void setMessageType(java.lang.CharSequence value) {
    this.messageType = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Creates a new Inventory RecordBuilder.
   * @return A new Inventory RecordBuilder
   */
  public static com.example.avro.pojo.Inventory.Builder newBuilder() {
    return new com.example.avro.pojo.Inventory.Builder();
  }

  /**
   * Creates a new Inventory RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Inventory RecordBuilder
   */
  public static com.example.avro.pojo.Inventory.Builder newBuilder(com.example.avro.pojo.Inventory.Builder other) {
    return new com.example.avro.pojo.Inventory.Builder(other);
  }

  /**
   * Creates a new Inventory RecordBuilder by copying an existing Inventory instance.
   * @param other The existing instance to copy.
   * @return A new Inventory RecordBuilder
   */
  public static com.example.avro.pojo.Inventory.Builder newBuilder(com.example.avro.pojo.Inventory other) {
    return new com.example.avro.pojo.Inventory.Builder(other);
  }

  /**
   * RecordBuilder for Inventory instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Inventory>
    implements org.apache.avro.data.RecordBuilder<Inventory> {

    private java.lang.CharSequence inventoryId;
    private java.lang.Integer inventoryVersion;
    private long processedTs;
    private java.lang.CharSequence source;
    private java.lang.CharSequence inputSystemIsac;
    private java.lang.CharSequence domainIsac;
    private java.lang.CharSequence messageType;
    private java.lang.CharSequence status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.pojo.Inventory.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.inventoryId)) {
        this.inventoryId = data().deepCopy(fields()[0].schema(), other.inventoryId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inventoryVersion)) {
        this.inventoryVersion = data().deepCopy(fields()[1].schema(), other.inventoryVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.processedTs)) {
        this.processedTs = data().deepCopy(fields()[2].schema(), other.processedTs);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source)) {
        this.source = data().deepCopy(fields()[3].schema(), other.source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.inputSystemIsac)) {
        this.inputSystemIsac = data().deepCopy(fields()[4].schema(), other.inputSystemIsac);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.domainIsac)) {
        this.domainIsac = data().deepCopy(fields()[5].schema(), other.domainIsac);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.messageType)) {
        this.messageType = data().deepCopy(fields()[6].schema(), other.messageType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Inventory instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.pojo.Inventory other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.inventoryId)) {
        this.inventoryId = data().deepCopy(fields()[0].schema(), other.inventoryId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inventoryVersion)) {
        this.inventoryVersion = data().deepCopy(fields()[1].schema(), other.inventoryVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.processedTs)) {
        this.processedTs = data().deepCopy(fields()[2].schema(), other.processedTs);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source)) {
        this.source = data().deepCopy(fields()[3].schema(), other.source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.inputSystemIsac)) {
        this.inputSystemIsac = data().deepCopy(fields()[4].schema(), other.inputSystemIsac);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.domainIsac)) {
        this.domainIsac = data().deepCopy(fields()[5].schema(), other.domainIsac);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.messageType)) {
        this.messageType = data().deepCopy(fields()[6].schema(), other.messageType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'inventoryId' field.
      * @return The value.
      */
    public java.lang.CharSequence getInventoryId() {
      return inventoryId;
    }

    /**
      * Sets the value of the 'inventoryId' field.
      * @param value The value of 'inventoryId'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setInventoryId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.inventoryId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'inventoryId' field has been set.
      * @return True if the 'inventoryId' field has been set, false otherwise.
      */
    public boolean hasInventoryId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'inventoryId' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearInventoryId() {
      inventoryId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'inventoryVersion' field.
      * @return The value.
      */
    public java.lang.Integer getInventoryVersion() {
      return inventoryVersion;
    }

    /**
      * Sets the value of the 'inventoryVersion' field.
      * @param value The value of 'inventoryVersion'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setInventoryVersion(java.lang.Integer value) {
      validate(fields()[1], value);
      this.inventoryVersion = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'inventoryVersion' field has been set.
      * @return True if the 'inventoryVersion' field has been set, false otherwise.
      */
    public boolean hasInventoryVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'inventoryVersion' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearInventoryVersion() {
      inventoryVersion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'processedTs' field.
      * @return The value.
      */
    public java.lang.Long getProcessedTs() {
      return processedTs;
    }

    /**
      * Sets the value of the 'processedTs' field.
      * @param value The value of 'processedTs'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setProcessedTs(long value) {
      validate(fields()[2], value);
      this.processedTs = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'processedTs' field has been set.
      * @return True if the 'processedTs' field has been set, false otherwise.
      */
    public boolean hasProcessedTs() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'processedTs' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearProcessedTs() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public java.lang.CharSequence getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setSource(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.source = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearSource() {
      source = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'inputSystemIsac' field.
      * @return The value.
      */
    public java.lang.CharSequence getInputSystemIsac() {
      return inputSystemIsac;
    }

    /**
      * Sets the value of the 'inputSystemIsac' field.
      * @param value The value of 'inputSystemIsac'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setInputSystemIsac(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.inputSystemIsac = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'inputSystemIsac' field has been set.
      * @return True if the 'inputSystemIsac' field has been set, false otherwise.
      */
    public boolean hasInputSystemIsac() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'inputSystemIsac' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearInputSystemIsac() {
      inputSystemIsac = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'domainIsac' field.
      * @return The value.
      */
    public java.lang.CharSequence getDomainIsac() {
      return domainIsac;
    }

    /**
      * Sets the value of the 'domainIsac' field.
      * @param value The value of 'domainIsac'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setDomainIsac(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.domainIsac = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'domainIsac' field has been set.
      * @return True if the 'domainIsac' field has been set, false otherwise.
      */
    public boolean hasDomainIsac() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'domainIsac' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearDomainIsac() {
      domainIsac = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageType' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessageType() {
      return messageType;
    }

    /**
      * Sets the value of the 'messageType' field.
      * @param value The value of 'messageType'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setMessageType(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.messageType = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'messageType' field has been set.
      * @return True if the 'messageType' field has been set, false otherwise.
      */
    public boolean hasMessageType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'messageType' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearMessageType() {
      messageType = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.status = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.example.avro.pojo.Inventory.Builder clearStatus() {
      status = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Inventory build() {
      try {
        Inventory record = new Inventory();
        record.inventoryId = fieldSetFlags()[0] ? this.inventoryId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.inventoryVersion = fieldSetFlags()[1] ? this.inventoryVersion : (java.lang.Integer) defaultValue(fields()[1]);
        record.processedTs = fieldSetFlags()[2] ? this.processedTs : (java.lang.Long) defaultValue(fields()[2]);
        record.source = fieldSetFlags()[3] ? this.source : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.inputSystemIsac = fieldSetFlags()[4] ? this.inputSystemIsac : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.domainIsac = fieldSetFlags()[5] ? this.domainIsac : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.messageType = fieldSetFlags()[6] ? this.messageType : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.status = fieldSetFlags()[7] ? this.status : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Inventory>
    WRITER$ = (org.apache.avro.io.DatumWriter<Inventory>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Inventory>
    READER$ = (org.apache.avro.io.DatumReader<Inventory>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
