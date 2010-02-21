/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.methods;

import java.io.IOException;

import cn.com.believer.songyuanframework.openapi.storage.box.factories.BoxResponseFactory;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetAccountTreeResponse;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetCommentsRequest;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetCommentsResponse;
import cn.com.believer.songyuanframework.openapi.storage.box.objects.BoxException;

/**
 * @author jjia
 * 
 */
public class GetCommentsMethod extends BaseBoxMethod {

    /**
     * This method is used to retrieve the comments on an item.
     * 
     * @param getCommentsRequest
     *            request object
     * @return response object
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetCommentsResponse getComments(GetCommentsRequest getCommentsRequest) {

        GetCommentsResponse getCommentsResponse = BoxResponseFactory.createGetCommentsResponse();
        
        return null;
    }

}
