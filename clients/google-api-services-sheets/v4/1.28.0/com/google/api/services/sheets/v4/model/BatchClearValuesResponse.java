/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sheets.v4.model;

/**
 * The response when clearing a range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchClearValuesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The ranges that were cleared, in A1 notation. If the requests are for an unbounded range or a
   * ranger larger than the bounds of the sheet, this is the actual ranges that were cleared,
   * bounded to the sheet's limits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> clearedRanges;

  /**
   * The spreadsheet the updates were applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The ranges that were cleared, in A1 notation. If the requests are for an unbounded range or a
   * ranger larger than the bounds of the sheet, this is the actual ranges that were cleared,
   * bounded to the sheet's limits.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getClearedRanges() {
    return clearedRanges;
  }

  /**
   * The ranges that were cleared, in A1 notation. If the requests are for an unbounded range or a
   * ranger larger than the bounds of the sheet, this is the actual ranges that were cleared,
   * bounded to the sheet's limits.
   * @param clearedRanges clearedRanges or {@code null} for none
   */
  public BatchClearValuesResponse setClearedRanges(java.util.List<java.lang.String> clearedRanges) {
    this.clearedRanges = clearedRanges;
    return this;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public BatchClearValuesResponse setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  @Override
  public BatchClearValuesResponse set(String fieldName, Object value) {
    return (BatchClearValuesResponse) super.set(fieldName, value);
  }

  @Override
  public BatchClearValuesResponse clone() {
    return (BatchClearValuesResponse) super.clone();
  }

}
