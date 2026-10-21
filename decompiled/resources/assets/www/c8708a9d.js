import{J as e,L as t,aZ as i,h as s,z as a,a8 as n,ak as o,ab as r,dJ as l,e3 as d,an as c,bF as h,ag as u,bU as g,a9 as p,cI as m,cD as b,di as v,cH as _,F as y,eb as f,ec as S,aV as C,i as x}from"./952f98a9.js";import{aE as T,C as w,v as k,M,L as E,G as H,x as $,I as R}from"./216055dc.js";import{B as P,a as I,b as D}from"./718d2902.js";import{B as O,a$ as N,aH as A}from"./7f3d7ca9.js";import"./0fe4c3f6.js";import"./5b1cfb65.js";import"./c0a2f832.js";import"./cae0f1de.js";class F extends(e(t)){static get is(){return"bbva-local-single-sign-on-api-dm"}postSingleSignOn(e){this._generateGetService(this._getService("post",e),{customEvent:"single-sign-on-api-dm-create",errorFireEventHandler:"single-sign-on-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}SingleSignOn`,this._getBgadp(s))}_getBgadp(e){return{postSingleSignOnV0:()=>new T(e),default:()=>"BGADP called not exist"}}_responseMapping(e={}){return e}}class L extends(e(t)){static get is(){return"bbva-local-purecloud-api-dm"}static get properties(){return{}}constructor(){super(),this.version="0",this.requiredToken="tsec",this.native=!1}postConversation(e){const t=this._getServiceParams(this.params,e),i=L._servicePurecloudConversationsPostV0(t);this._generateGetService(i,{customEvent:"post-conversation-success",errorFireEventHandler:"post-conversation-error"})}getConversationParticipants(e){const t=this._getServiceParams(this.params,e),i=L._servicePurecloudConversationsConversationParticipantsGetV0(t);this._generateGetService(i,{customEvent:"get-conversation-participants-success",errorFireEventHandler:"get-conversation-participants-error"})}patchConversationParticipants(e){const t=this._getServiceParams(this.params,e),i=L._servicePureCloudConversationsConversationParticipantsParticipantPatchV0(t);this._generateGetService(i,{customEvent:"patch-conversation-participants-success",errorFireEventHandler:"patch-conversation-participants-error"})}static _servicePurecloudConversationsPostV0(e){return new P(e)}static _servicePurecloudConversationsConversationParticipantsGetV0(e){return new I(e)}static _servicePureCloudConversationsConversationParticipantsParticipantPatchV0(e){return new D(e)}}class q{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,n=Math.max(a>=0?a:s-Math.abs(a),0);for(;n<s;){if((o=i[n])===(r=e)||"number"==typeof o&&"number"==typeof r&&isNaN(o)&&isNaN(r))return!0;n++}var o,r;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",n=0,o=arguments.length;n!==o;++n){var r=+arguments[n];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class j extends q{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const V=0,z=1,G="jwt",B="tsec",U="none";class W extends q{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=V,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new j,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=B:this.requiredToken=U,this.requiresJWT=!1):this.requiredToken===B?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===G?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===U?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(B)}_setJwtHandler(){this._setTokenHandler(G)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===z?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(B,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(G,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===G?"JWT ":"",a=e===G?"Authorization":B;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(n);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,n=0;if(s<=127?(a=0,n=255&s):s<=223?(a=1,n=31&s):s<=239?(a=2,n=15&s):s<=244&&(a=3,n=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],n=n<<6|63&s,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,n=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:n,data:o,state:r,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getSignatureMetadata(e);if(a)this._notifySignatureInvalid(c),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,n,o,r,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,n,o,r,l,d),i=!0}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,n){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};n&&(o.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_getSignatureMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,n){s?this._notifySignatureRequired(e,t,i,s,a,n):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,n,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,n,o)}}class J extends W{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class K extends J{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`contact-center/v${this.version}/video-call-interactions/meeting/{meeting-id}`)}toString(){return super.toString("BGADPContactCenterVideoCallInteractionsMeetingMeetingGetV2")}}class X extends(e(t)){static get is(){return"bbva-local-contact-center-api-dm"}constructor(){super(),this.version="2",this.requiredToken="tsec",this.native=!1}getMeeting(e){const t=this._getServiceParams(this.params,e),i=X._serviceContactCenterGetMeeting(t);this._generateGetService(i,{customEvent:"get-meeting-success",errorFireEventHandler:"get-meeting-error"})}static _serviceContactCenterGetMeeting(e){return new K(e)}}class Y extends t{static get properties(){return{_genericDm:{type:Object},host:{type:String},native:{type:Boolean},path:{type:String},eventNames:{type:Object},jwt:{type:String}}}constructor(){super(),this._genericDm={},this.host="",this.native=!1,this.path="api/v2/webchat/guest/conversations",this.eventNames={},this.jwt=""}firstUpdated(){this._genericDm=this.renderRoot.querySelector("#genericDm")}getHeaders(){return{"Content-Type":"application/json",Authorization:`Bearer ${this.jwt}`}}_genericSuccessResponse(e){this.jwt=e.detail.jwt?e.detail.jwt:"";const{success:t}=this.eventNames;this._dispatchEvent(t,e)}_genericErrorResponse(e){const{error:t}=this.eventNames;this._dispatchEvent(t,e)}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}render(){return s`
        <bbva-global-generic-dm
            id="genericDm"
            host="${this.host}"
            ?native="${this.native}"
            path="${this.path}"
            @generic-dm-create="${this._genericSuccessResponse}"
            @generic-dm-create-error="${this._genericErrorResponse}"
            @generic-dm-remove="${this._genericSuccessResponse}"
            @generic-dm-remove-error="${this._genericErrorResponse}"
        >
        </bbva-global-generic-dm>
        `}}class Z extends Y{static get is(){return"bbva-thirdparty-genesys-message-api-dm"}postMessage(e={}){e.body&&e.conversationId&&e.memberId&&e.jwtChat&&(this.jwt=e.jwtChat,this.eventNames={success:"post-message-success",error:"post-message-error"},this._genericDm.headers=this.getHeaders(),this._genericDm.setAttribute("path",`${this.path}/${e.conversationId}/members/${e.memberId}/messages`),this.requestUpdate(),this._genericDm.postData(e.body))}}class Q extends Y{static get is(){return"bbva-thirdparty-genesys-member-api-dm"}deleteMember(e={}){e.conversationId&&e.memberId&&e.jwtChat&&(this.jwt=e.jwtChat,this.eventNames={success:"delete-member-success",error:"delete-member-error"},this._genericDm.setAttribute("path",`${this.path}/${e.conversationId}/members/${e.memberId}`),this._genericDm.headers=this.getHeaders(),this._genericDm.body=null,this.requestUpdate(),this._genericDm.deleteData())}}class ee extends(O(t)){static get is(){return"bbva-nativeconnector-cisco-webex"}static get properties(){return{pluginName:{type:String,value:""}}}constructor(){super(),this.pluginName="CiscoWebex"}configView(e={}){return this._genericCall(this.pluginName,"configView","success-config-view-call",e)}setJwt(e={}){return this._genericCall(this.pluginName,"setJWT","success-set-jwt",e)}setVideocallAddressCall(e={}){return this._genericCall(this.pluginName,"setAddressCall","success-set-videocall-address-call",e)}initVideocall(e={}){return this._genericCall(this.pluginName,"initCall","success-init-videocall-call",e)}showTimeAlert(e={}){return this._genericCall(this.pluginName,"showTimeAlert","success-show-time-alert",e)}endVideocall(e={}){return this._genericCall(this.pluginName,"endCall","success-end-videocall-call",e)}}const te="#004481",ie="#072146",se="#ffffff",ae="8",ne={fontWeight:500,fontStyle:"normal"};var oe=a`:host {
  --_bg-color: var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${n(se)}));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${n(te)}));
  --_login-content-bg-color: var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${n(ie)}));
  --_login-content-text-color: var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${n(se)}));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${n(ae)}))) / 16) * 1rem) + 3rem);
  box-sizing: border-box;
  position: absolute;
  top: 0;
  left: 0;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  overflow: hidden;
  font-size: var(--typographyTypeSmall, ${n("0.9375rem")});
  line-height: var(--lineHeightTypeSmall, ${n("1.5rem")});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(ne.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(ne.fontStyle)});
  --bbva-spinner-size: var(--_spinner-size);
  @apply --bbva-progress-content; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *::before, *::after {
  box-sizing: inherit; }

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px; }

.spinner {
  flex: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  background-color: var(--_bg-color);
  @apply --bbva-progress-content-spinner; }

:host([variant=bottom]) {
  top: auto;
  bottom: 0;
  height: auto;
  --bbva-spinner-size: var(--_small-spinner-size);
  @apply --bbva-progress-content-bottom; }
  :host([variant=bottom]) .spinner {
    padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(ae)}))) / 16) * 1rem) 0;
    @apply --bbva-progress-content-bottom-spinner; }

:host([variant=login]) .spinner {
  padding-bottom: var(--_content-height);
  background-color: var(--_login-bg-color);
  --bbva-spinner-secondary-gradient-color: var(--_login-bg-color);
  @apply --bbva-progress-content-login-spinner; }

.content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 100%;
  left: 0;
  transform: translateY(calc(var(--_content-height) * -1));
  background-color: var(--_login-content-bg-color);
  @apply --bbva-progress-content-login-content; }

.layer {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  height: 100%;
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(ae)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(ae)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color); }

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(ae)}))) / 16) * 1rem);
  @apply --bbva-progress-content-login-icon; }

:host([login-animation]) {
  @apply --bbva-progress-content-login-animation; }
  :host([login-animation]) .content {
    animation-name: message;
    animation-duration: var(--bbva-progress-content-login-animation-message-duration, 1500ms);
    animation-delay: var(--bbva-progress-content-login-animation-message-delay, 0ms);
    animation-fill-mode: forwards;
    @apply --bbva-progress-content-login-animation-message; }

:host([login-animation][login-successful]) {
  @apply --bbva-progress-content-login-animation-successful; }
  :host([login-animation][login-successful]) .content {
    animation-duration: var(--_login-success-animation-duration);
    animation-delay: var(--_login-success-animation-delay);
    animation-fill-mode: forwards;
    animation-name: content;
    @apply --bbva-progress-content-login-animation-successful-content; }
  :host([login-animation][login-successful]) .layer {
    animation-duration: var(--_login-success-animation-duration);
    animation-delay: var(--_login-success-animation-delay);
    animation-fill-mode: forwards;
    animation-name: layer;
    @apply --bbva-progress-content-login-animation-successful-layer; }

@keyframes message {
  from {
    transform: translateY(0); }
  to {
    transform: translateY(calc(var(--_content-height) * -1)); } }

@keyframes content {
  to {
    transform: translateY(-100%); } }

@keyframes layer {
  to {
    transform: translateY(calc(50% - var(--_content-height) / 2)); } }
`,re=a`:host {
  --bbva-spinner-primary-gradient: var(--bbva-spinner-primary-gradient-color, #2dcccd);
  --bbva-spinner-secondary-gradient: var(--bbva-spinner-secondary-gradient-color, #004481);
  --bbva-spinner-background: var(--bbva-spinner-background-color, var(--bbva-spinner-secondary-gradient));
  box-sizing: border-box;
  pointer-events: none;
  display: flex;
  @apply --bbva-spinner; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *::before, *::after {
  box-sizing: inherit; }

:host([paused]) .Filter-2,
:host([paused]) .cls-6,
:host([paused]) .Gradient,
:host([paused]) .All_Grouped {
  animation-play-state: paused; }

figure {
  margin: var(--bbva-spinner-center, auto);
  width: var(--bbva-spinner-size, 3rem);
  position: relative;
  @apply --bbva-spinner-figure; }

svg {
  display: block; }

.Filter-2,
.cls-6,
.Gradient,
.All_Grouped {
  animation-duration: 1.6s;
  animation-timing-function: linear;
  animation-iteration-count: infinite;
  animation-fill-mode: both; }

.Filter-2 {
  animation-name: a1_d; }

.cls-6 {
  animation-name: Gradient_t, Gradient_fo, Gradient_f; }

.Gradient {
  animation-name: a0_t; }

.All_Grouped {
  animation-name: All_Grouped_t; }

.Gradient-0 stop:nth-child(1) {
  stop-color: var(--bbva-spinner-primary-gradient); }

.Gradient-0 stop:nth-child(2) {
  stop-color: var(--bbva-spinner-secondary-gradient); }

.Gradient-1 stop:nth-child(1) {
  stop-color: var(--bbva-spinner-primary-gradient); }

.Gradient-1 stop:nth-child(2) {
  stop-color: var(--bbva-spinner-secondary-gradient); }

.Gradient-2 stop:nth-child(1) {
  stop-color: var(--bbva-spinner-primary-gradient); }

.Gradient-2 stop:nth-child(2) {
  stop-color: var(--bbva-spinner-secondary-gradient); }

.Gradient-3 stop:nth-child(1) {
  stop-color: var(--bbva-spinner-primary-gradient); }

.Gradient-3 stop:nth-child(2) {
  stop-color: var(--bbva-spinner-primary-gradient); }

.cls-2 {
  fill: var(--bbva-spinner-background); }

@keyframes All_Grouped_t {
  0% {
    transform: translate(200px, 200px) rotate(0deg) translate(-200px, -200px);
    animation-timing-function: cubic-bezier(0.75124, 0.00386, 0.25186, 1.00696); }
  100% {
    transform: translate(200px, 200px) rotate(359.99457deg) translate(-200px, -200px); } }

@keyframes a0_t {
  0% {
    transform: scale(1, 0.7);
    animation-timing-function: cubic-bezier(0.68442, 0, 0.58, 1); }
  50% {
    transform: scale(1.4, 0.8);
    animation-timing-function: cubic-bezier(0.42, 0, 0.30322, 1); }
  100% {
    transform: scale(1, 0.7);
    animation-timing-function: cubic-bezier(0.68442, 0, 0.58, 1); } }

@keyframes Gradient_t {
  0% {
    transform: translate(0px, 0px);
    animation-timing-function: cubic-bezier(0.42, 0, 0.25, 1); }
  50% {
    transform: translate(-60px, 0px);
    animation-timing-function: cubic-bezier(0.74752, 0, 0.58, 1); }
  100% {
    transform: translate(0px, 0px); } }

@keyframes Gradient_fo {
  0% {
    fill-opacity: 0.6;
    animation-timing-function: cubic-bezier(0.42, 0, 0.58, 1); }
  50% {
    fill-opacity: 0.8;
    animation-timing-function: cubic-bezier(0.42, 0, 0.58, 1); }
  100% {
    fill-opacity: 0.6; } }

@keyframes Gradient_f {
  0% {
    fill: var(--gradient-0);
    animation-timing-function: steps(1); }
  50% {
    fill: var(--gradient-1);
    animation-timing-function: steps(1); }
  100% {
    fill: var(--gradient-2);
    animation-timing-function: steps(1); } }

@keyframes a1_d {
  0% {
    d: path("M-0.66667,0C-0.66667,0,50.5,85,167,85C281.5,85,334,0,334,0C334,0,281.5,93,167,93C50.5,93,-0.66667,0,-0.66667,0Z");
    animation-timing-function: cubic-bezier(0.87624, 0, 0.62376, 1); }
  50% {
    d: path("M-0.66667,0C-0.66667,0,41,68,167,68C290.5,68,334,0,334,0C334,0,281.425,113,166.925,113C50.4255,113,-0.66667,0,-0.66667,0Z");
    animation-timing-function: cubic-bezier(0.37376, 0, 0.12499, 1); }
  100% {
    d: path("M-0.66667,0C-0.66667,0,50.5,85,167,85C281.5,85,334,0,334,0C334,0,281.5,93,167,93C50.5,93,-0.66667,0,-0.66667,0Z");
    animation-timing-function: cubic-bezier(0.62005, 0, 0.38614, 1); } }
`;class le extends t{static get is(){return"bbva-spinner"}static get properties(){return{size:{type:Number},paused:{type:Boolean,reflect:!0},withMask:{type:Boolean,attribute:"with-mask",reflect:!0}}}constructor(){super(),this.paused=!1,this.withMask=!1,this._uniqueId=`${String(Math.floor(Math.random()*Date.now()))}`}firstUpdated(){this.style.setProperty("--gradient-0",`url(#Gradient-0_${this._uniqueId})`),this.style.setProperty("--gradient-1",`url(#Gradient-1_${this._uniqueId})`),this.style.setProperty("--gradient-2",`url(#Gradient-2_${this._uniqueId})`)}get _computeClipPath(){return this.withMask?`url(#ClipPath-1_${this._uniqueId})`:""}get _computeSize(){return"number"==typeof this.size?`width: ${this.size}px;`:""}static get shadyStyles(){return`\n      ${re.cssText}\n      ${o("bbva-spinner-shared-styles").cssText}`}render(){return s`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <figure style="${this._computeSize}">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 400 400" id="${this._uniqueId}">
          <defs>
            <filter id="Filter-0_${this._uniqueId}" color-interpolation-filters="sRGB">
              <feComponentTransfer>
                <feFuncR type="linear" slope="1.2" />
                <feFuncG type="linear" slope="1.2" />
                <feFuncB type="linear" slope="1.2" />
              </feComponentTransfer>
            </filter>
            <filter id="Filter-1_${this._uniqueId}" color-interpolation-filters="sRGB">
              <feComponentTransfer>
                <feFuncR type="linear" slope="2" />
                <feFuncG type="linear" slope="2" />
                <feFuncB type="linear" slope="2" />
              </feComponentTransfer>
            </filter>
            <filter id="Filter-2_${this._uniqueId}" color-interpolation-filters="sRGB">
              <feGaussianBlur stdDeviation="20" />
              <feComponentTransfer>
                <feFuncR type="linear" slope="2" />
                <feFuncG type="linear" slope="2" />
                <feFuncB type="linear" slope="2" />
              </feComponentTransfer>
            </filter>
            <radialGradient
              id="Gradient-0_${this._uniqueId}"
              class="Gradient-0"
              cx="199"
              cy="92"
              r="271.854"
              fx="197.801"
              fy="-27.9043"
              gradientUnits="userSpaceOnUse"
            >
              <stop offset="0.143991" stop-color="#2dcccd" />
              <stop offset="1" stop-color="#004481" stop-opacity="0" />
            </radialGradient>
            <radialGradient
              id="Gradient-1_${this._uniqueId}"
              class="Gradient-1"
              cx="199"
              cy="92"
              r="271.854"
              fx="197.801"
              fy="-27.9043"
              gradientUnits="userSpaceOnUse"
            >
              <stop offset="0.133991" stop-color="#2dcccd" />
              <stop offset="1" stop-color="#004481" stop-opacity="0" />
            </radialGradient>
            <radialGradient
              id="Gradient-2_${this._uniqueId}"
              class="Gradient-2"
              cx="199"
              cy="92"
              r="271.854"
              fx="197.801"
              fy="-27.9043"
              gradientUnits="userSpaceOnUse"
            >
              <stop offset="0.153991" stop-color="#2dcccd" />
              <stop offset="1" stop-color="#004481" stop-opacity="0" />
            </radialGradient>
            <radialGradient
              id="Gradient-3_${this._uniqueId}"
              class="Gradient-3"
              cx="196.5"
              cy="0"
              r="100"
              fx="196.5"
              fy="0"
              gradientUnits="userSpaceOnUse"
            >
              <stop offset="0" stop-color="#2dcccd" />
              <stop offset="1" stop-color="#2dcccd" stop-opacity="0" />
            </radialGradient>
            <clipPath id="clip-path_${this._uniqueId}">
              <ellipse
                class="cls-1"
                rx="197.5"
                ry="197.5"
                fill="none"
                transform="translate(0,0) translate(200,200)"
              />
            </clipPath>
            <mask id="Mask-1_${this._uniqueId}" style="mask-type: luminance;">
              <path
                d="M-0.66667,0C-0.66667,0,50.5,85,167,85C281.5,85,334,0,334,0C334,0,281.5,93,167,93C50.5,93,-0.66667,0,-0.66667,0Z"
                fill="#4afcfd"
                stroke-linecap="square"
                stroke="none"
                filter="url(#Filter-2_${this._uniqueId})"
                class="Filter-2"
                transform="translate(-166.5,104.5)"
                style="mix-blend-mode: normal;"
              />
            </mask>
            <clipPath id="ClipPath-1_${this._uniqueId}">
              <path
                class="st0"
                d="M400,0L0,0L0,400L400,400ZM45.9596,200C45.9596,115.061,115.061,45.9596,200,45.9596C284.939,45.9596,354.04,115.061,354.04,200C354.04,284.939,284.939,354.04,200,354.04C115.061,354.04,45.9596,284.939,45.9596,200Z"
                fill="#00ff16"
                fill-rule="evenodd"
              />
            </clipPath>
          </defs>
          <g
            class="All_Grouped"
            clip-path="${this._computeClipPath}"
            transform="translate(200,200) translate(-200,-200)"
          >
            <ellipse
              class="cls-2"
              rx="197.5"
              ry="197.5"
              fill="#004481"
              transform="translate(0,0) translate(200,200)"
            />
            <path
              class="cls-1"
              d="M196.5,0C87.9723,0,0,87.9723,0,196.5C0,305.028,87.9723,393,196.5,393C305.028,393,393,305.028,393,196.5C393,87.9723,305.028,0,196.5,0Z"
              fill="none"
              opacity="0.16"
              stroke="#f2f2f2"
              stroke-width="2"
              transform="translate(3.5,3.5)"
            />
            <g class="cls-5" clip-path="url(#clip-path_${this._uniqueId})">
              <g class="Gradient">
                <path
                  class="cls-6"
                  d="M400,0L400,400L0,400L0,0Z"
                  fill="url(#Gradient-0_${this._uniqueId})"
                  opacity="1"
                  filter="url(#Filter-0_${this._uniqueId})"
                  fill-opacity="0.6"
                  fill-rule="nonzero"
                  stroke-opacity="1"
                  transform="translate(0,0) scale(1,0.7)"
                />
              </g>
            </g>
            <ellipse
              rx="197.5"
              ry="197.5"
              fill="#4efeff"
              stroke="none"
              fill-rule="evenodd"
              filter="url(#Filter-1_${this._uniqueId})"
              mask="url(#Mask-1_${this._uniqueId})"
              transform="translate(199.5,199.5) rotate(180)
            translate(-0.5,-0.5)"
              style="mix-blend-mode: normal;"
            />
            <path
              class="cls-1"
              d="M196.5,0C87.9723,0,0,87.9723,0,196.5C0,305.028,87.9723,393,196.5,393C305.028,393,393,305.028,393,196.5C393,87.9723,305.028,0,196.5,0Z"
              fill="none"
              opacity="0.8"
              stroke="url(#Gradient-3_${this._uniqueId})"
              stroke-width="2"
              transform="translate(3.5,3.5)"
            />
          </g>
        </svg>
      </figure>
    `}}customElements.define(le.is,le);class de extends(w(t)){static get is(){return"bbva-progress-content"}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:Number,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String}}}constructor(){super(),this.variant="full",this.loginIcon="coronita:lock",this.loginSuccessIcon="coronita:unlock",this.loginIconSize=24,this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}updated(e){super.updated&&super.updated(e),(e.has("loginSuccessful")||e.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess())}static get shadyStyles(){return`\n      ${oe.cssText}\n      ${o("bbva-progress-content-shared-styles").cssText}\n    `}render(){return s`
      <style>
        ${this.constructor.shadyStyles}
      </style>

      <div class="spinner">
        <span class="sr-only" role="alert" aria-busy="true">
          <slot></slot>
        </span>
        <bbva-spinner ?with-mask="${"login"!==this.variant}"></bbva-spinner>
      </div>

      ${"login"===this.variant?s`
            <div class="content" @animationend="${this._onAnimationEnd}">
              <div class="layer">
                <cells-icon
                  class="icon"
                  .icon="${this._getLoginIcon}"
                  .size="${this.loginIconSize}"
                ></cells-icon>
                <div class="message">
                  ${this.t(this._loginMessageLabel)}
                </div>
              </div>
            </div>
          `:""}
    `}_onAnimationEnd(e){"content"===e.animationName&&this._fireEvent("bbva-progress-content-login-success")}_fireEvent(e){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0}))}_setLoginInProcess(){const[e]=this.loginMessageLabels;this._loginMessageLabel=e,this._loadingMessageInterval=setInterval((()=>{const e=this.loginMessageLabels.indexOf(this._loginMessageLabel),t=this.loginMessageLabels[e+1]||this.loginMessageLabels[0];this._loginMessageLabel=t}),this.loginMessageTimer),this._fireEvent("bbva-progress-content-login-start")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("bbva-progress-content-login-success")}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}}customElements.define(de.is,de);var ce=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-disability-videocall-successful] {
  padding-bottom: 16vh;
  background-color: red;
}

img {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 1rem auto 1rem;
}

.help-content-description {
  margin: 1rem 1rem 1rem 1rem;
}

.text-title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(r.medium.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize60, ${n(l.fontSize60)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

.text-subtitle {
  font-weight: var(--fontFacePrimaryLightFontWeight, ${n(r.light.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize40, ${n(l.fontSize40)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

.bbva-button-default-container {
  margin: 1rem auto 1rem auto;
  width: 100%;
  position: fixed;
  bottom: 0;
}

.div-button-content-exit {
  margin: 0 auto 0 auto;
}

.header-color {
  --bbva-header-main-bg-color: #ffffff;
  --_text-color: #121212;
}
`;class he extends(k(M(E(c(t))))){static get is(){return"bbva-disability-videocall-successful"}static get properties(){return{}}static get styles(){return[ce,o("bbva-disability-videocall-successful-shared-styles")]}static get scopedElements(){const e=[N,u,g];return he.scopedElementsFromClasses(e)}constructor(){super(),this.formattedDate=moment().format("DD MMMM YYYY, HH:mm:ss")}_onClickContinue(){this._dispatchCustomEvent("on-click-continue")}render(){return s`
      <bbva-header-main
        class="header-color"
        text="Videollamada LSM"
        icon-right-primary="${h()}"
      ></bbva-header-main>
      <div class="help-content-description">
        <img class="image-videocall"
        alt=""
        src="./images/success.svg">
        <bbva-text class="text-title" text="Videollamada realizada con éxito">
        </bbva-text>
        <bbva-text class="text-subtitle" alignment="center" text="${this.formattedDate}">
        </bbva-text>
      </div>
      <div class="bbva-button-default-container">
        <bbva-button-default
          id="successfulPageContinueButton"
          class="div-button-content-exit"
          text="Salir"
          @click=${this._onClickContinue}
        >
        </bbva-button-default>
      </div>
    `}}var ue=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host [data-tag-name=bbva-disability-videocall-help] {
  padding-bottom: 16vh;
}

img {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 1rem auto 1rem;
}

.help-content-description {
  margin: 1rem 1rem 1rem 1rem;
}

.text-title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(r.medium.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize60, ${n(l.fontSize60)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  color: var(--colorsSecondary600, ${n(p.secondary600)});
  text-align: center;
}

.text-subtitle {
  font-weight: var(--fontFacePrimaryLightFontWeight, ${n(r.light.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize40, ${n(l.fontSize40)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

.div-button-content {
  margin: 1rem auto 1rem auto;
  width: 100%;
  display: grid;
  position: fixed;
  bottom: 0;
}

.div-button-content-end-button {
  margin: auto;
}

.image-modal {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 0rem auto 1rem;
}

.help-content-modal {
  margin: 0rem 1rem 1rem 1rem;
}

bbva-help-modal {
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${n(p.secondary600)});
}
`;class ge extends(k(M(E(c(t))))){static get is(){return"bbva-disability-videocall-calling"}static get properties(){return{}}static get styles(){return[ue,o("bbva-disability-videocall-calling-shared-styles")]}static get scopedElements(){const e=[N,u,b,g];return ge.scopedElementsFromClasses(e)}_onClickCancel(){this._dispatchCustomEvent("on-click-cancel")}render(){return s`
      <bbva-header-main
        accessibility-text-icon-left-primary="Return"
        text="Videollamada LSM"
        icon-left-primary="${m()}"
      ></bbva-header-main>
      <div class="help-content-description">
        <img class="image-videocall"
        alt=""
        src="./images/disabilityVideocall/answer_video_call.svg">
        <bbva-text class="text-title" text="Llamando"> </bbva-text>
        <bbva-text
          class="text-subtitle"
          text="Estamos buscando a un asesor en Lengua de Señas Mexicana disponible, te ayudará en un momento."
        >
        </bbva-text>
      </div>
      <div class="div-button-content">
        <bbva-button-default
          id="callingPageButton"
          class="div-button-content-end-button"
          text="Finalizar videollamada"
          variant="link"
          @click=${this._onClickCancel}
        >
        </bbva-button-default>
      </div>
    `}}var pe=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

img {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 1rem auto 1rem;
}

.help-content-description {
  margin: 1rem 1rem 1rem 1rem;
}

.text-title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(r.medium.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize60, ${n(l.fontSize60)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

.text-subtitle {
  font-weight: var(--fontFacePrimaryLightFontWeight, ${n(r.light.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize40, ${n(l.fontSize40)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

bbva-list-bullet {
  --typographyTypeSmall: var(--fontSizeOptionsFontSize40, ${n(l.fontSize40)});
}

.modal-content {
  text-align: var(--bbva-transition-container-text-align, left);
}

.div-button-content {
  margin: auto;
  width: 100%;
  display: grid;
  position: fixed;
  bottom: 0;
}

.div-button-content-continue {
  margin: auto;
}

.div-button-content-cancel {
  margin: 1rem auto 1rem auto;
}
`;class me extends(k(M(E(c(t))))){static get is(){return"bbva-disability-videocall-put-attention"}static get properties(){return{}}static get styles(){return[pe,o("bbva-disability-videocall-help-shared-styles")]}static get scopedElements(){const e=[N,u,A,g];return me.scopedElementsFromClasses(e)}_onClickContinue(){this._dispatchCustomEvent("on-click-continue")}_onClickCancel(){this._dispatchCustomEvent("on-click-cancel")}render(){return s`
            <bbva-header-main 
                accessibility-text-icon-left-primary="Return"
                text="${this.t("disability-videocall-hearing-strategic-put-attention-header-text")}"
                icon-left-primary="${m()}"
                @header-main-icon-left-primary-click="${this._onClickReturnTwo}"
            ></bbva-header-main>

            <div class="help-content-description">
                <img class="image-videocall" alt="" src="./images/disabilityVideocall/attention_LDSM.svg">
                <bbva-text class="text-title" alignment="center" text="${this.t("disability-videocall-hearing-strategic-put-attention-title-text")}">
                </bbva-text>
                <bbva-text class="text-subtitle" alignment="center" text="${this.t("disability-videocall-hearing-strategic-put-attention-description-text")}">
                </bbva-text>
            </div>

            <div class="modal-content">
              <bbva-list-bullet>
                  ${this.t("disability-videocall-hearing-strategic-put-attention-first-bullet")}
              </bbva-list-bullet>
              <bbva-list-bullet>
                  ${this.t("disability-videocall-hearing-strategic-put-attention-second-bullet")}
              </bbva-list-bullet>
              <bbva-list-bullet>
                  ${this.t("disability-videocall-hearing-strategic-put-attention-third-bullet")}
              </bbva-list-bullet>
              <bbva-list-bullet>
                  ${this.t("disability-videocall-hearing-strategic-put-attention-fourth-bullet")}
              </bbva-list-bullet>
            </div>
            
            <div class="div-button-content">
                <bbva-button-default id="putattentionPageContinueButton" class="div-button-content-continue" text="${this.t("disability-videocall-hearing-strategic-put-attention-continue-button-text")}" @click=${this._onClickContinue}>
                </bbva-button-default>
                <bbva-button-default id="putattentionPageCancelButton" class="div-button-content-cancel" text="${this.t("disability-videocall-hearing-strategic-put-attention-cancel-button-text")}" variant="link" @click=${this._onClickCancel}>
                </bbva-button-default>
            </div>
            `}}var be=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host [data-tag-name=bbva-disability-videocall-help] {
  padding-bottom: 16vh;
}

img {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 1rem auto 1rem;
}

.help-content-description {
  margin: 1rem 1rem 1rem 1rem;
}

.text-title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(r.medium.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize60, ${n(l.fontSize60)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

.text-subtitle {
  font-weight: var(--fontFacePrimaryLightFontWeight, ${n(r.light.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize40, ${n(l.fontSize40)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  text-align: center;
}

bbva-notification-message {
  margin: 1rem 1rem 1rem 1rem;
}

.div-button-content {
  margin: auto;
  width: 100%;
  display: grid;
  position: fixed;
  bottom: 0;
}

.div-button-content-continue {
  margin: auto;
}

.div-button-content-cancel {
  margin: 1rem auto 1rem auto;
}
`;class ve extends(k(M(E(c(t))))){static get is(){return"bbva-disability-videocall-help"}static get properties(){return{}}static get styles(){return[be,o("bbva-disability-videocall-help-shared-styles")]}static get scopedElements(){const e=[N,u,b,g];return ve.scopedElementsFromClasses(e)}_onClickContinue(){this._dispatchCustomEvent("on-click-continue")}_onClickCancel(){this._dispatchCustomEvent("on-click-cancel")}render(){return s`
            <bbva-header-main
                id="helpPageHeaderMain" 
                accessibility-text-icon-left-primary="Return"
                text="${this.t("disability-videocall-hearing-strategic-help-header-text")}"
                icon-left-primary="${m()}"
            ></bbva-header-main>
            <div class="help-content-description">
                <img class="image-videocall" alt="" src="./images/disabilityVideocall/help_LDSM.svg">
                <bbva-text class="text-title" alignment="center" text="${this.t("disability-videocall-hearing-strategic-help-title-text")}">
                </bbva-text>
                <bbva-text class="text-subtitle" text="${this.t("disability-videocall-hearing-strategic-help-description-text")}">
                </bbva-text>
            </div>
            <bbva-notification-message variant="default" message="${this.t("disability-videocall-hearing-strategic-help-notification-message")}">
            </bbva-notification-message>
            <div class="div-button-content">
                <bbva-button-default id="helpPageContinueButton" class="div-button-content-continue" text="${this.t("disability-videocall-hearing-strategic-help-continue-button-text")}" @click=${this._onClickContinue}>
                </bbva-button-default>
                <bbva-button-default id="helpPageCancelButton" class="div-button-content-cancel" text="${this.t("disability-videocall-hearing-strategic-help-cancel-button-text")}" variant="link" @click=${this._onClickCancel}>
                </bbva-button-default>
            </div>
            `}}var _e=a`:host {
  display: block;
  box-sizing: border-box;
  width: 100%;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

.help-content-modal {
  margin: 0rem 1rem 1rem 1rem;
}

.row-title {
  align-items: left;
  display: flex;
  flex-direction: column;
}

.row {
  margin-top: -0.625rem;
}
.row-bullet {
  margin-top: 0.9375rem;
  margin-bottom: 0.9375rem;
}

.title {
  margin: 0;
}

.image-modal {
  display: block;
  width: var(--bbva-disability-videocall-info-image-width, 5rem);
  height: var(--bbva-disability-videocall-info-image-height, 5rem);
  margin: 0rem auto 1rem;
}

.text-title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(r.medium.fontWeight)});
  font-family: var(--fontFacePrimaryFontFamily, ${n(r.fontFamily)});
  font-size: var(--fontSizeOptionsFontSize60, ${n(l.fontSize60)});
  line-height: var(--lineHeightOptionsLineHeight20, ${n(d.lineHeight20)});
  color: var(--colorsSecondary600, ${n(p.secondary600)});
  text-align: center;
}

bbva-help-modal {
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${n(p.secondary600)});
}

.icon-modal {
  float: left;
  gap: 8px;
  padding-bottom: 4px;
  padding-right: 8px;
}

.container {
  padding: 0;
  margin-bottom: 15px;
}
`;class ye extends(k(M(E(c(t))))){static get is(){return"bbva-feature-disability-videocall-hearing-mx"}static get properties(){return{openingHour:{type:String},closingHour:{type:String},_openDisabilityVideocallHearingHelp:{type:Boolean},_openDisabilityVideocallHearingPutAttention:{type:Boolean},_openDisabilityVideocallHearingCalling:{type:Boolean},_openDisabilityVideocallHearingSuccessful:{type:Boolean},_disabilitySingleSignOnDm:{type:Object},_disabilityPurecloudDm:{type:Object},_disabilityContactCenterDm:{type:Object},_disabilityGenesysMessageDm:{type:Object},_disabilityGenesysMemberDm:{type:Object},_disabilityNativeconnectorCiscoWebex:{type:Object},_customerName:{type:String},aapTarget:{type:String},singleSignOnVersion:{type:String},_loginTimer:{type:Number},_pkcs7:{type:String},purecloudVersion:{type:String},_conversationData:{type:Object},_meetingData:{type:Object},maxTimeInSession:{type:Number},listOfTimers:{type:Array},_conversationHasStarted:{type:Boolean},_adviserNotFoundCounter:{type:Number},checkTimer:{type:String},_errorResponseModalCounter:{type:Number},_errorNetworkStatusModalCounter:{type:Number},isNativeIos:{type:Boolean},_logoutTimeoutExpired:{type:Boolean},_isNetworkDisconnectedModalOpened:{type:Boolean},_videocallHasEnded:{type:Boolean},disabilityImages:{type:Object},_secondTimeNetworkStatusIos:{type:Boolean},_modalId:{type:String},_fullHeightModalSettings:{type:Object},_fullHeightModal:{type:Object},_halfHeightModalSettings:{type:Object},timeWaitForAdviser:{type:Number},conversationSocket:{type:Object},meetingRoomUrl:{type:String},_timeInSession:{type:Number},timeoutExpiredNativeToastSettings:{type:Object},firstWorkingDay:{type:Number},lastWorkingDay:{type:Number},_adviserNotFoundTimeout:{type:Object,state:!0},_logoutTimeout:{type:Object,state:!0},_messageTimerTimeout:{type:Object,state:!0},_socketOpenListenerCallback:{type:Object,state:!0},_socketMessageListenerCallback:{type:Object,state:!0},_windowMessageListenerCallback:{type:Object,state:!0},_listOfTimersTimeout:{type:Array,state:!0}}}constructor(){super(),this.config={loader:!0},this._customerName="",this._loginTimer=0,this._isNetworkDisconnectedModalOpened=!1,this._conversationHasStarted=!1,this._openDisabilityVideocallHearingHelp=!1,this._openDisabilityVideocallHearingPutAttention=!1,this._openDisabilityVideocallHearingCalling=!1,this._openDisabilityVideocallHearingSuccessful=!1,this._errorResponseModalCounter=0,this._errorNetworkStatusModalCounter=0,this._adviserNotFoundCounter=0,this._secondTimeNetworkStatusIos=!1,this._logoutTimeoutExpired=!1,this._videocallHasEnded=!1,this._modalId="",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",hideContentPaddingTop:!0,headerText:"disability-videocall-hearing-strategic-modal-header-text",titleText:"disability-videocall-hearing-strategic-out-of-hours-modal-title-text",bodyText:"Recuerda que podemos responder tus dudas de lunes a domingo 08:00 a 23:00.",buttonText:"Aceptar",linkText:""},this.disabilityImages={},this.conversationSocket={},this._conversationData={},this.isNativeIos=!1,this.aapTarget="",this.singleSignOnVersion="0",this._pkcs7="",this._halfHeightModalSettings={fixedFooter:!0,titleLines:"0",hideContentPaddingTop:!0,headerText:"disability-videocall-hearing-strategic-modal-header-text",titleText:"disability-videocall-hearing-strategic-out-of-hours-modal-title-text",bodyText:"Recuerda que podemos responder tus dudas de lunes a domingo 08:00 a 23:00.",buttonText:"Aceptar",linkText:""},this.purecloudVersion="0",this.timeWaitForAdviser=6e4,this.meetingRoomUrl="https://bbva-dev-mexico.webex.com/bbva-dev-mexico/j.php?MTID=",this._timeInSession=0,this.maxTimeInSession=0,this.timeoutExpiredNativeToastSettings={duration:5,backgroundColor:"#1464A5",textColor:"#FFFFFFFF",textSize:15,maxLines:0,position:"bottom",delay:1500,textMargins:{top:24,bottom:24,right:16,left:16},message:"Por seguridad después de 20 minutos cerramos tu aplicación. Si no has terminado tu consulta inicia sesión y vuelve a llamar."},this._meetingData={},this.firstWorkingDay=0,this.lastWorkingDay=0,this._adviserNotFoundTimeout={},this._logoutTimeout={},this._messageTimerTimeout={},this._socketOpenListenerCallback={},this._socketMessageListenerCallback={},this._windowMessageListenerCallback={},this._listOfTimersTimeout=[]}firstUpdated(){this._disabilitySingleSignOnDm=this.renderRoot.querySelector("#singleSignOnApiDm"),this._disabilityPurecloudDm=this.renderRoot.querySelector("#purecloudApiDm"),this._disabilityContactCenterDm=this.renderRoot.querySelector("#contactCenterApiDm"),this._disabilityGenesysMessageDm=this.renderRoot.querySelector("#genesysSendMessageApiDm"),this._disabilityGenesysMemberDm=this.renderRoot.querySelector("#genesysDeleteMemberApiDm"),this._disabilityNativeconnectorCiscoWebex=this.renderRoot.querySelector("#nativeconnectorCiscoWebex"),this._fullHeightModal=this.renderRoot.querySelector("#fullHeightModal"),this._halfHeightModal=this.renderRoot.querySelector("#halfModal"),this.dataImageModal=this.renderRoot.querySelector("#image-modal-videocall")}static get scopedElements(){const e=[ve,me,ge,he,v,F,L,X,Z,Q,ee,H,$,de,_,y,u,R,...ye.configurationScopedElements()];return ye.scopedElementsFromClasses(e)}static get styles(){return[_e,o("bbva-feature-disability-videocall-hearing-mx-shared-styles")]}getCustomerName(e){e&&e.firstName&&e.lastName&&(this._customerName=`${e.firstName} ${e.lastName}`)}setLoginTimer(e){this._loginTimer=e}initPage(){this._isNetworkDisconnectedModalOpened?this._showNetworkDisconnectedModal():this._validateIfConversationHasStarted()}setAppSettingsParams({disabilityVideocall:e}){const{disabilityVideocallHearingStrategicConfiguration:t}=e||{},{openingHour:i,closingHour:s,aapTarget:a,maxTimeInSession:n,listOfTimers:o,meetingRoomUrl:r,firstWorkingDay:l,lastWorkingDay:d}=t||{};this.openingHour=i,this.closingHour=s,this.aapTarget=a,this.maxTimeInSession=n,this.listOfTimers=o,this.meetingRoomUrl=r,this.firstWorkingDay=l,this.lastWorkingDay=d}_validateIfConversationHasStarted(){this._conversationHasStarted?this._goToSuccessfulPage():this._validateCurrentHour()}_validateCurrentHour(){this._isBetweenWorkingHours()&&this._isBetweenWorkingDays()?this._goToHelpPage():this._showOutOfHourAttentionModal()}_isBetweenWorkingHours(){const e=moment(new Date),t=moment(this.openingHour,"hh:mm:ss"),i=moment(this.closingHour,"hh:mm:ss");return e.isBetween(t,i)}_isBetweenWorkingDays(){const e=(new Date).getDay();return e>=this.firstWorkingDay&&e<=this.lastWorkingDay}_goToHelpPage(){this._openDisabilityVideocallHearingHelp=!0,this._openDisabilityVideocallHearingPutAttention=!1,this._openDisabilityVideocallHearingCalling=!1,this._openDisabilityVideocallHearingSuccessful=!1,this._resetProperties()}_resetProperties(){this._errorResponseModalCounter=0,this._errorNetworkStatusModalCounter=0,this._adviserNotFoundCounter=0,this._secondTimeNetworkStatusIos=!1,this._logoutTimeoutExpired=!1,this._videocallHasEnded=!1,this._dispatchCustomEvent("go-to-help-page-analytics")}_showOutOfHourAttentionModal(){this._modalId="outOfHours",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",headerType:"modal-three-level",headerText:"disability-videocall-hearing-strategic-modal-header-text",iconRightPrimary:"bbva:close",titleText:this.t("disability-videocall-hearing-strategic-out-of-hours-modal-title-text"),bodyText:this.t("disability-videocall-hearing-strategic-out-of-hours-modal-body-text"),buttonText:this.t("disability-videocall-hearing-strategic-out-of-hours-modal-button-text"),linkText:"",img:this.disabilityImages.outOfHours},this.requestUpdate(),this._fullHeightModal.open(),this._dispatchCustomEvent("show-out-of-hour-attention-analytics")}_goToSuccessfulPage(){this.clearLoader(),this._openDisabilityVideocallHearingSuccessful=!0,this._openDisabilityVideocallHearingHelp=!1,this._openDisabilityVideocallHearingPutAttention=!1,this._openDisabilityVideocallHearingCalling=!1,this._conversationHasStarted=!1,this._endConversation(),this._dispatchCustomEvent("go-to-succesful-page-analytics")}_endConversation(){this.conversationSocket.removeEventListener("open",this._socketOpenListenerCallback),this.conversationSocket.removeEventListener("message",this._socketMessageListenerCallback),window.removeEventListener("message",this._windowMessageListenerCallback),this.conversationSocket.close(),this._deleteMember()}_deleteMember(){this._disabilityGenesysMemberDm.deleteMember(this._setDeleteMemberBody())}_setDeleteMemberBody(){return{conversationId:this._conversationData.conversationId,memberId:this._conversationData.conversationMemberId,jwtChat:this._conversationData.jwtChat}}_showNetworkDisconnectedModal(){this._modalId="networkDisconnected",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",hideContentPaddingTop:!0,iconRightPrimary:"",headerText:this.t("disability-videocall-hearing-strategic-network-disconnected-modal-header-text"),titleText:this.t("disability-videocall-hearing-strategic-network-disconnected-modal-title-text"),bodyText:this.t("disability-videocall-hearing-strategic-network-disconnected-modal-body-text"),buttonText:this.isNativeIos?this.t("disability-videocall-hearing-strategic-network-disconnected-modal-button-text-ios"):this.t("disability-videocall-hearing-strategic-network-disconnected-modal-button-text-android"),linkText:this.isNativeIos?"":this.t("disability-videocall-hearing-strategic-network-disconnected-modal-link-text-android"),img:this.disabilityImages.connectionError},this.requestUpdate(),this._fullHeightModal.open()}_getNetworkStatus(){this.showLoader("full"),this._resetOpenPages(),this._dispatchCustomEvent("get-network-status")}_resetOpenPages(){this._openDisabilityVideocallHearingHelp=!1,this._openDisabilityVideocallHearingPutAttention=!1,this._openDisabilityVideocallHearingCalling=!1,this._openDisabilityVideocallHearingSuccessful=!1}validateNetworkStatus(e){this.clearLoader();this[this.isNativeIos?"_validateSecondTimeInIos":"_validateNetworkStatus"](e)}_validateSecondTimeInIos(e){this[this._secondTimeNetworkStatusIos?"_validateNetworkStatus":"_secondTimeTruthyValue"](e)}_validateNetworkStatus(e){this["success"===e?"_validateAndroidDynamicModules":"_showErrorNetworkStatusModal"](),this._secondTimeNetworkStatusIos=!1}_validateAndroidDynamicModules(){this.isNativeIos?this._goToPutAttentionPage():this._dispatchCustomEvent("is-dynamic-module-installed","ciscowebex")}isDynamicModuleInstalledResponse(e){this[!0===e?"_goToPutAttentionPage":"_showDownloadAndroidDynamicModuleModal"]()}_showDownloadAndroidDynamicModuleModal(){this._modalId="downloadAndroidDynamicModulesModal",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",headerType:"modal-three-level",hideContentPaddingTop:!0,titleIcon:"",iconRightPrimary:"bbva:close",headerText:"Videollamada LSM",titleText:"COMPLEMENTOS NECESARIOS",bodyText:"Para usar y conectarse  a la videollamada en este celular, necesitamos algunos complementos.",buttonText:"Usar complementos",linkText:"",titleSize:"S",textAlignment:"left",fontWeight:"500",classNames:"title",itemsContent:[{icon:f(),description:"Ten en cuenta que ocuparán aproximadamente 200 megabytes en la memoria de tu celular.",divider:!0},{icon:S(),description:"Te recomendamos estar conectado a una red WiFi para no perder la conexión.",divider:!1}]},this.requestUpdate(),this._fullHeightModal.open()}_goToPutAttentionPage(){this._openDisabilityVideocallHearingHelp=!1,this._openDisabilityVideocallHearingPutAttention=!0,this._openDisabilityVideocallHearingCalling=!1,this._openDisabilityVideocallHearingSuccessful=!1,this._dispatchCustomEvent("go-to-put-attention-page-analytics")}_showErrorNetworkStatusModal(){this._modalId=this._errorNetworkStatusModalCounter<1?"errorNetworkStatusModal":"lastErrorNetworkStatusModal",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",headerType:"modal-three-level",hideContentPaddingTop:!0,iconRightPrimary:"bbva:close",headerText:this.t("disability-videocall-hearing-strategic-modal-header-text"),titleText:this._errorNetworkStatusModalCounter<1?this.t("disability-videocall-hearing-strategic-error-network-status-modal-title-text"):this.t("disability-videocall-hearing-strategic-error-network-status-modal-last-time-title-text"),bodyText:this._errorNetworkStatusModalCounter<1?this.t("disability-videocall-hearing-strategic-error-network-status-modal-body-text"):this.t("disability-videocall-hearing-strategic-error-network-status-modal-last-time-body-text"),buttonText:this._errorNetworkStatusModalCounter<1?this.t("disability-videocall-hearing-strategic-error-network-status-modal-button-text"):this.t("disability-videocall-hearing-strategic-error-network-status-modal-last-time-button-text"),linkText:this._errorNetworkStatusModalCounter<1?this.t("disability-videocall-hearing-strategic-error-network-status-modal-link-text"):"",img:this._errorNetworkStatusModalCounter<1?this.disabilityImages.errorNetworkStatus:this.disabilityImages.deviceErrorCall},this._errorNetworkStatusModalCounter+=1,this.requestUpdate(),this._fullHeightModal.open(),this._dispatchCustomEvent("show-error-response-analytics")}_secondTimeTruthyValue(){this._secondTimeNetworkStatusIos=!0}_setExitDisabilityModal(){this._modalId="exitDisability",this._halfHeightModalSettings={fixedFooter:!0,hideContentPaddingTop:!0,titleLines:"0",headerText:"",modalType:"warning",titleIcon:"bbva:warning",titleText:this.t("disability-videocall-hearing-strategic-exit-modal-title-text"),bodyText:this.t("disability-videocall-hearing-strategic-exit-modal-body-text"),buttonText:this.t("disability-videocall-hearing-strategic-exit-modal-button-text"),linkText:this.t("disability-videocall-hearing-strategic-exit-modal-link-text"),img:""},this.requestUpdate(),this._halfHeightModal.open(),this._dispatchCustomEvent("exit-disability-modal-analytics")}_goToCallingPage(){this.showLoader("full"),this._conversationHasStarted=!1,this._fullHeightModal.closeModalElements=["footer-button","footer-link","header-right-primary"],this._resetOpenPages(),this._setPostSingleSignOn(),this._dispatchCustomEvent("go-to-calling-page-analytics")}_setPostSingleSignOn(){this._disabilitySingleSignOnDm.postSingleSignOn({aapTarget:this.aapTarget})}_postCreateSsoSuccessfulResponse(e){e.detail&&e.detail.pkcs7&&(this._pkcs7=e.detail.pkcs7,this._setPostConversation())}_setPostConversation(){const e=this._setPostConversationBody();this._disabilityPurecloudDm.postConversation(e)}_setPostConversationBody(){return{context:{conversationRouteId:"VIDEOLLAMADA_LSM"},routingTarget:{targetType:"QUEUE",targetAddress:"VIDEOLLAMADA_LSM"},participants:[{displayName:this._customerName.split(" ")[0]}]}}_postConversationSucessfulResponse(e){var t,i,s,a,n;if(null!==(t=e.detail)&&void 0!==t&&t.eventStreamUri&&null!==(i=e.detail)&&void 0!==i&&i.id&&null!==(s=e.detail)&&void 0!==s&&s.token&&null!==(a=e.detail)&&void 0!==a&&a.participants&&(null===(n=e.detail)||void 0===n?void 0:n.participants.length)>0){const t=ye;this._conversationData=t._setConversationProperties(e.detail),this._webSocketManager()}}static _setConversationProperties(e){return{eventStreamUri:e.eventStreamUri,conversationId:e.id,jwtChat:e.token,conversationMemberId:e.participants[0].id}}_webSocketManager(){this.conversationSocket=new WebSocket(this._conversationData.eventStreamUri),this._openWebSocket(this.conversationSocket),this._messageWebSocket(this.conversationSocket)}_openWebSocket(e){this._socketOpenListenerCallback=()=>{this._setConversationParticipants()},e.addEventListener("open",this._socketOpenListenerCallback)}_setConversationParticipants(){this._disabilityPurecloudDm.params={"conversation-id":this._conversationData.conversationId},this._disabilityPurecloudDm.getConversationParticipants()}_getConversationParticipantsSuccessfulResponse(e){e.detail&&e.detail.length>0&&(this._conversationData.memberId=e.detail[0].id,this._patchModifyParticipantConversation())}_patchModifyParticipantConversation(){this._disabilityPurecloudDm.params={"conversation-id":this._conversationData.conversationId,"participant-id":this._conversationData.memberId};const e=this._setPatchConversationParticipantsBody();this._disabilityPurecloudDm.patchConversationParticipants(e)}_setPatchConversationParticipantsBody(){return{customFields:[{id:"pkcs7",value:this._pkcs7}],phoneCallClassification:{id:"CHAT",description:"Chat asesor"}}}_patchModifyParticipantConversationSuccessfulResponse(){this.clearLoader(),this._errorResponseModalCounter=0,this._openDisabilityVideocallHearingCalling=!0,this._waitForAdviser()}_waitForAdviser(){this._adviserNotFoundTimeout=setTimeout((()=>{!this._conversationHasStarted&&this._openDisabilityVideocallHearingCalling&&(this._openDisabilityVideocallHearingCalling=!1,this._showAdviserNotFoundModal(),this._endConversation())}),this.timeWaitForAdviser)}_showAdviserNotFoundModal(){this._modalId=this._adviserNotFoundCounter<2?"adviserNotFound":"lastAdviserNotFound",this._fullHeightModal.closeModalElements=[],this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",headerType:"modal-three-level",hideContentPaddingTop:!0,iconRightPrimary:"bbva:close",headerText:this.t("disability-videocall-hearing-strategic-modal-header-text"),titleText:this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-title-text"),bodyText:this._adviserNotFoundCounter<2?this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-body-text"):this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-body-text-last-try"),buttonText:this._adviserNotFoundCounter<2?this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-button-text"):this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-button-text-last-try"),linkText:this._adviserNotFoundCounter<2?this.t("disability-videocall-hearing-strategic-adviser-not-found-modal-link-text"):"",img:this._adviserNotFoundCounter<2?this.disabilityImages.outTime:this.disabilityImages.deviceErrorCall},this._adviserNotFoundCounter+=1,this.requestUpdate(),this._fullHeightModal.open(),this._dispatchCustomEvent("adviser-not-found-analytics")}_messageWebSocket(e){this._socketMessageListenerCallback=e=>{const t=JSON.parse(e.data);if(t.eventBody){const e=ye,i=t.eventBody.body?t.eventBody.body:e._validateMemberInEventBody(t.eventBody);i&&i===this.t("disability-videocall-hearing-strategic-web-socket-message")?(clearTimeout(this._adviserNotFoundTimeout),this._receivedConversationStartedMessage()):i&&"DISCONNECTED"===i&&this._conversationHasStarted&&this._endVideocall({})}},e.addEventListener("message",this._socketMessageListenerCallback)}static _validateMemberInEventBody(e){return e.member?e.member.state:""}_receivedConversationStartedMessage(){this._conversationHasStarted=!0,this._dispatchCustomEvent("conversation-has-started",!0),this.showLoader("full"),this._getMeeting()}_getMeeting(){this._disabilityContactCenterDm.params={"meeting-id":this._conversationData.conversationId},this._disabilityContactCenterDm.getMeeting()}_getMeetingSuccessfulResponse(e){e.detail&&e.detail.token&&e.detail.roomId&&(this.clearLoader(),this._meetingData=this._setMeetingData(e.detail),this._disabilityNativeconnectorCiscoWebex.configView(this._setConfigViewBody()))}_setMeetingData(e){return{meetingToken:e.token,meetingRoomId:this.meetingRoomUrl+e.roomId}}_setConfigViewBody(){return{mainView:{header:{title:this.t("disability-videocall-hearing-strategic-config-view-main-view-header-title"),floatingWindow:!0},camerasViews:{localName:this._customerName}},endCallAlert:{available:!0,bodyText:this.t("disability-videocall-hearing-strategic-config-view-end-call-alert-body-text")}}}_configViewSuccessfulResponse(){this._disabilityNativeconnectorCiscoWebex.setJwt({jwt:this._meetingData.meetingToken})}_setJwtSuccessfulResponse(){this._disabilityNativeconnectorCiscoWebex.setVideocallAddressCall({addressCall:this._meetingData.meetingRoomId})}_setVideocallAddressCallSuccessfulResponse(){this._disabilityNativeconnectorCiscoWebex.initVideocall({})}_initCallSuccessfulResponse(){this._timeInSession=this._getTimeInSession();const e=this.maxTimeInSession-this._timeInSession;this._subscribePostMessages(),this._setLogoutTimer(e),this._setTimeLeftMessages(e),this._dispatchCustomEvent("stop-session-timeout"),this._dispatchCustomEvent("manage-visibility-only-after-start",!0),this._resetOpenPages(),this._goToEntryPoint(),this._dispatchCustomEvent("init-call-seccessful-response-analytics")}_getTimeInSession(){return Date.now()-this._loginTimer}_subscribePostMessages(){this._windowMessageListenerCallback=e=>{this._handlePostMessage(e)},window.addEventListener("message",this._windowMessageListenerCallback)}_handlePostMessage(e){if(e.data){const t=ye._parsePostMessage(e.data);this._handleParsedMessage(t)}}static _parsePostMessage(e){return JSON.parse(e.split("\\").join(""))}_handleParsedMessage(e){const t={endCall:"_endVideocall",networkLost:"networkDisconnected"};if(e.payload&&e.payload.event){t[e.payload.event]&&this[t[e.payload.event]]()}}_setLogoutTimer(e){this._logoutTimeout=setTimeout((()=>{this._conversationHasStarted&&(this._logoutTimeoutExpired=!0,this._videocallHasEnded=!0,this._dispatchCustomEvent("conversation-has-started",!1),this._disabilityNativeconnectorCiscoWebex.endVideocall({}),this._endConversation(),this._dispatchCustomEvent("timeout-expired-with-message",this.timeoutExpiredNativeToastSettings),this._dispatchCustomEvent("timeout-expired"))}),e)}_setTimeLeftMessages(e){this.listOfTimers.forEach((t=>{t.time<e&&(this._messageTimerTimeout=setTimeout((()=>{this._timeAlertManager(t)}),e-t.time),this._listOfTimersTimeout.push(this._messageTimerTimeout))}))}_timeAlertManager(e){this._conversationHasStarted&&(this._disabilityNativeconnectorCiscoWebex.showTimeAlert({text:this.t("disability-videocall-hearing-strategic-show-time-alert-text")+e.minutesLeft+this.t("disability-videocall-hearing-strategic-show-time-alert-text-ending")}),this._disabilityGenesysMessageDm.postMessage(this._setPostMessageParams(e)))}_setPostMessageParams(e){return{body:ye._setPostMessageBody(e.message),conversationId:this._conversationData.conversationId,memberId:this._conversationData.conversationMemberId,jwtChat:this._conversationData.jwtChat}}static _setPostMessageBody(e){return{body:e,bodyType:"standard"}}_goToEntryPoint(){this._openDisabilityVideocallHearingCalling&&this._endConversation(),this._dispatchCustomEvent("go-to-entry-point"),this._fullHeightModal.close(),this._resetOpenPages()}_endVideocall(){this._logoutTimeoutExpired||this._isNetworkDisconnectedModalOpened||this._videocallHasEnded||(this._videocallHasEnded=!0,clearTimeout(this._logoutTimeout),this._listOfTimersTimeout.forEach((e=>clearTimeout(e))),this.showLoader("full"),this._dispatchCustomEvent("start-session-timeout"),this._dispatchCustomEvent("end-disability-videocall"),this._dispatchCustomEvent("conversation-has-started",!1),this._disabilityNativeconnectorCiscoWebex.endVideocall({}))}networkDisconnected(){this._conversationHasStarted&&(this._isNetworkDisconnectedModalOpened=!0,this._conversationHasStarted=!1,this._videocallHasEnded=!0,this._dispatchCustomEvent("start-session-timeout"),this._dispatchCustomEvent("end-disability-videocall"),this._dispatchCustomEvent("conversation-has-started",!1))}_handleClickFooterButton(){this[{adviserNotFound:"_goToCallingPage",exitDisability:"_goToEntryPoint",outOfHours:"_goToEntryPoint",lastAdviserNotFound:"_goToEntryPoint",errorResponseModal:this._conversationHasStarted?"_getMeeting":"_goToCallingPage",lastErrorResponseModal:"_goToEntryPoint",errorNetworkStatusModal:"_getNetworkStatus",lastErrorNetworkStatusModal:"_goToEntryPoint",networkDisconnected:this.isNativeIos?"_goToLogin":"_goToConfiguration",downloadAndroidDynamicModulesModal:"_downloadAndroidDynamicModules"}[this._modalId]]()}_goToLogin(){this._dispatchCustomEvent("timeout-expired")}_downloadAndroidDynamicModules(){this.config.loader={visible:!0,showSpinnerMessageLabel:!0,titleMessage:"Integrando complementos",text:"La integración puede tardar unos minutos"},this.showLoader(),this.requestUpdate(),this._dispatchCustomEvent("download-android-dynamic-module","ciscowebex")}downloadAndroidDynamicModulesSuccessfulResponse(){this.clearLoader(),this._goToPutAttentionPage(),this.config={loader:!0}}_goToConfiguration(){this._dispatchCustomEvent("open-native-settings",{setting:"application_settings"}),this._goToEntryPoint()}_handleClickLinkButton(){this[{adviserNotFound:"_setExitDisabilityModal",exitDisability:"_validateCloseModalElements",errorResponseModal:"_goToEntryPoint",errorNetworkStatusModal:"_goToEntryPoint",networkDisconnected:"_goToLogin"}[this._modalId]]()}_validateCloseModalElements(){0===this._fullHeightModal.closeModalElements.length&&(this._modalId="adviserNotFound")}_handleRightPrimaryClick(){const e={outOfHours:"_goToEntryPoint",adviserNotFound:"_setExitDisabilityModal",lastAdviserNotFound:"_goToEntryPoint",errorNetworkStatusModal:"_goToEntryPoint",lastErrorNetworkStatusModal:"_goToEntryPoint",downloadAndroidDynamicModulesModal:""};e[this._modalId]&&this[e[this._modalId]]()}_handleVeilClick(){this._modalId="adviserNotFound"}_showErrorResponseModal(){this._videocallHasEnded||(this.clearLoader(),this._modalId=this._errorResponseModalCounter<2?"errorResponseModal":"lastErrorResponseModal",this._fullHeightModalSettings={fixedFooter:!0,titleLines:"0",headerType:"modal",hideContentPaddingTop:!0,iconRightPrimary:"",headerText:this.t("disability-videocall-hearing-strategic-error-response-modal-header-text"),titleText:this.t("disability-videocall-hearing-strategic-error-response-modal-title-text"),bodyText:this.t("disability-videocall-hearing-strategic-error-response-modal-body-text"),buttonText:this._errorResponseModalCounter<2?this.t("disability-videocall-hearing-strategic-error-response-modal-button-text"):this.t("disability-videocall-hearing-strategic-error-response-modal-button-text-last-try"),linkText:this._errorResponseModalCounter<2?this.t("disability-videocall-hearing-strategic-error-response-modal-link-text"):"",img:this.disabilityImages.connectionError},this._errorResponseModalCounter+=1,this.requestUpdate(),this._fullHeightModal.open())}_beforeAgentMessageErrorResponse(){Object.keys(this._conversationData).length>0&&!this._conversationHasStarted&&(this._endConversation(),this._conversationData={}),this._showErrorResponseModal()}_afterAgentMessageErrorResponse(){this._errorResponseModalCounter>1&&(this._endConversation(),this._conversationData={},this._openDisabilityVideocallHearingCalling=!1,this._conversationHasStarted=!1),this._showErrorResponseModal()}render(){var e,t,i,a,n,o,r,l,d,c,h;return s`
    ${super.render()} 

    <bbva-transition-container id="disability-videocall-help" ?visible="${this._openDisabilityVideocallHearingHelp}">
      <div slot="slot-content">
        <bbva-disability-videocall-help
        id="helpPage"
        help-page-image="${this.disabilityImages.helpPage}"
        @header-main-icon-left-primary-click="${this._goToEntryPoint}"
        @on-click-continue="${this._getNetworkStatus}"
        @on-click-cancel="${this._setExitDisabilityModal}"
        ></bbva-disability-videocall-help>
      </div>
    </bbva-transition-container>

    <bbva-transition-container id="disability-videocall-put-attention" ?visible="${this._openDisabilityVideocallHearingPutAttention}">
      <div slot="slot-content">
        <bbva-disability-videocall-put-attention
        id="putattentionPage"
        @header-main-icon-left-primary-click="${this._goToHelpPage}"
        @on-click-continue="${this._goToCallingPage}"
        @on-click-cancel="${this._setExitDisabilityModal}"
        ></bbva-disability-videocall-put-attention>
      </div>
    </bbva-transition-container>

    <bbva-transition-container id="disability-videocall-calling" ?visible="${this._openDisabilityVideocallHearingCalling}">
      <div slot="slot-content">
        <bbva-disability-videocall-calling
        id="callingPage"
        @on-click-cancel="${this._setExitDisabilityModal}"
        @header-main-icon-left-primary-click="${this._setExitDisabilityModal}"
        ></bbva-disability-videocall-calling>
      </div>
    </bbva-transition-container>
    
    <bbva-transition-container id="disability-videocall-successful" ?visible="${this._openDisabilityVideocallHearingSuccessful}">
      <div slot="slot-content">
        <bbva-disability-videocall-successful
        id="successfulPage"
        @on-click-continue=${this._goToEntryPoint}
        @header-main-icon-right-primary-click="${this._goToEntryPoint}"
        ></bbva-disability-videocall-successful>
      </div>
    </bbva-transition-container>
    
    <bbva-local-single-sign-on-api-dm
      id="singleSignOnApiDm"
      .host="${this.host}"
      .requiredToken="${this.requiredToken}"
      ?native="${this.native}"
      .version="${this.singleSignOnVersion}"
      @single-sign-on-api-dm-create="${this._postCreateSsoSuccessfulResponse}"
      @api-dm-response-error="${this._beforeAgentMessageErrorResponse}"
    >
    </bbva-local-single-sign-on-api-dm>

    <bbva-local-purecloud-api-dm
      id="purecloudApiDm"
      .host="${this.host}"
      .requiredToken="${this.requiredToken}"
      ?native="${this.native}"
      .version="${this.purecloudVersion}"
      @post-conversation-success="${this._postConversationSucessfulResponse}"
      @get-conversation-participants-success="${this._getConversationParticipantsSuccessfulResponse}"
      @patch-conversation-participants-success="${this._patchModifyParticipantConversationSuccessfulResponse}"
      @api-dm-response-error="${this._beforeAgentMessageErrorResponse}"
    >
    </bbva-local-purecloud-api-dm>

    <bbva-local-contact-center-api-dm
      id="contactCenterApiDm"
      .host="${this.host}"
      ?native="${this.native}"
      @get-meeting-success="${this._getMeetingSuccessfulResponse}"
      @api-dm-response-error="${this._afterAgentMessageErrorResponse}"
    >
    </bbva-local-contact-center-api-dm>

    <bbva-nativeconnector-cisco-webex
      id="nativeconnectorCiscoWebex"
      @success-config-view-call="${this._configViewSuccessfulResponse}"
      @success-set-jwt="${this._setJwtSuccessfulResponse}"
      @success-set-videocall-address-call="${this._setVideocallAddressCallSuccessfulResponse}"
      @success-init-videocall-call="${this._initCallSuccessfulResponse}"
      @success-end-videocall-call="${this._successEndVideocall}"
      @error="${this._afterAgentMessageErrorResponse}"
    >
    </bbva-nativeconnector-cisco-webex>

    <bbva-thirdparty-genesys-message-api-dm
      id="genesysSendMessageApiDm"
      host="https://api.mypurecloud.com"
      ?native="${this.native}"
      @post-message-success="${this._genesysSendMessageSuccessfulResponse}"
      @post-message-error="${this._genesysSendMessageErrorResponse}"
    >
    </bbva-thirdparty-genesys-message-api-dm>

    <bbva-thirdparty-genesys-member-api-dm
      id="genesysDeleteMemberApiDm"
      host="https://api.mypurecloud.com"
      ?native="${this.native}"
      @delete-member-success="${this._genesysDeleteMemberSuccessfulResponse}"
      @delete-member-error="${this._genesysDeleteMemberErrorResponse}"
    >
    </bbva-thirdparty-genesys-member-api-dm>

    <slot>
      <bbva-help-modal
        id="fullHeightModal"
        full-height
        icon-right-primary="${this._fullHeightModalSettings.iconRightPrimary}"
        fixed-footer="${this._fullHeightModalSettings.fixedFooter}"
        header-type="${this._fullHeightModalSettings.headerType}"
        hide-content-padding-top="${this._fullHeightModalSettings.hideContentPaddingTop}"
        modal-type="${this._fullHeightModalSettings.modalType}"
        title-icon="${this._fullHeightModalSettings.titleIcon}"
        title-lines="${this._fullHeightModalSettings.titleLines}"
        header-text="${this._fullHeightModalSettings.headerText}"
        body-text="${this._fullHeightModalSettings.bodyText}"
        button-text="${this._fullHeightModalSettings.buttonText}"
        link-text="${this._fullHeightModalSettings.linkText}"
        @help-modal-footer-button-click="${this._handleClickFooterButton}"
        @help-modal-footer-link-click="${this._handleClickLinkButton}"
        @help-modal-header-right-primary-click="${this._handleRightPrimaryClick}"
      >
        <div  class="${null!==(e=this._fullHeightModalSettings)&&void 0!==e&&e.classNames?"row-title":"help-content-modal"}" 
              slot="slot-title">
          <img
            id="image-modal-videocall"
            ?hidden=${!(null!==(t=this._fullHeightModalSettings)&&void 0!==t&&t.img)}
            class="image-modal"
            src="${this._fullHeightModalSettings.img}"
            alt=""
          />
          ${null!==(i=this._fullHeightModalSettings)&&void 0!==i&&i.itemsContent?C:s`
              <bbva-text 
                  class='text-title' 
                  text="${this._fullHeightModalSettings.titleText}"
                ></bbva-text>
              `}

        </div>
        ${null!==(a=this._fullHeightModalSettings)&&void 0!==a&&a.itemsContent?s`
            <div class="row" slot="slot-content">
              <bbva-text 
                class="${null===(n=this._fullHeightModalSettings)||void 0===n?void 0:n.classNames}"
                text="${this._fullHeightModalSettings.titleText}"
                font-weight="${x(null===(o=this._fullHeightModalSettings)||void 0===o?void 0:o.fontWeight)}"
                size="${x(null===(r=this._fullHeightModalSettings)||void 0===r?void 0:r.titleSize)}"
                alignment="${x(null===(l=this._fullHeightModalSettings)||void 0===l?void 0:l.textAlignment)}"></bbva-text>

               <bbva-text
                    size="S"
                    alignment="left"
                    text="${null===(d=this._fullHeightModalSettings)||void 0===d?void 0:d.bodyText}">
                  </bbva-text>
               ${null===(c=this._fullHeightModalSettings)||void 0===c||null===(h=c.itemsContent)||void 0===h?void 0:h.map((e=>s`
                    <div slot="icon-text-content">
                      <bbva-icon
                        class="icon-modal"
                        icon="${e.icon}"
                        size="24"
                        icon-color="">
                      </bbva-icon>
                      <bbva-text
                        class=""
                        text="${e.description}">
                      </bbva-text>
                    </div>
                    ${e.divider?s`<bbva-divider-default class="container"></bbva-divider-default>`:C}
            `))}
            </div>
            `:C}
      </bbva-help-modal>
    </slot>
    <bbva-help-modal
        id="halfModal"
        ?full-height=false
        fixed-footer="${this._halfHeightModalSettings.fixedFooter}"
        hide-content-padding-top="${this._halfHeightModalSettings.hideContentPaddingTop}"
        modal-type="${this._halfHeightModalSettings.modalType}"
        title-icon="${this._halfHeightModalSettings.titleIcon}"
        title-lines="${this._halfHeightModalSettings.titleLines}"
        title-text="${this._halfHeightModalSettings.titleText}"
        body-text="${this._halfHeightModalSettings.bodyText}"
        button-text="${this._halfHeightModalSettings.buttonText}"
        link-text="${this._halfHeightModalSettings.linkText}"
        @help-modal-footer-button-click="${this._handleClickFooterButton}"
        @help-modal-footer-link-click="${this._handleClickLinkButton}"
        @help-modal-veil-click="${this._handleVeilClick}"
      >
    `}}customElements.define(ye.is,ye);
