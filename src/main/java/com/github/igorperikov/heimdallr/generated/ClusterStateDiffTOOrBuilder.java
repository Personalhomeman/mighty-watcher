// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

package com.github.igorperikov.heimdallr.generated;

public interface ClusterStateDiffTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:heimdallr.ClusterStateDiffTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .heimdallr.NodeDefinitionTO&gt; nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinitionTO&gt; nodes = 1;</code>
   */
  boolean containsNodes(
      java.lang.String key);
  /**
   * Use {@link #getNodesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinitionTO>
  getNodes();
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinitionTO&gt; nodes = 1;</code>
   */
  java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinitionTO>
  getNodesMap();
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinitionTO&gt; nodes = 1;</code>
   */

  com.github.igorperikov.heimdallr.generated.NodeDefinitionTO getNodesOrDefault(
      java.lang.String key,
      com.github.igorperikov.heimdallr.generated.NodeDefinitionTO defaultValue);
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinitionTO&gt; nodes = 1;</code>
   */

  com.github.igorperikov.heimdallr.generated.NodeDefinitionTO getNodesOrThrow(
      java.lang.String key);
}
