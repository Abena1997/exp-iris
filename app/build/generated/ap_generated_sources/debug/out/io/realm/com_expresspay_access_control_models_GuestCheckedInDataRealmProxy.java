package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_expresspay_access_control_models_GuestCheckedInDataRealmProxy extends com.expresspay.access_control.models.GuestCheckedInData
    implements RealmObjectProxy, com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface {

    static final class GuestCheckedInDataColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long visitorNameIndex;
        long visitorPhoneIndex;
        long staffNameIndex;
        long purposeIndex;
        long passNumberIndex;
        long checkedInTimeIndex;
        long checkedOutTimeIndex;
        long checkedOutIndex;

        GuestCheckedInDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GuestCheckedInData");
            this.visitorNameIndex = addColumnDetails("visitorName", "visitorName", objectSchemaInfo);
            this.visitorPhoneIndex = addColumnDetails("visitorPhone", "visitorPhone", objectSchemaInfo);
            this.staffNameIndex = addColumnDetails("staffName", "staffName", objectSchemaInfo);
            this.purposeIndex = addColumnDetails("purpose", "purpose", objectSchemaInfo);
            this.passNumberIndex = addColumnDetails("passNumber", "passNumber", objectSchemaInfo);
            this.checkedInTimeIndex = addColumnDetails("checkedInTime", "checkedInTime", objectSchemaInfo);
            this.checkedOutTimeIndex = addColumnDetails("checkedOutTime", "checkedOutTime", objectSchemaInfo);
            this.checkedOutIndex = addColumnDetails("checkedOut", "checkedOut", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GuestCheckedInDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GuestCheckedInDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GuestCheckedInDataColumnInfo src = (GuestCheckedInDataColumnInfo) rawSrc;
            final GuestCheckedInDataColumnInfo dst = (GuestCheckedInDataColumnInfo) rawDst;
            dst.visitorNameIndex = src.visitorNameIndex;
            dst.visitorPhoneIndex = src.visitorPhoneIndex;
            dst.staffNameIndex = src.staffNameIndex;
            dst.purposeIndex = src.purposeIndex;
            dst.passNumberIndex = src.passNumberIndex;
            dst.checkedInTimeIndex = src.checkedInTimeIndex;
            dst.checkedOutTimeIndex = src.checkedOutTimeIndex;
            dst.checkedOutIndex = src.checkedOutIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GuestCheckedInDataColumnInfo columnInfo;
    private ProxyState<com.expresspay.access_control.models.GuestCheckedInData> proxyState;

    com_expresspay_access_control_models_GuestCheckedInDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GuestCheckedInDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.expresspay.access_control.models.GuestCheckedInData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$visitorName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.visitorNameIndex);
    }

    @Override
    public void realmSet$visitorName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.visitorNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.visitorNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.visitorNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.visitorNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$visitorPhone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.visitorPhoneIndex);
    }

    @Override
    public void realmSet$visitorPhone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.visitorPhoneIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.visitorPhoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.visitorPhoneIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.visitorPhoneIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$staffName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.staffNameIndex);
    }

    @Override
    public void realmSet$staffName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.staffNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.staffNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.staffNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.staffNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$purpose() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.purposeIndex);
    }

    @Override
    public void realmSet$purpose(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.purposeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.purposeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.purposeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.purposeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$passNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passNumberIndex);
    }

    @Override
    public void realmSet$passNumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passNumberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passNumberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passNumberIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passNumberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$checkedInTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.checkedInTimeIndex);
    }

    @Override
    public void realmSet$checkedInTime(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'checkedInTime' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$checkedOutTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.checkedOutTimeIndex);
    }

    @Override
    public void realmSet$checkedOutTime(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.checkedOutTimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.checkedOutTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.checkedOutTimeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.checkedOutTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$checkedOut() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.checkedOutIndex);
    }

    @Override
    public void realmSet$checkedOut(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.checkedOutIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.checkedOutIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("GuestCheckedInData", 8, 0);
        builder.addPersistedProperty("visitorName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("visitorPhone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("staffName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("purpose", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("passNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("checkedInTime", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("checkedOutTime", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("checkedOut", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GuestCheckedInDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GuestCheckedInDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GuestCheckedInData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GuestCheckedInData";
    }

    @SuppressWarnings("cast")
    public static com.expresspay.access_control.models.GuestCheckedInData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.expresspay.access_control.models.GuestCheckedInData obj = null;
        if (update) {
            Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
            GuestCheckedInDataColumnInfo columnInfo = (GuestCheckedInDataColumnInfo) realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class);
            long pkColumnIndex = columnInfo.checkedInTimeIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("checkedInTime")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("checkedInTime"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("checkedInTime")) {
                if (json.isNull("checkedInTime")) {
                    obj = (io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy) realm.createObjectInternal(com.expresspay.access_control.models.GuestCheckedInData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy) realm.createObjectInternal(com.expresspay.access_control.models.GuestCheckedInData.class, json.getString("checkedInTime"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'checkedInTime'.");
            }
        }

        final com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface objProxy = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) obj;
        if (json.has("visitorName")) {
            if (json.isNull("visitorName")) {
                objProxy.realmSet$visitorName(null);
            } else {
                objProxy.realmSet$visitorName((String) json.getString("visitorName"));
            }
        }
        if (json.has("visitorPhone")) {
            if (json.isNull("visitorPhone")) {
                objProxy.realmSet$visitorPhone(null);
            } else {
                objProxy.realmSet$visitorPhone((String) json.getString("visitorPhone"));
            }
        }
        if (json.has("staffName")) {
            if (json.isNull("staffName")) {
                objProxy.realmSet$staffName(null);
            } else {
                objProxy.realmSet$staffName((String) json.getString("staffName"));
            }
        }
        if (json.has("purpose")) {
            if (json.isNull("purpose")) {
                objProxy.realmSet$purpose(null);
            } else {
                objProxy.realmSet$purpose((String) json.getString("purpose"));
            }
        }
        if (json.has("passNumber")) {
            if (json.isNull("passNumber")) {
                objProxy.realmSet$passNumber(null);
            } else {
                objProxy.realmSet$passNumber((String) json.getString("passNumber"));
            }
        }
        if (json.has("checkedOutTime")) {
            if (json.isNull("checkedOutTime")) {
                objProxy.realmSet$checkedOutTime(null);
            } else {
                objProxy.realmSet$checkedOutTime((String) json.getString("checkedOutTime"));
            }
        }
        if (json.has("checkedOut")) {
            if (json.isNull("checkedOut")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'checkedOut' to null.");
            } else {
                objProxy.realmSet$checkedOut((boolean) json.getBoolean("checkedOut"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.expresspay.access_control.models.GuestCheckedInData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.expresspay.access_control.models.GuestCheckedInData obj = new com.expresspay.access_control.models.GuestCheckedInData();
        final com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface objProxy = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("visitorName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$visitorName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$visitorName(null);
                }
            } else if (name.equals("visitorPhone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$visitorPhone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$visitorPhone(null);
                }
            } else if (name.equals("staffName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$staffName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$staffName(null);
                }
            } else if (name.equals("purpose")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$purpose((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$purpose(null);
                }
            } else if (name.equals("passNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$passNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$passNumber(null);
                }
            } else if (name.equals("checkedInTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$checkedInTime((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$checkedInTime(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("checkedOutTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$checkedOutTime((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$checkedOutTime(null);
                }
            } else if (name.equals("checkedOut")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$checkedOut((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'checkedOut' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'checkedInTime'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_expresspay_access_control_models_GuestCheckedInDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class), false, Collections.<String>emptyList());
        io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy obj = new io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.expresspay.access_control.models.GuestCheckedInData copyOrUpdate(Realm realm, GuestCheckedInDataColumnInfo columnInfo, com.expresspay.access_control.models.GuestCheckedInData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.expresspay.access_control.models.GuestCheckedInData) cachedRealmObject;
        }

        com.expresspay.access_control.models.GuestCheckedInData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
            long pkColumnIndex = columnInfo.checkedInTimeIndex;
            String value = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedInTime();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.expresspay.access_control.models.GuestCheckedInData copy(Realm realm, GuestCheckedInDataColumnInfo columnInfo, com.expresspay.access_control.models.GuestCheckedInData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.expresspay.access_control.models.GuestCheckedInData) cachedRealmObject;
        }

        com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface realmObjectSource = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.visitorNameIndex, realmObjectSource.realmGet$visitorName());
        builder.addString(columnInfo.visitorPhoneIndex, realmObjectSource.realmGet$visitorPhone());
        builder.addString(columnInfo.staffNameIndex, realmObjectSource.realmGet$staffName());
        builder.addString(columnInfo.purposeIndex, realmObjectSource.realmGet$purpose());
        builder.addString(columnInfo.passNumberIndex, realmObjectSource.realmGet$passNumber());
        builder.addString(columnInfo.checkedInTimeIndex, realmObjectSource.realmGet$checkedInTime());
        builder.addString(columnInfo.checkedOutTimeIndex, realmObjectSource.realmGet$checkedOutTime());
        builder.addBoolean(columnInfo.checkedOutIndex, realmObjectSource.realmGet$checkedOut());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_expresspay_access_control_models_GuestCheckedInDataRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.expresspay.access_control.models.GuestCheckedInData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        long tableNativePtr = table.getNativePtr();
        GuestCheckedInDataColumnInfo columnInfo = (GuestCheckedInDataColumnInfo) realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class);
        long pkColumnIndex = columnInfo.checkedInTimeIndex;
        String primaryKeyValue = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedInTime();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$visitorName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorName();
        if (realmGet$visitorName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, realmGet$visitorName, false);
        }
        String realmGet$visitorPhone = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorPhone();
        if (realmGet$visitorPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, realmGet$visitorPhone, false);
        }
        String realmGet$staffName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$staffName();
        if (realmGet$staffName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.staffNameIndex, rowIndex, realmGet$staffName, false);
        }
        String realmGet$purpose = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$purpose();
        if (realmGet$purpose != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.purposeIndex, rowIndex, realmGet$purpose, false);
        }
        String realmGet$passNumber = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$passNumber();
        if (realmGet$passNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passNumberIndex, rowIndex, realmGet$passNumber, false);
        }
        String realmGet$checkedOutTime = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOutTime();
        if (realmGet$checkedOutTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, realmGet$checkedOutTime, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.checkedOutIndex, rowIndex, ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOut(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        long tableNativePtr = table.getNativePtr();
        GuestCheckedInDataColumnInfo columnInfo = (GuestCheckedInDataColumnInfo) realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class);
        long pkColumnIndex = columnInfo.checkedInTimeIndex;
        com.expresspay.access_control.models.GuestCheckedInData object = null;
        while (objects.hasNext()) {
            object = (com.expresspay.access_control.models.GuestCheckedInData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedInTime();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$visitorName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorName();
            if (realmGet$visitorName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, realmGet$visitorName, false);
            }
            String realmGet$visitorPhone = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorPhone();
            if (realmGet$visitorPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, realmGet$visitorPhone, false);
            }
            String realmGet$staffName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$staffName();
            if (realmGet$staffName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.staffNameIndex, rowIndex, realmGet$staffName, false);
            }
            String realmGet$purpose = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$purpose();
            if (realmGet$purpose != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.purposeIndex, rowIndex, realmGet$purpose, false);
            }
            String realmGet$passNumber = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$passNumber();
            if (realmGet$passNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passNumberIndex, rowIndex, realmGet$passNumber, false);
            }
            String realmGet$checkedOutTime = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOutTime();
            if (realmGet$checkedOutTime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, realmGet$checkedOutTime, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.checkedOutIndex, rowIndex, ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOut(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.expresspay.access_control.models.GuestCheckedInData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        long tableNativePtr = table.getNativePtr();
        GuestCheckedInDataColumnInfo columnInfo = (GuestCheckedInDataColumnInfo) realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class);
        long pkColumnIndex = columnInfo.checkedInTimeIndex;
        String primaryKeyValue = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedInTime();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$visitorName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorName();
        if (realmGet$visitorName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, realmGet$visitorName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, false);
        }
        String realmGet$visitorPhone = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorPhone();
        if (realmGet$visitorPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, realmGet$visitorPhone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, false);
        }
        String realmGet$staffName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$staffName();
        if (realmGet$staffName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.staffNameIndex, rowIndex, realmGet$staffName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.staffNameIndex, rowIndex, false);
        }
        String realmGet$purpose = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$purpose();
        if (realmGet$purpose != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.purposeIndex, rowIndex, realmGet$purpose, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.purposeIndex, rowIndex, false);
        }
        String realmGet$passNumber = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$passNumber();
        if (realmGet$passNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passNumberIndex, rowIndex, realmGet$passNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passNumberIndex, rowIndex, false);
        }
        String realmGet$checkedOutTime = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOutTime();
        if (realmGet$checkedOutTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, realmGet$checkedOutTime, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.checkedOutIndex, rowIndex, ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOut(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        long tableNativePtr = table.getNativePtr();
        GuestCheckedInDataColumnInfo columnInfo = (GuestCheckedInDataColumnInfo) realm.getSchema().getColumnInfo(com.expresspay.access_control.models.GuestCheckedInData.class);
        long pkColumnIndex = columnInfo.checkedInTimeIndex;
        com.expresspay.access_control.models.GuestCheckedInData object = null;
        while (objects.hasNext()) {
            object = (com.expresspay.access_control.models.GuestCheckedInData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedInTime();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$visitorName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorName();
            if (realmGet$visitorName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, realmGet$visitorName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.visitorNameIndex, rowIndex, false);
            }
            String realmGet$visitorPhone = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$visitorPhone();
            if (realmGet$visitorPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, realmGet$visitorPhone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.visitorPhoneIndex, rowIndex, false);
            }
            String realmGet$staffName = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$staffName();
            if (realmGet$staffName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.staffNameIndex, rowIndex, realmGet$staffName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.staffNameIndex, rowIndex, false);
            }
            String realmGet$purpose = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$purpose();
            if (realmGet$purpose != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.purposeIndex, rowIndex, realmGet$purpose, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.purposeIndex, rowIndex, false);
            }
            String realmGet$passNumber = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$passNumber();
            if (realmGet$passNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passNumberIndex, rowIndex, realmGet$passNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passNumberIndex, rowIndex, false);
            }
            String realmGet$checkedOutTime = ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOutTime();
            if (realmGet$checkedOutTime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, realmGet$checkedOutTime, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.checkedOutTimeIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.checkedOutIndex, rowIndex, ((com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) object).realmGet$checkedOut(), false);
        }
    }

    public static com.expresspay.access_control.models.GuestCheckedInData createDetachedCopy(com.expresspay.access_control.models.GuestCheckedInData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.expresspay.access_control.models.GuestCheckedInData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.expresspay.access_control.models.GuestCheckedInData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.expresspay.access_control.models.GuestCheckedInData) cachedObject.object;
            }
            unmanagedObject = (com.expresspay.access_control.models.GuestCheckedInData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface unmanagedCopy = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) unmanagedObject;
        com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface realmSource = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$visitorName(realmSource.realmGet$visitorName());
        unmanagedCopy.realmSet$visitorPhone(realmSource.realmGet$visitorPhone());
        unmanagedCopy.realmSet$staffName(realmSource.realmGet$staffName());
        unmanagedCopy.realmSet$purpose(realmSource.realmGet$purpose());
        unmanagedCopy.realmSet$passNumber(realmSource.realmGet$passNumber());
        unmanagedCopy.realmSet$checkedInTime(realmSource.realmGet$checkedInTime());
        unmanagedCopy.realmSet$checkedOutTime(realmSource.realmGet$checkedOutTime());
        unmanagedCopy.realmSet$checkedOut(realmSource.realmGet$checkedOut());

        return unmanagedObject;
    }

    static com.expresspay.access_control.models.GuestCheckedInData update(Realm realm, GuestCheckedInDataColumnInfo columnInfo, com.expresspay.access_control.models.GuestCheckedInData realmObject, com.expresspay.access_control.models.GuestCheckedInData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface realmObjectTarget = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) realmObject;
        com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface realmObjectSource = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxyInterface) newObject;
        Table table = realm.getTable(com.expresspay.access_control.models.GuestCheckedInData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.visitorNameIndex, realmObjectSource.realmGet$visitorName());
        builder.addString(columnInfo.visitorPhoneIndex, realmObjectSource.realmGet$visitorPhone());
        builder.addString(columnInfo.staffNameIndex, realmObjectSource.realmGet$staffName());
        builder.addString(columnInfo.purposeIndex, realmObjectSource.realmGet$purpose());
        builder.addString(columnInfo.passNumberIndex, realmObjectSource.realmGet$passNumber());
        builder.addString(columnInfo.checkedInTimeIndex, realmObjectSource.realmGet$checkedInTime());
        builder.addString(columnInfo.checkedOutTimeIndex, realmObjectSource.realmGet$checkedOutTime());
        builder.addBoolean(columnInfo.checkedOutIndex, realmObjectSource.realmGet$checkedOut());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("GuestCheckedInData = proxy[");
        stringBuilder.append("{visitorName:");
        stringBuilder.append(realmGet$visitorName() != null ? realmGet$visitorName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{visitorPhone:");
        stringBuilder.append(realmGet$visitorPhone() != null ? realmGet$visitorPhone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{staffName:");
        stringBuilder.append(realmGet$staffName() != null ? realmGet$staffName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{purpose:");
        stringBuilder.append(realmGet$purpose() != null ? realmGet$purpose() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{passNumber:");
        stringBuilder.append(realmGet$passNumber() != null ? realmGet$passNumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{checkedInTime:");
        stringBuilder.append(realmGet$checkedInTime() != null ? realmGet$checkedInTime() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{checkedOutTime:");
        stringBuilder.append(realmGet$checkedOutTime() != null ? realmGet$checkedOutTime() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{checkedOut:");
        stringBuilder.append(realmGet$checkedOut());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_expresspay_access_control_models_GuestCheckedInDataRealmProxy aGuestCheckedInData = (com_expresspay_access_control_models_GuestCheckedInDataRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGuestCheckedInData.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGuestCheckedInData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGuestCheckedInData.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
