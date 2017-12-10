package com.suda.jzapp.dao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECORD_TYPE".
*/
public class RecordTypeDao extends AbstractDao<RecordType, Long> {

    public static final String TABLENAME = "RECORD_TYPE";

    /**
     * Properties of entity RecordType.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RecordTypeID = new Property(1, Long.class, "RecordTypeID", false, "RECORD_TYPE_ID");
        public final static Property RecordDesc = new Property(2, String.class, "RecordDesc", false, "RECORD_DESC");
        public final static Property RecordType = new Property(3, Integer.class, "RecordType", false, "RECORD_TYPE");
        public final static Property SysType = new Property(4, Boolean.class, "SysType", false, "SYS_TYPE");
        public final static Property RecordIcon = new Property(5, Integer.class, "RecordIcon", false, "RECORD_ICON");
        public final static Property Index = new Property(6, Integer.class, "Index", false, "INDEX");
        public final static Property SexProp = new Property(7, Integer.class, "SexProp", false, "SEX_PROP");
        public final static Property Occupation = new Property(8, Integer.class, "Occupation", false, "OCCUPATION");
        public final static Property SyncStatus = new Property(9, Boolean.class, "SyncStatus", false, "SYNC_STATUS");
        public final static Property IsDel = new Property(10, Boolean.class, "isDel", false, "IS_DEL");
        public final static Property ObjectID = new Property(11, String.class, "ObjectID", false, "OBJECT_ID");
        public final static Property CreatedAt = new Property(12, java.util.Date.class, "createdAt", false, "CREATED_AT");
        public final static Property UpdatedAt = new Property(13, java.util.Date.class, "updatedAt", false, "UPDATED_AT");
    }


    public RecordTypeDao(DaoConfig config) {
        super(config);
    }
    
    public RecordTypeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECORD_TYPE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"RECORD_TYPE_ID\" INTEGER," + // 1: RecordTypeID
                "\"RECORD_DESC\" TEXT," + // 2: RecordDesc
                "\"RECORD_TYPE\" INTEGER," + // 3: RecordType
                "\"SYS_TYPE\" INTEGER," + // 4: SysType
                "\"RECORD_ICON\" INTEGER," + // 5: RecordIcon
                "\"INDEX\" INTEGER," + // 6: Index
                "\"SEX_PROP\" INTEGER," + // 7: SexProp
                "\"OCCUPATION\" INTEGER," + // 8: Occupation
                "\"SYNC_STATUS\" INTEGER," + // 9: SyncStatus
                "\"IS_DEL\" INTEGER," + // 10: isDel
                "\"OBJECT_ID\" TEXT," + // 11: ObjectID
                "\"CREATED_AT\" INTEGER," + // 12: createdAt
                "\"UPDATED_AT\" INTEGER);"); // 13: updatedAt
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECORD_TYPE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RecordType entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long RecordTypeID = entity.getRecordTypeID();
        if (RecordTypeID != null) {
            stmt.bindLong(2, RecordTypeID);
        }
 
        String RecordDesc = entity.getRecordDesc();
        if (RecordDesc != null) {
            stmt.bindString(3, RecordDesc);
        }
 
        Integer RecordType = entity.getRecordType();
        if (RecordType != null) {
            stmt.bindLong(4, RecordType);
        }
 
        Boolean SysType = entity.getSysType();
        if (SysType != null) {
            stmt.bindLong(5, SysType ? 1L: 0L);
        }
 
        Integer RecordIcon = entity.getRecordIcon();
        if (RecordIcon != null) {
            stmt.bindLong(6, RecordIcon);
        }
 
        Integer Index = entity.getIndex();
        if (Index != null) {
            stmt.bindLong(7, Index);
        }
 
        Integer SexProp = entity.getSexProp();
        if (SexProp != null) {
            stmt.bindLong(8, SexProp);
        }
 
        Integer Occupation = entity.getOccupation();
        if (Occupation != null) {
            stmt.bindLong(9, Occupation);
        }
 
        Boolean SyncStatus = entity.getSyncStatus();
        if (SyncStatus != null) {
            stmt.bindLong(10, SyncStatus ? 1L: 0L);
        }
 
        Boolean isDel = entity.getIsDel();
        if (isDel != null) {
            stmt.bindLong(11, isDel ? 1L: 0L);
        }
 
        String ObjectID = entity.getObjectID();
        if (ObjectID != null) {
            stmt.bindString(12, ObjectID);
        }
 
        java.util.Date createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindLong(13, createdAt.getTime());
        }
 
        java.util.Date updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindLong(14, updatedAt.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RecordType entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long RecordTypeID = entity.getRecordTypeID();
        if (RecordTypeID != null) {
            stmt.bindLong(2, RecordTypeID);
        }
 
        String RecordDesc = entity.getRecordDesc();
        if (RecordDesc != null) {
            stmt.bindString(3, RecordDesc);
        }
 
        Integer RecordType = entity.getRecordType();
        if (RecordType != null) {
            stmt.bindLong(4, RecordType);
        }
 
        Boolean SysType = entity.getSysType();
        if (SysType != null) {
            stmt.bindLong(5, SysType ? 1L: 0L);
        }
 
        Integer RecordIcon = entity.getRecordIcon();
        if (RecordIcon != null) {
            stmt.bindLong(6, RecordIcon);
        }
 
        Integer Index = entity.getIndex();
        if (Index != null) {
            stmt.bindLong(7, Index);
        }
 
        Integer SexProp = entity.getSexProp();
        if (SexProp != null) {
            stmt.bindLong(8, SexProp);
        }
 
        Integer Occupation = entity.getOccupation();
        if (Occupation != null) {
            stmt.bindLong(9, Occupation);
        }
 
        Boolean SyncStatus = entity.getSyncStatus();
        if (SyncStatus != null) {
            stmt.bindLong(10, SyncStatus ? 1L: 0L);
        }
 
        Boolean isDel = entity.getIsDel();
        if (isDel != null) {
            stmt.bindLong(11, isDel ? 1L: 0L);
        }
 
        String ObjectID = entity.getObjectID();
        if (ObjectID != null) {
            stmt.bindString(12, ObjectID);
        }
 
        java.util.Date createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindLong(13, createdAt.getTime());
        }
 
        java.util.Date updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindLong(14, updatedAt.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public RecordType readEntity(Cursor cursor, int offset) {
        RecordType entity = new RecordType( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // RecordTypeID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // RecordDesc
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // RecordType
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // SysType
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // RecordIcon
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // Index
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // SexProp
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // Occupation
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0, // SyncStatus
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // isDel
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ObjectID
            cursor.isNull(offset + 12) ? null : new java.util.Date(cursor.getLong(offset + 12)), // createdAt
            cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)) // updatedAt
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RecordType entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRecordTypeID(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setRecordDesc(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setRecordType(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setSysType(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setRecordIcon(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setIndex(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSexProp(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setOccupation(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setSyncStatus(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
        entity.setIsDel(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setObjectID(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setCreatedAt(cursor.isNull(offset + 12) ? null : new java.util.Date(cursor.getLong(offset + 12)));
        entity.setUpdatedAt(cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RecordType entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RecordType entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RecordType entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
