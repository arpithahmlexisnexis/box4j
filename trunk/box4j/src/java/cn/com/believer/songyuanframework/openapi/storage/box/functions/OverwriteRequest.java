/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

import java.util.Map;

/**
 * @author Stefan Kopf
 * 
 */
public interface OverwriteRequest extends BoxRequest {

    /**
     * @return the authToken
     */
    public String getAuthToken();

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken);

    /**
     * @return the folderId
     */
    public String getFileId();

    /**
     * @param folderId
     *            the folderId to set
     */
    public void setFileId(String fileId);

    /**
     * @return the asFile
     */
    public boolean isAsFile();

    /**
     * @param asFile
     *            the asFile to set
     */
    public void setAsFile(boolean asFile);

    /**
     * @return the dataMap
     */
    public Map getDataMap();

    /**
     * @param dataMap
     *            the dataMap to set
     */
    public void setDataMap(Map dataMap);
}
