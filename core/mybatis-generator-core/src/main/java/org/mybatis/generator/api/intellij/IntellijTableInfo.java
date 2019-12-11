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

import java.util.List;

public class IntellijTableInfo {

  private String tableName;
  private String databaseType;
  private String tableRemark;
  private String tableType;
  private List<IntellijColumnInfo> columnInfos;
  private List<IntellijColumnInfo> primaryKeyColumns;

  public IntellijTableInfo() {
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getDatabaseType() {
    return this.databaseType;
  }

  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }

  public List<IntellijColumnInfo> getColumnInfos() {
    return this.columnInfos;
  }

  public void setColumnInfos(List<IntellijColumnInfo> columnInfos) {
    this.columnInfos = columnInfos;
  }

  public List<IntellijColumnInfo> getPrimaryKeyColumns() {
    return this.primaryKeyColumns;
  }

  public void setPrimaryKeyColumns(List<IntellijColumnInfo> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
  }

  public String getTableRemark() {
    return this.tableRemark;
  }

  public void setTableRemark(String tableRemark) {
    this.tableRemark = tableRemark;
  }

  public String getTableType() {
    return this.tableType;
  }

  public void setTableType(String tableType) {
    this.tableType = tableType;
  }
}
