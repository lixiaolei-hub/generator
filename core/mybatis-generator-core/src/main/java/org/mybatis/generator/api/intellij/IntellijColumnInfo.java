/**
 *    Copyright 2006-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.api.intellij;

public class IntellijColumnInfo {
  private String name;
  private int dataType;
  private boolean generatedColumn;
  private boolean autoIncrement;
  private int size;
  private int decimalDigits;
  private String remarks;
  private String columnDefaultValue;
  private Boolean nullable;
  private short keySeq;

  public IntellijColumnInfo() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDataType() {
    return this.dataType;
  }

  public void setDataType(int dataType) {
    this.dataType = dataType;
  }

  public boolean isGeneratedColumn() {
    return this.generatedColumn;
  }

  public void setGeneratedColumn(boolean generatedColumn) {
    this.generatedColumn = generatedColumn;
  }

  public boolean isAutoIncrement() {
    return this.autoIncrement;
  }

  public void setAutoIncrement(boolean autoIncrement) {
    this.autoIncrement = autoIncrement;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getDecimalDigits() {
    return this.decimalDigits;
  }

  public void setDecimalDigits(int decimalDigits) {
    this.decimalDigits = decimalDigits;
  }

  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getColumnDefaultValue() {
    return this.columnDefaultValue;
  }

  public void setColumnDefaultValue(String columnDefaultValue) {
    this.columnDefaultValue = columnDefaultValue;
  }

  public Boolean getNullable() {
    return this.nullable;
  }

  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }

  public short getKeySeq() {
    return this.keySeq;
  }

  public void setKeySeq(short keySeq) {
    this.keySeq = keySeq;
  }
}
