/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog_service.proto

package com.google.cloud.retail.v2;

public final class CatalogServiceProto {
  private CatalogServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListCatalogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListCatalogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListCatalogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListCatalogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UpdateCatalogRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UpdateCatalogRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/retail/v2/catalog_service"
          + ".proto\022\026google.cloud.retail.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032$google/cloud/"
          + "retail/v2/catalog.proto\032\033google/protobuf"
          + "/empty.proto\032 google/protobuf/field_mask"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "w\n\023ListCatalogsRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\"b\n\024ListCatalogsResponse\0221\n\010catalogs\030\001 \003"
          + "(\0132\037.google.cloud.retail.v2.Catalog\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"~\n\024UpdateCatalogReq"
          + "uest\0225\n\007catalog\030\001 \001(\0132\037.google.cloud.ret"
          + "ail.v2.CatalogB\003\340A\002\022/\n\013update_mask\030\002 \001(\013"
          + "2\032.google.protobuf.FieldMask2\304\003\n\016Catalog"
          + "Service\022\250\001\n\014ListCatalogs\022+.google.cloud."
          + "retail.v2.ListCatalogsRequest\032,.google.c"
          + "loud.retail.v2.ListCatalogsResponse\"=\202\323\344"
          + "\223\002.\022,/v2/{parent=projects/*/locations/*}"
          + "/catalogs\332A\006parent\022\273\001\n\rUpdateCatalog\022,.g"
          + "oogle.cloud.retail.v2.UpdateCatalogReque"
          + "st\032\037.google.cloud.retail.v2.Catalog\"[\202\323\344"
          + "\223\002?24/v2/{catalog.name=projects/*/locati"
          + "ons/*/catalogs/*}:\007catalog\332A\023catalog,upd"
          + "ate_mask\032I\312A\025retail.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "ormB\310\001\n\032com.google.cloud.retail.v2B\023Cata"
          + "logServiceProtoP\001Z<google.golang.org/gen"
          + "proto/googleapis/cloud/retail/v2;retail\242"
          + "\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Goog"
          + "le\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Reta"
          + "il::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CatalogProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_ListCatalogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_ListCatalogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListCatalogsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_retail_v2_ListCatalogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_ListCatalogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListCatalogsResponse_descriptor,
            new java.lang.String[] {
              "Catalogs", "NextPageToken",
            });
    internal_static_google_cloud_retail_v2_UpdateCatalogRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_UpdateCatalogRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UpdateCatalogRequest_descriptor,
            new java.lang.String[] {
              "Catalog", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CatalogProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
