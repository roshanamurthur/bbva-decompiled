import{J as e,L as t,aZ as i,a7 as s,dC as a,dD as n,dE as o,h as r,a as c,i as d,b as l,z as u,aX as h,an as p,ak as m,ai as b,aV as g,V as f,cU as _,aN as y}from"./952f98a9.js";import{L as v,D as C,a1 as E,O as S,aw as D,G as A,a2 as T,P as x,x as I,Y as P,Z as R,I as k,M as O,A as N,e as $,f as M,F as w,R as F,T as V,K as L}from"./216055dc.js";import{B}from"./67256d35.js";import{B as q,a as j}from"./20acd25d.js";import"./cff03f17.js";import{B as H}from"./577155d8.js";import{a as U,e as G,d as K,c as z,B as Y}from"./1979ce36.js";import{B as Q}from"./a101086e.js";import{B as X}from"./13014d63.js";import{B as J,a as W}from"./a0b89eb0.js";import{B as Z,a as ee}from"./4eb8d874.js";import{B as te}from"./40b41b3c.js";import{B as ie,a as se}from"./a4e2d801.js";import{c3 as ae,bf as ne,c4 as oe,bg as re,aI as ce,aH as de,R as le}from"./7f3d7ca9.js";import{B as ue}from"./077d7438.js";import{B as he}from"./7f28d0e7.js";import"./fcddf1cb.js";class pe extends(e(t)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==e[t].id&&e.splice(t,1);return e}}class me{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,n=Math.max(a>=0?a:s-Math.abs(a),0);for(;n<s;){if((o=i[n])===(r=e)||"number"==typeof o&&"number"==typeof r&&isNaN(o)&&isNaN(r))return!0;n++}var o,r;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",n=0,o=arguments.length;n!==o;++n){var r=+arguments[n];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class be extends me{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const ge=0,fe=1,_e="jwt",ye="tsec",ve="none";class Ce extends me{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ge,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new be,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ye:this.requiredToken=ve,this.requiresJWT=!1):this.requiredToken===ye?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===_e?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ve?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ye)}_setJwtHandler(){this._setTokenHandler(_e)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===fe?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ye,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(_e,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===_e?"JWT ":"",a=e===_e?"Authorization":ye;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(n);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,n=0;if(s<=127?(a=0,n=255&s):s<=223?(a=1,n=31&s):s<=239?(a=2,n=15&s):s<=244&&(a=3,n=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],n=n<<6|63&s,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,n=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:n,data:o,state:r,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(l),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,l,n,o,r,c,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,n,o,r,c,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),n=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(n),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,n){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};n&&(o.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,n){s?this._notifySignatureRequired(e,t,i,s,a,n):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,n,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,n,o)}}class Ee extends Ce{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Se extends Ce{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class De extends Ee{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Ae extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class Te extends Ee{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class xe extends Ee{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Ie extends Ee{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Pe extends Ee{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Re extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/documentation-dossiers`)}toString(){return super.toString("BGADPAccountsDocumentationDossiersPostV0")}}class ke extends pe{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(s))}_getBgadp(e){return{getAccountsV1:()=>new te(e),getAccountsV0:()=>new De(e),postAccountsV0:()=>new Ae(e),postAccountsV1:()=>new Z(e),getAccountsV2:()=>new J(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){if("0"==this.version&&Object.keys(e).length){const t=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],i=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];e["status.id"]&&t.includes(e["status.id"])&&this._removeFields(["status.id"],e),e["indicators.id"]&&i.includes(e["indicators.id"])&&this._removeFields(["indicators.id"],e),this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(e,"expand.id","expand"),e}_responseMapping(e){if(Array.isArray(e)&&e.length>0){if("0"==this.version)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product");["COMMON","CREDIT"].includes(e[t].accountType.id)||this._removeFields(["accountType"],e[t]),this._removeFields(["subType"],e[t].accountType),this._removeFields(["previousMonthAverageBalances"],e[t].availableBalance),"DORMANT"===e[t].status.id&&this._removeFields(["status"],e[t]),this._removeFields(["reason","reasonDescription","situation"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],e[t])}else if("1"==this.version)for(let t=0;t<e.length;t++)e[t].product&&this._removeFields(["subProduct"],e[t].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],e[t]),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){if("0"==this.version&&Object.keys(e).length){this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.status.reason&&(e.status.reason={id:e.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(e.accountType.id)||this._removeFields(["accountType"],e),e.participants.forEach((e=>{this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType||Object.keys(e).some((e=>"firstName"===e))?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):("LEGAL_PERSON"===e.personType||Object.keys(e).some((e=>"legalName"===e)))&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],e)),e.participantType.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination&&e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails&&e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],e)}return e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.status&&this._removeFields(["name"],e.status),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(e.participantType.id)&&this._removeFields(["participantType"],e),e.order&&(e.participantType={...e.participantType,order:e.order},this._removeFields(["order"],e)),e.customDetails.firstName&&(e.firstName=e.customDetails.firstName),e.customDetails.lastName&&(e.lastName=e.customDetails.lastName),e.customDetails.secondLastName&&(e.secondLastName=e.customDetails.secondLastName);const t=["DNI","NIE","NIF","CIF","PASSPORT"];e.customDetails.identityDocuments&&e.customDetails.identityDocuments.forEach((i=>{t.includes(i.documentType.id)&&(e.identityDocument={documentNumber:i.documentNumber,documentType:i.documentType.id})})),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),"DIGITAL_CONTACT"===e.destination.id&&this._removeFields(["id"],e.destination),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingType"],e)})))),e}_paginationMapping(e){return e}}s(ke,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),s(ke,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(ke.is,ke);class Oe extends pe{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(s))}_getBgadp(e){return{getAccountTransactionsV2:()=>new a(e),getAccountTransactionsV0:()=>new Pe(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let s=t[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===e[s])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(e[t].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const a=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[a,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}s(Oe,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Oe.is,Oe);class Ne extends pe{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const i={"account-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(s))}_getBgadp(e){return{getAccountParticipantsV2:()=>new ie(e),getAccountParticipantsV1:()=>new n(e),postAccountParticipantsV1:()=>new o(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}s(Ne,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),s(Ne,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(Ne.is,Ne);class $e extends pe{static get is(){return"bbva-global-account-participants-api-dm"}static get properties(){return{accountParticipants:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accountParticipants=[],this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accountParticipants"],this._loaded=!1,this._requestParams={},this._modules={Es:()=>import("./20d04845.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}AccountParticipants`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccountParticipants${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-account-participants-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-account-participants-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ne.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccountParticipants(){await this.module.updateComplete,this.module.resetAccountParticipants()}async getAccountParticipants(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({accountId:e,params:t}):this._requestParams={get:[{accountId:e,params:t}]}}async _getAccountParticipants(){await this.module.updateComplete,Object.keys(this.accountParticipants).length||(this._requestParams.get.forEach((e=>{this.module.getAccountParticipants(null==e?void 0:e.accountId,null==e?void 0:e.params)})),delete this._requestParams.get)}async postAccountParticipants(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({accountId:e,body:t}):this._requestParams={post:[{accountId:e,body:t}]}}async _postAccountParticipants(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postAccountParticipants(null==e?void 0:e.accountId,null==e?void 0:e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return r` ${this._module?this._module:""}`}}const Me={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},we={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Fe extends(c(Oe)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[l];return Fe.scopedElementsFromClasses(e)}render(){return r` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return r`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${d(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,s)=>(i[s.replace(e,"")]=t.getItem(s),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const i=this.shadowRoot.getElementById("accountTransactions"),s=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:i,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[s]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let s={};var a,n;i&&(s={id:"EUR"===(null===(a=i.currency)||void 0===a?void 0:a.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(n=i.currency)||void 0===n?void 0:n.id});let o={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;o={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const r=0===Object.keys(s).length,c=0===Object.keys(o).length;return r&&c?null:r?[o]:c?[s]:[s,o]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const s=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,a=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,n=Me[s];var o;return{id:s,name:n,category:{id:s,name:n,subcategory:{id:a,name:(o=a,Object.keys(we).find((e=>we[e].includes(o))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:s,body:a}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${s}`,e.method=i,e.body=a,e.generateRequest(!0)}}customElements.define(Fe.is,Fe);class Ve extends pe{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(s))}_getBgadp(e){return{getAccountLimitsV0:()=>new Ie(e),getAccountLimitsV2:()=>new ee(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}s(Ve,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Ve.is,Ve);class Le extends pe{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(s))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new se(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Le,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(Le.is,Le);class Be extends pe{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(e,t,i){i=Object.assign({"account-id":e,"financial-statement-id":t},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,i.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatement`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementV0:()=>new xe(e),default:()=>"BGADP does not exist."}}}s(Be,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(Be.is,Be);class qe extends pe{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatements`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementsV0:()=>new Te(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(qe,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define(qe.is,qe);class je extends pe{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountRelatedContracts`,this._getBgadp(s))}_getBgadp(e){return{getAccountRelatedContractsV2:()=>new W(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(je,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(je.is,je);class He extends(e(t)){}class Ue extends He{static get is(){return"bbva-local-accounts-level-upgrade-api-dm"}static get properties(){return{}}postLevelUpgrade(e,t){const i={"account-id":e};this._generateGetService(this._getService("post",t,i),{customEvent:"account-level-upgrade-api-dm-fetch",errorFireEventHandler:"account-level-upgrade-api-dm-fetch-error"},this._responseMapping?this._responseMapping:Ue._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}LevelUpgrade`,this._getBgadp?this._getBgadp(s):Ue._getBgadp(s))}static _getBgadp(e){return{postLevelUpgradeV2:()=>new ae(e),default:()=>"BGADP called not exist"}}static _responseMapping(e){return e}}class Ge extends He{static get is(){return"bbva-local-accounts-documentation-dossiers-api-dm"}static get properties(){return{}}postDocumentationDossiers(e){this._generateGetService(this._getService("post",e,{}),{customEvent:"account-documentation-dossiers-api-dm-fetch",errorFireEventHandler:"account-documentation-dossiers-api-dm-fetch-error"},this._responseMapping?this._responseMapping:Ge._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}DocumentationDossiers`,this._getBgadp?this._getBgadp(s):Ge._getBgadp(s))}static _getBgadp(e){return{postDocumentationDossiersV0:()=>new Re(e),default:()=>"BGADP called not exist"}}static _responseMapping(e){return e}}var Ke=u`
:host {
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

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --_help-modal-content-bg-color: var(--colorsPrimaryCoreDark);
  --_help-modal-full-height-bg-color: var(--colorsPrimaryCoreDark);
}

[data-tag-name=bbva-expandable-multistep-index] {
  margin: 1rem 1rem;
}

.confirmation {
  width: 100%;
  padding: 1rem 1rem 1.5rem;
  background-color: var(--colorsPrimaryCoreLightened);
  position: fixed;
  bottom: 0;
}

.footer-button {
  margin-top: 1rem;
  background-color: var(--colorsPrimaryCoreLightened);
  padding: 1rem 1rem 1.5rem;
}

.identity-divider {
  margin-top: 0.5rem;
  margin-bottom: 1rem;
  padding: 0rem 1rem;
}

.notification {
  padding: 0.9375rem;
}

.expandable-step-divider {
  margin-left: 1rem;
}

.expandable-step-summary {
  padding-bottom: 1rem;
}

.confirm-notification {
  padding: 0rem 1rem 1.5rem;
}

.list-residence {
  padding-left: 0.5rem;
  padding-right: 1rem;
}

#divider-tax-residences {
  margin-top: 1rem;
  margin-bottom: 1rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-completed-content-max-height: auto;
}
`,ze=u`
.list-simple {
  display: flex;
  justify-content: space-between;
  padding: 0px 16px;
  margin-bottom: 0.5rem;
  align-items: center;
  gap: 16px;
}
.list-simple *:last-child {
  text-align: right;
}

.list-simple-kyc {
  margin: 0 0.9375rem 0.625rem;
}

.file-list {
  display: flex;
  flex-direction: column;
  padding: 0px 16px;
  margin-bottom: 0.5rem;
}

.identity-list {
  display: flex;
  justify-content: space-between;
  padding: 0px 16px;
  margin-top: 1rem;
  margin-bottom: 1rem;
}

.identity-list .name {
  margin-right: 1.5rem;
  flex-shrink: 0;
}

.identity-list > :not(.name) {
  overflow-wrap: anywhere;
  text-align: end;
}

.identity-list-title {
  justify-content: flex-start;
  padding: 0px 16px;
  margin-top: 1rem;
  margin-bottom: 1.5rem;
  display: flex;
  gap: 8px;
}

.identity-list-title-icon {
  flex-basis: 26px;
  margin-top: 4.67px;
}

.list-simple-fatca {
  display: flex;
  justify-content: space-between;
  padding: 0px 16px;
  margin-bottom: 8px;
}

.list-simple-fatca-key {
  width: 50%;
}

.list-simple-fatca-value {
  text-align: end;
  display: flex;
  flex-flow: column;
  align-items: flex-end;
  text-wrap: balance;
  text-align: right;
}
`;class Ye extends(h(v(p(t)))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[A,T,x,I];return Ye.scopedElementsFromClasses(e)}static get styles(){return[ze,C.primary,E.primary,E.secondary,S.primary,S.secondary,m("bbva-list-simple-shared-styles")]}static get properties(){return{className:{type:String,attribute:"class-name",default:"list-simple"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},items:{type:Array},_dateOptions:{type:Object,state:!0}}}constructor(){super(),this.maskChars="•",this.visibleChars=4,this.currencyCode="",this.localCurrency="",this.items=[],this._dateOptions={day:"2-digit",month:"long",hour:"2-digit",minute:"2-digit"}}render(){return r`
      ${D(this.items,(e=>r`
          ${e.title?r`
              <div class="${this.className}-title flex-column">
                <bbva-type-icon
                  class="${this.className}-title-icon"
                  icon=${b()}
                  size="16"
                ></bbva-type-icon>
                <bbva-type-text
                  size="S"
                  font-weight="500"
                  text="${e.title.text}"
                  unset
                ></bbva-type-text>
              </div>
            `:g}
          <div class="${this.className}">
            <bbva-type-text
              size="S"
              class="${this.className}-key name"
              text="${e&&e.name&&e.name.mask?f(e.name.mask,this.maskChars,!0,this.visibleChars):e.name}"
              unset
            ></bbva-type-text>
            ${e.value&&e.value.text?r`
                <bbva-type-text
                  size="S"
                  class="${this.className}-value"
                  text="${e.value&&e.value.text}"
                  font-weight="${e.value&&e.value.bold?"500":""}"
                  unset
                >
                </bbva-type-text>
              `:g}
          </div>
        `))}
    `}}var Qe=u`
.list-simple-kyc {
  margin: 0 1rem 1rem;
}

.subtitle {
  margin: 0.5rem auto;
}
`;class Xe extends(h(v(p(t)))){static get is(){return"bbva-list-simple-kyc"}static get scopedElements(){const e=[A];return Xe.scopedElementsFromClasses(e)}static get styles(){return[Qe,C.primary,C.secondary,m("bbva-list-simple-kyc-shared-styles")]}static get properties(){return{items:{type:Array}}}constructor(){super(),this.items=[]}get _showSection(){return this.items.map((e=>r`
      ${this._renderSection("AboutHabits",e.aboutHabits)}
      ${this._renderSection("BankOperations",e.bankOperations)}
      ${this._renderSubtitle("bbva-feature-proceedings-kyc-step-subtitle-account-information")}
      ${this._renderSection("Services",e.services)}
      ${this._renderSection("Account",e.account)}
      ${this._renderSection("Bank",e.bank)}
    `))}_renderSubtitle(e){return r`
      <div class="${"bbva-feature-proceedings-kyc-step-subtitle-bank-operations"===e?"subtitle":"list-simple-kyc"}">
        <bbva-type-text
          size="S"
          text="${this.t(e)}"
          font-weight="500"
          unset
        >
        </bbva-type-text>
      </div>
    `}_renderSection(e,t){return r`
      ${D(t,(t=>r`
          ${t.value&&t.value.text?r`
              <div id="section${e}" class="list-simple-kyc" ambient="secondary">
                <bbva-type-text
                  id="${t.name}"
                  size="S"
                  text="${this.t(t.name)}"
                  unset
                >
                </bbva-type-text>
                <bbva-type-text
                  size="S"
                  text="${t.value&&t.value.text}"
                  font-weight="500"
                  unset
                >
                </bbva-type-text>
                ${"AboutHabits"===e&&"bbva-feature-proceedings-kyc-step-monthly-operations-exceed"===t.name&&"bbva-feature-proceedings-kyc-step-yes"===t.value.text?this._renderSubtitle("bbva-feature-proceedings-kyc-step-subtitle-bank-operations"):g}
              </div>
            `:g}
        `))}
    `}render(){return r`
      ${this._showSection}
    `}}var Je=u`
.list_contact {
  display: flex;
  margin: 0 1.25rem;
  padding-bottom: 1.0625rem;
}
.list_contact .clip-box {
  align-content: center;
}
.list_contact .data-content {
  padding-left: 1rem;
  width: -webkit-fill-available;
}
.list_contact .sub-data-content {
  display: flex;
  padding-right: 0.625rem;
  justify-content: space-between;
  margin: -0.625rem -0.9375rem 0.625rem 0;
}

.divider {
  padding: 0rem 0rem 0.5rem 16px;
}

.full-name {
  color: var(--color-secondary-link-main-default, #5BBEFF);
}
`;class We extends(h(v(p(t)))){static get is(){return"bbva-list-contact"}static get scopedElements(){const e=[R,A,k];return We.scopedElementsFromClasses(e)}static get styles(){return[Je,P.secondary,C.secondary,m("bbva-list-contact-shared-styles")]}static get properties(){return{items:{type:Array}}}constructor(){super(),this.items=[]}render(){return r`
      ${this.items.map(((e,t)=>r`
        <div class="list_contact" ambient="secondary">
          <span class="clip-box">
            <bbva-clip-box
              group="${JSON.stringify([{text:(e.firstName&&e.firstName.charAt(0)||"")+(e.lastName&&e.lastName.charAt(0)||""),size:"l",bitone:"true",bgColor:"secondary"}])}"
            >
            </bbva-clip-box>
          </span>
          <div class="data-content">
            <bbva-type-text
              class="full-name"
              size="S"
              text="${e.fullName}"
              font-weight="500"
              ellipsis
            >
            </bbva-type-text>
            <div class="sub-data-content">
              <bbva-type-text
                text="${e.relationType}"
                font-style="italic"
                unset
              >
              </bbva-type-text>
              <bbva-type-text
                text="${`${e.participationPercentage}%`}"
                font-style="italic"
                unset
              >
              </bbva-type-text>
            </div>
          </div>
        </div>
        ${this.items.length-1!==t?r`
          <div class="divider">
            <bbva-divider-default
              size="small"
            ></bbva-divider-default>
          </div>
        `:null}
      `))}
    `}}class Ze extends(h(O(v(p(t))))){static get is(){return"bbva-feature-proceedings-multistep"}static get scopedElements(){const e=[$,ne,oe,re,k,Ye,Xe,M,w,R,M,A,k,We];return Ze.scopedElementsFromClasses(e)}static get styles(){return[Ke,N.secondary,m("bbva-feature-proceedings-multistep-shared-styles")]}static get properties(){return{addressComplete:{type:Boolean,attribute:"address-complete"},beneficiariesComplete:{type:Boolean,attribute:"beneficiaries-complete"},fatcaComplete:{type:Boolean,attribute:"fatca-complete"},listContractingDossiers:{type:Array},kycData:{type:Array},scrollToStepIndex:{type:Number,attribute:"scroll-to-step-index"},showConfirmInfoValidationExpandable:{type:Boolean,attribute:"show-confirm-info-validation-expandable"},showIdentityValidationExpandable:{type:Boolean,attribute:"show-identity-validation-expandable"},identityValidationList:{type:Array},showKycValidationExpandable:{type:Boolean,attribute:"show-kyc-validation-expandable"},visible:{type:Boolean},showAddress:{type:Boolean,attribute:"show-address"},addressData:{type:Object},customer:{type:Object},taxResidences:{type:Array},residencesList:{type:Array},accountDetailData:{type:Object},participantsChannel:{type:Array},participants:{type:Array},visibleButtonUpgradeLevel:{type:Boolean},fromPortability:{type:String}}}constructor(){super(),this.addressComplete=!1,this.fatcaComplete=!1,this.listContractingDossiers=[],this.kycData=[],this.scrollToStepIndex=-1,this.visible=!1,this.showConfirmInfoValidationExpandable=!1,this.showIdentityValidationExpandable=!1,this.showKycValidationExpandable=!1,this.showAddress=!1,this.identityValidationList=[],this.addressData={addressComplete:"",hideAddress:"",addressType:""},this.customer={},this.taxResidences=[],this.residencesList=[],this.accountDetailData={},this.participantsChannel=[],this.participants=[],this.visibleButtonUpgradeLevel=!1,this.beneficiariesComplete=!1,this.fromPortability=""}firstUpdated(){this.listContractingDossiers.length>0&&this.handleStatusValidationCompled(),this.visibleButtonUpgradeLevel=!0}updated(e){e.has("listContractingDossiers")&&this.listContractingDossiers.length&&this.handleStatusValidationCompled(),(e.has("listContractingDossiers")||e.has("participants"))&&this.fatcaComplete&&this.addressComplete&&this.beneficiariesComplete&&this._handlerConfirmationValidationStep(),super.updated(e)}_handleMultistepModalOpen(e){e.stopPropagation(),this._dispatchCustomEvent("bbva-feature-proceedings-multistep-modal-open")}_handleCloseButton(){this.showIdentityValidationExpandable||this.showKycValidationExpandable||this.showConfirmInfoValidationExpandable?this._dispatchCustomEvent("bbva-feature-proceedings-show-modal-close"):this._dispatchCustomEvent("bbva-feature-proceedings-multistep-exit")}_confirmData(e){const t={id:e.target.id,status:e.target.status};this._dispatchCustomEvent("bbva-feature-proceedings-operative-confirm-data",t)}completeAllConfirmInformation(){this._getConfirmInfoValidationElement.setAttribute("state","success"),this._getConfirmInfoValidationElement.setAttribute("description",`${this.t("bbva-feature-proceedings-multistep-index-confirmation-information-step-description")}`),this._getConfirmInfoValidationElement.setAttribute("badge-text",`${this.t("bbva-feature-proceedings-multistep-index-module-completed-text")}`),this._getConfirmInfoValidationElement.removeAttribute("expanded"),this._getConfirmInfoValidationElement.removeAttribute("active"),this._getConfirmInfoValidationElement.removeAttribute("disabled"),this.showConfirmInfoValidationExpandable=!this.showConfirmInfoValidationExpandable,this._handleConfirmLevelButton()}handleStatusValidationCompled(){this.listContractingDossiers.forEach((e=>{"identityValidation"===e.keys?this._handleStatusIdentityValidation(e):"kyc"===e.keys?this._handleStatusKyc(e):this._handleStatusAddressAndFatca(e)}))}_handleStatusIdentityValidation(e){"Q"!==e.status&&"E"!==e.status||(this._getIdentityValidationElement.setAttribute("state","success"),this._getIdentityValidationElement.setAttribute("description",`${this.t("bbva-feature-proceedings-multistep-index-identity-validation-step-description")}`),this._getIdentityValidationElement.setAttribute("badge-text",`${this.t("bbva-feature-proceedings-multistep-index-module-completed-text")}`),this._getIdentityValidationElement.removeAttribute("expanded"),this._getIdentityValidationElement.removeAttribute("active"),this._getKycValidationElement.removeAttribute("disabled"),this._handleStatusConfirmInfoValidation())}_handleStatusKyc(e){"O"!==e.status&&"C"!==e.status||(this._getKycValidationElement.setAttribute("state","success"),this._getKycValidationElement.setAttribute("description",`${this.t("bbva-feature-proceedings-multistep-index-kyc-validation-step-description")}`),this._getKycValidationElement.setAttribute("badge-text",`${this.t("bbva-feature-proceedings-multistep-index-module-completed-text")}`),this._getKycValidationElement.removeAttribute("expanded"),this._getKycValidationElement.removeAttribute("disabled"),this._getKycValidationElement.removeAttribute("active"),this._handleStatusConfirmInfoValidation())}_handleStatusAddressAndFatca(e){const{status:t,keys:i}=e,s="A"===t||"R"===t;"address"===i?this.addressComplete="Q"===t||"E"===t||this.addressComplete:this.fatcaComplete=!s&&this.addressComplete}_handleStatusConfirmInfoValidation(){this._getIdentityValidationElement.state&&this._getKycValidationElement.state&&this._getConfirmInfoValidationElement.removeAttribute("disabled")}_navigationTarggetLinkProceedings(e){this._dispatchCustomEvent(`interaction-update-${e}`),"official-identity"===e||"ine-data"===e?this._editIdentityValidation(e):"kyc-information"===e?this._editKycQuestionnaire(e):this._editConfirmInfoValidation(e)}_editIdentityValidation(e){this._dispatchCustomEvent("bbva-feature-proceedings-multistep-navigation-identity-expandable-link",e)}_editKycQuestionnaire(e){this._dispatchCustomEvent("bbva-feature-proceedings-multistep-modify-kyc",e)}_editConfirmInfoValidation(e){"home-data"===e||"address-data"===e?this._editAddressStep(e):"fatca-data"===e||"fatca-list-data"===e?this._editTaxResidencesStep(e):this._addBeneficiaries()}_editAddressStep(e){const t=e;this._dispatchCustomEvent("bbva-feature-proceedings-multistep-navigation-address",t)}_editTaxResidencesStep(e){const t=e;this._dispatchCustomEvent("bbva-feature-proceedings-multistep-navigation-tax-residence",t)}_addBeneficiaries(){this._dispatchCustomEvent("bbva-feature-multistep-navigate-to-recipients")}_handleNavigationIdentity(){this._getIdentityValidationElement.state||(this.identityValidationList.length>0&&(this.showIdentityValidationExpandable=!this.showIdentityValidationExpandable),this._dispatchCustomEvent("bbva-feature-proceedings-multistep-index-identity-section"))}_handleNavigateToKyc(e){this._getKycValidationElement.state||this._dispatchCustomEvent("bbva-feature-proceedings-multistep-navigate-kyc",e)}_handlerConfirmationValidationStep(){"portability"===this.fromPortability&&this.addressComplete||this.fatcaComplete&&this.addressComplete&&this.beneficiariesComplete?(this._getConfirmInfoValidationElement.setAttribute("state","success"),this._getConfirmInfoValidationElement.setAttribute("description",`${this.t("bbva-feature-proceedings-multistep-index-confirmation-information-step-description")}`),this._getConfirmInfoValidationElement.setAttribute("badge-text",`${this.t("bbva-feature-proceedings-multistep-index-module-completed-text")}`),this._getConfirmInfoValidationElement.removeAttribute("expanded"),this._getConfirmInfoValidationElement.removeAttribute("active"),this._getConfirmInfoValidationElement.removeAttribute("disabled"),this._handleConfirmLevelButton()):(this.showConfirmInfoValidationExpandable=!this.showConfirmInfoValidationExpandable,this._dispatchCustomEvent("bbva-feature-proceedings-confirm-information-click"))}validationBirtdayCountry(){const{birthData:e,customerData:t}=this.customer||{},{country:i}=e||{},{countryOfBirth:s}=t||{};return i&&"MEX"===i.id?this.t("bbva-feature-proceedings-multistep-step-confirmation-country-birth-mexico"):s&&s.name||""}validationNationality(){const{nationalities:e}=this.customer;if(e&&e.length>0){const t=e[0];return"MEX"===t.id?this.t("bbva-feature-proceedings-multistep-step-confirmation-nationality-mexicana"):t.description}}validationCountryOfDomicile(){const{taxResidence:e,customerData:t}=this.customer||{},{country:i}=e||{},{countryOfDomicile:s}=t||{};return i&&"MEX"===i.id?this.t("bbva-feature-proceedings-multistep-step-confirmation-country-domicile-mexico"):s&&s.name||""}taxResidenceInOtherCountries(){return this.taxResidences.length>=1?this.t("bbva-feature-proceedings-multistep-step-confirmation-mexico-other-country"):this.t("bbva-feature-proceedings-multistep-step-confirmation-only-mexico")}validationRFC(){const e=this.customer&&this.customer.identityDocuments;if(e){const t=e.find((e=>e.documentType&&"RFC"===e.documentType.id));if(t&&t.documentNumber)return t.documentNumber}const t=this.customer&&this.customer.customerData;return t&&t.rfc||""}_handleConfirmLevelButton(){this._getIdentityValidationElement.state&&this._getKycValidationElement.state&&this._getConfirmInfoValidationElement.state&&(this.visibleButtonUpgradeLevel=!1)}_handleConfirmProceedingsButton(){this._dispatchCustomEvent("bbva-feature-confirm-proceedings-upgrade")}get _identityValidationModule(){return r`
      <bbva-expandable-multistep-index
        id="identity-validation"
        step="${this.t("bbva-feature-proceedings-multistep-index-identity-validation-step")}"
        step-title="${this.t("bbva-feature-proceedings-multistep-index-identity-validation-step-title")}"
        step-title-ellipsis-lines="1"
        active
        @expandable-multistep-index-click="${this._handleNavigationIdentity}"
      >
      </bbva-expandable-multistep-index>
      <div ?hidden="${!this.showIdentityValidationExpandable}">
        ${this._identityValidationExpandable()}
      </div>
    `}get _kycValidationModule(){return r`
      <bbva-expandable-multistep-index
        id="kyc-validation"
        step="${this.t("bbva-feature-proceedings-multistep-index-kyc-validation-step")}"
        step-title="${this.t("bbva-feature-proceedings-multistep-index-kyc-validation-step-title")}"
        step-title-ellipsis-lines="1"
        active
        disabled
        @expandable-multistep-index-click="${e=>{this._handleNavigateToKyc(e.target.id)}}"
      >
      </bbva-expandable-multistep-index>
      <div ?hidden="${!this.showKycValidationExpandable}">
        ${this._kycExpandable()}
      </div>
    `}get _confirmInfoValidationModule(){return r`
      <bbva-expandable-multistep-index
        id="confirm-information"
        step="${this.t("bbva-feature-proceedings-multistep-index-confirmation-information-step")}"
        step-title="${this.t("bbva-feature-proceedings-multistep-index-confirmation-information-step-title")}"
        step-title-ellipsis-lines="1"
        active
        disabled
        @expandable-multistep-index-click="${this._handlerConfirmationValidationStep}"
      >
      </bbva-expandable-multistep-index>
      <div ?hidden="${!this.showConfirmInfoValidationExpandable}">
        ${this._confirmInformationExpandable()}
      </div>
    `}get _getIdentityValidationElement(){return this.shadowRoot.getElementById("identity-validation")}get _getKycValidationElement(){return this.shadowRoot.getElementById("kyc-validation")}get _getConfirmInfoValidationElement(){return this.shadowRoot.getElementById("confirm-information")}get _placeHolder(){const{number:e,alias:t}=this.accountDetailData;return[{name:t,value:{text:"bbva-feature-proceedings-multistep-index-participant-step"}},{name:{mask:e}}]}_identityValidationExpandable(){return r`
      <div id="content-expandable-identity-validation">
        ${this._expandableStepTpl({stepId:"official-identity",title:this.t("bbva-feature-proceedings-identity-validation-title"),editLabel:"bbva-feature-proceedings-multistep-modify-button",summary:this.identityValidationList.length>1?this._renderSimpleList(0,"identity-list"):null})}
        <div class="identity-divider">
          <bbva-divider-default size="fill"></bbva-divider-default>
        </div>
        ${this._expandableStepTpl({stepId:"ine-data",title:"Datos de INE",editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),summary:this.identityValidationList.length>1?this._renderSimpleList(1,"identity-list"):null})}
        ${this._renderFooterButton("identity-validation")}
      </div>
    `}_kycExpandable(){return r`
      <div id="content-expandable-kyc-validation">
        ${this._expandableStepTpl({stepId:"kyc-information",title:this.t("bbva-feature-proceedings-kyc-step-multistep-index-title"),editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),summary:this.kycData.length>0?this._renderKycQuestionnaire("file-list"):""})}
        <div class="notification">
          <bbva-notification-help
            ambient="secondary"
            variant="info"
            text="${this.t("bbva-feature-proceedings-kyc-step-notification-help-text")}"
          ></bbva-notification-help>
        </div>
        ${this._renderFooterButton("kyc-validation")}
      </div>
    `}_confirmInformationExpandable(){const e=this.fatcaComplete&&this.addressComplete,t={addressStatus:this.addressComplete,beneficiariesStatus:"portability"===this.fromPortability||this.beneficiariesComplete,fatcaStatus:"portability"===this.fromPortability||e};return r`
      <div ?hidden="${this.addressComplete}">
        ${this._validationAddres()}
      </div>
      <div ?hidden="${t.fatcaStatus}">
        ${this._validationResidences()}
      </div>
      <div ?hidden="${t.beneficiariesStatus}">
        ${this._validationBeneficiaries()}
      </div>
      ${this._renderFooterButton("confirm-information",t)}
    `}_validationAddres(){return r`
      ${this._expandableStepTpl({stepId:"home-data",title:this.t("bbva-feature-proceedings-multistep-step-document-address"),editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),page:"",summary:this._addressSummaryStep()})}
      ${this._expandableStepTpl({stepId:"address-data",title:this.t("bbva-feature-proceedings-multistep-step-actual-address"),editLabel:this.showAddress?this.t("bbva-feature-proceedings-multistep-modify-button"):this.t("bbva-feature-proceedings-multistep-show-data"),page:"",summary:this._addressCurrentSummaryStep()})}
    `}_validationResidences(){return r`
      ${this._expandableStepTpl({stepId:"fatca-data",title:this.t("bbva-feature-proceedings-multistep-step-confirmation-tax-residence"),editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),summary:this.summaryTaxResidence()})}
      <div ?hidden="${this.taxResidences.length<1}">
        ${this._expandableStepTpl({stepId:"fatca-list-data",title:this.t("bbva-feature-proceedings-multistep-step-tax-residence-additional-title"),editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),summary:this._summaryListTaxResidence()})}
      </div>
    `}_validationBeneficiaries(){return r`
      ${this._expandableStepTpl({stepId:"beneficiaries-data",title:this.t("bbva-feature-proceedings-multistep-step-beneficiaries-title"),editLabel:this.t("bbva-feature-proceedings-multistep-modify-button"),summary:0===this.participantsChannel.length?this.beneficiaries:this._renderNewBenef})}
    `}_renderFooterButton(e,t){let i=!1;return"confirm-information"===e&&(i=this.fatcaStatus&&this.addressStatus&&this.beneficiariesStatus),r`
      <div id="div-button-${e}" class="footer-button" ?hidden=${i}>
        <bbva-button-default
          id="${e}"
          .status="${t}"
          text="${this.t("bbva-feature-proceedings-multistep-index-step-footer-button-section")}"
          fullwidth
          tabindex="${i?"-1":"0"}"
          @click=${e=>this._confirmData(e)}
        ></bbva-button-default>
      </div>
    `}_renderSimpleList(e,t){const i=this.identityValidationList[e];return r`
          <bbva-list-simple ambient="secondary" class-name="${t}" .items="${i}">
          </bbva-list-simple>
        `}_renderKycQuestionnaire(){return this.renderRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').classList.remove("scrollable"),r`
        <bbva-list-simple-kyc
          .items=${this.kycData}
          ambient="secondary"
        >
        </bbva-list-simple-kyc>
      `}_addressSummaryStep(){const{addressType:e}=this.addressData,t=[{name:`${this.t("bbva-feature-proceedings-multistep-document-type")}`,value:{text:e,bold:!0}}];return r`
      <div class="expandable-step-summary">
        <bbva-list-simple class-name="list-simple" ambient="secondary" .items="${t}">
        </bbva-list-simple>
      </div>
      <div class="expandable-step-divider">
        <bbva-divider-default size="small"></bbva-divider-default>
      </div>
    `}_addressCurrentSummaryStep(){const{addressComplete:e,hideAddress:t}=this.addressData,i=[{name:this.showAddress?e:{mask:t},value:{text:" "}}];return r`
      <div>
        <bbva-list-simple
          class-name="list-simple"
          ambient="secondary"
          .items="${i}"
          class="alignment"
        ></bbva-list-simple>
        <div class="notification">
          <bbva-notification-help
            ambient="secondary"
            variant="info"
            text="${this.t("bbva-feature-proceedings-multistep-step-address-notification")}"
          ></bbva-notification-help>
        </div>
      </div>
      ${"portability"!==this.fromPortability?r`<bbva-divider-default size="fill"></bbva-divider-default>`:""}
    `}summaryTaxResidence(){const e=[{name:`${this.t("bbva-feature-proceedings-multistep-step-confirmation-country-birth")}`,value:{text:this.validationBirtdayCountry(),bold:!0}},{name:`${this.t("bbva-feature-proceedings-multistep-step-confirmation-nationality")}`,value:{text:this.validationNationality(),bold:!0}},{name:`${this.t("bbva-feature-proceedings-multistep-step-confirmation-country-domicile")}`,value:{text:this.validationCountryOfDomicile(),bold:!0}},{name:`${this.t("bbva-feature-proceedings-multistep-step-confirmation-RFC")}`,value:{text:this.validationRFC(),bold:!0}},{name:`${this.t("bbva-feature-proceedings-multistep-step-confirmation-tax-residence")}`,value:{text:this.taxResidenceInOtherCountries(),bold:!0}}];return r`
      <div class="expandable-step-summary">
        <bbva-list-simple class-name="list-simple-fatca" ambient="secondary" .items="${e}">
        </bbva-list-simple>
      </div>
      ${this._dividerTemplate()}
    `}_formatResidence(e,t){const{country:i,taxPayer:s,identifierFiscalNumber:a,name:n}=e,o=i&&i.name||n,c=s&&s.identityDocument&&s.identityDocument.documentNumber||a;return r`
      <div class="residencias-addicionales-title">
        <bbva-type-text
          class="list-residence"
          ambient="secondary"
          id="additional-residence-${t}"
          size="15px"
          font-weight="500"
          text="${this.t("bbva-feature-proceedings-multistep-step-residence-additional-title")} ${t+1}"
          inherit
        ></bbva-type-text>
      </div>
      <bbva-list-simple
        class-name="list-simple"
        ambient="secondary"
        .items="${[{name:"bbva-feature-proceedings-multistep-step-confirmation-country",value:{text:o,bold:!0}},{name:"bbva-feature-proceedings-multistep-step-confirmation-nif",value:{text:c,bold:!0}}]}"
      ></bbva-list-simple>
      ${t<this.taxResidences.length-1?r`
            <div class="expandable-step-divider" id="divider-tax-residences">
              <bbva-divider-default size="small"></bbva-divider-default>
            </div>
          `:g}
    `}_summaryListTaxResidence(){const e=this.beneficiariesComplete?g:r`
          <bbva-divider-default size="fill"></bbva-divider-default>
        `;return r`
      <div class="expandable-step-summary">
        ${this.taxResidences.map(((e,t)=>this._formatResidence(e,t)))}
      </div>
      ${e}
    `}_dividerTemplate(){const e=Boolean(this.beneficiariesComplete);return this.taxResidences.length>=1?r`
        <div class="expandable-step-divider">
          <bbva-divider-default size="small"></bbva-divider-default>
        </div>
      `:e?g:r`
        <bbva-divider-default size="fill"></bbva-divider-default>
      `}get beneficiaries(){return r`
      <div ambient="secondary">
        <bbva-list-simple
          class-name="list-simple"
          .items="${this._placeHolder}"
        >
        </bbva-list-simple>
        <bbva-notification-help
          class="confirm-notification"
          text="${this.t("bbva-feature-proceedings-multistep-index-participant-notification-message")}"
        ></bbva-notification-help>
      </div>
    `}get _renderNewBenef(){return r`
      <bbva-list-contact .items="${this.participantsChannel}"> </bbva-list-contact>
    `}_expandableStepTpl({stepId:e,title:t,editLabel:i,summary:s}){return r`
      <div>
        <bbva-expandable-step
          show-link
          hide-padding-left
          hide-padding-right
          hide-padding-top
          hide-padding-bottom
          header-completed-ellipsis
          id="${e}"
          header="${this.t(t)}"
          hide-divider
          completed
          open-edit-step
          @expandable-step-edit-step-prevent-open=${()=>this._navigationTarggetLinkProceedings(e)}
          edit-label="${this.t(i)}"
        >
          <div slot="summary" class="summary">
            ${s}
          </div>
        </bbva-expandable-step>
      </div>
    `}render(){return r`
      <bbva-help-modal
        id="multistep-modal-main"
        full-height
        header-type="modal-initial-secondary"
        header-text="${"portability"===this.fromPortability?"bbva-feature-proceedings-multistep-header-title-portability":"bbva-feature-proceedings-multistep-header-title"}"
        header-position="sticky"
        ?visible="${this.visible}"
        hide-content-padding-top
        avoid-icon-close-modal
        header-close-icon-aria-label="${this.t("bbva-feature-proceedings-half-modal-button-aria-label-close")}"
        @help-modal-header-click="${this._handleCloseButton}"
        @help-modal-open="${this._handleMultistepModalOpen}"
      >
        <div slot="slot-content">
          <bbva-expandable-multistep
            scroll-to-step-index="${this.scrollToStepIndex}"
            show-dividers="hide-all"
          >
            <div slot="content">
              ${this._identityValidationModule} ${this._kycValidationModule}
              ${this._confirmInfoValidationModule}
            </div>
            <div
              slot="confirmation"
              class="confirmation"
              ?hidden="${this.visibleButtonUpgradeLevel}"
              id="button-upgrade-level"
            >
              <bbva-button-default
                id="confirm-button-level-upgrade"
                variant="positive"
                fullwidth
                text="${this.t("bbva-feature-proceedings-module-confirm-information")}"
                @click="${this._handleConfirmProceedingsButton}"
              ></bbva-button-default>
            </div>
          </bbva-expandable-multistep>
        </div>
      </bbva-help-modal>
    `}}var et=u`
:host {
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

[data-tag-name=bbva-type-icon] {
  margin-bottom: 1rem;
}
[data-tag-name=bbva-type-icon][mode=warning] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-warning-color);
}
[data-tag-name=bbva-type-icon][mode=error] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-error-color);
}

[data-tag-name=bbva-type-text] {
  margin-bottom: 0.25rem;
}

.instructions {
  margin-top: 1rem;
}
`,tt=u`
:host {
  --_primary-alt-support-warning-color: var(--loan-finance-debit-line-cancellation--_ambient--_primary-alt-support-warning-color, ${F("colorPrimaryAltSupportWarningDefault",{colorPrimaryAltSupportWarningDefault:"#685219"})});
  --_primary-alt-support-error-color: var(--loan-finance-debit-line-cancellation--_ambient--_primary-alt-support-error-color, ${F("colorPrimaryAltSupportErrorDefault",{colorPrimaryAltSupportErrorDefault:"#b92a45"})});
}
`;class it extends(h(v(p(t)))){static get is(){return"bbva-feature-proceedings-half-modal"}static get scopedElements(){const e=[$,I,A];return it.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},config:{type:Object}}}constructor(){super(),this.visible=!1,this.config={}}static get styles(){return[et,tt,V.primary,V.secondary,C.primary,C.secondary,m("bbva-feature-proceedings-half-modal-shared-styles")]}_handleModalStateChange(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-half-modal-change",{detail:e.detail.visible,bubbles:!0,composed:!0}))}_handleModalHeaderClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-half-modal-header-click",{bubbles:!0,composed:!0}))}_handleModalButtonClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-half-modal-button-click",{bubbles:!0,composed:!0}))}_handleModalLinkClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-half-modal-link-click",{bubbles:!0,composed:!0}))}_getIcon(e=""){return{warning:_(),error:y(),"":_()}[e]}render(){return r`
      <bbva-help-modal
        ?visible="${this.visible}"
        ambient="primary"
        header-text="${this.config.headerText}"
        button-text="${this.config&&this.config.buttonText}"
        link-text="${d(this.t(this.config&&this.config.linkText))}"
        @modal-state-change="${this._handleModalStateChange}"
        @help-modal-footer-button-click="${this._handleModalButtonClick}"
        @help-modal-footer-link-click="${this._handleModalLinkClick}"
        @help-modal-header-click="${this._handleModalHeaderClick}"
        header-close-icon-aria-label="${this.t("bbva-feature-proceedings-half-modal-button-aria-label-close")}"
      >
        <div slot="slot-content">
          <bbva-type-icon
            size="24"
            mode="${this.config&&this.config.type}"
            icon="${this._getIcon(this.config&&this.config.type)}"
          ></bbva-type-icon>
          <bbva-type-text unset size="S" text="${this.config.messageText}"> </bbva-type-text>
        </div>
      </bbva-help-modal>
    `}}customElements.define(it.is,it);var st=u`
:host {
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

ul {
  padding: 0;
}

li {
  list-style: none;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

[data-tag-name=bbva-type-icon] {
  margin-bottom: 1rem;
}
[data-tag-name=bbva-type-icon][mode=warning] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-warning-color);
}
[data-tag-name=bbva-type-icon][mode=error] {
  --bbva-type-icon--custom--primary-ambient--color: var(--_primary-alt-support-error-color);
}
`;class at extends(h(v(p(t)))){static get scopedElements(){const e=[$,L,A,de,I];return at.scopedElementsFromClasses(e)}static get is(){return"bbva-feature-proceedings-full-modal"}static get properties(){return{visible:{type:Boolean},config:{type:Object},closeModalElements:{type:Array}}}static get styles(){return[st,tt,C.primary,ce.primary,V.primary,V.secondary,m("bbva-feature-proceedings-full-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.config={},this.closeModalElements=["header","footer-button"]}_handleModalStateChange(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-full-modal-change",{detail:e.detail.visible,bubbles:!0,composed:!0}))}_handleModalHeaderClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-full-modal-header-click",{bubbles:!0,composed:!0}))}_handleModalButtonClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-full-modal-button-click",{bubbles:!0,composed:!0}))}_handleModalLinkClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-proceedings-full-modal-link-click",{bubbles:!0,composed:!0}))}render(){return r`
      <bbva-help-modal
        ambient="primary"
        full-height
        ?fixed-footer="${this.config&&this.config.fixedFooter}"
        header-text="${this.config&&this.config.headerText}"
        ?visible="${this.visible}"
        hide-content-padding-top
        title-icon="${this.config&&this.config.type}"
        modal-type="${this.config&&this.config.modalType}"
        @modal-state-change="${this._handleModalStateChange}"
        @help-modal-footer-button-click="${this._handleModalButtonClick}"
        @help-modal-footer-link-click="${this._handleModalLinkClick}"
        @help-modal-header-click="${this._handleModalHeaderClick}"
        button-text="${this.config&&this.config.buttonText}"
        link-text="${d(this.t(this.config&&this.config.linkText))}"
        footer-button-aria-label="${this.config&&this.config.buttonText}"
        footer-link-aria-label="${this.t(this.config&&this.config.linkText)}"
        header-close-icon-aria-label="${this.t("bbva-feature-proceedings-full-modal-button-aria-label-close")}"
        .closeModalElements="${d(this.config&&this.config.closeModalElements)}"
      >
        <div slot="slot-content">
          ${this.config&&this.config.microillustration?r`
              <bbva-clip-microillustration
                size="M"
                microillustration="${this.config&&this.config.microillustration}"
              >
              </bbva-clip-microillustration>
            `:g}
          ${this.config&&"addressAlert"===this.config.id?r`<bbva-type-text unset size="S" font-weight="500" text="${this.config&&this.config.titleText}"> </bbva-type-text>`:r`<bbva-type-text tag="h2" text="${this.config&&this.config.titleText}"> </bbva-type-text>`}
          <bbva-type-text unset size="S" text="${this.config&&this.config.messageText}"> </bbva-type-text>
          ${this.config&&this.config.list?r`
            <ul>
              ${D(this.config&&this.config.list,(e=>r`
                    <li>
                      <bbva-list-bullet>${this.t(e)}</bbva-list-bullet>
                    </li>
                  `))}
            </ul>
          `:g}
          ${this.config&&this.config.footerText?r`
            <bbva-type-text size="S" text="${this.config&&this.config.footerText}"> </bbva-type-text>
          `:g}
        </div>
      </bbva-help-modal>
    `}}customElements.define(at.is,at);class nt{constructor(e){this.context=e}_handleFullModalFooterButton(){const e=this.context._addressInitialPayload("typeIdentificationProceedings");if("addressAlert"===this.context._fullModalConfig.id)this.context._sendAnalyticsInformation("address"),this.context._dispatchCustomEvent("proceedings-init-analytics-view-home-address"),this.context._dispatchCustomEvent("bbva-feature-proceedings-edit-customer-address",e);else this.context._exitOperative()}_handleFullModalHeaderButton(){"error"===this.context._fullModalConfig.id&&(this.context._dispatchCustomEvent("interaction-update-modal-error"),this.context._exitOperative())}get _getFullModal(){return r`
      <bbva-feature-proceedings-full-modal
        ?visible="${this.context._fullModalOpened}"
        .config="${this.context._fullModalConfig}"
        @bbva-feature-proceedings-full-modal-change="${e=>{this.context._fullModalOpened=e.detail}}"
        @bbva-feature-proceedings-full-modal-button-click="${e=>{this._handleFullModalFooterButton(e)}}"
        @bbva-feature-proceedings-full-modal-header-click="${e=>{this._handleFullModalHeaderButton(e)}}"
      >
      </bbva-feature-proceedings-full-modal>
    `}}class ot{constructor(e){this.context=e,this._retryBand=!1}_handleHalfModalStateChange(e){this.context._halfModalOpened=e.detail,e.detail||this._retryBand||"criticalError"!==this.context._halfModalConfig.id?this._retryBand=!1:this.context._exitOperative()}_handleHalfModalFooterButton(){switch(this.context._halfModalConfig.id){case"exit":default:this.context._exitOperative();break;case"error":this.context[`_${this.context._lastService}`]();break;case"criticalError":this._retryBand=!0,this.context[`_${this.context._lastService}`]();break;case"identityAlert":this.context.exitProceedings(),this.context._dispatchCustomEvent("proceedings-navigation-back-to-modify-identity-capture")}}_handleHalfModalFooterLink(){"error"!==this.context._halfModalConfig.id&&"criticalError"!==this.context._halfModalConfig.id||this.context._exitOperative()}_handleHalfModalHeaderButton(){"criticalError"===this.context._halfModalConfig.id&&this.context._exitOperative()}get _getHalfModal(){return r`
      <bbva-feature-proceedings-half-modal
        ?visible="${this.context._halfModalOpened}"
        .config="${this.context._halfModalConfig}"
        @bbva-feature-proceedings-half-modal-change="${e=>{this._handleHalfModalStateChange(e)}}"
        @bbva-feature-proceedings-half-modal-button-click="${e=>{this._handleHalfModalFooterButton(e)}}"
        @bbva-feature-proceedings-half-modal-link-click="${e=>{this._handleHalfModalFooterLink(e)}}"
        @bbva-feature-proceedings-half-modal-header-click="${e=>{this._handleHalfModalHeaderButton(e)}}"
      >
      </bbva-feature-proceedings-half-modal>
    `}}const rt={id:"error",headerText:"bbva-feature-proceedings-half-modal-header-error",buttonText:"bbva-feature-proceedings-half-modal-exit",fixedFooter:!0,titleText:"bbva-feature-proceedings-half-modal-error",messageText:"bbva-feature-proceedings-half-modal-retry-later",microillustration:"error",closeModalElements:["footer-button"]},ct={id:"error",headerText:"bbva-feature-proceedings-half-modal-error",type:"error",messageText:"bbva-feature-proceedings-half-modal-retry-message",buttonText:"bbva-feature-proceedings-half-modal-retry",linkText:"bbva-feature-proceedings-half-modal-exit"},dt={id:"criticalError",headerText:"bbva-feature-proceedings-half-modal-error",type:"error",messageText:"bbva-feature-proceedings-half-modal-retry-message",buttonText:"bbva-feature-proceedings-half-modal-retry",linkText:"bbva-feature-proceedings-half-modal-exit"},lt={id:"exit",headerText:"bbva-feature-proceedings-half-modal-exit-operation",type:"warning",messageText:"bbva-feature-proceedings-half-modal-exit-warning",buttonText:"bbva-feature-proceedings-half-modal-exit",linkText:"bbva-feature-proceedings-half-modal-continue-operation"},ut={id:"addressAlert",headerText:"bbva-feature-proceedings-full-modal-address-header",buttonText:"bbva-feature-proceedings-full-modal-continue-address",titleText:"bbva-feature-proceedings-full-modal-voucher",messageText:"bbva-feature-proceedings-full-modal-address-message",linkText:"bbva-feature-proceedings-full-modal-out-process",type:"bbva:caution",modalType:"caution",list:["bbva-feature-proceedings-full-modal-voucher-1","bbva-feature-proceedings-full-modal-voucher-2"],footerText:"bbva-feature-proceedings-full-modal-footer-address"},ht={id:"identityAlert",headerText:"bbva-feature-proceedings-half-modal-want-modify",type:"warning",messageText:"bbva-feature-proceedings-half-modal-identity-warning",buttonText:"bbva-feature-proceedings-half-modal-continue"},pt=e=>{var t,i;const s=(e=>{const t=e.replace(/#/g,"Ñ").toLowerCase(),i=["de","del","la","las","los","y","e","i"];return t.split(" ").map(((e,t)=>i.includes(e.toLowerCase())&&0!==t?e.toLowerCase():e.charAt(0).toUpperCase()+e.slice(1).toLowerCase())).join(" ")})((null==e||null===(t=e.country)||void 0===t?void 0:t.name)||"");return{id:(null==e||null===(i=e.country)||void 0===i?void 0:i.id)||"",name:s}},mt=(e,t)=>{var i,s;return{...pt(t),identifierFiscalNumber:e||(null==t||null===(i=t.taxPayer)||void 0===i||null===(s=i.identityDocument)||void 0===s?void 0:s.documentNumber)||""}},bt=(e,t)=>e.every((e=>Boolean(e.id&&e.name&&(!t||e.identifierFiscalNumber))));function gt(e,t){return{country:{id:e},taxPayer:{identityDocument:{documentNumber:t}}}}function ft(e){return e.map((e=>({id:e.id})))}function _t(e){return e.map((({name:e,value:t})=>({name:e,value:{text:t,bold:!0}})))}const{moment:yt}=window,vt=(e,t,i,s)=>`<?xml version="1.0" encoding="UTF-8"?>\n  <CONTEXTO>\n    <OPCION>A2</OPCION>\n    <CANAL>GLMO</CANAL>\n    <CVEDOC>${e}</CVEDOC>\n    <PUBLICIDAD>true</PUBLICIDAD>\n    <JSON>BUILD_IT</JSON>\n    <NUMCLIE>${t}</NUMCLIE>\n    <FOLIO_REF>${i}</FOLIO_REF>\n    <IDPROCESO>${s}</IDPROCESO>\n  </CONTEXTO>`;function Ct(e){var t;return null===(t=yt(e))||void 0===t?void 0:t.locale("es-MX")}function Et(e,t,i){return{documentType:"O",verificationType:[{id:"NAME"}],metadata:[{key:"DOCUMENT_TYPE_ID",value:e},{key:"PRODUCT",value:"GM"},{key:"OPERATION_TYPE",value:"guardaDoctoOficial"},{key:"REFERENCE_NUMBER",value:t},{key:"PROCEDURE",value:"A2"}],contentInfo:{contentData:`documento ${i}`,contentType:"xml",documentFamily:"xml"},pageType:"FIRST_PAGE",side:"OBVERSE"}}const St=[{termType:{id:"BD-MX-AA-FATCRS-003"},acceptanceMethod:{id:"TA001"},acceptanceMessages:[{value:"BDFACKYC01"},{value:"BDFACKYC02"},{value:"BDFACKYC03"}]}],Dt=[{termType:{id:"BD-MX-AA-NOBENE-001"},origin:{id:"MG"},acceptanceMethod:{id:"TA001"},status:{id:"ACCEPTED"},acceptanceMessages:[{value:"BDALTBEN03"}]}],At={dataServices:[{name:"bbva-feature-proceedings-kyc-step-civil-state",value:""},{name:"bbva-feature-proceedings-kyc-step-ocupation",value:""},{name:"bbva-feature-proceedings-kyc-step-economic-activity",value:""}],dataBanking:[{name:"bbva-feature-proceedings-kyc-step-relation-type",value:""},{name:"bbva-feature-proceedings-kyc-step-add-clabe-account",value:""},{name:"bbva-feature-proceedings-kyc-step-add-e-signature",value:""}],dataAccount:[{name:"bbva-feature-proceedings-kyc-step-source-money",value:""},{name:"bbva-feature-proceedings-kyc-step-account-purpose",value:""},{name:"bbva-feature-proceedings-kyc-step-state",value:""}],bankOperations:[{name:"bbva-feature-proceedings-kyc-step-bank-operations-deposits-withdrawals",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-transfers",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-question-buy-sell-dollars",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-buy-sell-dollars",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""}],dataAboutYourHabits:[{name:"bbva-feature-proceedings-kyc-step-act-own",value:""},{name:"bbva-feature-proceedings-kyc-step-politic-activity",value:""},{name:"bbva-feature-proceedings-kyc-step-has-international-operations",value:""},{name:"bbva-feature-proceedings-kyc-step-third-party-funds",value:""},{name:"bbva-feature-proceedings-kyc-step-have-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-pay-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-advance-pay-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-more-than-operations-monthly",value:""},{name:"bbva-feature-proceedings-kyc-step-monthly-operations-exceed",value:""}],comesFromProceedings:!0};function Tt(e,t,i,s){const a=t.substring(t.length-5);return{eventCode:"A000000353",senderId:"0000000001",message:{messageBody:`{"sNOMBRE":"${e}","sFINANCIEROS":"${s}","sFECHA":"${t.substring(0,t.length-6)}     ",   "sHORA":"${a}",   "sFOLIO":"${i}"}`}}}function xt(e){return e.reduce(((e,t)=>{const i=t.componentTypes[0].toLowerCase().replace(/_/g,"");if("exteriornumber"===i){const i=t.name.replace(/\s+/g,"").split("-");e.exteriornumber={name:i[0]},e.interiornumber={name:i[1]||""}}else e[i]={code:t.code||"",name:t.name};return e}),{})}var It=u`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
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
`;class Pt extends(h(O(v(p(t))))){static get is(){return"bbva-feature-proceedings"}static get scopedElements(){const e=[Ze,Ue,Ge,B,U,G,K,z,Y,q,j,Q,ue,he,X,it,at,nt,ot,H,$e,...Pt.configurationScopedElements()];return Pt.scopedElementsFromClasses(e)}static get styles(){return[It,m("bbva-feature-proceedings-shared-styles")]}static get properties(){return{updateInitialServices:{type:Boolean,attribute:"update-initial-services"},_multistepModalOpened:{type:Boolean,state:!0},params:{type:Object},accountId:{type:String,attribute:"account-id"},customerData:{type:Array},customerInfo:{type:Object},extractedDataBackup:{type:Object},customerId:{type:String,attribute:"customer-id"},contractDocuments:{type:Array},customerEmail:{type:String,attribute:"customer-email"},contractDocumentsApiVersion:{type:String,attribute:"contract-documents-api-version"},accountsApiVersion:{type:String,attribute:"accounts-api-version"},customersApiVersion:{type:String,attribute:"customers-api-version"},notificationsApiVersion:{type:String,attribute:"notifications-api-version"},requiredOtp:{type:Boolean},contractQueryParam:{type:Object},dossiersIdentifiers:{type:Array},documentKeyTaxResidence:{type:String,attribute:"document-key-tax-residence"},listContractingDossiers:{type:Array},_halfModalOpened:{type:Boolean,state:!0},_halfModalConfig:{type:Object,state:!0},_fullModalOpened:{type:Boolean,state:!0},_fullModalConfig:{type:Object,state:!0},_lastService:{type:String,state:!0},_currentRetries:{type:Number,state:!0},accountDetailData:{type:Object},_dataCustomer:{type:Object,state:!0},dataContractDetails:{type:Array},maxRetries:{type:Number},_showIdentityValidation:{type:Boolean,state:!0},_showKycValidation:{type:Boolean,state:!0},_identityValidationList:{type:Array,state:!0},_identityValidationDocumentExtracted:{type:Object,state:!0},_identityValidationFiles:{type:Object,state:!0},_lastUploadedDocument:{type:Object,state:!0},_updatedIdentityValidation:{type:Boolean,state:!0},attachmentIds:{type:Object},_obverseSaved:{type:Boolean,state:!0},_reverseSaved:{type:Boolean,state:!0},_videoselfieSaved:{type:Boolean,state:!0},_kycSummaryData:{type:Array,state:!0},kycDocumentKey:{type:String,attribute:"kyc-document-key"},kycDocumentName:{type:String,attribute:"kyc-document-name"},dataProceedingsModify:{type:Object},addressData:{type:Object},showAddress:{type:Boolean,attribute:"show-address"},participantsChannel:{type:Array},profileRecipientsChannel:{type:Array},beneficiarieVisible:{type:Boolean,attribute:"beneficiarie-visible"},unmaskedAddress:{type:Boolean,attribute:"unmasked-address"},addressId:{type:String,attribute:"address-id"},addressDataPayload:{type:Array},documentTypeAddress:{type:Object},addressDocumentLabel:{type:String,attribute:"address-document-label"},addressFormData:{type:Object},_taxResidencesChannel:{type:Array,state:!0},_termsOperationNumber:{type:String,state:!0},defaultMainTaxResidence:{type:Object},_currentProcess:{type:String,state:!0},_tempAddressStatus:{type:Boolean,state:!0},_tempShowAddressStatus:{type:Boolean,state:!0},_tempBeneficiariesStatus:{type:Boolean,state:!0},_tempFatcaStatus:{type:Boolean,state:!0},documentNameTaxResidence:{type:String,attribute:"document-name-tax-residence"},headersCustomersIdentifications:{type:Object},dossiersCompleted:{type:Boolean,attribute:"dossiers-completed"},clientId:{type:String},portabilityN2Entrypoint:{type:String},featureFlagPayrollPortabilityN2:{type:Boolean},featureFlagUpgradeCustomer:{type:Boolean},featureFlags:{type:Object},financialOverviewDetails:{type:Object},payloadForDeepLink:{type:Object},isPayroll:{type:Boolean},simpleCode:{type:String},productName:{type:String},_dataFormData:{type:Object,state:!0}}}constructor(){super(),this.updateInitialServices=!1,this.params={},this._multistepModalOpened=!1,this.config={loader:!0},this.customerData=[],this.customerId="",this.contractDocuments=[],this.contractDocumentsApiVersion="0",this.accountsApiVersion="1",this.customersApiVersion="1",this.notificationsApiVersion="0",this.requiredOtp=!0,this.contractQueryParam={operationType:"G1","branch.id":"3607","status.id":"A"},this.dossiersIdentifiers=[{key:"identityValidation",description:"I"},{key:"fatca",description:"CRSF"},{key:"kyc",description:"KY1"},{key:"address",description:"D"}],this.listContractingDossiers=[],this._currentRetries=0,this.maxRetries=3,this._lastService="",this._proceedingsFullModal=new nt(this),this._proceedingsHalfModal=new ot(this),this._halfModalOpened=!1,this._fullModalOpened=!1,this._halfModalConfig={},this._fullModalConfig={},this.accountDetailData={},this._dataCustomer={},this.dataContractDetails=[],this.customerInfo={},this.extractedDataBackup={},this._showIdentityValidation=!1,this._showKycValidation=!1,this._identityValidationList=[],this._identityValidationDocumentExtracted={},this._identityValidationFiles={},this._lastUploadedDocument={},this._updatedIdentityValidation=!1,this.attachmentIds={obverseImage:"obverse-image",obverseFlashImage:"obverse-flash-image",reverseImage:"reverse-image",selfieImage:"selfie-image",selfieAliveImage:"selfie-alive-image",selfieVideo:"selfie-video"},this._obverseSaved=!1,this._reverseSaved=!1,this._videoselfieSaved=!1,this._kycSummaryData=[],this.payloadKycPatchCustomer=[],this.payloadKycPatchEconomicData=[],this.payloadKycPostAdditionalInfo=[],this.payloadKycPutQuestionnaire=[],this.payloadKycPostTerms=[],this.addressData={addressComplete:"",hideAddress:"",addressType:""},this.addressDocumentLabel="CREDENCIAL DE ELECTOR",this.addressComponents={},this.showAddress=!1,this.participantsChannel=[],this.beneficiarieVisible=!1,this.profileRecipientsChannel=[],this.unmaskedAddress=!1,this.addressId="",this.addressDataPayload=[],this._taxResidencesChannel=[],this._termsOperationNumber="",this.documentKeyTaxResidence="237",this.customerInfo={},this.addressFormData={},this.documentTypeAddress={id:"026"},this.kycDocumentKey="777",this.kycDocumentName="KYC",this.dataProceedingsModify={},this.hiddenTaxResidences=!1,this.hiddenAdress=!1,this.defaultMainTaxResidence={country:{id:"MEX",name:"Mexico"}},this._currentProcess="",this._tempAddressStatus=!1,this._tempShowAddressStatus=!1,this._tempBeneficiariesStatus=!1,this._tempFatcaStatus=!1,this.documentNameTaxResidence="FATCA",this.customerEmail="",this.dossiersCompleted=!1,this.headersCustomersIdentifications={"Content-Type":"multipart/form-data","Accept-Language":"es"},this._dataFormData=new FormData,this.xmlFile=new Blob,this.metadaFile=new Blob,this.clientId="",this.portabilityN2Entrypoint="",this.featureFlagPayrollPortabilityN2=!1,this.featureFlagUpgradeCustomer=!1,this.featureFlags={},this.financialOverviewDetails={},this.payloadForDeepLink={},this.isPayroll=!1,this.simpleCode="",this.productName=""}firstUpdated(){super.firstUpdated&&super.firstUpdated(),"deeplink"!==this.portabilityN2Entrypoint||this.featureFlagPayrollPortabilityN2&&this.featureFlagUpgradeCustomer?(this._loadServices(),this._multistep=this.renderRoot.querySelector("[data-tag-name=bbva-feature-proceedings-multistep]")):this._goBackToDashboard()}updated(e){e.has("accountId")&&""!==this.accountId&&!this.contractDocuments.length&&this._getContractingDossiers(),super.updated(e)}_loadServices(){this._contractingDossiersDm=this.renderRoot.querySelector("#contract-documents-contracting-dossiers"),this._globalAccountParticipantsDm=this.renderRoot.querySelector("#global-account-participants"),this._accountsLevelUpgradeDm=this.renderRoot.querySelector("#local-accounts-level-upgrade-api-dm"),this._accountsDocumentationDossiersDm=this.shadowRoot.querySelector("#local-accounts-documentation-dossiers-api-dm"),this._globalCustomerDm=this.renderRoot.querySelector("#global-customer-api-dm"),this._customerContactDetailsDm=this.renderRoot.querySelector("#global-customer-contact-details"),this._globalCustomerAddressesDm=this.renderRoot.querySelector("#global-customer-addresses"),this._localCustomerAddressDm=this.renderRoot.querySelector("#local-customer-address"),this._localCustomerDm=this.renderRoot.querySelector("#local-customer-api-dm"),this._identificationProcessDocumentDm=this.renderRoot.querySelector("#identification-process-documents-api-dm"),this._localCustomerEconomicDataDm=this.renderRoot.querySelector("#local-customer-economic-data-api-dm"),this._localCustomerAdditionalInfoDm=this.renderRoot.querySelector("#local-customer-additional-information-api-dm"),this._localCustomerQuestionnaireDm=this.renderRoot.querySelector("#local-customer-questionnaire-api-dm"),this._globalCustomerTermsDm=this.renderRoot.querySelector("#global-customer-terms-api-dm"),this._localNotificationSendDm=this.renderRoot.querySelector("#local-notifications-send-api-dm")}get _emailCustomer(){const e=this.dataContractDetails&&this.dataContractDetails.find((({contact:e})=>"EMAIL"===e.contactDetailType));return e?e.contact.address:""}get videoSelfieMode(){return this.params&&!this.params.isPayroll||!1}get segmentProfile(){return this.params&&"04"===this.params.accountLevel&&this.params&&this.params.isPayroll?"warningNominees":this.params&&"02"===this.params.accountLevel&&this.params&&this.params.isPayroll?"proactiveNominees":this.params&&"02"===this.params.accountLevel?"nonNominatedProactive":""}get _validarRFC(){const{identityDocuments:e,customerData:t}=this._dataCustomer;if(e){const t=e.find((({documentType:e})=>e&&"RFC"===e.id));return t&&t.documentNumber}return t&&t.rfc}_exitOperative(){"deeplink"===this.portabilityN2Entrypoint||"inapp"===this.params.entryPoint?(this._dispatchCustomEvent("payroll-deeplink-n2-dashboard"),this._goBackToDashboard()):this._dispatchCustomEvent("bbva-feature-proceedings-exit",{productId:this.accountId}),this.resetProp()}resetProp(){this.customerData=[],this.contractDocuments=[],this.listContractingDossiers=[],this._multistepModalOpened=!1,this._halfModalOpened=!1,this._fullModalOpened=!1,this._dataCustomer={},this.dataContractDetails=[],this._showIdentityValidation=!1,this._showKycValidation=!1,this._identityValidationList=[],this._identityValidationFiles={},this._updatedIdentityValidation=!1,this._lastUploadedDocument="",this._obverse=!1,this._obverseFlash=!1,this._reverse=!1,this._videoselfie=!1,this._selfie=!1,this._kycSummaryData=[],this._currentRetries=0,this._currentProcess="",this.portabilityN2Entrypoint="",this.featureFlagPayrollPortabilityN2=!1,this.featureFlagUpgradeCustomer=!1,this.featureFlags={},this.financialOverviewDetails={},this.payloadForDeepLink={},this.isPayroll=!1,this.simpleCode="",this.productName="",this._multistep.showConfirmInfoValidationExpandable=!1}showSpinner(){this._multistepModalOpened=!1,this.showLoader()}hideSpinner(e={}){(e&&!0===e.canceled||e&&"signature-invalid"===e.errorType||!Object.keys(e).length)&&(this._multistepModalOpened=!0,this.clearLoader())}exitProceedings(){this._multistepModalOpened=!1}backToProceedings(){this._multistepModalOpened=!0}_handleOpenModal(){this._sendAnalyticsInformation("proceedings")}setPropertiesInit(e){this.params=e;const{accountId:t="",clientId:i="",entrypoint:s=""}=e;this.accountId=t,this.clientId=i,this.portabilityN2Entrypoint=s,"deeplink"===this.portabilityN2Entrypoint&&this.clientId||this._requestClientId(),this.updateInitialServices&&!this.listContractingDossiers.length&&this._getContractingDossiers()}_requestClientId(){this._dispatchCustomEvent("global-get-from-storage",{key:"loginData",secure:!0})}initPropertiesFromDeeplink(){this.portabilityN2Entrypoint="deeplink",this.featureFlagPayrollPortabilityN2=this._getFeatureFlagPayrollN2(),this.featureFlagUpgradeCustomer=this._getFeatureFlagUpgradeCustomer(),this._requestClientId()}globalDataFromEntryPoint(e){this.accountDetailData=e}_goBackToDashboard(){this.resetProp(),this._dispatchCustomEvent("payroll-deeplink-n2-dashboard")}handleLoginDataResponse(e){this.clientId=(e||{}).grantingTicketUserId?e.grantingTicketUserId:this.clientId,"deeplink"===this.portabilityN2Entrypoint&&this.clientId&&this._requestFlagsToPortability()}_requestFlagsToPortability(){if(this.financialOverviewDetails.data&&this.featureFlagPayrollPortabilityN2&&this.featureFlagUpgradeCustomer){const e=(this.financialOverviewDetails.data&&this.financialOverviewDetails.data.contracts).find((e=>"02"===(e.detail&&e.detail.level)));e?(this.accountId=e&&e.id,this._storePayrollPortabilityConfiguration(e),this._setDeepLinkPayload()):this._goBackToDashboard()}else this._goBackToDashboard()}_getFeatureFlagPayrollN2(){return(this.featureFlags["glomo.account.payrollPortabilityN2"]||{}).value||!1}_getFeatureFlagUpgradeCustomer(){return(this.featureFlags["glomo.account.upgradeCustomer"]||{}).value||!1}_storePayrollPortabilityConfiguration(e){const{alias:t,number:i,id:s,simpleCode:a}=e,{name:n}=e&&e.product,o=(e&&e.detail&&e.detail.specificAmounts).find((e=>"CURRENT_BALANCE"===e.id)),{amount:r}=o.amounts&&o.amounts[0],{currency:c}=o.amounts&&o.amounts[0],d=(e&&e.detail&&e.detail.indicators).find((e=>"IS_PAYROLL_ACCOUNT"===e.id)),l=!!d&&d.isActive;this.isPayroll=l,this.simpleCode=a;const u=e.product.id?e.product.id:"";this.productName=u,this.payloadForDeepLink=((e,t,i,s,a,n)=>({product:{alias:e,description:{masked:!0,value:t},id:i,name:s,number:t,primaryAmount:{amount:a,currency:n,label:"dashboard-account-current-balance"}}}))(t,i,s,n,r,c)}_setDeepLinkPayload(){this.setPropertiesInit({accountId:this.accountId,clientId:this.clientId,accountLevel:"02",simpleCode:this.simpleCode,target:"portability",productName:this.productName,entrypoint:this.portabilityN2Entrypoint,isPayroll:this.isPayroll})}_getContractingDossiers(){this.showSpinner(),this._lastService="getContractingDossiers",this._contractingDossiersDm.getContractingDossiers(this.customerId,this.contractQueryParam)}_handleGetContractingDossiers({detail:e}){this._currentRetries=0,this.contractDocuments=e&&e.data||e,this._parseListContractingDossiers(),this._getAccountParticipants()}_parseListContractingDossiers(){const e=this.contractDocuments.length?this.contractDocuments.map((e=>{const t=e.validationDocuments[0].documentStatus.operation||"",i=e.validationDocuments[0].documentFamily.id||"",s=e.validationDocuments[0].validityPeriod.startDate||"",a=this.dossiersIdentifiers.filter((e=>e.description===i));return{keys:a.length?a[0].key:"",status:t,validityPeriodStart:s}})):[];this.listContractingDossiers=e}_getAccountParticipants(){this.showSpinner(),this._lastService="getAccountParticipants",this._globalAccountParticipantsDm.getAccountParticipants(this.accountId)}_handleGetAccountParticipantsSuccess({detail:e}){this._currentRetries=0;const t=e.data||e;this.participants=t.filter((e=>"HOLDER"!==e.participantType.id)),this.beneficiarieVisible=this.participants.length>0,this.updateInitialServices=!0,this.hideSpinner()}_handleServiceError(){this.hideSpinner(),this._currentRetries<this.maxRetries?(this._currentRetries+=1,"getContractingDossiers"===this._lastService?(this._halfModalConfig=dt,this._halfModalOpened=!0):(this._halfModalConfig=ct,this._halfModalOpened=!0)):(this._dispatchCustomEvent("interaction-update-modal-error"),this._fullModalConfig=rt,this._fullModalOpened=!0)}_navigationToIdentityValidation(){if(!this._updatedIdentityValidation){const e={customerId:this.customerId,videoSelfieMode:this.videoSelfieMode,fromProceedings:!0};this.exitProceedings(),this._sendAnalyticsInformation("identity-validation"),this._dispatchCustomEvent("proceedings-init-analytics-internal-link-identity-validation"),this._dispatchCustomEvent("proceedings-navigation-to-identity-validation",e)}}_sendAnalyticsInformation(e){const t=e,i={videoSelfieMode:this.videoSelfieMode,...this.segmentProfile?{segmentProfile:this.segmentProfile}:{},productName:this.params&&this.params.productName.toLowerCase(),primaryCategory:"cuentas",completedModules:this._completeModules(),target:this.params&&this.params.target};this._dispatchCustomEvent(`proceedings-init-analytics-view-${t}`,i)}_completeModules(){const e=[],t=["Q","E"],i=["O","C"],s=["E","C","Q"];return this.listContractingDossiers.forEach((a=>{"identityValidation"===a.keys&&t.some((e=>a.status.includes(e)))?e.push("01"):"kyc"===a.keys&&i.some((e=>a.status.includes(e)))?e.push("02"):"fatca"===a.keys&&s.some((e=>a.status.includes(e)))&&this.listContractingDossiers.find((e=>"address"===e.keys&&"Q"===e.status))&&this.beneficiarieVisible&&e.push("03")})),e.length?`${e.join(";")}`:"00"}_navigationBackToIdentityValidation({detail:e}){"official-identity"===e?(this._halfModalConfig=ht,this._halfModalOpened=!0):(this.exitProceedings(),this._dispatchCustomEvent("proceedings-navigation-back-to-modify-confirm-identity"))}updateIdentityValidation(e){this._updatedIdentityValidation=!0,this._showIdentityValidation=!0,this.extractedDataBackup=e.documentExtracted,this._identityValidationDocumentExtracted=e.documentExtracted,this._identityValidationFiles=e.capturedBiometrics;const t=((e,t)=>{const i=[{title:{icon:!0,text:"bbva-feature-proceedings-identity-validation-step-data-title"},name:"bbva-feature-proceedings-identity-validation-scan-ine",value:{text:"bbva-feature-proceedings-identity-validation-complete",bold:!0}},{name:"bbva-feature-proceedings-identity-validation-take-selfie",value:{text:"bbva-feature-proceedings-identity-validation-complete",bold:!0}}];return Object.keys(e.capturedBiometrics).forEach((e=>{"selfie-video"===e&&t&&i.push({name:"bbva-feature-proceedings-identity-validation-take-video-selfie",value:{text:"bbva-feature-proceedings-identity-validation-complete",bold:!0}})})),[i,[{name:"bbva-feature-proceedings-identity-validation-step-curp",value:{text:e.documentExtracted.curp,bold:!0}},{name:"bbva-feature-proceedings-identity-validation-step-ocr-number",value:{text:e.documentExtracted.ocrNumber,bold:!0}},{name:"bbva-feature-proceedings-identity-validation-step-voter-code",value:{text:e.documentExtracted.identificationNumber,bold:!0}},{name:"bbva-feature-proceedings-identity-validation-step-issue-number",value:{text:e.documentExtracted.emisionNumber,bold:!0}},{name:"bbva-feature-proceedings-identity-validation-step-validity",value:{text:e.documentExtracted.validityYear.substring(0,4),bold:!0}}]]})(e,this.videoSelfieMode);this._identityValidationList=t,this.backToProceedings()}_navigateToKycModule(e){const t=this._kycInitialPayload();"kyc-validation"===e?(this.exitProceedings(),this._sendAnalyticsInformation("kyc-validation"),this._dispatchCustomEvent("proceedings-init-analytics-view-update-kyc-module")):(this.exitProceedings(),this._dispatchCustomEvent("proceedings-init-analytics-view-update-kyc-modify")),this._dispatchCustomEvent("bbva-feature-navigate-to-kyc",t)}_kycInitialPayload(){const e=this._dataCustomer&&this._dataCustomer.firstName;return{expedientStatus:this._getDocumentStatus("kyc").status||"A",customerData:{email:this.customerEmail,clientId:this.clientId,customerId:this.customerId,firstName:e},questionnaire:this.payloadKycPutQuestionnaire||{},dataProceedings:0===Object.entries(this.dataProceedingsModify).length?At:this.dataProceedingsModify}}getDataKycModule(e){const{dataAboutYourHabits:t,dataServices:i,dataBanking:s,dataAccount:a,bankOperations:n}=e.dataProceedings;this.dataProceedingsModify=e.dataProceedings,this.dataProceedingsModify.comesFromProceedings=!0,this.payloadKycPatchCustomer=e.payloadPatchCustomer,this.payloadKycPatchEconomicData=e.payloadpatchEconomicData,this.payloadKycPostAdditionalInfo=e.payloadpostAditionalInformation?e.payloadpostAditionalInformation:{},this.payloadKycPutQuestionnaire=e.payloadQuestionnaires,this.payloadKycPostTerms=e.payloadCustomerTerms,this.payloadKycPostIdentificationProcess=e.payloadIdentificationProcessDocument,this._kycSummaryData=[{aboutHabits:_t(t),services:_t(i),account:_t(a),bank:_t(s),bankOperations:_t(n)}],this._showKycValidation=!0,this.backToProceedings()}_initCustomerRequest(){this._dispatchCustomEvent("interaction-update-confirm-information"),Object.keys(this._dataCustomer).length||this._getCustomer()}_getCustomer(){this.showSpinner(),this._lastService="getCustomer",this._globalCustomerDm.getCustomer(this.customerId)}_handleGetCustomerData({detail:e}){this._currentRetries=0,this.customerFirstName=e.firstName,this._dataCustomer=e&&e.data||e;const t=this._dataCustomer&&this._dataCustomer.taxResidence&&this._dataCustomer.taxResidence.nonPresentialResidences;this._maptaxResideces(t),this._getCustomerContactDetails()}_maptaxResideces(e){if(e){const i=Boolean(e.length),s=this._validarRFC,a=i?e[0]:this.defaultMainTaxResidence,n=e.filter(((e,t)=>e&&t>0));this._taxResidencesChannel=n,this._dataCustomer.taxResidencesInfo={mainResidence:mt(s,a),additionalResidences:(t=n,t.length>0?t.map((e=>{var t,i;return{...pt(e),identifierFiscalNumber:(null==e||null===(t=e.taxPayer)||void 0===t||null===(i=t.identityDocument)||void 0===i?void 0:i.documentNumber)||""}})):[]),userHasRfc:Boolean(s),hasInformedTaxResidences:i}}var t}_getCustomerContactDetails(){this._lastService="getCustomerContactDetails",this._customerContactDetailsDm.getCustomerContactDetails(this.customerId)}_handleGetCustomerContractDetails({detail:e}){this._currentRetries=0,this.dataContractDetails=e&&e.data||e,this._getCustomerAddresses()}_getCustomerAddresses(){this._lastService="getCustomerAddresses",this._globalCustomerAddressesDm.getCustomerAddresses(this.customerId)}_handleGetAddresses({detail:e}){const t=e&&e.find((e=>e&&e.addressType&&"HOME"===e.addressType.id)),i=t&&t.location;this.addressComponents=i&&i.addressComponents,this.addressId=t&&t.id;const s=xt(this.addressComponents);this._addressFormato(s),this._getAddressData(s),this.unmaskedAddress&&(this.showAddress=!0),this._multistep.showConfirmInfoValidationExpandable=!0,this.hideSpinner()}_addressFormato(e){const{street:t,postalcode:i,municipality:s,exteriornumber:a,interiornumber:n,country:o,administrativearealevel1:r,administrativearealevel2:c,colony:d}=e;this.addressDataPayload=[{componentTypes:["COUNTRY"],code:o&&o.code},{componentTypes:["POSTAL_CODE"],code:i&&i.code},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:r&&r.code},{componentTypes:["ADMINISTRATIVE_AREA_LEVEL_2"],name:c&&c.name||s&&s.name},{componentTypes:["COLONY"],name:d&&d.name},{componentTypes:["STREET"],name:t&&t.name},{componentTypes:["EXTERIOR_NUMBER"],name:a&&a.name},{componentTypes:["INTERIOR_NUMBER"],name:n&&n.name}]}_getAddressData(e){const{street:t,postalcode:i,municipality:s,exteriornumber:a,interiornumber:n,country:o,administrativearealevel1:r,administrativearealevel2:c,colony:d}=e,l=[t&&t.name,a&&a.name,n&&n.name,i&&i.code,d&&d.name,s&&s.name,c&&c.name,r&&r.name,o&&o.name].filter(Boolean).join(", "),u=`${i&&i.code}, ${r&&r.code}, ${o&&o.code}`;this.addressData={addressComplete:l,hideAddress:u,addressType:this.addressDocumentLabel}}_requestGetUnmaskedAddress(){this._lastService="requestGetUnmaskedAddress",this.unmaskedAddress=!0,this._globalCustomerAddressesDm.getCustomerAddresses(this.customerId,{unmasked:!0})}_handleMultistepConfirmData({detail:e}){if(e&&"identity-validation"===e.id)this._dispatchCustomEvent("interaction-update-identity-validation-confirm"),this._currentProcess="identity",this._handleResquestPatchCustomer();else if(e&&"kyc-validation"===e.id)this._dispatchCustomEvent("interaction-update-kyc-validation-confirm"),this._currentProcess="kyc",this._patchCustomerKyc();else{this._dispatchCustomEvent("interaction-update-confirm-information-button");const{addressStatus:t,beneficiariesStatus:i,fatcaStatus:s}=e.status;this._tempAddressStatus=t,this._tempBeneficiariesStatus=i,this._tempFatcaStatus=s,this._prepareConfirmInformationRequest()}}_handleResquestPatchCustomer(){this.showSpinner(),this._lastService="handleResquestPatchCustomer";const e={identityDocuments:[{expirationDate:`${this._identityValidationDocumentExtracted.validityYear.substring(0,4)}-12-31`,documentNumber:this._identityValidationDocumentExtracted.ocrNumber,documentType:{id:"INE"}}]};this._localCustomerDm.patchCustomer(this.customerId,e)}_prepareRequest(){!this._obverseSaved&&Object.prototype.hasOwnProperty.call(this._identityValidationFiles,"obverse-image")?(this._lastUploadedDocument={flag:"obverseSaved",id:this.attachmentIds.obverseImage},this._postIdentificationProcessDocuments()):!this._reverseSaved&&Object.prototype.hasOwnProperty.call(this._identityValidationFiles,"reverse-image")?(this._lastUploadedDocument={flag:"reverseSaved",id:this.attachmentIds.reverseImage},this._postIdentificationProcessDocuments()):this.videoSelfieMode&&!this._videoSelfieSaved&&Object.prototype.hasOwnProperty.call(this._identityValidationFiles,"selfie-video")?(this._lastUploadedDocument={flag:"videoSelfieSaved",id:this.attachmentIds.selfieVideo},this._postIdentificationProcessDocuments()):(this._currentProcess="",this._confirmIdentityValidationModule())}_confirmIdentityValidationModule(){const e=this.listContractingDossiers.findIndex((e=>"identityValidation"===e.keys));-1!==e&&(this.listContractingDossiers[e].status="Q",this.listContractingDossiers=[...this.listContractingDossiers],this._showIdentityValidation=!1),this.hideSpinner()}_postIdentificationProcessDocuments(){this.showSpinner();const e=this._identityValidationFiles[this._lastUploadedDocument.id],t=this._lastUploadedDocument.id.toUpperCase(),{base64:i}=e,s="SELFIE-VIDEO"===t,a="OBVERSE-IMAGE"===t?"FIRST_PAGE":"LAST_PAGE",n=t.split("-").shift(),o=this._generateContentInfo(s,a,n),r={type:"multipart/form-data",formDataParts:[{name:"documentInfo",body:{mediaType:"application/json",content:JSON.stringify(o)}},{name:"file",filename:e.fileName,body:{mediaType:s?"video/mp4":"image/jpeg",content:s?i:i.split(",").pop()}}]};this._identificationProcessDocumentDm.forceBoundary=!0,this._identificationProcessDocumentDm.multipart=r,this._lastService="postIdentificationProcessDocuments",this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId)}_generateContentInfo(e,t,i){const s={documentType:e?"A":"O",side:e?"OBVERSE":i,verificationType:[{id:"NAME"}],metadata:[{key:"DOCUMENT_TYPE_ID",value:e?"AGX":"001"},{key:"PRODUCT",value:"GM"},{key:"OPERATION_TYPE",value:"saveDocCteTempGM"},{key:"REFERENCE_NUMBER",value:""},{key:"PROCEDURE",value:e?"AD":"A2"}],contentInfo:{contentData:e?"video selfie":"identificacion INE",contentType:e?"mp4":"jpg",documentFamily:e?"mp4":"jpg"}},a=[{key:"numContrato",value:"",valueCypher:this.accountId},{key:"sucursal",value:"3607"},{key:"usuario",value:"ZG10003"},{key:"tipoMatriz",value:"AD01"},{key:"secRef",value:"001"},{key:"idProceso",value:"FAD_CONSUMO"},{key:"txEU",value:"EUG4"}];return e?s.metadata=s.metadata.concat(a):s.pageType=t,s}_patchCustomerKyc(){this.showSpinner(),this._lastService="patchCustomerKyc",this._localCustomerDm.patchCustomer(this.customerId,this.payloadKycPatchCustomer)}_patchCustomerEconomicData(){this._lastService="patchCustomerEconomicData",this._localCustomerEconomicDataDm.patchCustomerEconomicData(this.customerId,this.payloadKycPatchEconomicData)}_handleEconomicDataPatchSuccess(){this._currentRetries=0,this._postCustomerAdditionalInformation()}_postCustomerAdditionalInformation(){this._lastService="postCustomerAdditionalInformation",Object.keys(this.payloadKycPostAdditionalInfo).length?this._localCustomerAdditionalInfoDm.postCustomerAdditionalInformation(this.customerId,this.payloadKycPostAdditionalInfo):this._putCustomerQuestionnaire()}_handleAdditionalInfoSuccess(){this._currentRetries=0,this._putCustomerQuestionnaire()}_putCustomerQuestionnaire(){this._lastService="putCustomerQuestionnaire",this._localCustomerQuestionnaireDm.putCustomerQuestionnaire(this.customerId,"KYC",this.payloadKycPutQuestionnaire)}_handleQuestionnairesPutSuccess(){this._currentRetries=0,this._postCustomerTermsKyc()}_postCustomerTermsKyc(){this._lastService="postCustomerTermsKyc",this._globalCustomerTermsDm.postCustomerTerms(this.customerId,this.payloadKycPostTerms)}_postCustomerIdentificationProcessDocumentsKyc(){if(this._lastService="postCustomerIdentificationProcessDocumentsKyc",this.native)this._identificationProcessDocumentDm.multipart=this._generateMultipartData(),this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId);else{const e=this._generateBodyForIdProcessViaXMLMultipart();this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId,e)}}_sendNotification(){const e=Ct(this._termsCreationDate).format("DD [de] MMMM [de] YYYY HH:mm"),t=Tt(this._dataCustomer&&this._dataCustomer.firstName||"",e,this._termsOperationNumber,"Hábitos financieros");this._localNotificationSendDm.postNotificationSend(t),this.hideSpinner(),this._currentProcess="",this._confirmKycValidationModule()}_confirmKycValidationModule(){const e=this.listContractingDossiers.findIndex((e=>"kyc"===e.keys));-1!==e&&(this.showLoader(),this.listContractingDossiers[e].status="O",this.listContractingDossiers=[...this.listContractingDossiers],this._showKycValidation=!1,this.hideSpinner())}_confirmAddressValidationModule(){const e=this.listContractingDossiers.findIndex((e=>"address"===e.keys));-1!==e&&(this.listContractingDossiers[e].status="Q",this.listContractingDossiers=[...this.listContractingDossiers])}_confirmAddressInformation(){"026"===this.documentTypeAddress.id?this._updateCustomerAddress():(this._lastService="confirmAddressInformation",this._identificationProcessDocumentDm.multipart=this.addressFormData,this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId))}_validateShowAddress(){this.showAddress?(this.showSpinner(),this._currentProcess="address",this._confirmAddressInformation()):(this._tempAddressStatus=!0,this._currentProcess="",this._prepareConfirmInformationRequest())}_prepareConfirmInformationRequest(){this._tempAddressStatus?this._tempFatcaStatus||"portability"===this.params.target?this._tempBeneficiariesStatus||"portability"===this.params.target?(this.hideSpinner(),this._multistep.completeAllConfirmInformation()):(this.showSpinner(),this._currentProcess="beneficiaries",this.profileRecipientsChannel&&this.profileRecipientsChannel.participants&&this.profileRecipientsChannel.participants.length>0?this._confirmPostAccountParticipants():this._postCustomerTermsBeneficiaries()):(this._currentProcess="fatca",this.showSpinner(),this._patchCustomerFatca()):this._validateShowAddress()}_updateCustomerAddress(){this._lastService="updateCustomerAddress",this._localCustomerAddressDm.updateCustomerAddress(this.customerId,this.addressId,this._buildSetAddressPayload())}_buildSetAddressPayload(){const e={addressType:{id:"HOME"},ownershipType:{id:"FAMILY"},location:{locationTypes:["HOME"],addressComponents:this.addressDataPayload},residenceStartDate:yt(new Date).add(1,"y").format("YYYY-MM-DD"),addressProofDocuments:[{documentType:this.documentTypeAddress,documentNumber:"026"===this.documentTypeAddress.id?Math.floor(1e13*Math.random()).toString().padStart(13,"0"):""}]};return"026"===this.documentTypeAddress.id?e.addressProofDocuments[0].expirationDate=yt(new Date).add(1,"y").format("YYYY-MM-DD"):e.addressProofDocuments[0].issueDate=yt(new Date).subtract(1,"M").format("YYYY-MM-DD"),e}_addressHandleUpdate(){this._currentProcess="",this._tempAddressStatus=!0,this._confirmAddressValidationModule(),this._prepareConfirmInformationRequest()}_patchCustomerFatca(){this._lastService="patchCustomerFatca";const e=this._dataCustomer||{},t=e.taxResidencesInfo||{},i=e.birthData||{},s=e.taxResidence||{},a=this.additionalTaxResidences||t.additionalResidences||[],n=function(e,t,i,s,a){const n=[gt(s.id,s.identifierFiscalNumber)];if(a.length){const e=a.map((e=>gt(e.id,e.identifierFiscalNumber)));Array.prototype.push.apply(n,e)}return{birthData:{country:{id:e}},nationalities:ft(t),taxResidence:{country:{id:i},nonPresentialResidences:n}}}(i.country&&i.country.id||"",e.nationalities||[],s.country&&s.country.id||"",t.mainResidence||{},a);this._localCustomerDm.patchCustomer(this.customerId,n)}_postCustomerTermsFatca(){this._lastService="postCustomerTermsFatca",this._globalCustomerTermsDm.postCustomerTerms(this.customerId,St)}_postCustomerIdentificationProcessDocumentsFatca(){if(this._lastService="postCustomerIdentificationProcessDocumentsFatca",this.native)this._identificationProcessDocumentDm.multipart=this._generateMultipartData(),this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId);else{const e=this._generateBodyForIdProcessViaXMLMultipart();this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId,e)}}_generateMultipartData(){const e="kyc"===this._currentProcess,t=e?this.kycDocumentKey:this.documentKeyTaxResidence,i=e?this.kycDocumentName:this.documentNameTaxResidence,s=e?"KYC":"FATCA",a=e?"kyc_document.xml":"fatca_document.xml",n=Et(t,this._termsOperationNumber,i),o=vt(t,this.clientId,this._termsOperationNumber,s);return{type:"multipart/form-data",formDataParts:[{name:"documentInfo",body:{mediaType:"application/json",content:JSON.stringify(n)}},{name:"file",filename:a,body:{mediaType:"text/xml",content:btoa(o)}}]}}_postCustomerTermsBeneficiaries(){this._lastService="postCustomerTermsBeneficiaries",this._globalCustomerTermsDm.postCustomerTerms(this.customerId,Dt)}_confirmPostAccountParticipants(){this._globalAccountParticipantsDm.postAccountParticipants(this.accountId,this.profileRecipientsChannel)}_requestPostRecipientsSuccess(){this.hideSpinner(),this._tempBeneficiariesStatus=!0,this.beneficiarieVisible=!0,this._currentProcess="",this._prepareConfirmInformationRequest()}_handlePatchCustomerResponse({detail:e}){if(this._currentRetries=0,"identity"===this._currentProcess){const{operationNumber:t,operationDate:i}=e;this.extractedDataBackup={...this.extractedDataBackup,operationNumber:t,operationDate:i},Object.assign(this.customerInfo,{documentExtracted:this.extractedDataBackup}),this._prepareRequest()}else"kyc"===this._currentProcess?this._patchCustomerEconomicData():this._postCustomerTermsFatca()}_handleIdentificationProcessDocumentsSuccess(){if(this._currentRetries=0,"identity"===this._currentProcess)this[`_${this._lastUploadedDocument.flag}`]=!0,this._prepareRequest();else if("address"===this._currentProcess)this._updateCustomerAddress();else if("kyc"===this._currentProcess)this._sendNotification();else{const e=Ct(this._termsOperationDate).format("DD [de] MMMM [de] YYYY HH:mm"),t=Tt(this._dataCustomer&&this._dataCustomer.firstName,e,this._termsOperationNumber,"Residencia fiscal");this._localNotificationSendDm.postNotificationSend(t),this._tempFatcaStatus=!0,this._tempShowAddressStatus=!0,this._confirmFatcaValidationModule(),this._confirmAddressValidationModule(),this._currentProcess="",this._prepareConfirmInformationRequest()}}_handleCustomerTermSuccess({detail:e}){this._currentRetries=0;const t=e&&e.data||e;this._termsOperationNumber=t&&t.operationTracking&&t.operationTracking.operationNumber||"",this._termsOperationDate=t&&t.creationDate,"beneficiaries"===this._currentProcess?(this._tempBeneficiariesStatus=!0,this.hideSpinner(),this._currentProcess="",this.beneficiarieVisible=!0,this._prepareConfirmInformationRequest()):"kyc"===this._currentProcess?this._postCustomerIdentificationProcessDocumentsKyc():this._postCustomerIdentificationProcessDocumentsFatca()}_handleFullConfirmation(){this._dispatchCustomEvent("interaction-update-confirm-upgrade"),"operatives"===this.portabilityN2Entrypoint?(this._dispatchCustomEvent("bbva-feature-proceedings-porta-n2-continue-button-link","J"),this._multistepModalOpened=!1):"deeplink"===this.portabilityN2Entrypoint?(this._dispatchCustomEvent("bbva-feature-proceedings-porta-n2-continue-button-publish",this.payloadForDeepLink),this._dispatchCustomEvent("bbva-feature-proceedings-porta-n2-continue-button-link","J"),this._multistepModalOpened=!1):"02"===this.params.accountLevel?this._postAccountLevelUpgrade():this._postAccountDocumentationDossiers()}_postAccountLevelUpgrade(){this.showSpinner(),this._lastService="postAccountLevelUpgrade";this._accountsLevelUpgradeDm.postLevelUpgrade(this.accountId,{upgradeMode:{id:"QUALITY_ASSUREMENT_AUTHORIZATION"}})}_postAccountDocumentationDossiers(){this.showSpinner(),this._lastService="postAccountDocumentationDossiers";const e={statusType:"COMPLETE",account:{id:this.params.simpleCode},acceptanceMethod:{id:"CONSENTIDO CON FIRMA ELECTRONICA"}};this._accountsDocumentationDossiersDm.postDocumentationDossiers(e)}_handlePostAccountLevelUpgradeSuccess(e){this._currentRetries=0;const t=e;this._dispatchCustomEvent("bbva-feature-proceedings-level-upgrade-success",{detail:t}),this._postAccountDocumentationDossiers()}_handlePostAccountDocumentationDossiersSuccess(e){const t=[this._getDocumentStatus("identityValidation").status,this._getDocumentStatus("kyc").status,this._getDocumentStatus("address").status,this._getDocumentStatus("fatca").status],i=e&&e.detail||e,s=i&&i.operationTracking&&i.operationTracking.operationNumber||"",a=i&&i.operationDate||(new Date).toISOString();this.dossiersCompleted=["Q","O","Q","E"].join("")===t.join("");const n={customerId:this.customerId,accountId:this.accountId,accountLevel:this.params.accountLevel,dossiersCompleted:this.dossiersCompleted,operationNumber:s,operationDate:a,email:this.customerEmail,completedModules:this._completeModules(),isPayroll:this.isPayroll};this.hideSpinner(),this.updateInitialServices=!1,this._multistepModalOpened=!1,this._dispatchCustomEvent("bbva-feature-proceedings-navigate-to-upgrade-success",n)}_confirmFatcaValidationModule(){const e=this.listContractingDossiers.findIndex((e=>"fatca"===e.keys));-1!==e&&(this.showLoader(),this.listContractingDossiers[e].status="E",this.listContractingDossiers=[...this.listContractingDossiers])}_addressInitialPayload(e){return{data:{address:{addressComponents:{data:{location:{addressComponents:this.addressDataPayload}}}},documentData:{id:this.documentTypeAddress.id,name:"DOC123.jpg"},entryPoint:e}}}getDataBeneficiariesModule(e){this.hideSpinner(),this.profileRecipientsChannel=e,this.participantsChannel=e.participants.map((({customDetails:e})=>({firstName:e.firstName,lastName:e.lastName,fullName:`${e.firstName} ${e.lastName} ${e.secondLastName}`,participationPercentage:e.participationPercentage,relationType:e.relationType.id.toUpperCase()[0]+e.relationType.id.slice(1).toLowerCase()})))}taxResidencesAdiccionalData(e){const t=e;this.hideSpinner(),this.updateNonPresentialResidences(t)}addresToProceedings({detail:e}){const{updateAddres:{location:{addressComponents:t},addressProofDocuments:[{documentType:i,label:s}]},formData:a}=e;this._tempAddressStatus=!1,this.addressDocumentLabel=s,this.documentTypeAddress=i,this.addressFormData=a;const n=xt(t);this._addressFormato(n),this._getAddressData(n),this.showAddress=!0,this.hideSpinner()}_handleNavigationAddress(e){if("home-data"===e.detail)this._sendAnalyticsInformation("address"),this._fullModalConfig=ut,this._fullModalOpened=!0;else if(this.showAddress){this._sendAnalyticsInformation("address"),this._dispatchCustomEvent("proceedings-init-analytics-view-update-address");const e=this._addressInitialPayload("updateAddressProceedings");this._dispatchCustomEvent("bbva-feature-proceedings-edit-customer-address",e)}else this.showSpinner(),this._requestGetUnmaskedAddress()}_navToRecipients(){this.showSpinner();const e=this.accountDetailData.availableBalance.currentBalances[0].amount,{id:t,number:i,name:s}=this.accountDetailData,a={previewPage:"proceedings",contracts:[{id:t,number:i,product:{name:s},detail:{specificAmounts:[{id:`${this.t("bbva-feature-proceedings-participants-sen-data-id")}`,name:`${this.t("bbva-feature-proceedings-participants-sen-data-name")}`,amounts:[{amount:e,currency:`${this.t("bbva-feature-proceedings-participants-sen-data-currency")}`}]}]}}]};a.participants=this.profileRecipientsChannel.participants,this._sendAnalyticsInformation("participants"),this._dispatchCustomEvent("bbva-feature-proceedings-navigation-participants",a)}forcedShutdownBenef(){this.hideSpinner(),this.profileRecipientsChannel=[],this.participantsChannel=[]}_buildResidencesInitialPayload(e){const t=this._dataCustomer||{},i=t.taxResidencesInfo||{},s=i.mainResidence||null,a=i.additionalResidences||[],n=i.userHasRfc||!1,o=bt([s],!1),r=bt(a,!0),c=!e||o&&r;if(this.clientId&&c){const{firstName:e,birthData:i,nationalities:o,taxResidence:r}=t;return{expedientStatus:this._getDocumentStatus("fatca").status,customerData:{firstName:e||"",countryOfBirth:i&&i.country||{},nationalities:o||[],countryOfDomicile:r&&r.country||{},rfc:this._validarRFC,email:this._emailCustomer,clientId:this.clientId,customerId:this.customerId},taxResidenceInformation:{mainResidence:s,nonPresentialResidences:a,userHasRfc:n},dataTaxResidence:[],fromProceedings:!0}}return null}updateNonPresentialResidences(e){Array.isArray(e)&&(this._dataCustomer.taxResidencesInfo.additionalResidences=e.map((e=>({id:e.id,name:e.name,identifierFiscalNumber:e.identifierFiscalNumber}))),this._taxResidencesChannel=this._dataCustomer.taxResidencesInfo.additionalResidences)}_getDocumentStatus(e){return this.listContractingDossiers.find((({keys:t})=>t===e))||{}}_handleNavigationFatca(e){const t=e.detail,i=this._dataCustomer.taxResidencesInfo.additionalResidences;if("fatca-data"===t&&i&&i.length>0){const e=this._buildResidencesInitialPayload(!1);this.exitProceedings(),this._sendAnalyticsInformation("tax-residences"),this._dispatchCustomEvent("bbva-proceedings-navigation-to-tax-residences",e)}else{const e=this._buildResidencesInitialPayload(!0);this.exitProceedings(),this._sendAnalyticsInformation("tax-residences"),this._dispatchCustomEvent("bbva-proceedings-navigation-to-tax-residences",e)}}_handleMultistepClose(){this._halfModalConfig=lt,this._halfModalOpened=!0,this._dispatchCustomEvent("bbva-feature-proceedings-operative-close")}_generateBodyForIdProcessViaXMLMultipart(){if("kyc"===this._currentProcess){const e=this._generateIdProcessXMLFile(),t=this._generateIdProcessJSONMetadata();this._dataFormData.append("file",e),this._dataFormData.append("documentInfo",t)}else{const e=this._generateIdProcessXMLFile(),t=this._generateIdProcessJSONMetadata();this._dataFormData.append("file",e,"fatca_document.xml"),this._dataFormData.append("documentInfo",t)}return this._dataFormData}_generateIdProcessXMLFile(){if("kyc"===this._currentProcess){const e=vt(this.kycDocumentKey,this.clientId,this._termsOperationNumber,"KYC");this.xmlFile=new Blob([e],{type:"text/xml"})}else{const e=vt(this.documentKeyTaxResidence,this.clientId,this._termsOperationNumber,"FATCA");this.xmlFile=new Blob([e],{type:"text/xml"})}return this.xmlFile}_generateIdProcessJSONMetadata(){if("kyc"===this._currentProcess){const e=Et(this.kycDocumentKey,this._termsOperationNumber,this.kycDocumentName);this.metadaFile=new Blob([JSON.stringify(e)],{type:"application/json"})}else{const e=Et(this.documentKeyTaxResidence,this._termsOperationNumber,this.documentNameTaxResidence);this.metadaFile=new Blob([JSON.stringify(e)],{type:"application/json"})}return this.metadaFile}get _tplsApi(){return r`
      <bbva-local-contract-documents-contracting-dossiers-api-dm
        id="contract-documents-contracting-dossiers"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.contractDocumentsApiVersion}"
        ?native="${this.native}"
        @contracting-dossiers-api-dm-fetch="${this._handleGetContractingDossiers}"
        @contracting-dossiers-api-dm-fetch-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-contract-documents-contracting-dossiers-api-dm>

      <bbva-global-account-participants-api-dm
        id="global-account-participants"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        ?requiredOTP="${this.requiredOtp}"
        @account-participants-api-dm-fetch="${this._handleGetAccountParticipantsSuccess}"
        @account-participants-api-dm-fetch-error="${this._handleServiceError}"
        @account-participants-api-dm-create="${this._requestPostRecipientsSuccess}"
        @account-participants-api-dm-create-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      ></bbva-global-account-participants-api-dm>

      <bbva-local-accounts-level-upgrade-api-dm
        id="local-accounts-level-upgrade-api-dm"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="2"
        ?native="${this.native}"
        @account-level-upgrade-api-dm-fetch="${this._handlePostAccountLevelUpgradeSuccess}"
        @account-level-upgrade-api-dm-fetch-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-accounts-level-upgrade-api-dm>

      <bbva-local-accounts-documentation-dossiers-api-dm
        id="local-accounts-documentation-dossiers-api-dm"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="0"
        ?native="${this.native}"
        requiredOTP
        @account-documentation-dossiers-api-dm-fetch="${this._handlePostAccountDocumentationDossiersSuccess}"
        @account-documentation-dossiers-api-dm-fetch-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-accounts-documentation-dossiers-api-dm>

      <bbva-global-customer-api-dm
        id="global-customer-api-dm"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .customerId="${this.customerId}"
        @customer-api-dm-fetch="${this._handleGetCustomerData}"
        @customer-api-dm-fetch-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-global-customer-api-dm>

      <bbva-global-customer-contact-details-api-dm
        id="global-customer-contact-details"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        @customer-contact-details-api-dm-fetch="${this._handleGetCustomerContractDetails}"
        @customer-contact-details-api-dm-fetch-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-global-customer-contact-details-api-dm>

      <bbva-global-customer-addresses-api-dm
        id="global-customer-addresses"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        ?requiredOTP="${this.requiredOtp}"
        @customer-addresses-api-dm-fetch="${this._handleGetAddresses}"
        @customer-addresses-api-dm-fetch-error="${this._handleErrors}"
      ></bbva-global-customer-addresses-api-dm>

      <bbva-local-customer-address-api-dm
        id="local-customer-address"
        .version="${this.customersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOtp}"
        @customer-address-api-dm-update="${this._addressHandleUpdate}"
        @customer-address-api-dm-update-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      ></bbva-local-customer-address-api-dm>

      <bbva-local-customer-api-dm
        id="local-customer-api-dm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOtp}"
        @customer-api-dm-update="${this._handlePatchCustomerResponse}"
        @customer-api-dm-update-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-customer-api-dm>

      <bbva-global-customer-identification-process-documents-api-dm
        id="identification-process-documents-api-dm"
        .version="${this.customersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .requiredOTP="${this.requiredOtp}"
        .headers="${this.headersCustomersIdentifications}"
        .forceBoundary="${!0}"
        @customer-identification-process-documents-api-dm-create="${this._handleIdentificationProcessDocumentsSuccess}"
        @customer-identification-process-documents-api-dm-create-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-global-customer-identification-process-documents-api-dm>

      <bbva-local-customer-economic-data-api-dm
        id="local-customer-economic-data-api-dm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOtp}"
        @customer-economic-data-api-dm-update="${this._handleEconomicDataPatchSuccess}"
        @customer-economic-data-api-dm-update-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-customer-economic-data-api-dm>

      <bbva-local-customer-additional-information-api-dm-mx
        id="local-customer-additional-information-api-dm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native=${this.native}
        .requiredToken=${this.requiredToken}
        @customer-additional-information-api-dm-create="${this._handleAdditionalInfoSuccess}"
        @customer-additional-information-api-dm-create-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-customer-additional-information-api-dm-mx>

      <bbva-local-customer-questionnaire-api-dm
        id="local-customer-questionnaire-api-dm"
        .host=${this.host}
        .version="${this.customersApiVersion}"
        ?native=${this.native}
        .requiredToken=${this.requiredToken}
        @customer-questionnaire-api-dm-update="${this._handleQuestionnairesPutSuccess}"
        @customer-questionnaire-api-dm-update-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      >
      </bbva-local-customer-questionnaire-api-dm>

      <bbva-global-customer-terms-api-dm
        id="global-customer-terms-api-dm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOtp}"
        @customer-terms-api-dm-create="${this._handleCustomerTermSuccess}"
        @customer-terms-api-dm-create-error="${this._handleServiceError}"
        @api-dm-error="${this._handleServiceError}"
      ></bbva-global-customer-terms-api-dm>

      <bbva-local-notifications-send-api-dm
        id="local-notifications-send-api-dm"
        .host="${this.host}"
        .version="${this.notificationsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
      ></bbva-local-notifications-send-api-dm>
    `}render(){return r`
      ${super.render()} ${this._tplsApi}
      <bbva-feature-proceedings-multistep
        .listContractingDossiers="${this.listContractingDossiers}"
        ?visible="${this._multistepModalOpened}"
        identityValidationList="${JSON.stringify(this._identityValidationList)}"
        ?show-identity-validation-expandable="${this._showIdentityValidation}"
        .kycData="${this._kycSummaryData}"
        ?show-kyc-validation-expandable="${this._showKycValidation}"
        .addressData="${this.addressData}"
        .customer="${this._dataCustomer}"
        .taxResidences="${this._taxResidencesChannel}"
        .accountDetailData="${this.accountDetailData}"
        .participantsChannel="${this.participantsChannel}"
        ?beneficiaries-complete="${this.beneficiarieVisible}"
        .participants="${this.participants}"
        .showAddress="${this.showAddress}"
        ?address-complete="${this._tempShowAddressStatus}"
        ?fatca-complete="${this._tempFatcaStatus}"
        .fromPortability="${this.params&&this.params.target}"
        @bbva-feature-proceedings-show-modal-close="${this._handleMultistepClose}"
        @bbva-feature-proceedings-multistep-exit="${this._exitOperative}"
        @bbva-feature-proceedings-multistep-index-identity-section="${this._navigationToIdentityValidation}"
        @bbva-feature-proceedings-multistep-navigation-identity-expandable-link="${this._navigationBackToIdentityValidation}"
        @bbva-feature-proceedings-multistep-navigate-kyc="${e=>this._navigateToKycModule(e.detail)}"
        @bbva-feature-proceedings-multistep-modify-kyc="${e=>this._navigateToKycModule(e.detail)}"
        @bbva-feature-proceedings-multistep-navigation-address="${this._handleNavigationAddress}"
        @bbva-feature-proceedings-multistep-navigation-tax-residence="${this._handleNavigationFatca}"
        @bbva-feature-proceedings-operative-confirm-data="${this._handleMultistepConfirmData}"
        @bbva-feature-proceedings-confirm-information-click="${this._initCustomerRequest}"
        @bbva-feature-multistep-navigate-to-recipients="${this._navToRecipients}"
        @bbva-feature-confirm-proceedings-upgrade="${this._handleFullConfirmation}"
        @bbva-feature-proceedings-multistep-modal-open="${this._handleOpenModal}"
      ></bbva-feature-proceedings-multistep>
      ${this._proceedingsHalfModal._getHalfModal} ${this._proceedingsFullModal._getFullModal}
    `}}customElements.define(Pt.is,Pt);class Rt extends(le(t)){static get is(){return"bbva-analyticmanager-procedings"}static get properties(){return{customerData:{type:Object},segments:{type:Object},eventInteraction:{type:String},_isAppPageViewInitLaunched:{type:Boolean},literals:{type:Object}}}constructor(){super(),this.customerData={},this.eventInteraction="analytics-activity-click",this.segments={warningNominees:"nominados alertados",proactiveNominees:"proactivos nominados",nonNominatedProactive:"proactivos no nominados"},this._isAppPageViewInitLaunched=!1,this.literals={validateIdentity:"validemos tu identidad",modifyAddress:"modificar domicilio",modifyCurrentAddress:"modificar direccion actual",modifyOfficialIdentification:"modificar identificacion oficial",modifyIneData:"modificar datos ine",confirmIdentity:"confirmar identidad",habitsFinancial:"cuentanos tus habitos financieros",confirmHabitsFinancialName:"confirmar habitos financieros",confirmYourInformation:"confirmemos tu informacion",confirmInformation:"confirmar informacion",confirmDataUpdate:"confirmar actualizacion de datos",otpLevel:"otp",errorPage:"error operacion no realizada"}}resetProp(){this._isAppPageViewInitLaunched=!1,this.customerData={}}manageAppView(e){var t,i,s,a;this.customerData=e;const n=this.segments[null===(t=this.customerData)||void 0===t?void 0:t.segmentProfile]||"",o=null!==(i=this.customerData)&&void 0!==i&&i.completedModules?`segmento usuario:${n}, modulos completados:${this.customerData.completedModules}`:"",r="portability"===this.customerData.target?"cambiar nomina":"ampliar cuenta",c=(null===(s=this.customerData)||void 0===s?void 0:s.primaryCategory)||"",d=(null===(a=this.customerData)||void 0===a?void 0:a.productName.toLowerCase())||"",l=`modulos completados:${this.customerData.completedModules}`;this.persistData({customFieldsProceedings:o,level3:r,customFields:l,segmentProfile:n,primaryCategory:c,productName:d}),this._isAppPageViewInitLaunched||(this._dispatch("analytics-start-flow",{...this.data}),this._isAppPageViewInitLaunched=!0)}onAppInternalLinkIdentityValidation(){this._dispatch("analytics-app-on-click-start-identity",this.data)}onAppInternalLinkKycValidation(){this._dispatch("analytics-app-on-click-start-kyc",this.data)}onAppInternalLinkKycValidationModify(){this._dispatch("analytics-app-on-click-start-kyc-modify",this.data)}onAppOnClickStartFatca(){this._dispatch("analytics-app-on-click-start-fatca",this.data)}onAppOnClickStartAddress(){this._dispatch("analytics-app-on-click-start-home-address",{step:this.literals.modifyAddress,...this.data})}onAppOnClickStartUpdateAddress(){this._dispatch("analytics-app-on-click-start-update-address",{step:this.literals.modifyCurrentAddress,...this.data})}onClickStartParticipants(){this._dispatch("analytics-app-on-click-start-participants",this.data)}dispatchNavigateIdentityModuleAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.validateIdentity,flagName:"ProceedingsVrfIdentity",...this.data})}dispatchOfficialIdentificationModificationAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.modifyOfficialIdentification,flagName:"ProceedingsOfficialIdentification",...this.data})}dispatchIneDataModificationAnalyticriesData(){this._dispatch(this.eventInteraction,{linkName:this.literals.modifyIneData,flagName:"ProceedingsModificationIne",...this.data})}dispatchConfirmIdentityModuleAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.confirmIdentity,flagName:"ProceedingsCnfIdentity",...this.data})}dispatchNavigateKycModuleAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.habitsFinancial,flagName:"Proceedingsfinance",...this.data})}dispatchConfirmKycModuleAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.confirmHabitsFinancialName,flagName:"ProceedingsCnfFinance",...this.data})}dispatchConfirmInformationModuleAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.confirmYourInformation,flagName:"ProceedingsInformation",...this.data})}dispatchConfirmInformationModuleButtonAnalytic(){this._dispatch(this.eventInteraction,{linkName:this.literals.confirmInformation,flagName:"ProceedingsCnfInformation",...this.data})}dispatchConfirmLevelUpgradeAnalytic(){this._dispatch("analytics-confirm-update-information",{level4:this.literals.confirmDataUpdate,...this.data})}dispatchOtpAnalytic(){var e;const t=`segmento usuario:${this.segments[null===(e=this.customerData)||void 0===e?void 0:e.segmentProfile]}, firma:token, modulos completados:${this.customerData.completedModules}`;this.persistData({customFieldsFootprint:t}),this._dispatch("analytics-activity-otp",{level4:this.literals.otpLevel,...this.data})}dispatchErrorPageAnalytic(){this._dispatch("analytics-activity-error",{level4:this.literals.errorPage,errorPage:this.literals.errorPage,...this.data})}}customElements.define(Rt.is,Rt);var kt=Object.freeze({__proto__:null});export{Ne as B,kt as p};
