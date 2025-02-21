// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.computefleet.models.FleetProperties;
import com.azure.resourcemanager.computefleet.models.ManagedServiceIdentity;
import com.azure.resourcemanager.computefleet.models.Plan;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * An Compute Fleet resource.
 */
@Fluent
public final class FleetInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    private FleetProperties properties;

    /*
     * Zones in which the Compute Fleet is available
     */
    private List<String> zones;

    /*
     * The managed service identities assigned to this resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * Details of the resource plan.
     */
    private Plan plan;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of FleetInner class.
     */
    public FleetInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public FleetProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the FleetInner object itself.
     */
    public FleetInner withProperties(FleetProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the zones property: Zones in which the Compute Fleet is available.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Zones in which the Compute Fleet is available.
     * 
     * @param zones the zones value to set.
     * @return the FleetInner object itself.
     */
    public FleetInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     * 
     * @param identity the identity value to set.
     * @return the FleetInner object itself.
     */
    public FleetInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the plan property: Details of the resource plan.
     * 
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Details of the resource plan.
     * 
     * @param plan the plan value to set.
     * @return the FleetInner object itself.
     */
    public FleetInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FleetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FleetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("plan", this.plan);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FleetInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FleetInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FleetInner.
     */
    public static FleetInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FleetInner deserializedFleetInner = new FleetInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFleetInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFleetInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFleetInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedFleetInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedFleetInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedFleetInner.properties = FleetProperties.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedFleetInner.zones = zones;
                } else if ("identity".equals(fieldName)) {
                    deserializedFleetInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("plan".equals(fieldName)) {
                    deserializedFleetInner.plan = Plan.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedFleetInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFleetInner;
        });
    }
}
