/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import java.util.Map;

import cn.com.believer.songyuanframework.openapi.storage.box.constant.BoxConstant;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.OverwriteRequest;

/**
 * @author Stefan Kopf
 * 
 */
public class OverwriteRequestImpl extends BoxRequestImpl implements OverwriteRequest {

    /** auth token. */
    private String authToken;

    /** folder id. */
    private String fileId;

    /** true means will upload Java File object rather than pure bytes array. */
    private boolean asFile;

    /**
     * map key is file name, value could be either Java File object or bytes
     * array.
     */
    private Map dataMap;

    /**
     * @return the authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * @return the fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @param fileId
     *            the folderId to set
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return the asFile
     */
    public boolean isAsFile() {
        return this.asFile;
    }

    /**
     * @param asFile
     *            the asFile to set
     */
    public void setAsFile(boolean asFile) {
        this.asFile = asFile;
    }

    /**
     * @return the dataMap
     */
    public Map getDataMap() {
        return this.dataMap;
    }

    /**
     * @param dataMap
     *            the dataMap to set
     */
    public void setDataMap(Map dataMap) {
        this.dataMap = dataMap;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_UPLOAD;
    }
}
