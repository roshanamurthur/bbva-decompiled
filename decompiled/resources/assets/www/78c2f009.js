import{a as e,h as s,b as t}from"./952f98a9.js";import{d as r}from"./f89161ad.js";import"./7d773f57.js";import"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./d2484b66.js";import"./4656db6d.js";class i extends(e(r)){static get is(){return"bbva-civil-registries-search-mx-api-dm"}static get scopedElements(){const e=[t];return i.scopedElementsFromClasses(e)}render(){return s`
      <bbva-core-generic-dp
        id="civilRegistriesSearch"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        method="post"
        @request-success="${this._handlerSearchSuccess}"
        @request-error="${this._handlerSearchError}"
      >
      </bbva-core-generic-dp>
    `}_handlerSearchSuccess(e){this.dispatchEvent(new CustomEvent("civil-registries-search-api-dm-fetch",{bubbles:!0,composed:!0,detail:e.detail.data})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handlerSearchError(e){var s,t,r,i;e.stopPropagation();const o=e.detail.response,a=this._getErrorCode(null==o||null===(s=o.messages)||void 0===s||null===(t=s[0])||void 0===t||null===(r=t.message.split("#"))||void 0===r?void 0:r[0]),d=400===(null==e||null===(i=e.detail)||void 0===i?void 0:i.status)?"civil-registries-search-api-dm-fetch-error":"api-dm-error";this.dispatchEvent(new CustomEvent(d,{bubbles:!0,composed:!0,detail:a})),this.dispatchEvent(new CustomEvent("api-dm-response-error",{bubbles:!0,composed:!0,detail:!0}))}_getErrorCode(e){return{"00915309":{code:"dataNoMatch",message:"There are no records for the request made"},"01519031":{code:"dataNoMatch",message:"There are no records for the request made"},"01519021":{code:"dataNoMatch",message:"There are no records for the request made"}}[e]}_requestCivilRegistriesSearchMx(e){const s=this.shadowRoot.getElementById("civilRegistriesSearch");this._setGenericRequest({dm:s,path:"customers/v1/civil-registries/search",body:e})}async postCivilRegistriesSearch(e){this._requestCivilRegistriesSearchMx(e)}_setGenericRequest({dm:e,path:s,body:t}){return e.native=!1,e.requiresToken=!0,e.path=`${s}`,e.body=t,e.generateRequest()}}customElements.define(i.is,i);export{i as BbvaCivilRegistriesSearchMxApiDm};
