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
 * Security Command Center managed properties. These properties are managed by Security Command
 * Center and cannot be modified by the user.
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
public final class GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties extends com.google.api.client.json.GenericJson {

  /**
   * The user defined display name for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceDisplayName;

  /**
   * The full resource name of the Google Cloud resource this asset represents. This field is
   * immutable after create time. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Owners of the Google Cloud resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceOwners;

  /**
   * The full resource name of the immediate parent of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceParent;

  /**
   * The user defined display name for the parent of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceParentDisplayName;

  /**
   * The full resource name of the project the resource belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceProject;

  /**
   * The user defined display name for the project of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceProjectDisplayName;

  /**
   * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and
   * ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the
   * producer of the resource and is immutable after create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * The user defined display name for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceDisplayName() {
    return resourceDisplayName;
  }

  /**
   * The user defined display name for this resource.
   * @param resourceDisplayName resourceDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceDisplayName(java.lang.String resourceDisplayName) {
    this.resourceDisplayName = resourceDisplayName;
    return this;
  }

  /**
   * The full resource name of the Google Cloud resource this asset represents. This field is
   * immutable after create time. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * The full resource name of the Google Cloud resource this asset represents. This field is
   * immutable after create time. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @param resourceName resourceName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Owners of the Google Cloud resource.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceOwners() {
    return resourceOwners;
  }

  /**
   * Owners of the Google Cloud resource.
   * @param resourceOwners resourceOwners or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceOwners(java.util.List<java.lang.String> resourceOwners) {
    this.resourceOwners = resourceOwners;
    return this;
  }

  /**
   * The full resource name of the immediate parent of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceParent() {
    return resourceParent;
  }

  /**
   * The full resource name of the immediate parent of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @param resourceParent resourceParent or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceParent(java.lang.String resourceParent) {
    this.resourceParent = resourceParent;
    return this;
  }

  /**
   * The user defined display name for the parent of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceParentDisplayName() {
    return resourceParentDisplayName;
  }

  /**
   * The user defined display name for the parent of this resource.
   * @param resourceParentDisplayName resourceParentDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceParentDisplayName(java.lang.String resourceParentDisplayName) {
    this.resourceParentDisplayName = resourceParentDisplayName;
    return this;
  }

  /**
   * The full resource name of the project the resource belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceProject() {
    return resourceProject;
  }

  /**
   * The full resource name of the project the resource belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * @param resourceProject resourceProject or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceProject(java.lang.String resourceProject) {
    this.resourceProject = resourceProject;
    return this;
  }

  /**
   * The user defined display name for the project of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceProjectDisplayName() {
    return resourceProjectDisplayName;
  }

  /**
   * The user defined display name for the project of this resource.
   * @param resourceProjectDisplayName resourceProjectDisplayName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceProjectDisplayName(java.lang.String resourceProjectDisplayName) {
    this.resourceProjectDisplayName = resourceProjectDisplayName;
    return this;
  }

  /**
   * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and
   * ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the
   * producer of the resource and is immutable after create time.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and
   * ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the
   * producer of the resource and is immutable after create time.
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties clone() {
    return (GoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties) super.clone();
  }

}
