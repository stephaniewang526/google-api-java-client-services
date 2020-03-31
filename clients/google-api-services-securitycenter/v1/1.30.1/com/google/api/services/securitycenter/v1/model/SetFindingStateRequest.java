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

package com.google.api.services.securitycenter.v1.model;

/**
 * Request message for updating a finding's state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetFindingStateRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The time at which the updated state takes effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required. The desired State of the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The time at which the updated state takes effect.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Required. The time at which the updated state takes effect.
   * @param startTime startTime or {@code null} for none
   */
  public SetFindingStateRequest setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Required. The desired State of the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Required. The desired State of the finding.
   * @param state state or {@code null} for none
   */
  public SetFindingStateRequest setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public SetFindingStateRequest set(String fieldName, Object value) {
    return (SetFindingStateRequest) super.set(fieldName, value);
  }

  @Override
  public SetFindingStateRequest clone() {
    return (SetFindingStateRequest) super.clone();
  }

}
