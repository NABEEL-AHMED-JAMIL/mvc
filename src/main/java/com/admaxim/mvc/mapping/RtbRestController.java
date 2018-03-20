package com.admaxim.mvc.mapping;


import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * <h1>RTB-CONTROLLER-Generic</h1>
 * <p>
 * The @class RtbRestController program implements an application that
 * simply Work with "RTB-REQUEST" to the standard output.
 * </p>
 *
 * @author  Nabeel Ahmed
 * @version 1.0
 * @since   2016-03-12
 *
 *
 */
@RestController
public class RtbRestController {


    /************************************************************************************************
     * A property group for {@link RtbRestController } fetch {@link RtbRequest } request in POJO
     * {@link @method {@link RtbRequest} responseRtbJson({@link RtbRequest rtbRequest}}
     *
     * @param rtbRequest
     *
     * @return {@link RtbResponse } for {@link RtbRestController } configuration
     *
     *************************************************************************************************/
    @RequestMapping( value= { "/adsnativeBidder",
            "/adyoulikeBidder", "/avocarrotBidder", "/axonixBidder",
            "/brightRollBidder", "/envisionxBidder", "/flurryBidder"}, method = RequestMethod.POST)
    public RtbRequest responseRtbJson(@RequestBody RtbRequest rtbRequest) {

        System.out.println(rtbRequest.toString());
        return rtbRequest;
    }

    public void getAnnotaion(HttpServletRequest request) {
        System.out.println("request "+ request.getRequestURI());
        switch (request.getRequestURI()) {

            case "/adsnativeBidder":
            case "/adyoulikeBidder":
            case "/avocarrotBidder":
            case "/axonixBidder":
            case "/brightRollBidder":
            case "/envisionxBidder":
            case "/flurryBidder":

        }

    }

    public void createRTBResponse () {

    }



}
