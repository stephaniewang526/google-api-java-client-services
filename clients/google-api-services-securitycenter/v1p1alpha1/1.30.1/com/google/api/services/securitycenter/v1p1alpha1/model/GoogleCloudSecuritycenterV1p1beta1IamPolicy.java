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

package com.google.api.services.securitycenter.v1p1alpha1.model;

/**
 * Cloud IAM Policy information associated with the Google Cloud resource described by the Security
 * Command Center asset. This information is managed and defined by the Google Cloud resource and
 * cannot be modified by the user.
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
public final class GoogleCloudSecuritycenterV1p1beta1IamPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The JSON representation of the Policy associated with the asset. See
   * https://cloud.google.com/iam/docs/reference/rest/v1/Policy for format details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyBlob;

  /**
   * The JSON representation of the Policy associated with the asset. See
   * https://cloud.google.com/iam/docs/reference/rest/v1/Policy for format details.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyBlob() {
    return policyBlob;
  }

  /**
   * The JSON representation of the Policy associated with the asset. See
   * https://cloud.google.com/iam/docs/reference/rest/v1/Policy for format details.
   * @param policyBlob policyBlob or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1IamPolicy setPolicyBlob(java.lang.String policyBlob) {
    this.policyBlob = policyBlob;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1IamPolicy set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1p1beta1IamPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1IamPolicy clone() {
    return (GoogleCloudSecuritycenterV1p1beta1IamPolicy) super.clone();
  }

}
