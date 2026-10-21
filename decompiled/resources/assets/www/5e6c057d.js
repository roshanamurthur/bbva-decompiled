import{J as e,L as t,aZ as a,a7 as i,h as s,dC as n,dD as r,dE as o,a as c,i as d,b as l,z as u,an as p,aY as h,aV as m,W as g,aN as y,aX as _,ak as b,cT as v,cU as f,bF as T}from"./952f98a9.js";import{M as S,v as E,L as A,G as R,a2 as C,f as P,V as x,a1 as O,Q as w,H as $,I as N,F as D,e as I,D as k,an as q,K as M,ao as H}from"./216055dc.js";import{B as j,a as B}from"./a0b89eb0.js";import{B as L,a as F}from"./4eb8d874.js";import{B as V}from"./40b41b3c.js";import{B as G,a as U}from"./a4e2d801.js";import{bg as z,ck as K,bf as W}from"./7f3d7ca9.js";import{B as X}from"./6580680e.js";import{B as J,b as Y}from"./d335c75d.js";import{B as Q,b as Z}from"./30ef6f1f.js";import{B as ee,b as te}from"./41ed0536.js";import{a as ae,B as ie,c as se}from"./ff7f0130.js";import{b as ne,B as re}from"./84dff06e.js";import{B as oe}from"./0bde5adf.js";class ce extends(e(t)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==e[t].id&&e.splice(t,1);return e}}let de=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|t,n=Math.max(s>=0?s:i-Math.abs(s),0);for(;n<i;){if((r=a[n])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;n++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,s="",n=0,r=arguments.length;n!==r;++n){var o=+arguments[n];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(s+=e.apply(null,a),a.length=0)}return s+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}},le=class extends de{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const ue=0,pe=1,he="jwt",me="tsec",ge="none";let ye=class extends de{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ue,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new le,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=me:this.requiredToken=ge,this.requiresJWT=!1):this.requiredToken===me?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===he?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ge?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(me)}_setJwtHandler(){this._setTokenHandler(he)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=a),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===pe?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(me,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(he,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===he?"JWT ":"",s=e===he?"Authorization":me;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[a].getItem(n);r?t[s]=t[s]||i+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],s=0,n=0;if(i<=127?(s=0,n=255&i):i<=223?(s=1,n=31&i):i<=239?(s=2,n=15&i):i<=244&&(s=3,n=7&i),e.length-a-s>0){let t=0;for(;t<s;)i=e[a+t+1],n=n<<6|63&i,t+=1}else n=65533,s=e.length-a;t+=String.fromCodePoint(n),a+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",s=a[e].split(i);t[s.shift().toLowerCase()]=s.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(s=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[i])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,s,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,a=r.authenticationdata||null,i=r.authenticationstate,s=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:a,state:i,challenge:s,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let s;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,a);s=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${e}`,this._buildSignatureHeaders(s,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:n,data:r,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(l),a=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,n,r,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,n,r,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),n=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(n),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,s,n){this._defineSignatureValue(t,a,i);const r={type:t,data:a,challenge:s,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,s,n){i?this._notifySignatureRequired(e,t,a,i,s,n):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,s,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,s):this._notifySignatureRequired(t,a,i,s,n,r)}},_e=class extends ye{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}},be=class extends ye{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class ve extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class fe extends be{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class Te extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class Se extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Ee extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Ae extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Re extends ce{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(i))}_getBgadp(e){return{getAccountsV1:()=>new V(e),getAccountsV0:()=>new ve(e),postAccountsV0:()=>new fe(e),postAccountsV1:()=>new L(e),getAccountsV2:()=>new j(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,a){t in e&&(e[a]=e[t],delete e[t])}_paramsMapping(e){if("0"==this.version&&Object.keys(e).length){const t=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],a=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];e["status.id"]&&t.includes(e["status.id"])&&this._removeFields(["status.id"],e),e["indicators.id"]&&a.includes(e["indicators.id"])&&this._removeFields(["indicators.id"],e),this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(e,"expand.id","expand"),e}_responseMapping(e){if(Array.isArray(e)&&e.length>0){if("0"==this.version)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product");["COMMON","CREDIT"].includes(e[t].accountType.id)||this._removeFields(["accountType"],e[t]),this._removeFields(["subType"],e[t].accountType),this._removeFields(["previousMonthAverageBalances"],e[t].availableBalance),"DORMANT"===e[t].status.id&&this._removeFields(["status"],e[t]),this._removeFields(["reason","reasonDescription","situation"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],e[t])}else if("1"==this.version)for(let t=0;t<e.length;t++)e[t].product&&this._removeFields(["subProduct"],e[t].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],e[t]),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){if("0"==this.version&&Object.keys(e).length){this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.status.reason&&(e.status.reason={id:e.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(e.accountType.id)||this._removeFields(["accountType"],e),e.participants.forEach((e=>{this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType||Object.keys(e).some((e=>"firstName"===e))?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):("LEGAL_PERSON"===e.personType||Object.keys(e).some((e=>"legalName"===e)))&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],e)),e.participantType.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination&&e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails&&e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],e)}return e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.status&&this._removeFields(["name"],e.status),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(e.participantType.id)&&this._removeFields(["participantType"],e),e.order&&(e.participantType={...e.participantType,order:e.order},this._removeFields(["order"],e)),e.customDetails.firstName&&(e.firstName=e.customDetails.firstName),e.customDetails.lastName&&(e.lastName=e.customDetails.lastName),e.customDetails.secondLastName&&(e.secondLastName=e.customDetails.secondLastName);const t=["DNI","NIE","NIF","CIF","PASSPORT"];e.customDetails.identityDocuments&&e.customDetails.identityDocuments.forEach((a=>{t.includes(a.documentType.id)&&(e.identityDocument={documentNumber:a.documentNumber,documentType:a.documentType.id})})),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),"DIGITAL_CONTACT"===e.destination.id&&this._removeFields(["id"],e.destination),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingType"],e)})))),e}_paginationMapping(e){return e}}i(Re,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),i(Re,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(Re.is,Re);class Ce extends ce{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accounts"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./0035933f.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}Accounts`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccounts${e}ApiDm`;(0,this._modules[e])().then((async e=>{const a=e[t].is;this._module=this._createModuleElement(a),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Re.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getAccounts(){await this.module.updateComplete,Object.keys(this.accounts).length||(this._requestParams.get.forEach((e=>{this.module.getAccounts(e.params)})),delete this._requestParams.get)}async postAccounts(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postAccounts(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postAccounts(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return s` ${this._module?this._module:""}`}}class Pe extends ce{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(i))}_getBgadp(e){return{getAccountTransactionsV2:()=>new n(e),getAccountTransactionsV0:()=>new Ae(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let a=0;a<t.length;a++){let i=t[a];if("operationAmount.id"===i&&"LOCAL_AMOUNT"===e[i])for(let a=0;a<t.length;a++)"operationAmount.fromAmount"===t[a]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[a]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[a]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,a){t in e&&(e[a]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const a=e[t].classification;a&&(this._removeFields(["pfmId","customName"],a),this._removeFields(["customName"],a.category),this._removeFields(["customName"],a.category.subcategory));const i=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],i),i&&i.branch&&(e[t].branch={id:i.branch.id,name:i.branch.name},this._removeFields(["branch"],i)),i&&i.updatedBalance&&(i.balances=[{id:"UPDATED_BALANCE",amount:i.updatedBalance.amount,currency:i.updatedBalance.currency}],this._removeFields(["updatedBalance"],i)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const s=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[s,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}i(Pe,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Pe.is,Pe);class xe extends ce{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const a={"account-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(i))}_getBgadp(e){return{getAccountParticipantsV2:()=>new G(e),getAccountParticipantsV1:()=>new r(e),postAccountParticipantsV1:()=>new o(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}i(xe,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),i(xe,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(xe.is,xe);const Oe={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},we={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class $e extends(c(Pe)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[l];return $e.scopedElementsFromClasses(e)}render(){return s` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return s`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${d(((e,t)=>{let a={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;a=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((a,i)=>(a[i.replace(e,"")]=t.getItem(i),a)),{})}return JSON.stringify({...t,...a})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const a=this.shadowRoot.getElementById("accountTransactions"),i=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:a,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[i]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var a;return(null==e||null===(a=e.financingData)||void 0===a?void 0:a.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",a=null==e?void 0:e.amount;let i={};var s,n;a&&(i={id:"EUR"===(null===(s=a.currency)||void 0===s?void 0:s.code)?"CONTRACT_AMOUNT":t,amount:null==a?void 0:a.amount,currency:null==a||null===(n=a.currency)||void 0===n?void 0:n.id});let r={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:a}=e;r={id:t,amount:a.payment.amount,currency:a.payment.currency.id}}const o=0===Object.keys(i).length,c=0===Object.keys(r).length;return o&&c?null:o?[r]:c?[i]:[i,r]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,a;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(a=e.amount)||void 0===a?void 0:a.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,a;const i=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,s=null==e||null===(a=e.humanSubcategory)||void 0===a?void 0:a.id,n=Oe[i];var r;return{id:i,name:n,category:{id:i,name:n,subcategory:{id:s,name:(r=s,Object.keys(we).find((e=>we[e].includes(r))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:a,params:i,body:s}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${i}`,e.method=a,e.body=s,e.generateRequest(!0)}}customElements.define($e.is,$e);class Ne extends ce{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(i))}_getBgadp(e){return{getAccountLimitsV0:()=>new Ee(e),getAccountLimitsV2:()=>new F(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}i(Ne,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Ne.is,Ne);class De extends ce{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(i))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new U(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(De,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(De.is,De);class Ie extends ce{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(e,t,a){a=Object.assign({"account-id":e,"financial-statement-id":t},a),this._generateGetService(this._getService("get",{},a),this.constructor.GET_EVENTS,a.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountFinancialStatement`,this._getBgadp(i))}_getBgadp(e){return{getAccountFinancialStatementV0:()=>new Se(e),default:()=>"BGADP does not exist."}}}i(Ie,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(Ie.is,Ie);class ke extends ce{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountFinancialStatements`,this._getBgadp(i))}_getBgadp(e){return{getAccountFinancialStatementsV0:()=>new Te(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}i(ke,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define(ke.is,ke);class qe extends ce{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}AccountRelatedContracts`,this._getBgadp(i))}_getBgadp(e){return{getAccountRelatedContractsV2:()=>new B(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(qe,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(qe.is,qe);class Me{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|t,n=Math.max(s>=0?s:i-Math.abs(s),0);for(;n<i;){if((r=a[n])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;n++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,s="",n=0,r=arguments.length;n!==r;++n){var o=+arguments[n];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(s+=e.apply(null,a),a.length=0)}return s+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class He extends Me{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const je=0,Be=1,Le="jwt",Fe="tsec",Ve="none";class Ge extends Me{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=je,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new He,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Fe:this.requiredToken=Ve,this.requiresJWT=!1):this.requiredToken===Fe?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Le?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Ve?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Fe)}_setJwtHandler(){this._setTokenHandler(Le)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=a),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===Be?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Fe,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Le,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===Le?"JWT ":"",s=e===Le?"Authorization":Fe;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[a].getItem(n);r?t[s]=t[s]||i+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],s=0,n=0;if(i<=127?(s=0,n=255&i):i<=223?(s=1,n=31&i):i<=239?(s=2,n=15&i):i<=244&&(s=3,n=7&i),e.length-a-s>0){let t=0;for(;t<s;)i=e[a+t+1],n=n<<6|63&i,t+=1}else n=65533,s=e.length-a;t+=String.fromCodePoint(n),a+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",s=a[e].split(i);t[s.shift().toLowerCase()]=s.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(s=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[i])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,s,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,a=r.authenticationdata||null,i=r.authenticationstate,s=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:a,state:i,challenge:s,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let s;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,a);s=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${e}`,this._buildSignatureHeaders(s,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:n,data:r,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(l),a=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,n,r,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,n,r,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),n=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(n),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,s,n){this._defineSignatureValue(t,a,i);const r={type:t,data:a,challenge:s,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,s,n){i?this._notifySignatureRequired(e,t,a,i,s,n):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,s,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,s):this._notifySignatureRequired(t,a,i,s,n,r)}}class Ue extends Ge{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class ze extends Ge{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Ke extends Ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`transfers/v${this.version}/currencies`)}toString(){return super.toString("BGADPTransfersCurrenciesGetV0")}}class We extends Ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`transfers/v${this.version}/interbank-transfers`)}toString(){return super.toString("BGADPInterbankTransfersGetV0")}}class Xe extends ze{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`transfers/v${this.version}/interbank-transfers`)}toString(){return super.toString("BGADPInterbankTransfersPostV0")}}class Je extends(e(t)){}class Ye extends Je{static get is(){return"bbva-global-interbank-transfers-base-api-dm"}resetInterbankTransfers(){this.interbankTransfers=[]}getInterbankTransfers(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postInterbankTransfers(e,t){this._generateGetService(this._getService("post",e,t),this.constructor.POST_EVENTS,this._responseMapping),this.resetInterbankTransfers()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}InterbankTransfers`,this._getBgadp(i))}_getBgadp(e){return{getInterbankTransfersV0:()=>new We(e),postInterbankTransfersV0:()=>new Xe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}i(Ye,"GET_EVENTS",{customEvent:"interbank-transfers-api-dm-fetch",paginationEvent:"interbank-transfers-api-dm-pagination",errorFireEventHandler:"interbank-transfers-api-dm-fetch-error"}),i(Ye,"POST_EVENTS",{customEvent:"interbank-transfers-api-dm-create",errorFireEventHandler:"interbank-transfers-api-dm-create-error"}),customElements.define(Ye.is,Ye);class Qe extends Je{static get is(){return"bbva-global-interbank-transfers-api-dm"}static get properties(){return{interbankTransfers:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.interbankTransfers=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}InterbankTransfers`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaInterbankTransfers${e}ApiDm`;(0,this._modules[e])().then((async e=>{const a=e[t].is;this._module=this._createModuleElement(a),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-interbank-transfers-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-interbank-transfers-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ye.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetInterbankTransfers(){await this.module.updateComplete,this.module.resetInterbankTransfers()}async getInterbankTransfers(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getInterbankTransfers(){await this.module.updateComplete,Object.keys(this.interbankTransfers).length||(this._requestParams.get.forEach((e=>{this.module.getInterbankTransfers(e.params)})),delete this._requestParams.get)}async postInterbankTransfers(e,t={}){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e,params:t}):this._requestParams={post:[{body:e,params:t}]}}async _postInterbankTransfers(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postInterbankTransfers(e.body,e.params)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return s` ${this._module?this._module:""}`}}class Ze extends Je{static get is(){return"bbva-global-currencies-base-api-dm"}resetCurrencies(){this.currencies=[]}getCurrencies(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Currencies`,this._getBgadp(i))}_getBgadp(e){return{getCurrenciesV0:()=>new Ke(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}i(Ze,"GET_EVENTS",{customEvent:"currencies-api-dm-fetch",errorFireEventHandler:"currencies-api-dm-fetch-error",paginationEvent:"currencies-api-dm-pagination"}),customElements.define(Ze.is,Ze);var et=u`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .container-amount-info {
    display: flex;
    justify-content: space-between;
  }

  .radio-item-list-title {
    padding: 1rem;
  }

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }

  .content-card {
    display: flex;
    justify-content: center;
  }

  .notification-step1 {
    margin: 1rem 0 1.5rem;
  }

  .container {
    padding: 0.5rem;
  }

  .card-summary-to-pay {
    margin-right: 0.5rem;
  }

  [data-tag-name='bbva-form-radio-button'] {
    padding-bottom: 1rem;
  }

  [slot='right'] {
    padding: 0.5rem;
  }

  .account-to-pay {
    padding: 1rem 0;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-bottom: 0;
    --bbva-transition-container-text-align: normal;
  }

  .confirm-step {
    width: 100%;
    padding: 1rem;
  }
  .confirm-step > [data-tag-name='bbva-type-amount'] {
    padding-bottom: 1rem;
  }

  [data-tag-name='bbva-button-default'][name='continue-button'] {
    margin-top: 1rem;
  }
`;class tt extends(S(E(A(p(t))))){static get is(){return"promotions-advance-payment-select-amount"}static get scopedElements(){const e=[R,J,C,P,Q,...tt.configurationScopedElements()];return tt.scopedElementsFromClasses(e)}static get properties(){return{_paymentTypesArray:{type:Array},loading:{type:Boolean},selectedAmountType:{type:Object,attribute:"selected-amount-type"},_invalidAmount:{type:Boolean},_showOtherAmountDetail:{type:Boolean},_disabledButton:{type:Boolean},_errorMessage:{type:String},advancedPromotionSelected:{type:Object,attribute:"advanced-promotion-selected"},currency:{type:String},cardResponse:{type:Object,attribute:"card-response"},accountSelected:{type:Object},maxLengthAmount:{type:Number,attribute:"max-length-amount"},_checkedAmount:{type:Boolean}}}static get styles(){return[x.primaryAlt,Y.primaryAlt,O.primaryAlt,Z.primaryAlt,et]}constructor(){super(),this.currency="",this._errorMessage="",this.selectedAmountType="",this._disabledButton=!0,this._invalidAmount=!1,this._showOtherAmountDetail=!1,this.advancedPromotionSelected={},this.accountSelected={},this.maxLengthAmount="",this.cardResponse={},this.loading=!1,this._checkedAmount=!1,this._paymentTypesArray=[{radioTitle:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-monthly-payment-title"),radioDescription:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-monthly-payment-description"),value:"monthlyAmount"},{radioTitle:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-total-payment-title"),radioDescription:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-total-payment-description"),value:"totalAmount"},{radioTitle:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-other-payment-title"),radioDescription:this.t("card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-other-payment-description"),value:"otherAmount"}]}firstUpdated(){super.firstUpdated(),this._resetValues()}update(e){super.update(e),e.has("resetStep")&&!this.resetStep&&(this._resetValues(),this._setValues()),e.has("loading")&&this._renderLoaders()}_setValues(){this._showOtherAmountDetail=!1,this._invalidAmount=!1}_resetValues(){this.selectedAmountType={},this._invalidAmount=!1,this._errorMessage=""}_vallidateAmount(e){var t;this._disabledButton=!0,this._invalidAmount=!0;const a=null===(t=this.advancedPromotionSelected.totalAmount)||void 0===t?void 0:t.amount;e>this.accountSelected.amount?this._errorMessage=`${this.t("card-transaction-promotions-advanced-payment-select-amount-payment-input-error-insufficient-amount-message",{maxAmount:this._amountFormatted(this.accountSelected.amount)})}`:e>a?this._errorMessage=`${this.t("card-transaction-promotions-advanced-payment-select-amount-payment-input-error-message",{maxAmount:this._amountFormatted(a)})}`:0===e?this._errorMessage="card-transaction-promotions-advanced-payment-select-amount-payment-input-warning-message":(this._invalidAmount=!1,this._disabledButton=!1)}_inputChangesAmount(e){var t,a;this._showOtherAmountDetail&&(""===(null===(t=e.detail)||void 0===t?void 0:t.value)?(this._invalidAmount=!1,this._disabledButton=!0):(this._vallidateAmount(null===(a=e.detail)||void 0===a?void 0:a.amount),this._handlePost(e)))}_handlePost(e){var t;this.selectedAmountType={paymentType:"otherAmount",amount:(null===(t=e.detail)||void 0===t?void 0:t.amount)||"",currency:this.currency}}manageAmountSelection(e){var t,a;e&&e.value&&this.advancedPromotionSelected[e.value]?(this._showOtherAmountDetail=!1,this.selectedAmountType={paymentType:e.value,amount:null===(t=this.advancedPromotionSelected[e.value])||void 0===t?void 0:t.amount,currency:null===(a=this.advancedPromotionSelected[e.value])||void 0===a?void 0:a.currency},this._disabledButton=!1):this._disabledButton=!0}_onChangeFormRadio(e){var t;"otherAmount"===(null===(t=e.target)||void 0===t?void 0:t.value)&&(this._showOtherAmountDetail=!0),this.manageAmountSelection(e.target)}get _renderPaymentAmountsList(){return Object.keys(this.advancedPromotionSelected).length>0?this._paymentTypesArray.map((({radioTitle:e,radioDescription:t,value:a},i)=>{let n=this.advancedPromotionSelected[a];return n||(n={amount:""}),s`
            <bbva-form-radio-button
              divider=${i===this._paymentTypesArray.length-1?"":"full"}
              name="amounts"
              value=${a}
              ?checked=${this._checkedAmount}
              ?indeterminate=${this._checkedAmount}
              label-medium
              info-message=${t}
              @change=${this._onChangeFormRadio}
            >
              <div class="container-amount-info">
                <bbva-type-text
                  tag="span"
                  text="${e}"
                  font-weight="${h.fontWeight40}"
                  alignment="left"
                >
                </bbva-type-text>
                ${"otherAmount"!==a?s`
                      <bbva-type-amount
                        variant="M"
                        amount=${n.amount}
                        currency-code="${this.currency}"
                        local-currency="${this.currency}"
                        language=${this.language}
                      >
                      </bbva-type-amount>
                    `:m}
              </div>
            </bbva-form-radio-button>
          `})):m}get _renderDifferentAmountDetail(){return s`
      <div ?hidden=${!this._showOtherAmountDetail}>
        <bbva-form-input
          ambient="primary-alt"
          type="amount"
          currency-code="${this.currency}"
          local-currency="${this.currency}"
          language="${this.language}"
          maxlength="${this.maxLengthAmount}"
          label="card-transaction-promotions-advanced-payment-select-amount-payment-input-label"
          label-out="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-select-amount-type-other-amount-instruction"
          info-message="${this._invalidAmount?"":`${this.t("card-transaction-promotions-advanced-payment-select-amount-payment-input-info-message")}`}"
          ?invalid=${this._invalidAmount}
          error-message="${this._errorMessage}"
          @form-amount-input-change=${this._inputChangesAmount}
          ?reset-value=${!this._showOtherAmountDetail}
        >
        </bbva-form-input>
      </div>
    `}get _renderAmountsList(){return s`
      <div class="radio-item-list">
        <bbva-type-text
          class="radio-item-list-title"
          tag="span"
          text="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-select-amount-type-instruction")}"
        >
        </bbva-type-text>
        ${this._renderPaymentAmountsList}
      </div>
    `}_onClickButtonDefault(){var e,t;this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-origin-account-send-data",{applicationTypology:this.advancedPromotionSelected.name,cardData:{productName:null===(e=this.cardResponse)||void 0===e?void 0:e.productName,amount:null===(t=this.cardResponse)||void 0===t?void 0:t.actualDebt,currency:this.currency}}),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-payment-amount-type-select",this.selectedAmountType),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-payment-value-change"),this._dispatchCustomEvent("complete"),this._checkedAmount=!this._checkedAmount,this._disabledButton=!0,this._showOtherAmountDetail=!1}get _renderButtonContinue(){return s`
      <bbva-button-default
        name="continue-button"
        variant="primary"
        fullwidth=""
        text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-continue-button-label"
        ?disabled="${this._disabledButton}"
        @click="${this._onClickButtonDefault}"
      >
      </bbva-button-default>
    `}_amountFormatted(e){return g(e,{currencyCode:this.currency,localCurrency:this.currency,language:this.language,decimalDigits:2})}_renderLoaders(){return this.loading?s`
          <div class="loader-wrapper">
            <div class="loader">
              <div class="skeleton"></div>
            </div>
            <bbva-divider></bbva-divider>
          </div>
        `:m}render(){return s`
      ${super.render()} ${this._renderAmountsList} ${this._renderDifferentAmountDetail}
      ${this._renderButtonContinue}
    `}}var at=u`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .accounts-list {
    padding-bottom: 0.5rem;
    display: flex;
    flex-direction: column;
    margin-bottom: 1.25rem;
  }
  .accounts-list [data-tag-name='bbva-notification-help'] {
    margin: 1rem;
  }

  .account-item-top {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-top: 1rem;
  }

  .account-item-bottom {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-bottom: 0.5rem;
  }

  .description-text {
    padding-bottom: 0.5rem;
  }

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }

  .content-card {
    display: flex;
    justify-content: center;
  }

  .notification-step1 {
    margin: 1rem 0 1.5rem;
  }

  .container {
    padding: 0.5rem;
  }

  .card-summary-to-pay {
    margin-right: 0.5rem;
  }

  [data-tag-name='bbva-form-radio-button'] {
    padding-bottom: 1rem;
  }

  [slot='right'] {
    padding: 0.5rem;
  }

  .account-to-pay {
    padding: 1rem 0;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-bottom: 0;
    --bbva-transition-container-text-align: normal;
  }

  .confirm-step {
    width: 100%;
    padding: 1rem;
  }
  .confirm-step > [data-tag-name='bbva-type-amount'] {
    padding-bottom: 1rem;
  }

  .subheader-aling-items {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-top: 1rem;
    margin-bottom: 1rem;
  }
`;class it extends(S(E(A(p(t))))){static get is(){return"promotions-advance-payment-select-account"}static get scopedElements(){const e=[R,C,w,$,ee,N,D,I,...it.configurationScopedElements()];return it.scopedElementsFromClasses(e)}static get properties(){return{amountPaymentSelected:{type:Object,attribute:"amount-payment-selected"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},_enableSelectAccountContinue:{type:Boolean},updateAccountSelected:{type:Boolean,attribute:"update-account-selected"},accountsErrorVisible:{type:Boolean,attribute:"accounts-error-visible"},accountsResponse:{type:Array,attribute:"accounts-response"},payment:{type:Object},validateAmountPay:{type:Object},_showModalAllAccounts:{type:Boolean},accountsInitView:{type:Number}}}constructor(){super(),this.accountsErrorVisible=!1,this.accountsResponse=[],this._cachedAccountsResponse=null,this.isRetry=!1,this.currency="",this.language="",this.disabledTabindex=!1,this._enableSelectAccountContinue=!1,this.payment={},this.updateAccountSelected=!1,this.validateAmountPay={},this._showModalAllAccounts=!1,this.accountsInitView=3}static get styles(){return[at]}_selectOriginAccountDispatch(e,t){this._showModalAllAccounts=!1;const{productName:a,amount:i,currency:s,number:n,id:r}=t,o={productName:a,amount:i,currency:s,number:n,id:r};this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-origin-account-select",o),this._dispatchCustomEvent("complete"),this.updateAccountSelected=!0}get _renderAccountsError(){return this.accountsErrorVisible?s`
          <bbva-notification-message
            variant="error"
            id="notification-message"
            book-title="true"
            message-title="${this.t("finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error")}"
            link-title="${this.t("finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-retry")}"
            @notification-message-link-click="${this._retryError}"
          >
          </bbva-notification-message>
        `:m}get _renderAfterRetryThreeTimes(){return this.accountsErrorVisible?s`
          <bbva-notification-message
            variant="error"
            book-title="true"
            message-title=${this.t("finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-after-retry")}
            link-title=${this.t("finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-after-retry-exit")}
            @notification-message-link-click="${this._retryError}"
          >
          </bbva-notification-message>
        `:m}_renderErrorInsufficientBalance(e){var t;return(null===(t=this.payment)||void 0===t?void 0:t.amount)>(null==e?void 0:e.amount)?s`
          <bbva-notification-help
            ambient="primary-alt"
            accessibility-label-icon="Alert"
            variant="alert"
            icon="${y()}"
            text="${this.t("card-transaction-promotions-advanced-payment-select-origin-account-step-insufficient-funds-error")}"
          >
          </bbva-notification-help>
        `:m}_renderAccountsList(){return this.accountsResponse.map(((e,t)=>{if(t<this.accountsInitView){const t=parseFloat(null==e?void 0:e.amount)<this.validateAmountPay;return s`
          <div class="accounts-list">
            <div class="account-item-top">
              <bbva-type-link
                id="selectedAccountLink"
                ambient="primary-alt"
                size="XS"
                text="${null==e?void 0:e.productName}"
                @click=${t=>this._selectOriginAccountDispatch(t,e)}
                ?disabled=${t}
              ></bbva-type-link>
              <bbva-type-amount
                ambient="primary-alt"
                type="bold"
                amount="${null==e?void 0:e.amount}"
                currency-code="${null==e?void 0:e.currency}"
                local-currency="${null==e?void 0:e.currency}"
                language="${this.language}"
                ?disabled=${t}
              ></bbva-type-amount>
            </div>
            <div class="account-item-bottom">
              <bbva-badge-reference
                ambient="primary-alt"
                number="${null==e?void 0:e.number}"
                ?disabled=${t}
              >
              </bbva-badge-reference>
              <bbva-type-text
                ambient="primary-alt"
                text="card-transaction-promotions-advanced-payment-select-origin-account-step-avaliable-balance-text"
                tag="span"
                ?disabled=${t}
              >
              </bbva-type-text>
            </div>
            ${this._renderErrorInsufficientBalance(e)}
            <bbva-divider-default size="full"></bbva-divider-default>
          </div>
        `}return""}))}_renderLoaders(){return this.loading?s`
          <div class="loader-wrapper">
            <div class="loader">
              <div class="skeleton"></div>
            </div>
            <bbva-divider></bbva-divider>
          </div>
        `:m}get _accountAllAdvancePayment(){return s`
      <bbva-help-modal
        id="accountsModal"
        two-slots
        full-height
        sticky-footer
        hide-content-padding-top
        header-text="card-transaction-promotions-advanced-payment-select-origin-account-step-subtitle"
        ?visible=${this._showModalAllAccounts}
        @header-main-icon-click=${e=>{e.stopPropagation()}}
        @help-modal-close=${()=>{this._showModalAllAccounts=!1,this.accountsInitView=3}}
      >
        <div slot="slot-content">${this._renderAccountsList()}</div>
      </bbva-help-modal>
    `}_showMoreAccounts(e){this._showModalAllAccounts=e,this.accountsInitView=this.accountsResponse.length}render(){return s`
      <div class="content">
        <bbva-type-text
          inherit
          ambient="primary-alt"
          tag="span"
          class="description-text"
          text="card-transaction-promotions-advanced-payment-select-origin-account-step-description-text"
        >
        </bbva-type-text>
        <div class="subheader-aling-items">
          <bbva-type-text
            inherit
            text="card-transaction-promotions-advanced-payment-select-origin-account-step-subtitle"
            font-weight="${h.fontWeight40}"
            ambient-color="secondary500"
          >
          </bbva-type-text>
          <bbva-type-link
            id="showMoreAccounts"
            ambient="primary-alt"
            size="XS"
            text="card-transaction-promotions-advanced-payment-select-origin-all-account"
            @click=${()=>this._showMoreAccounts(!0)}
            ?disabled=${!1}
          ></bbva-type-link>
        </div>
        ${this._accountAllAdvancePayment} ${this._renderAccountsList()}
        ${this.isRetry?this._renderAccountsError:this._renderAfterRetryThreeTimes}
        ${this._renderLoaders()}
      </div>
    `}}var st=u`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .promotion-item {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-top: 1rem;
  }

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }

  .content-card {
    display: flex;
    justify-content: center;
  }

  .notification-step1 {
    margin: 1rem 0 1.5rem;
  }

  .container {
    padding: 0.5rem;
  }

  .card-summary-to-pay {
    margin-right: 0.5rem;
  }

  [data-tag-name='bbva-form-radio-button'] {
    padding-bottom: 1rem;
  }

  [slot='right'] {
    padding: 0.5rem;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  [slot='right'] > [data-tag-name='bbva-type-text'] {
    width: 50%;
  }

  .account-to-pay {
    padding: 1rem 0;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-bottom: 0;
    --bbva-transition-container-text-align: normal;
  }

  .form-container {
    padding-bottom: 2rem;
  }

  .radiobutton-content {
    display: flex;
    justify-content: space-between;
  }

  .radiobutton-title {
    flex-grow: 1;
    flex-shrink: 1;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    padding-right: 0.5rem;
  }

  .radiobutton-amount {
    flex-shrink: 0;
  }

  .confirm-step {
    width: 100%;
    padding: 1rem;
  }
  .confirm-step > [data-tag-name='bbva-type-amount'] {
    padding-bottom: 1rem;
  }

  [data-tag-name='bbva-form-control-input'] {
    --bbva-form-control-input-container-align: center;
  }
`;class nt extends(_(S(E(A(p(t)))))){static get is(){return"promotions-advance-payment-select-promotion"}static get scopedElements(){const e=[R,C,w,P,ae,ie,...nt.configurationScopedElements()];return nt.scopedElementsFromClasses(e)}static get properties(){return{responsePromotions:{type:Array,attribute:"response-promotions"},selectedPromotionType:{type:String,attribute:"selected-promotion-type"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},oldValue:{type:String,attribute:"old-value"},resetStep:{type:Boolean,attribute:"reset-step"},_disabledButton:{type:Boolean},_cachedPromotionTypes:{type:Array},detailPromoSelected:{type:Object,attribute:"detail-promo-selected"},cardResponse:{type:Object,attribute:"card-response"}}}static get styles(){return[se.primaryAlt,x.primaryAlt,O.primaryAlt,k.primary,st]}constructor(){super(),this.currency="",this.language="",this.disabledTabindex=!1,this.selectedPromotionType="",this.oldValue="",this._disabledButton=!1,this.responsePromotions=[],this._cachedPromotionTypes=[],this.detailPromoSelected={},this.cardResponse={}}update(e){super.update(e),e.has("responsePromotions")&&(this._cachedPromotionTypes=[])}dispatchEvents(){var e,t,a,i;const s=this.promotionTypes();this.detailPromoSelected={id:this.selectedPromotionType,name:s.find((e=>e.id===this.selectedPromotionType)).name,amount:s.find((e=>e.id===this.selectedPromotionType)).amount,currency:s.find((e=>e.id===this.selectedPromotionType)).currency},this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-promotion-response-send-data",{applicationStep:this.detailPromoSelected.name,cardData:{productName:null===(e=this.cardResponse)||void 0===e?void 0:e.productName,amount:null===(t=this.cardResponse)||void 0===t?void 0:t.actualDebt,currency:this.currency}}),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-promotion-typology-send-data",{applicationTypology:this.detailPromoSelected.name,cardData:{productName:null===(a=this.cardResponse)||void 0===a?void 0:a.productName,amount:null===(i=this.cardResponse)||void 0===i?void 0:i.actualDebt,currency:this.currency}}),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-advance-promotion-type-select-complete",this.detailPromoSelected),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-value-promos-change"),this._dispatchCustomEvent("complete"),this.oldValue=this.selectedPromotionType}promotionTypes(){const e=this.responsePromotions;return this._cachedPromotionTypes&&this._cachedPromotionTypes.length===e.length&&!this._cachedPromotionTypes.some(((t,a)=>t.id!==e[a].id))||(this._cachedPromotionTypes=e.map((e=>{var t,a;return{id:e.id,name:e.name.trim(),amount:(null==e||null===(t=e.totalAmount)||void 0===t?void 0:t.amount)??0,currency:(null==e||null===(a=e.totalAmount)||void 0===a?void 0:a.currency)??this.currency}}))),this._cachedPromotionTypes}get _renderPromotionTypesList(){const e=this.promotionTypes();return e.length>0?e.map((e=>s`
            <bbva-form-control-input
              slot="_option"
              alignment="right"
              type="radio"
              name="custom"
              value="${e.id}"
            >
              <div slot="right">
                <bbva-type-text
                  tag="span"
                  font-weight="500"
                  ellipsis
                  ambient="${this.ambient}"
                  text="${e.name}"
                ></bbva-type-text>
                <bbva-type-amount
                  amount="${e.amount}"
                  ambient="${this.ambient}"
                  currency-code="${e.currency}"
                  local-currency="${e.currency}"
                  language="${this.language}"
                ></bbva-type-amount>
              </div>
            </bbva-form-control-input>
          `)):m}_radioChangeEventHandler(e){null!=e&&e.value?(this.selectedPromotionType=e.value,this._disabledButton=!0):this._disabledButton=!1}get _renderPromotionsList(){return s`
      <bbva-type-text
        tag="span"
        text="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-promotions-advance-payment-select-promotion-instruction")}"
      ></bbva-type-text>

      <bbva-form-container
        divider-size="full"
        label-out=""
        show-help-icon=""
        error-text="Information text"
        error-accessibility-text="Error icon"
        @form-container-radio-change=${({detail:e})=>this._radioChangeEventHandler(e)}
      >
        ${this._renderPromotionTypesList}
      </bbva-form-container>

      <bbva-notification-message
        id="button1"
        message-title="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-promotions-advance-payment-select-promotion-description")}"
        book-title=""
        class="notification-step1"
      ></bbva-notification-message>

      <bbva-button-default
        tabindex=${this.disabledTabindex?"-1":"0"}
        variant="primary"
        fullwidth=""
        ?disabled=${!this._disabledButton}
        text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-continue-button-label"
        @click=${this.dispatchEvents}
      >
      </bbva-button-default>
    `}render(){return s` ${super.render()} ${this._renderPromotionsList}`}}const rt={PROMOTION_PAYMENT:"card-transaction-servicing-cc-promotions-advanced-payments-success-advance-payments-detail-operation-type"},ot={monthlyAmount:"card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-monthly-payment-title",totalAmount:"card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-total-payment-title",otherAmount:"card-transaction-promotions-advanced-payment-select-amount-payment-type-step-radio-button-other-payment-title"};var ct=u`
  :host {
    display: block;
    box-sizing: border-box;
  }

  [data-tag-name='bbva-header-category'] {
    padding-left: 0;
  }

  .panel-button-amounts,
  .panel-button {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    padding-bottom: 0.5rem;
  }

  .panel-button {
    gap: 1rem;
  }

  .description-help-info {
    padding-left: 0;
    padding-right: 0;
  }

  .description-message {
    margin: 1rem;
  }

  .list-item {
    display: flex;
    justify-content: space-between;
    flex-wrap: nowrap;
    padding: 0.5rem;
    gap: 0.5rem;
  }

  .taxes-info-bottom {
    padding: 0;
  }

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }

  .summary-amount-container {
    padding: 1rem;
  }
`;class dt extends(_(A(p(t)))){static get is(){return"promotions-advance-payment-select-amount-summary"}static get scopedElements(){const e=[R,C];return dt.scopedElementsFromClasses(e)}static get properties(){return{selectedOption:{type:Object,attribute:"selected-option"},currency:{type:String},editPay:{type:Boolean,attribute:"edit-pay"}}}constructor(){super(),this.currency="",this.language="",this.selectedOption={},this.editPay=!1}static get styles(){return[k.secondary,O.secondary,ct,b("amount-to-pay-step-summary-shared-styles")]}render(){return this.selectedOption&&Object.keys(this.selectedOption).length>0?s`
          <div class="content-text">
            <bbva-type-text
              ambient="secondary"
              tag="span"
              text="${this.t(ot[this.selectedOption.paymentType])}"
            ></bbva-type-text>
            <bbva-type-amount
              tag="span"
              variant="M"
              amount=${this.selectedOption.amount}
              currency-code=${this.currency}
              local-currency=${this.currency}
              language="${this.language}"
              ambient="secondary"
              decimal-digits="2"
            >
            </bbva-type-amount>
          </div>
        `:m}}var lt=u`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.account-list-container {
  padding-bottom: 0.5rem;
}

.account-list-item-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.account-list-item-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
`;class ut extends(_(S(A(p(t))))){static get is(){return"promotions-advance-payment-select-account-summary"}static get scopedElements(){const e=[ee,C,R,...ut.configurationScopedElements()];return ut.scopedElementsFromClasses(e)}static get properties(){return{language:{type:String},selectedValues:{type:Object,attribute:"selected-values"},accountUpdated:{type:Boolean,attribute:"account-updated"}}}constructor(){super(),this.language="",this.selectedValues={},this.accountUpdated=!1}static get styles(){return[lt,b("promotions-advance-payment-select-account-summary")]}_accountSummary({productName:e,amount:t,currency:a,number:i}){return s`
      <div class="account-list-container">
        <div class="account-list-item-top">
          <bbva-type-text
            font-weight="500"
            text="${e}"
            size="L"
            tag="span"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="secondary"
            type="bold"
            amount="${t}"
            currency-code="${a}"
            local-currency="${a}"
            language="${this.language}"
          ></bbva-type-amount>
        </div>
        <div class="account-list-item-bottom">
          <bbva-badge-reference number="${i}"></bbva-badge-reference>
          <bbva-type-text
            text="${this.t("card-transaction-promotions-advanced-payment-select-origin-account-step-summary-avaliable-balance-text")}"
            tag="span"
          ></bbva-type-text>
        </div>
      </div>
    `}get _renderSummaryContent(){return s` <div>${this._accountSummary(this.selectedValues)}</div> `}render(){return s` ${this._renderSummaryContent} `}}var pt=u`
  :host {
    display: block;
    box-sizing: border-box;
  }

  .promotions-selected-step-summary {
    padding-left: 1rem;
  }

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }
`;class ht extends(_(A(p(t)))){static get is(){return"promotions-advance-payment-select-promotion-summary"}static get scopedElements(){const e=[R,C];return ht.scopedElementsFromClasses(e)}static get properties(){return{selectedOption:{type:Object,attribute:"selected-option"},editPromotion:{type:Boolean,attribute:"edit-promotion"},language:{type:String}}}constructor(){super(),this.language="",this.selectedOption={},this.editPromotion=!1}static get styles(){return[pt,k.secondary,O.secondary,b("promotions-advance-payment-select-promotion-shared-styles")]}render(){return Object.keys(this.selectedOption).length>0?s`
          <div class="content-text">
            <bbva-type-text
              ambient="${this.ambient}"
              tag="span"
              text=${this.selectedOption.name}
            ></bbva-type-text>
            <bbva-type-amount
              tag="span"
              variant="M"
              amount=${this.selectedOption.totalAmount.amount}
              currency-code=${this.selectedOption.totalAmount.currency}
              local-currency=${this.selectedOption.totalAmount.currency}
              language=${this.language}
              ambient="${this.ambient}"
              decimal-digits="2"
            >
            </bbva-type-amount>
          </div>
        `:m}}var mt=u`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.content-text {
  display: flex;
  justify-content: space-between;
  align-items: baseline;
  align-self: stretch;
}

.content-card {
  display: flex;
  justify-content: center;
}

.card-summary-to-pay {
  margin-right: 0.5rem;
}
`;class gt extends(_(A(p(t)))){static get is(){return"promotions-advance-payment-select-card-summary"}static get scopedElements(){const e=[R,C,re,ee];return gt.scopedElementsFromClasses(e)}static get properties(){return{currency:{type:String},cardResponse:{type:Object,atribute:"card-response"}}}constructor(){super(),this.currency="",this.language="",this.ambient="",this.cardResponse={}}static get styles(){return[mt,k.secondary,O.secondary,ne.secondary,te.secondary,b("promotions-advance-payment-select-card-summary-shared-styles")]}render(){return s`
      <div class="content-text">
        <bbva-type-text
          inherit
          font-weight="500"
          size="M"
          text="${this.cardResponse.cardName}"
          ambient="${this.ambient}"
        >
        </bbva-type-text>
        <bbva-type-amount
          type="bold"
          variant="l"
          amount="${this.cardResponse.actualDebt}"
          currency-code="${this.cardResponse.currencyActualDebt}"
          local-currency="${this.cardResponse.currencyActualDebt}"
          language="${this.language}"
          ambient="${this.ambient}"
        >
        </bbva-type-amount>
      </div>
      <div class="content-text">
        <div class="content-card">
          <bbva-clip-card
            class="card-summary-to-pay"
            card-type="${this.cardResponse.brandAssociation}"
            card-image="${this.cardResponse.images}"
            size="xs"
            ambient="${this.ambient}"
          >
          </bbva-clip-card>
          <bbva-badge-reference
            inherit
            number="${this.cardResponse.cardNumber}"
            ambient="${this.ambient}"
          >
          </bbva-badge-reference>
        </div>
        <bbva-type-text
          inherit
          text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-actual-debt"
          ambient="${this.ambient}"
        >
        </bbva-type-text>
      </div>
      <div class="content-text">
        <bbva-type-text
          text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-cut-off-amount"
          size="S"
          ambient="${this.ambient}"
        >
        </bbva-type-text>
        <bbva-type-amount
          variant="M"
          amount="${this.cardResponse.balanceAtCutOff}"
          currency-code="${this.cardResponse.currencyBalanceAtCutOff}"
          local-currency="${this.cardResponse.currencyBalanceAtCutOff}"
          language="${this.language}"
          ambient="${this.ambient}"
        >
        </bbva-type-amount>
      </div>
      <div class="content-text">
        <bbva-type-text
          inherit
          text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-cut-off-date"
          size="S"
          ambient="${this.ambient}"
        >
        </bbva-type-text>
        <bbva-type-text
          text="${this.cardResponse.nextPaymentDay}"
          size="S"
          ambient="${this.ambient}"
        >
        </bbva-type-text>
      </div>
    `}}var yt=u`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.content-text {
  display: flex;
  justify-content: space-between;
  align-items: baseline;
  align-self: stretch;
}

.notification-step1 {
  margin: 1rem 0 1.5rem;
}

.container {
  padding: 0.5rem;
}

[data-tag-name=bbva-form-radio-button] {
  padding-bottom: 1rem;
}

[slot=right] {
  padding: 0.5rem;
}

.account-to-pay {
  padding: 1rem 0;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-bottom: 0;
  --bbva-transition-container-text-align: normal;
}

.confirm-step {
  background-color: white;
  width: 100%;
  padding: 1rem;
}
.confirm-step > [data-tag-name=bbva-type-amount] {
  padding-bottom: 1rem;
}
`;class _t extends(_(S(E(A(p(t)))))){static get is(){return"promotion-advance-payment-multistep"}static get scopedElements(){const e=[R,C,P,z,K,W,X,tt,it,nt,dt,ut,ht,gt,..._t.configurationScopedElements()];return _t.scopedElementsFromClasses(e)}static get properties(){return{flagToResetAdvancePromotions:{type:Boolean,attribute:"flag-to-reset-advance-promotions"},isCompletedAccountStep:{type:Boolean,attribute:"is-completed-account-step"},isCompleteSelectPromotion:{type:Boolean,attribute:"is-complete-select-promotion"},isCompleteSelectAmountPayment:{type:Boolean,attribute:"is-complete-select-amount-payment"},_disabledAmountToPayTabindex:{type:Boolean,state:!0},_disabledSelectedPromotionsTabindex:{type:Boolean,state:!0},_disabledSelectedAccountTabindex:{type:Boolean,state:!0},responsePromotions:{type:Array},changeValuePromos:{type:Boolean,attribute:"change-value-promos"},changeValuePayStep:{type:Boolean,attribute:"change-value-pay-step"},changeAccountSelected:{type:Boolean,attribute:"change-account-selected"},selectedAmountTypeOption:{type:Object},selectedOriginAccountDetail:{type:Object,attribute:"selected-origin-account-detail"},currency:{type:String},otherAmountVersionFlag:{type:Boolean,attribute:"other-amount-version-flag"},cardResponse:{type:Object,attribute:"card-response"},maxLengthAmount:{type:Number,attribute:"max-length-amount"}}}static get styles(){return[yt,b("promotion-advance-payment-multistep-styles")]}constructor(){super(),this.selectedAmountTypeOption={},this.accountsResponse=[],this.flagToResetAdvancePromotions=!1,this.currency="",this.isCompleteSelectPromotion=!1,this.isCompleteSelectAmountPayment=!1,this.isCompletedAccountStep=!1,this.otherAmountVersionFlag=!1,this.selectedPromotionDetail={},this.selectedOriginAccountDetail={},this.totalPay={},this.responsePromotions=[],this.maxLengthAmount="",this.cardResponse={},this.selectedOption={},this.advancedPromotionSelected={},this.ambient="secondary",this._disabledAmountToPayTabindex=!1,this._disabledSelectedPromotionsTabindex=!1,this._disabledSelectedAccountTabindex=!1,this.changeValuePromos=!1,this.changeValuePayStep=!1,this.changeAccountSelected=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._handleHeaderBack()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeHeaderBack()}_handleHeaderBack(){this.addEventListener("header-main-icon-click",(()=>{this._modalExitOperative()}))}_removeHeaderBack(){this.removeEventListener("header-main-icon-click",this._modalExitOperative.bind(this),!0)}_completeSelectPromotionStep(e){var t,a;this.selectedPromotionDetail=null===(t=e.detail)||void 0===t?void 0:t.id,this.isCompleteSelectPromotion=!0,this.advancedPromotionSelected=this.responsePromotions.find((e=>e.id===this.selectedPromotionDetail)),this.changeValuePromos=!1,this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-execute-specific-amount-custom-event",null===(a=this.advancedPromotionSelected)||void 0===a?void 0:a.id)}_completeSelectAmountTypeStep(e){var t;this.changeValuePayStep=!1,this.selectedAmountTypeOption={...e.detail},this.totalPay={amount:null==e||null===(t=e.detail)||void 0===t?void 0:t.amount,currency:this.currency},this.paymentType=e.detail.paymentType,"otherAmount"===this.paymentType?this.otherAmountVersionFlag=!0:this.otherAmountVersionFlag=!1,this.isCompleteSelectAmountPayment=!0,this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-execute-accounts-service",!0)}_completeSelectOriginAccountStep(e){var t,a;this.isCompletedAccountStep=!0,this.selectedOriginAccountDetail={...e.detail},this.changeAccountSelected=!0,this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-final-step-resume-send-data",{productName:this.selectedOriginAccountDetail.productName,totalAmount:this.totalPay.amount,currency:this.selectedOriginAccountDetail.currency,applicationTypology:this.advancedPromotionSelected.name,cardData:{productName:null===(t=this.cardResponse)||void 0===t?void 0:t.productName,amount:null===(a=this.cardResponse)||void 0===a?void 0:a.actualDebt,currency:this.currency}})}_modalExitOperative(){0!==this.selectedAmount||this.validateExitFromMonthlyStep?this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-reset-advance-payments"):this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-exit-advance-payments")}_openSuccessModalDispatch(){const e={account:this.selectedOriginAccountDetail,settleOtherAmountFlag:this.otherAmountVersionFlag,promotionDetail:this.advancedPromotionSelected,paymentDetail:this.selectedAmountTypeOption,paymentType:this.paymentType};this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-open-success-modal",e)}get _renderAccountInfoStep(){return s`
      <bbva-expandable-step
        id="account-info-step"
        header="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-card-to-pay")}"
        prefilled
        view-label
        class="animation"
        tag="span"
        ambient="${this.ambient}"
      >
        ${this._renderAccountInfoStepCollapsed}>
      </bbva-expandable-step>
    `}get _renderAccountInfoStepCollapsed(){return s`
      <div class="summary" slot="summary">
        <promotions-advance-payment-select-card-summary
          ambient="${this.ambient}"
          currency="${this.currency}"
          language=${this.language}
          .cardResponse=${this.cardResponse}
        >
        </promotions-advance-payment-select-card-summary>
      </div>
    `}get _renderSelectPromotions(){return s`
      <div>
        <promotions-advance-payment-select-promotion
          ambient="primary"
          .disabledTabindex=${this._disabledSelectedPromotionsTabindex}
          .currency=${this.currency}
          .language=${this.language}
          .cardResponse=${this.cardResponse}
          .responsePromotions="${this.responsePromotions}"
          ?resetStep=${this.flagToResetAdvancePromotions}
          @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-value-promos-change=${this._changeStatus}
        ></promotions-advance-payment-select-promotion>
      </div>
      <div class="summary" slot="summary">
        <promotions-advance-payment-select-promotion-summary
          ambient="secondary"
          .editPromotion=${this.changeValuePromos}
          .selectedOption=${this.advancedPromotionSelected}
          .language=${this.language}
          .currency=${this.currency}
        >
        </promotions-advance-payment-select-promotion-summary>
      </div>
    `}_changeStatus(){this.changeValuePromos=!0,this.changeValuePayStep=!0,this.isCompleteSelectAmountPayment=!1,this.isCompletedAccountStep=!1}get _renderSelectPromotionsStep(){return s`
      <bbva-expandable-step
        show-link
        id="select-promotions-step"
        step="1"
        total-steps="3"
        ambient="${this.ambient}"
        current-step-label=${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-heading",{step:1,total:3})}
        header="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-header")}"
        edit-label="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-edit-label")}"
        @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-advance-promotion-type-select-complete=${this._completeSelectPromotionStep}
        ?completed=${this.isCompleteSelectPromotion}
      >
        ${this._renderSelectPromotions}
      </bbva-expandable-step>
    `}get _renderAmountToPayContent(){return Object.keys(this.advancedPromotionSelected).length>0?s`
          <div class="content">
            <promotions-advance-payment-select-amount
              ambient="primary-alt"
              .disabledTabindex=${this._disabledAmountToPayTabindex}
              .currency="${this.currency}"
              .language="${this.language}"
              .cardResponse="${this.cardResponse}"
              .advancedPromotionSelected="${this.advancedPromotionSelected}"
              .accountSelected="${this.selectedOriginAccountDetail}"
              max-length-amount="${this.maxLengthAmount}"
              @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-payment-value-change=${this._changeStatusPay}
            >
            </promotions-advance-payment-select-amount>
          </div>
          <div class="amount-summary" ambient="dark" slot="summary">
            <promotions-advance-payment-select-amount-summary
              .editPay=${this.changeValuePayStep}
              .selectedOption=${this.selectedAmountTypeOption}
              .language="${this.language}"
              .currency="${this.currency}"
            >
            </promotions-advance-payment-select-amount-summary>
          </div>
        `:m}_changeStatusPay(){this.changeValuePayStep=!0,this.isCompletedAccountStep=!1}get _renderAmountToPayStep(){return s`
      <bbva-expandable-step
        id="amount-to-pay-step"
        step="2"
        total-steps="3"
        class="animation"
        show-link
        ambient="${this.ambient}"
        current-step-label=${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-heading",{step:2,total:3})}
        header="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-amount")}"
        edit-label="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-edit-label")}"
        @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-payment-amount-type-select=${this._completeSelectAmountTypeStep}
        ?completed=${this.isCompleteSelectAmountPayment}
      >
        ${this._renderAmountToPayContent}
      </bbva-expandable-step>
    `}get _renderSelectAccountStepContent(){return s`
      <div class="content">
        <promotions-advance-payment-select-account
          ambient="light"
          .accountsResponse=${this.accountsResponse}
          .validateAmountPay=${this.selectedAmountTypeOption.amount}
          .payment=${this.totalPay}
          .disabledTabindex=${this._disabledSelectedAccountTabindex}
          .language=${this.language}
          .currency="${this.currency}"
        >
        </promotions-advance-payment-select-account>
      </div>
      <div class="summary" slot="summary">
        <promotions-advance-payment-select-account-summary
          language="${this.language}"
          .accountUpdated=${this.changeAccountSelected}
          .selectedValues=${this.selectedOriginAccountDetail}
        >
        </promotions-advance-payment-select-account-summary>
      </div>
    `}get _renderSelectAccountStep(){return s`
      <bbva-expandable-step
        id="select-account-step"
        step="2"
        total-steps="3"
        class="animation"
        show-link
        ambient="${this.ambient}"
        current-step-label=${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-heading",{step:3,total:3})}
        header="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-withdrawal-account")}"
        edit-label="${this.t("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-step-edit-label")}"
        @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-origin-account-select=${this._completeSelectOriginAccountStep}
        ?completed=${this.isCompletedAccountStep}
      >
        ${this._renderSelectAccountStepContent}
      </bbva-expandable-step>
    `}get _summaryButton(){return s`
      <div class="panel-summary">
        <div>
          <bbva-type-text
            text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-multistep-summary-payment-amount"
            tag="span"
            size="S"
            ambient="primary-alt"
          >
          </bbva-type-text>
          <bbva-type-amount
            type="bold"
            variant="3xl"
            amount="${this.totalPay.amount}"
            currency-code="${this.currency}"
            local-currency="${this.currency}"
            language="${this.language}"
            ambient="primary-alt"
          >
          </bbva-type-amount>
        </div>
        <bbva-button-default
          fullwidth=""
          variant="positive"
          text="card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-multistep-summary-confirm-button-text"
          class="button"
          @click=${this.summaryButtonHandleEvent}
          ambient="primary-alt"
        >
        </bbva-button-default>
      </div>
    `}_requesBody(){var e,t,a,i,s,n,r,o,c,d,l,u,p,h,m,g,y,_;return{concept:null===(e=this.advancedPromotionSelected)||void 0===e?void 0:e.name,sentMoney:[{amount:null===(t=this.totalPay)||void 0===t?void 0:t.amount,currency:null===(a=this.totalPay)||void 0===a?void 0:a.currency}],interbankTransferMode:{id:"PROMOTION_PAYMENT"},receiver:{holder:{holderName:null===(i=this.cardResponse)||void 0===i?void 0:i.holderName},contract:{number:null===(s=this.cardResponse)||void 0===s?void 0:s.cardNumber,numberType:{id:null===(n=this.cardResponse)||void 0===n||null===(r=n.numberType)||void 0===r?void 0:r.id},bank:{id:null===(o=this.cardResponse)||void 0===o||null===(c=o.bank)||void 0===c?void 0:c.id},contractType:{id:"CARD"},specificProductType:{id:null===(d=this.cardResponse)||void 0===d?void 0:d.id,name:null===(l=this.cardResponse)||void 0===l?void 0:l.description}}},sender:{contract:{number:null===(u=this.selectedOriginAccountDetail)||void 0===u?void 0:u.number,numberType:{id:null===(p=this.selectedOriginAccountDetail)||void 0===p?void 0:p.id,name:null===(h=this.selectedOriginAccountDetail)||void 0===h?void 0:h.productName},contractType:{id:"ACCOUNT"}}},promotionParameters:{extractNumber:null===(m=this.advancedPromotionSelected)||void 0===m?void 0:m.quotationNumber,movementNumber:null===(g=this.advancedPromotionSelected)||void 0===g?void 0:g.movementNumber,promotionDeadline:null===(y=this.advancedPromotionSelected)||void 0===y||null===(_=y.period)||void 0===_?void 0:_.current}}}summaryButtonHandleEvent(){var e,t;this._validatePaymentType(),this._openSuccessModalDispatch(),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-final-step-launch-otp",{productName:this.selectedOriginAccountDetail.productName,totalAmount:this.totalPay.amount,currency:this.selectedOriginAccountDetail.currency,applicationTypology:this.advancedPromotionSelected.name,cardData:{productName:null===(e=this.cardResponse)||void 0===e?void 0:e.productName,amount:null===(t=this.cardResponse)||void 0===t?void 0:t.actualDebt,currency:this.currency}})}_validatePaymentType(){const e=this._requesBody();this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-execute-interbank-payments-post-response",e)}_onCompleteExpandableMultistep({detail:e}){this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-multistep-complete",{completed:e})}get _renderMultistep(){return s`
      <bbva-expandable-multistep
        ambient="${this.ambient}"
        tabindex="0"
        @expandable-multistep-all-complete="${this._onCompleteExpandableMultistep}"
      >
        <div slot="content">
          ${this._renderAccountInfoStep} ${this._renderSelectPromotionsStep}
          ${this._renderAmountToPayStep} ${this._renderSelectAccountStep}
        </div>
        <div class="confirm-step" slot="confirmation" ambient="primary-alt">
          ${this._summaryButton}
        </div>
      </bbva-expandable-multistep>
    `}render(){return s` ${super.render()} ${this._renderMultistep} `}}const{moment:bt}=window;function vt(e,t){return bt(e).format(t)}function ft(e,t){return e.find((e=>e.id===t?e:""))}var Tt=u`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.panel-info {
  padding: 1rem;
  text-align: start;
}

.amount-section {
  padding: 1rem;
  text-align: start;
}

.microilustration-container {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
  margin-bottom: 2rem;
}

.container {
  display: flex;
  justify-content: space-between;
  margin-top: 1rem;
}
.container *.align-end {
  text-align: end;
}

.payment-description-container {
  display: flex;
  flex-direction: column;
  row-gap: 0;
  margin-top: 0.5rem;
  margin-bottom: 1rem;
}

.notification-message {
  margin-top: 1rem;
}

.share-button {
  margin-top: 2rem;
}
`;class St extends(S(E(A(p(t))))){static get is(){return"promotions-advance-payment-receipt"}static get scopedElements(){const e=[R,q,C,w,M,...St.configurationScopedElements()];return St.scopedElementsFromClasses(e)}static get properties(){return{currency:{type:String},responseDataPayment:{type:Object,attribute:"response-data-payment"},microilustration:{type:String}}}constructor(){super(),this.currency="",this.responseDataPayment={},this.microilustration="success"}static get styles(){return[Tt,O.primaryAlt,k.primaryAlt,H.primaryAlt,b("promotions-advance-payment-receipt-shared-styles")]}get _renderMicroilustration(){return s`
      <div class="microilustration-container">
        <div class="clip-microillustration">
          <bbva-clip-microillustration microillustration="${this.microilustration}">
          </bbva-clip-microillustration>
        </div>
        <bbva-type-text
          ambient="${this.ambient}"
          size="3XL"
          text="card-transaction-promotions-advanced-payment-success-subtitle"
          font-weight="${h.fontWeight50}"
          tag="span"
        >
        </bbva-type-text>
      </div>
    `}get _renderPaymentAmount(){var e;return s`
      <div class="payment-description-container">
        <bbva-type-text
          ambient="${this.ambient}"
          inherit
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-amount-paid"
        >
        </bbva-type-text>
        <bbva-type-amount
          ambient="${this.ambient}"
          variant="3xl"
          type="bold"
          font-weight="${h.fontWeight50}"
          amount="${null===(e=this.responseDataPayment)||void 0===e?void 0:e.amount}"
          currency-code="${this.currency}"
          local-currency="${this.currency}"
        >
        </bbva-type-amount>
      </div>
    `}get _renderSuccessDetail(){var e,t,a,i;return s` <div>
      <div class="container">
        <bbva-type-text
          inherit
          ambient="${this.ambient}"
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-date-and-hour"
        >
        </bbva-type-text>
        <bbva-type-text
          class="align-end"
          inherit
          ambient="${this.ambient}"
          font-weight="${h.fontWeight40}"
          text="${null===(e=this.responseDataPayment)||void 0===e?void 0:e.date}"
        >
        </bbva-type-text>
      </div>
      <div class="container">
        <bbva-type-text
          inherit
          ambient="${this.ambient}"
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-origin-account"
        >
        </bbva-type-text>
        <bbva-type-text
          class="align-end"
          inherit
          ambient="${this.ambient}"
          font-weight="${h.fontWeight40}"
          text="${null===(t=this.responseDataPayment)||void 0===t?void 0:t.accountNumber}"
        >
        </bbva-type-text>
      </div>
      <div class="container">
        <bbva-type-text
          inherit
          ambient="${this.ambient}"
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-operation-type"
        >
        </bbva-type-text>
        <bbva-type-text
          ambient="${this.ambient}"
          class="align-end"
          inherit
          font-weight="${h.fontWeight40}"
          text="card-transaction-servicing-cc-promotions-advanced-payments-operation-type-promotion-advanced-payment"
        >
        </bbva-type-text>
      </div>
      <div class="container">
        <bbva-type-text
          ambient="${this.ambient}"
          inherit
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-promotion-label"
        >
        </bbva-type-text>
        <bbva-type-text
          ambient="${this.ambient}"
          class="align-end"
          inherit
          font-weight="${h.fontWeight40}"
          text="${null===(a=this.responseDataPayment)||void 0===a?void 0:a.description}"
        >
        </bbva-type-text>
      </div>
      <div class="container">
        <bbva-type-text
          ambient="${this.ambient}"
          inherit
          font-weight="${h.fontWeight10}"
          text="card-transaction-promotions-advanced-payment-success-operation-number"
        >
        </bbva-type-text>
        <bbva-type-text
          ambient="${this.ambient}"
          inherit
          font-weight="${h.fontWeight40}"
          text="${null===(i=this.responseDataPayment)||void 0===i?void 0:i.operationFolio}"
        >
        </bbva-type-text>
      </div>
    </div>`}get _notificationMessage(){return s`
      <bbva-notification-message
        message-title="${this.t("card-transaction-promotions-advanced-payment-success-message")}"
        book-title=""
        class="notification-message"
      >
      </bbva-notification-message>
    `}get _shareButtonSettings(){const e=[{icon:v(),label:this.t("card-transaction-servicing-cc-promotions-advanced-payments-success-advance-payments-share-button-label"),id:"button-1"}];return s`
      <bbva-button-row
        .options=${e}
        ambient="primary-alt"
        class="share-button"
        @button-row-item-button-1-click=${this._handleShareButton}
      >
      </bbva-button-row>
    `}_handleShareButton(){this._dispatchCustomEvent("bbva-button-row-click")}render(){return s`
      <div>
        ${this._renderMicroilustration} ${this._renderPaymentAmount} ${this._renderSuccessDetail}
        ${this._notificationMessage} ${this._shareButtonSettings}
      </div>
    `}}class Et extends(_(S(A(p(t))))){static get is(){return"modal-half-content"}static get scopedElements(){const e=[I,M];return Et.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}get _renderHalfModals(){var e,t,a,i,n,r,o,c,d,l,u,p,h,g,y,_,b,v,f,T,S;return s`
      <bbva-help-modal
        ?visible=${this.visible}
        id="${null===(e=this.modalConfig)||void 0===e?void 0:e.id}"
        header-text="${this.t(null===(t=this.modalConfig)||void 0===t?void 0:t.headerText)}"
        .fullHeight="${null===(a=this.modalConfig)||void 0===a?void 0:a.fullHeight}"
        .fixedFooter="${null===(i=this.modalConfig)||void 0===i?void 0:i.fixedFooter}"
        content="${null===(n=this.modalConfig)||void 0===n?void 0:n.content}"
        title-icon="${null===(r=this.modalConfig)||void 0===r?void 0:r.titleIcon}"
        modal-type=${null===(o=this.modalConfig)||void 0===o?void 0:o.modalType}
        title-text=""
        body-text="${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.bodyText)}"
        button-text="${this.t(null===(d=this.modalConfig)||void 0===d?void 0:d.buttonText)}"
        link-text="${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.linkText)}"
        subtitle-text=""
        @help-modal-footer-button-click=${null===(u=this.modalConfig)||void 0===u?void 0:u.footerButtonClick}
        @help-modal-header-click=${null===(p=this.modalConfig)||void 0===p?void 0:p.headerPrimaryClick}
        @help-modal-veil-click=${null===(h=this.modalConfig)||void 0===h?void 0:h.veilClick}
        @help-modal-footer-link-click=${null===(g=this.modalConfig)||void 0===g?void 0:g.footerLinkClick}
      >
        ${null!==(y=this.modalConfig)&&void 0!==y&&y.fullBodyMode?s`
              <div class="modal-content-wrapper" slot="slot-title">
                <bbva-clip-microillustration
                  microillustration="${null===(_=this.modalConfig)||void 0===_||null===(b=_.content)||void 0===b?void 0:b.microillustration}"
                  size="${null===(v=this.modalConfig)||void 0===v||null===(f=v.content)||void 0===f?void 0:f.microillustrationSize}"
                ></bbva-clip-microillustration>
                <h2 class="my-header-title" fon>
                  ${this.t(null===(T=this.modalConfig)||void 0===T||null===(S=T.content)||void 0===S?void 0:S.subTitleBody)}
                </h2>
              </div>
              :
            `:m}
      </bbva-help-modal>
    `}render(){return s` ${super.render()} ${this._renderHalfModals}`}}const At=({footerButtonClick:e})=>({ERROR_SERVICE_FULL_HEIGHT:{id:"errorFullModal",fullHeight:!0,fixedFooter:!0,visible:!0,headerText:"card-transaction-servicing-cc-promotions-advanced-payments-success-advance-payments-detail-operation-type",modalType:"warning",modalSize:"L",titleIcon:y(),descriptionText:"",bodyText:"card-transaction-servicing-promotions-advanced-payment-monthly-payment-modal-error-full-description",buttonText:"card-transaction-servicing-promotions-advanced-payment-error-service-retry-modal-button-text",linkText:"",fullBodyMode:!0,content:{subTitleBody:"card-transaction-servicing-promotions-advanced-payment-error-service-exit-modal-header-text",microillustration:"error",microillustrationSize:"M"},footerButtonClick:e},ERROR_SERVICE_RETRY:{id:"retryErrorModal",fullHeight:!1,headerText:"card-transaction-servicing-promotions-advanced-payment-error-service-exit-modal-header-text",modalSize:"M",descriptionText:"",titleIcon:y(),modalType:"warning",hideContentPaddingTop:!0,avoidIconCloseModal:!0,bodyText:"card-transaction-servicing-promotions-advanced-payment-error-service-exit-modal-body-text",buttonText:"card-transaction-servicing-promotions-advanced-payment-error-service-exit-modal-button-text",linkText:"",footerButtonClick:e},EXIT_OPERATIVE:{id:"exitModal",fullHeight:!1,headerText:"card-transaction-servicing-promotions-advanced-payment-exit-modal-header-text",modalSize:"M",titleIcon:f(),modalType:"caution",descriptionText:"",bodyText:"card-transaction-servicing-promotions-advanced-payment-exit-modal-body-text",buttonText:"card-transaction-servicing-promotions-advanced-payment-exit-modal-button-text",linkText:"card-transaction-servicing-promotions-advanced-payment-exit-modal-link-text",subtitleText:"",footerButtonClick:e}}),Rt=(e,{footerButtonClick:t,headerPrimaryClick:a})=>({id:"withoutPromotionsModal",fullHeight:!1,headerText:"card-transaction-servicing-promotions-advanced-payment-change-process-modal-header-text",modalSize:"M",titleIcon:f(),modalType:"caution",descriptionText:"",hideContentPaddingTop:!0,avoidIconCloseModal:!0,bodyText:"card-transaction-servicing-promotions-advanced-payment-no-movements-modal-description",buttonText:"card-transaction-servicing-promotions-advanced-payment-change-process-modal-button-text",linkText:"",footerButtonClick:t,headerPrimaryClick:a}),Ct=({footerButtonClick:e,headerPrimaryClick:t})=>({id:"changeOperative",fullHeight:!1,headerText:"card-transaction-servicing-promotions-advanced-payment-change-process-modal-header-text",modalSize:"M",titleIcon:f(),modalType:"caution",descriptionText:"",hideContentPaddingTop:!0,avoidIconCloseModal:!0,bodyText:"card-transaction-servicing-promotions-advanced-payment-change-process-modal-body-text",buttonText:"card-transaction-servicing-promotions-advanced-payment-change-process-modal-button-text",linkText:"",footerButtonClick:e,headerPrimaryClick:t});var Pt=u`
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

  .content-text {
    display: flex;
    justify-content: space-between;
    align-items: baseline;
    align-self: stretch;
  }

  .content-card {
    display: flex;
    justify-content: center;
  }

  .notification-step1 {
    margin: 1rem 0 1.5rem;
  }

  .container {
    padding: 1rem;
  }

  .card-summary-to-pay {
    margin-right: 0.5rem;
  }

  [data-tag-name='bbva-form-radio-button'] {
    padding-bottom: 1rem;
  }

  [slot='right'] {
    padding: 0.5rem;
  }

  .account-to-pay {
    padding: 1rem 0;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-bottom: 0;
    --bbva-transition-container-text-align: normal;
  }

  .confirm-step {
    width: 100%;
    padding: 1rem;
  }
  .confirm-step > [data-tag-name='bbva-type-amount'] {
    padding-bottom: 1rem;
  }

  .amounts-summary {
    margin-bottom: 0.5rem;
  }
`;class xt extends(_(S(p(A(t))))){static get is(){return"card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment"}static get scopedElements(){const e=[Et,I,K,Ce,X,St,_t,Qe,...xt.configurationScopedElements()];return xt.scopedElementsFromClasses(e)}static get properties(){return{cardPromotionsApiVersion:{type:String,attribute:"card-promotions-api-version"},cardId:{type:String,attribute:"card-id"},cardsApiVersion:{type:String,attribute:"cards-api-version"},_dataSuccessScreen:{type:Object},maxRetries:{type:Number,attribute:"max-retries"},pageSize:{type:Number,attribute:"page-size"},paginationKey:{type:Number,attribute:"pagination-key"},_retriesConfig:{type:Object,state:!0},_showMultistep:{type:Boolean},_showHalfModal:{type:Boolean},currency:{type:String},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean},requiredOTPInterbankTransfers:{type:Boolean,attribute:"required-otp-interbank-transfers"},transfersApiVersion:{type:String,attribute:"transfer-api-version"},accountsApiVersion:{type:String,attribute:"accounts-api-version"},_currentServiceError:{type:String},_responsePromotions:{type:Array},_responseDataPayment:{type:Object},_dataPostAdvancePromotionPayment:{type:Object},ivrWelcome:{type:Object},_exitStatusModal:{type:Boolean},_productAndCardDetails:{type:Object},_amountMinimumPayment:{type:Number},maxLengthAmount:{type:Number,attribute:"max-length-amount"}}}static get styles(){return[Pt,b("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-shared-styles")]}constructor(){super(),this.cardId="",this.accountsResponse=[],this.ambient="secondary",this.cardPromotionsApiVersion="",this.cardResponse={},this.cardsApiVersion="",this._header="",this.config={header:{id:"header-main",variant:"modal-initial",text:"card-transaction-servicing-cc-promotions-advanced-payments-operation-type-promotion-advanced-payment","@header-main-icon-click":this._onClickHeaderIcon.bind(this),buttons:[{id:"btn-close",icon:T(),name:"Close",accessibilityText:"card-transaction-servicing-promotions-advanced-payment-promotions-advanced-payment-header-close-accessibility-text"}],showLeftICon:!1},loader:!0,notify:!1,back:!1,fixedHeader:!1,className:"dark-blue-bg"},this.country="",this._dataSuccessScreen={},this.requiredOTPInterbankTransfers=!1,this._productAndCardDetails={},this.currency="",this.maxRetries=3,this.native=!1,this.pageSize=0,this.requiredToken="tsec",this._responsePromotions=[],this._responseDataPayment={},this.transfersApiVersion="",this._dataPostAdvancePromotionPayment={},this._showModalSuccess=!1,this._retriesConfig={GETPROMOTIONS:0,GETPROMOTION:0,GETACCOUNTS:0,GETCARD:0},this._showMultistep=!1,this.accountsApiVersion="",this._showHalfModal=!1,this.ivrWelcome={},this._currentServiceError="",this._exitStatusModal=!1,this.paginationKey=0,this._amountMinimumPayment=0}firstUpdated(e){super.firstUpdated(e),this._addListeners(),this._getInterbankTransfersDM=this.shadowRoot.querySelector('[data-tag-name="bbva-global-interbank-transfers-api-dm"]')}async init(){this.showLoader(),this._getCard(),await this.updateComplete}_reset(){this._dataSuccessScreen={},this._header="",this.maxRetries=3,this._showMultistep=!1,this._responseDataPayment={},this._showModalSuccess=!1,this._exitStatusModal=!1,this._retriesConfig={GETPROMOTIONS:0,GETPROMOTION:0,GETACCOUNTS:0,GETCARD:0}}_addListeners(){this.addEventListener("header-main-icon-click",this._manageMultistepCloseRequest)}navigateBack(){this._reset(),this._dispatchCustomEvent("close-header-event",{productId:this.cardId}),this._dispatchCustomEvent("set-additional-product-id",this.cardId),this._dispatchCustomEvent("get-card-detail-data",!0),this._dispatchCustomEvent("detail-data-refresh"),this._dispatchCustomEvent("detail-data-refresh-reload")}operativeCloseModal(){this.clearLoader()}_onClickHeaderIcon(){this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-header-close")}_openModalSuccess({detail:e}){this._dataSuccessScreen=e}_shareReceiptData(e){var t;const{account:a}=this._dataSuccessScreen,i=`${(null==a?void 0:a.productName)||""} •${(null==a||null===(t=a.number)||void 0===t?void 0:t.substr(-4))||""}`;var s,n,r;this._responseDataPayment={operationType:rt[e.paymentType],amount:e.paymentAmount.amount,accountNumber:i,description:e.paymentConcept,date:(s=e.paymentDate,s?null===(n=bt(s))||void 0===n||null===(r=n.format("DD MMMM YYYY, HH:MM t"))||void 0===r?void 0:r.replace(".","").replace("t","h"):""),operationFolio:`${e.operationNumber}`},this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-receipt-share",this._responseDataPayment)}_successChanged({detail:e}){this._showModalSuccess=e}_manageMultistepCloseRequest(){!this._showModalSuccess&&""===this._currentServiceError||this._exitStatusModal?(this._exitStatusModal=!0,this.modalConfig=At({footerButtonClick:this.navigateBack.bind(this)}).EXIT_OPERATIVE,this._showHalfModal=!0):this.navigateBack()}_getDataFromEvent({detail:e}){this.modalConfig=e}_filterAccounts(e){this.accountsResponse=e.map((e=>{var t,a,i,s,n,r;return{productName:null===(t=e.product)||void 0===t?void 0:t.name,amount:null==e||null===(a=e.availableBalance)||void 0===a||null===(i=a.currentBalances[0])||void 0===i?void 0:i.amount,currency:null==e||null===(s=e.availableBalance)||void 0===s||null===(n=s.currentBalances[0])||void 0===n?void 0:n.currency,number:e.number,id:null==e||null===(r=e.numberType)||void 0===r?void 0:r.id}}))}_setAccounts({detail:e}){this._filterAccounts(e)}get _accountsDM(){return s`
      <bbva-global-accounts-api-dm
        id="accountsDm"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @accounts-api-dm-fetch="${this._setAccounts}"
        @api-dm-error="${()=>{this._manageError("GETACCOUNTS")}}"
        @accounts-api-dm-fetch-error=${()=>{this._manageError("GETACCOUNTS")}}
      ></bbva-global-accounts-api-dm>
    `}_getAccounts(){this.shadowRoot.querySelector('[data-tag-name="bbva-global-accounts-api-dm"]').getAccounts()}async _handleCardFetch({detail:e}){if(ft(e.paymentMethods,"MINIMUM_AMOUNT_PAYMENT").monetaryPayments.forEach((e=>{this._amountMinimumPayment=e.amount})),this._amountMinimumPayment>0)this._configModalChangeOperative();else{var t,a,i,s,n,r,o,c,d,l,u,p,h,m,g;const y=ft(e.images,"FRONT_CARD"),_=null==e||null===(t=e.cardType)||void 0===t?void 0:t.id,b=e.availableBalance.currentBalances.find((e=>e.amount.currency===this.currency));this.cardResponse={images:y?y.url:"",brandAssociation:null===(a=e.brandAssociation)||void 0===a?void 0:a.id,cardName:e.alias||(null===(i=e.product)||void 0===i?void 0:i.name),cardType:_,cardNumber:null==e?void 0:e.number,nextPaymentDay:vt(ft(e.paymentMethods,"LAST_PERIOD_AMOUNT_PAYMENT").nextPaymentDate,"DD MMMM YYYY"),actualDebt:"CREDIT_CARD"===_?null===(s=e.cardType.disposedBalance)||void 0===s||null===(n=s.currentBalances[0])||void 0===n||null===(r=n.amount)||void 0===r?void 0:r.amount:"",currencyActualDebt:"CREDIT_CARD"===_?null===(o=e.cardType.disposedBalance)||void 0===o||null===(c=o.currentBalances[0])||void 0===c||null===(d=c.amount)||void 0===d?void 0:d.currency:"",balanceAtCutOff:null==b||null===(l=b.amount)||void 0===l?void 0:l.amount,currencyBalanceAtCutOff:null==b||null===(u=b.amount)||void 0===u?void 0:u.currency,bank:null==e?void 0:e.bank,holderName:null==e||null===(p=e.cardType)||void 0===p?void 0:p.holderName,description:null==e||null===(h=e.cardType)||void 0===h?void 0:h.description,id:null==e||null===(m=e.cardType)||void 0===m?void 0:m.id,numberType:null==e?void 0:e.numberType,productName:null==e||null===(g=e.product)||void 0===g?void 0:g.name},await this.updateComplete,this._getCardPromotions(),this._getAccounts()}}get _cardDM(){return s`
      <bbva-global-card-api-dm
        id="cardDm"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @card-api-dm-fetch="${this._handleCardFetch}"
        @api-dm-error="${()=>{this._manageError("GETCARD")}}"
        @card-api-dm-fetch-error="${()=>{this._manageError("GETCARD")}}"
      >
      </bbva-global-card-api-dm>
    `}_getCard(){this.shadowRoot.querySelector("#cardDm").getCard(this.cardId,{expand:"payment-methods"})}_validateShowModalWithoutPromotions(){this.modalConfig=Rt({headerText:this._header},{footerButtonClick:this.navigateBack.bind(this),headerPrimaryClick:this.navigateBack.bind(this)}),this._showHalfModal=!0}_handlePromotionsFetch(e){e.length>0&&(this._showMultistep=!0,this._responsePromotions=null==e?void 0:e.map(((e,t)=>{const a=e.startDate;return{index:t,id:`${e.id}-${e.description}`,date:vt(a,"DD MMMM YYYY"),name:e.description.trim(),totalAmount:{amount:e.remainingTotalAmount.amount,currency:e.remainingTotalAmount.currency},monthlyAmount:{amount:e.partialAmount.amount,currency:e.partialAmount.currency},quotationNumber:e.quotationNumber,movementNumber:e.movementNumber,period:{current:e.period.current}}})))}async _setPromotionsResponse({detail:e}){var t,a;this.clearLoader(),this._handlePromotionsFetch(e),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-card-response-send-data",{cardData:{productName:null===(t=this.cardResponse)||void 0===t?void 0:t.productName,amount:null===(a=this.cardResponse)||void 0===a?void 0:a.actualDebt,currency:this.currency}}),await this.updateComplete}_handleShareClickEvent(){const e={operative:"advancePromotionsReceipt",templateSelected:"advancePromotionsReceipt",...this._responseDataPayment};this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-share-receipt-click",e)}_manageError(e){this.clearLoader();const t=this._retriesConfig[e]<this.maxRetries;this._retriesConfig[e]+=1,t?(this._serviceGenericError(),this._currentServiceError=e,this._showHalfModal=!0):(this.modalConfig=At({footerButtonClick:this._callBbvaLine.bind(this)}).ERROR_SERVICE_FULL_HEIGHT,this._showHalfModal=!0)}_callBbvaLine(){var e,t;this._dispatchCustomEvent("open-call-action-plug-in",{value:null===(e=this.ivrWelcome)||void 0===e||null===(t=e.contact)||void 0===t?void 0:t.ivrWelcome})}_serviceGenericError(){this.modalConfig=At({footerButtonClick:this._retryServiceActived.bind(this)}).ERROR_SERVICE_RETRY}_retryServiceActived(){this._showHalfModal=!1,this.showLoader(),"GETACCOUNTS"===this._currentServiceError?this._getAccounts():"GETCARD"===this._currentServiceError?this._getCard():"GETCARDPROMOTIONS"===this._currentServiceError?this._getCardPromotions():"POSTINTERBAK"===this._currentServiceError&&this._getInterbankTransfersDM.postInterbankTransfers(this._dataPostAdvancePromotionPayment,{simulated:!1})}_errorPromotionController(e){"functionalError"===e.detail.messages[0].code?(this._responsePromotions=[],this._validateShowModalWithoutPromotions()):this._manageError("GETCARDPROMOTIONS")}get _promotionsDM(){return s`
      <bbva-global-card-promotions-api-dm
        id="cardPromotionsDm"
        .host="${this.host}"
        .version="${this.cardPromotionsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @card-promotions-api-dm-fetch="${this._setPromotionsResponse}"
        @card-promotions-api-dm-fetch-error="${this._errorPromotionController}"
      >
      </bbva-global-card-promotions-api-dm>
    `}get _cardPromotionsDm(){return this.__cardPromotionsDm=this.shadowRoot.querySelector(`[data-tag-name="${X.is}"]`),this.__cardPromotionsDm}_getCardPromotions(){this._cardPromotionsDm.getCardPromotions(this.cardId,{status:{id:"ACTIVE"},paginationKey:this.paginationKey,pageSize:this.pageSize})}_configModalChangeOperative(){this._colapseStep="",this.modalConfig=Ct({footerButtonClick:this.navigateBack.bind(this),headerPrimaryClick:this.navigateBack.bind(this)}),this._showHalfModal=!0}_filterResponsePayment(e){var t,a;let i={};null==e||null===(t=e.sentMoney)||void 0===t||t.forEach((e=>{null!=e&&e.isMajor&&(i={amount:null==e?void 0:e.amount,currency:null==e?void 0:e.currency})})),this._responseDataPayment={paymentConcept:null==e?void 0:e.concept,paymentDate:null==e?void 0:e.date,paymentType:null==e||null===(a=e.interbankTransferMode)||void 0===a?void 0:a.id,operationNumber:null==e?void 0:e.operationNumber,paymentAmount:i},Object.keys(this._responseDataPayment).length>0&&(this.clearLoader(),this._showModalSuccess=!0,this._showMultistep=!1,this._shareReceiptData(this._responseDataPayment)),this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-open-success-send-data",{operationNumber:this._responseDataPayment.operationFolio,...this._productAndCardDetails})}_setResponseInterbankTransfer({detail:e}){this._filterResponsePayment(e)}get _interbankTransfersDM(){return s`
      <bbva-global-interbank-transfers-api-dm
        id="interbankTransfersDm"
        .host="${this.host}"
        .version="${this.transfersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOTPInterbankTransfers}"
        .country="${this.country}"
        @interbank-transfers-api-dm-create="${this._setResponseInterbankTransfer}"
        @interbank-transfers-api-dm-create-error="${()=>{this._manageError("POSTINTERBAK")}}"
        @api-dm-response-error="${()=>{this._manageError("POSTINTERBAK")}}"
        @api-dm-error="${()=>{this._manageError("POSTINTERBAK")}}"
      >
      </bbva-global-interbank-transfers-api-dm>
    `}_postAdvancePromotionPayment(e=!1){this.showLoader(),this._dataPostAdvancePromotionPayment=null==e?void 0:e.detail,this._getInterbankTransfersDM.postInterbankTransfers(this._dataPostAdvancePromotionPayment,{simulated:!1})}get _renderGlobalApis(){return s`
      ${this._promotionsDM} ${this._interbankTransfersDM} ${this._cardDM} ${this._accountsDM}
    `}get _renderHalfModal(){return s`
      <modal-half-content
        .modalConfig=${this.modalConfig}
        ?visible=${this._showHalfModal}
        @visible-changed=${({detail:e})=>{this._showHalfModal=e,this._modalHalfContentClick(e)}}
      >
      </modal-half-content>
    `}_modalHalfContentClick(e){this._dispatchCustomEvent("card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-modal-button-click",e)}_changeHeaderColor({detail:e}){this.config.header.variant=e.completed?"modal-initial-secondary":"modal-initial",this.requestUpdate()}get _renderMultistep(){return this._header=this.t("card-transaction-servicing-cc-promotions-advanced-payments-operation-type-promotion-advanced-payment"),this._showMultistep?s`
          <promotion-advance-payment-multistep
            currency="${this.currency}"
            language="${this.language}"
            .cardResponse=${this.cardResponse}
            .responsePromotions=${this._responsePromotions}
            .accountsResponse="${this.accountsResponse}"
            max-length-amount="${this.maxLengthAmount}"
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-retry-accounts-service=${this._retryService}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-open-success-modal=${this._openModalSuccess}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-execute-accounts-service=${this._getAccounts}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-execute-interbank-payments-post-response=${this._postAdvancePromotionPayment}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-reset-advance-payments=${this._manageMultistepCloseRequest}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-exit-advance-payments=${this._reset}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-show-modal=${this._getDataFromEvent}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-expandable-multistep-complete=${this._changeHeaderColor}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-select-advance-payments-type-show-modal=${this._configModalChangeOperative}
            @card-transaction-servicing-credit-card-payment-own-cards-cc-promotions-advanced-payment-final-step-launch-otp=${this._setProductAndAmountDetails}
          >
          </promotion-advance-payment-multistep>
        `:m}_setProductAndAmountDetails(e){this._productAndCardDetails=e.detail}get _successAdvancePayment(){return this._showModalSuccess?s`
          <bbva-help-modal
            full-height
            hide-content-padding-top
            header-text="${this._header}"
            ?visible=${this._showModalSuccess}
            @visible-changed=${this._successChanged}
            @help-modal-close=${this._reset}
          >
            <div slot="slot-content">
              <promotions-advance-payment-receipt
                ambient="primary-alt"
                currency="${this.currency}"
                language="${this.language}"
                .responseDataPayment=${this._responseDataPayment}
                @bbva-button-row-click=${this._handleShareClickEvent}
              >
              </promotions-advance-payment-receipt>
            </div>
          </bbva-help-modal>
        `:m}render(){return s`
      ${super.render()} ${this._renderGlobalApis} ${this._renderMultistep}
      ${this._successAdvancePayment} ${this._renderHalfModal}
    `}}customElements.define(xt.is,xt);class Ot extends(oe(t)){static get is(){return"bbva-analyticmanager-promotions-advanced-payment"}static get properties(){return{}}fireEventAppPageVisit(e){e.cardData.productName=e.cardData.productName.toLowerCase(),this._dispatch("analytics-app-page-visit",e)}fireEventAppStarted(e){e.applicationStep=e.applicationStep.toLowerCase().trim(),e.cardData.productName=e.cardData.productName.toLowerCase(),this._dispatch("analytics-app-started",e)}fireEventAppStepAmount(e){e.cardData.productName=e.cardData.productName.toLowerCase(),e.applicationTypology=e.applicationTypology.toLowerCase().trim(),this._dispatch("analytics-app-step-amount-section",e)}fireEventAppStepAccount(e){e.cardData.productName=e.cardData.productName.toLowerCase(),e.applicationTypology=e.applicationTypology.toLowerCase().trim(),this._dispatch("analytics-app-step-account-section",e)}fireEventAppStepConfirmation(e){e.applicationTypology=e.applicationTypology.toLowerCase().trim(),e.productName=e.productName.toLowerCase(),e.cardData.productName=e.cardData.productName.toLowerCase(),this._dispatch("analytics-app-step-confirmation-section",e)}fireEventAppStepOTP(e){e.applicationTypology=e.applicationTypology.toLowerCase().trim(),e.productName=e.productName.toLowerCase(),e.cardData.productName=e.cardData.productName.toLowerCase(),this._dispatch("analytics-app-step-otp-section",e)}fireProcessAppCompleted(e){e.applicationTypology=e.applicationTypology.toLowerCase().trim(),e.productName=e.productName.toLowerCase(),e.cardData.productName=e.cardData.productName.toLowerCase(),this._dispatch("analytics-app-completed",e)}}customElements.define(Ot.is,Ot);var wt=Object.freeze({__proto__:null});export{_e as B,Re as a,wt as p};
