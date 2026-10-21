import{J as e,L as t,aZ as i,a7 as s,h as a,dC as n,a as r,i as o,b as c,z as l,V as d,aX as u,an as h,ak as m,dk as p,aY as v,ci as g,aV as b,bD as _,dr as y,aD as S,a9 as f,dp as C,av as E,aU as x,cT as T,bF as A,aN as $,cU as D,b7 as P}from"./952f98a9.js";import{R as O,S as I,M as w,L as k,G as N,H as R,Z as M,f as L,D as V,z as B,V as H,Y as F,Q as j,e as q,a2 as G,I as U,a1 as W,h as z,F as K,A as Y,an as X,K as J,ao as Q,N as Z,E as ee}from"./216055dc.js";import"./e5f89cd9.js";import{b as te,a as ie,B as se,c as ae}from"./80b427be.js";import{B as ne,a as re}from"./4eb8d874.js";import{B as oe}from"./40b41b3c.js";import{a as ce}from"./f18a73d9.js";import{a2 as le,a3 as de,by as ue,bP as he,bQ as me,bf as pe,bg as ve,aH as ge,aI as be}from"./7f3d7ca9.js";import{B as _e,a as ye,b as Se}from"./d2484b66.js";import{a as fe}from"./4656db6d.js";import{B as Ce,b as Ee}from"./84dff06e.js";import{B as xe,b as Te}from"./30ef6f1f.js";import{B as Ae,b as $e}from"./6b902eda.js";import{a as De,B as Pe,b as Oe,c as Ie}from"./e3d898b2.js";import"./9b29e435.js";class we extends(e(t)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1);return e}}class ke{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,n=Math.max(a>=0?a:s-Math.abs(a),0);for(;n<s;){if((r=i[n])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;n++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",n=0,r=arguments.length;n!==r;++n){var o=+arguments[n];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class Ne extends ke{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Re=0,Me=1,Le="jwt",Ve="tsec",Be="none";class He extends ke{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Re,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ne,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ve:this.requiredToken=Be,this.requiresJWT=!1):this.requiredToken===Ve?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Le?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Be?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ve)}_setJwtHandler(){this._setTokenHandler(Le)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Me?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Ve,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Le,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Le?"JWT ":"",a=e===Le?"Authorization":Ve;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(n);r?t[a]=t[a]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,n=0;if(s<=127?(a=0,n=255&s):s<=223?(a=1,n=31&s):s<=239?(a=2,n=15&s):s<=244&&(a=3,n=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],n=n<<6|63&s,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,a=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:n,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,n,r,o,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,n,r,o,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),n=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(n),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,n){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:a,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,n){s?this._notifySignatureRequired(e,t,i,s,a,n):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,n,r)}}class Fe extends He{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class je extends He{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class qe extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Ge extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class Ue extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class We extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class ze extends we{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(s))}_getBgadp(e){return{getAccountsV1:()=>new oe(e),getAccountsV0:()=>new qe(e),postAccountsV0:()=>new Ge(e),postAccountsV1:()=>new ne(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"0"==this.version?(this._renameProperty(e,"currency","currencies.currency"),this._renameProperty(e,"indicators.id","indicators.indicatorId"),e):e}_responseMapping(e){if(Array.isArray(e)){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product"),this._removeFields(["bank","commercialPackage","joint","alias","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement"],e[t]),this._removeFields(["previousMonthAverageBalance"],e[t].availableBalance),this._removeFields(["subType"],e[t].accountType),this._removeFields(["reason","reasonDescription"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){return"0"==this.version&&Object.keys(e).length&&(this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.participants.forEach((e=>{var t;this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):"LEGAL_PERSON"===e.personType&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","legalName","identityDocument"],e)),null!==(t=e.participantType)&&void 0!==t&&t.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),e.documentType&&(e.serviceType={id:e.documentType},this._removeFields(["documentType"],e)),this._removeFields(["deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation","offerId"],e)),e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{var t,i,s,a,n,r;null!==(t=e.customDetails)&&void 0!==t&&t.firstName&&(e.firstName=e.customDetails.firstName),null!==(i=e.customDetails)&&void 0!==i&&i.middleName&&(e.middleName=e.customDetails.middleName),null!==(s=e.customDetails)&&void 0!==s&&s.lastName&&(e.lastName=e.customDetails.lastName),null!==(a=e.customDetails)&&void 0!==a&&a.secondLastName&&(e.secondLastName=e.customDetails.secondLastName),null!==(n=e.customDetails)&&void 0!==n&&n.identityDocuments?e.identityDocument={documentNumber:e.customDetails.identityDocuments[0].documentNumber,documentType:e.customDetails.identityDocuments[0].documentType.id}:null!==(r=e.customDetails)&&void 0!==r&&r.businessDocuments&&(e.identityDocument={documentNumber:e.customDetails.businessDocuments[0].documentNumber,documentType:e.customDetails.businessDocuments[0].documentType.id}),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),this._removeFields(["contractDetails"],e.relatedContracts),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingtype"],e)})))),e}_paginationMapping(e){return e}}s(ze,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),s(ze,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(ze.is,ze);class Ke extends we{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages"],this._modules={Mx:()=>import("./e979bbd6.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&this._module&&this[t]!==e&&(this._module[t]=this[t])}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccounts${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=ze.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(e={}){await this.module.updateComplete,Object.keys(this.accounts).length||this.module.getAccounts(e)}async postAccounts(e){await this.module.updateComplete,this.module.postAccounts(e)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class Ye extends we{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(s))}_getBgadp(e){return{getAccountTransactionsV2:()=>new n(e),getAccountTransactionsV0:()=>new We(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let s=t[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===e[s])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(e[t].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const a=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[a,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}s(Ye,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Ye.is,Ye);const Xe={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},Je={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Qe extends(r(Ye)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[c];return Qe.scopedElementsFromClasses(e)}render(){return a` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return a`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${o(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,s)=>(i[s.replace(e,"")]=t.getItem(s),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){var i;const s=this.shadowRoot.getElementById("accountTransactions"),a=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t||null===(i=t.financingType)||void 0===i?void 0:i.id,this._setGenericRequest({dm:s,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[a]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let s={};var a,n;i&&(s={id:"EUR"===(null===(a=i.currency)||void 0===a?void 0:a.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(n=i.currency)||void 0===n?void 0:n.id});let r={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;r={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const o=0===Object.keys(s).length,c=0===Object.keys(r).length;return o&&c?null:o?[r]:c?[s]:[s,r]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const s=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,a=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,n=Xe[s];var r;return{id:s,name:n,category:{id:s,name:n,subcategory:{id:a,name:(r=a,Object.keys(Je).find((e=>Je[e].includes(r))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:s,body:a}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${s}`,e.method=i,e.body=a,e.generateRequest()}}customElements.define(Qe.is,Qe);class Ze extends we{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(s))}_getBgadp(e){return{getAccountLimitsV0:()=>new Ue(e),getAccountLimitsV2:()=>new re(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}s(Ze,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Ze.is,Ze);class et extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class tt extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class it extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class st extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class at extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class nt extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class rt extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class ot extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class ct extends Fe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class lt extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class dt extends(e(t)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class ut extends dt{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(s))}_getBgadp(e){return{getCustomerTermsV1:()=>new ct(e),postCustomerTermsV1:()=>new lt(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}s(ut,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s(ut,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(ut.is,ut);class ht extends dt{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(s))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new et(e),getCustomerContactDetailsV1:()=>new at(e),getCustomerContactDetailsV2:()=>new le(e),getCustomerContactDetailsV3:()=>new de(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let i=0;i<e.length;i++)if(this._renameProperty(e[i],"contactDetailId","id"),e[i].contactType){switch(t=e[i].contact,e[i].contact={contactDetailType:this._contactType[e[i].contactType.id]},e[i].contact.contactDetailType){case"EMAIL":e[i].contact.address=t,e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.emailType=this._emailType[e[i].contactType.id];break;case"LANDLINE":e[i].contact.number=t,e[i].contact.phoneType=this._phoneType[e[i].contactType.id],e[i].country&&(e[i].contact.country=e[i].country),e[i].regionalCode&&(e[i].contact.regionalCode=e[i].regionalCode),e[i].extension&&(e[i].contact.extension=e[i].extension),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified);break;case"MOBILE":e[i].contact.number=t,e[i].phoneCompany&&(e[i].contact.phoneCompany=e[i].phoneCompany),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[i].contact.userName=t,e[i].contact.socialNetwork=this._socialNetwork[e[i].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[i])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let i=0;i<e.length;i++)e[i].contact&&"MOBILE"===e[i].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[i].contact),this._removeFields(t,e[i])}return e}}class mt extends dt{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new ue(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(mt,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(mt.is,mt);class pt extends dt{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(s))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new tt(e),getCustomerEconomicDataV2:()=>new _e(e),getCustomerEconomicDataV3:()=>new ye(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}s(pt,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(pt.is,pt);class vt extends dt{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(s))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new st(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(vt,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(vt.is,vt);class gt extends dt{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(s))}_getBgadp(e){return{getCivilRegistriesV1:()=>new it(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(gt,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(gt.is,gt);class bt extends dt{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(s))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new fe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(bt,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(bt.is,bt);class _t extends dt{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new nt(e),postCustomerIdentificationProcessDocumentsV1:()=>new rt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(_t,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(_t,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(_t.is,_t);class yt extends dt{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new ot(e),getCustomerIndicatorsV3:()=>new Se(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}s(yt,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(yt.is,yt);var St=l`
[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.service-selected, .service-cancel {
  display: flex;
  justify-content: start;
  align-items: center;
  gap: 1rem;
}

.body-cancel {
  display: flex;
  justify-content: space-between;
  align-items: end;
}

.cancel-amount {
  margin-top: 1rem;
}

.detail-content {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}

.content-summary {
  display: flex;
  justify-content: space-between;
}

.align-detail {
  text-align: right;
}

.service-owner-title {
  margin-right: 2rem;
}

.content-account,
.description-account,
.max-amount {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.num-account {
  display: flex;
  align-items: center;
  column-gap: 0.5rem;
}

.confirm-step {
  background-color: var(--_account-transaction-servicing-scheduled-bill-payments-confirmation-bg);
  width: auto;
  padding-right: 1rem;
}

.button-cancel {
  padding-top: 1rem;
}

.amount-value {
  font-size: 2rem;
  display: flex;
  margin-bottom: 0.5rem;
}

.panel-summary {
  margin: 1rem 0;
  display: flex;
  flex-direction: column;
  width: 100%;
  padding-right: 1rem;
}
.panel-summary [data-tag-name=bbva-type-amount] {
  margin-bottom: 1rem;
}
`,ft=l`
:host {
  --_account-transaction-servicing-scheduled-bill-payments-confirmation-bg: var(
    --account-transaction-servicing-scheduled-bill-payments--_ambient--confirmation-bg,
    var(
      --account-transaction-servicing-scheduled-bill-payments--custom--primary-ambient--confirmation-bg,
      ${O("colorPrimarySurfaceAmbientDefault",I)}
    )
  );
}
`,Ct=l`
.link-text {
  display: flex;
  flex-direction: column;
}

.service-selected {
  display: flex;
  justify-content: flex-start;
  align-items: center;
  padding-bottom: 1rem;
}
.service-selected :last-child {
  margin-left: auto;
}

.image {
  margin-right: calc(1 * var(--gridSpacerVariant, var(--gridSpacer, 8)) / 16 * 1rem);
}

[data-tag-name=bbva-type-link] {
  font-size: 1.125rem;
  padding: 0;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}

.content-options {
  display: flex;
  flex-direction: column;
  row-gap: 2rem;
}
`;const Et=(e,t,i=!0)=>{const s="complete"===t?"complete":`account-transaction-servicing-scheduled-bill-payments-${t}`;e.dispatchEvent(new CustomEvent(s,{detail:i,bubbles:!0,composed:!0}))},{moment:xt}=window;function Tt(e){const t=xt(e);return{now:t.toISOString(),longDate:t.format("D [de] MMMM [de] YYYY h:mm A").replace(".","").replace(" PM","h").replace(" AM","h"),shortDate:t.format("D MMM YYYY h:mm A").replace(".","").replace(" PM","h").replace(" AM","h")}}function At(e=""){return d(e," • ",!0,4)}class $t extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-select-service"}static get scopedElements(){const e=[N,R,M,L,...$t.configurationScopedElements()];return $t.scopedElementsFromClasses(e)}static get properties(){return{serviceSelected:{type:Object}}}constructor(){super(),this.serviceSelected={}}static get styles(){return[Ct,V.primaryAlt,B.primaryAlt,H.primaryAlt,F.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-select-service-shared-styles")]}_completeStep(e){Et(this,"step-one-continue"),Et(e.target,"complete")}_openModal(e){"newService"===e?Et(this,"list-services-get",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-step-select-service-link-name")}):"saveService"===e&&Et(this,"saved-services-get",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-step-select-stored-service-link-name")})}get _serviceSelected(){var e;return this.serviceSelected.name?a`
          <div class="service-selected">
            <bbva-clip-box
              class="image"
              .group=${[{icon:p(),size:"xl",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-multistep-header-step-one"}]}
            >
            </bbva-clip-box>
            <bbva-type-text
              size="L"
              font-weight="${v.fontWeight40}"
              text=${null===(e=this.serviceSelected)||void 0===e?void 0:e.name}
            >
            </bbva-type-text>
            <bbva-type-link
              id="changeService"
              class="trash-icon"
              variant="icon"
              icon="${g()}"
              icon-size="24"
              @click=${()=>Et(this,"multistep-exit","SELECT_SERVICE")}
            ></bbva-type-link>
          </div>
        `:b}get _renderOptions(){var e,t;return a`
      <div class="content-options">
        <bbva-type-link
          id="newService"
          ?disabled="${null===(e=this.serviceSelected)||void 0===e?void 0:e.name}"
          icon="${_()}"
          icon-size="24"
          @click="${()=>this._openModal("newService")}"
        >
          ${this.t("account-transaction-servicing-scheduled-bill-payments-step-select-service-button-link-one")}
        </bbva-type-link>
        <bbva-type-link
          id="saveService"
          ?disabled="${null===(t=this.serviceSelected)||void 0===t?void 0:t.name}"
          icon="${y()}"
          icon-size="24"
          @click="${()=>this._openModal("saveService")}"
        >
          ${this.t("account-transaction-servicing-scheduled-bill-payments-step-select-service-button-link-two")}
        </bbva-type-link>
      </div>
    `}get _renderDescription(){return a`
      <bbva-type-text
        text="${this.t("account-transaction-servicing-scheduled-bill-payments-step-select-service-caption")}"
        size="S"
      >
      </bbva-type-text>
    `}get _renderBtnContinue(){var e;return null!==(e=this.serviceSelected)&&void 0!==e&&e.name?a`
          <bbva-button-default
            id="serviceContinueButton"
            fullwidth
            text=${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}
            @click="${e=>this._completeStep(e)}"
          >
          </bbva-button-default>
        `:b}render(){return a`
      <div class="link-text" ambient="primary-alt">
      ${this._renderDescription} ${this._serviceSelected} ${this._renderOptions} ${this._renderBtnContinue}
      </div>
    `}}var Dt=l`
[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1.25rem;
}

[data-tag-name=bbva-form-input] {
  text-align: left;
}
`;class Pt extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-service-detail"}static get scopedElements(){const e=[j,xe,L,...Pt.configurationScopedElements()];return Pt.scopedElementsFromClasses(e)}static get properties(){return{checkOrigin:{type:Boolean,attribute:"check-origin"},nameService:{type:String,attribute:"name-service"},resetInputs:{type:Boolean,attribute:"reset-inputs"},scannerReference:{type:String,attribute:"scanner-reference"},_continueButton:{type:Boolean},_disabled:{type:Boolean},_invalid:{type:Boolean},_reference:{type:String},_serviceDetail:{type:Object},_serviceOwner:{type:String}}}constructor(){super(),this.reset()}reset(){this.checkOrigin=!1,this.nameService="",this.referenceScanner="",this.resetInputs=!1,this.scannerReference="",this._continueButton=!1,this._disabled=!1,this._invalid=!1,this._reference="",this._serviceDetail={},this._serviceOwner=""}static get styles(){return[Dt,Te.primaryAlt,H.primary,m("account-transaction-servicing-scheduled-bill-payments-service-detail-shared-styles")]}updated(e){super.updated&&super.updated(e),e.has("scannerReference")&&""!==this.scannerReference&&(this._reference=this.scannerReference)}_completeStep(e){this._serviceDetail={reference:this._reference,serviceOwner:this._serviceOwner},this.checkOrigin?Et(e.target,"complete"):Et(this,"accounts-cards-get"),Et(this,"service-detail",this._serviceDetail)}_validateInput(e,t){if(this._disabled=t.length>32,"reference"===e)this._reference=t;else if(""!==t){this._serviceOwner=t;const e=t.replace(/\s/g,"");this._invalid=/[\W\d]/g.test(e)}else this._invalid=!1;this._continueButton=!(""===this._reference||""===this._serviceOwner)}get _renderContinueDetail(){return a`
      <bbva-notification-message
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-message")}"
      ></bbva-notification-message>
      <bbva-button-default
        id="serviceDetailContinueButton"
        ambient="primary"
        ?disabled="${!this._continueButton||this._invalid}"
        fullwidth
        text="${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}"
        @click="${e=>this._completeStep(e)}"
      ></bbva-button-default>
    `}get _renderInputs(){return a`
      <bbva-form-input
        id="reference"
        ambient="primary-alt"
        type="camera"
        value="${this._reference}"
        ?disabled="${this._disabled}"
        ?reset-value="${this.resetInputs}"
        label="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-one")}"
        label-out="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-out-one")}"
        help-icon="${S()}"
        info-message="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-info-message")}"
        @form-field-help-click="${()=>{Et(this,"info-get","REFERENCE"),Et(this,"service-detail-interaction-select",{appStartedStep:this.t("account-transaction-servicing-scheduled-bill-payments-modal-reference"),nameService:this.nameService}),Et(this,"service-detail-reference-step-view")}}"
        @form-field-input-focus="${()=>{Et(this,"service-detail-interaction-select",{appStartedStep:this.t("account-transaction-servicing-scheduled-bill-payments-reference"),nameService:this.nameService})}}"
        @form-input-value-change="${e=>this._validateInput("reference",e.detail.value)}"
        @form-field-button-submit="${()=>{Et(this,"camera-open"),Et(this,"service-detail-interaction-select",{appStartedStep:this.t("account-transaction-servicing-scheduled-bill-payments-scan-reference"),nameService:this.nameService})}}"
      ></bbva-form-input>
      <bbva-form-input
        id="serviceOwner"
        ambient="primary-alt"
        type="text"
        value="${this._serviceOwner}"
        label="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-two")}"
        label-out="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-out-two")}"
        help-icon="${S()}"
        info-message="${this.t("account-transaction-servicing-scheduled-bill-payments-step-service-detail-info-message-special-characteres")}"
        ?reset-value="${this.resetInputs}"
        ?invalid="${this._invalid}"
        pattern=""
        error-message="${this.t("account-transaction-servicing-scheduled-bill-payments-modal-invalid-character")}"
        @form-field-help-click="${()=>{Et(this,"info-get","SERVICE_OWNER"),Et(this,"service-detail-interaction-select",{appStartedStep:this.t("account-transaction-servicing-scheduled-bill-payments-service-owner-modal"),nameService:this.nameService}),Et(this,"service-detail-service-owner-step-view")}}"
        @form-field-input-focus="${()=>Et(this,"service-detail-interaction-select",{appStartedStep:this.t("account-transaction-servicing-scheduled-bill-payments-service-owner"),nameService:this.nameService})}"
        @form-input-value-change="${e=>this._validateInput("serviceOwner",e.detail.value)}"
      ></bbva-form-input>
    `}render(){return a` ${this._renderInputs} ${this._renderContinueDetail} `}}var Ot=l`
.content-card-title {
  margin-top: 1rem;
  display: flex;
  flex-direction: column;
}

.num-card {
  display: flex;
  align-items: center;
  column-gap: 0.5rem;
  margin-bottom: 1rem;
}

.origin-info {
  display: flex;
  align-items: center;
}

.button-link {
  margin-top: 1rem;
}

[data-tag-name=bbva-tab-default] {
  --tab-default-group-padding: 0;
}

.align-items {
  display: flex;
  justify-content: space-between;
}

.button-content {
  margin: 1rem 0;
}
`;class It extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-select-origin"}static get scopedElements(){const e=[M,Ce,q,N,L,R,G,U,Ae,...It.configurationScopedElements()];return It.scopedElementsFromClasses(e)}static get properties(){return{accountList:{type:Array},cardList:{type:Array},maximumProductsShowed:{type:Number,attribute:"maximum-products-showed"},paymentMethod:{type:String,attribute:"payment-method"},_accountEntity:{type:Array},_paymentType:{type:String}}}constructor(){super(),this.language="",this.accountList=[],this.cardList=[],this.maximumProductsShowed=0,this.paymentMethod="",this._accountEntity=[{icon:p(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}],this._paymentType=""}static get styles(){return[Ot,F.primaryAlt,Ee.primaryAlt,B.primaryAlt,W.primaryAlt,V.primaryAlt,$e.primaryAlt,H.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-select-origin-shared-styles")]}get _showHelpModal(){return this.accountList.length<=1||0!==this.cardList.length?a`
          <bbva-button-default
            id="modalInfoButtonSelectCard"
            ambient="primary-alt"
            variant="icon no-background"
            icon="${S()}"
            icon-size="16"
            @click="${()=>{Et(this,"info-get","ORIGIN"),Et(this,"origin-payment-method-open")}}"
          >
          </bbva-button-default>
        `:b}get _validateDescription(){return this.accountList.length>1&&0===this.cardList.length?this.t("account-transaction-servicing-scheduled-bill-payments-step-origin-caption-account"):this.t("account-transaction-servicing-scheduled-bill-payments-step-origin-caption")}get _renderDescription(){return this._validateOriginProducts?a`
          <div class="origin-info">
            <bbva-type-text text="${this._validateDescription}" tag="p" size="S"></bbva-type-text>
            ${this._showHelpModal}
          </div>
        `:b}get _hasList(){return this.accountList.length>1||this.cardList.length>1||1===this.accountList.length&&1===this.cardList.length?"BOTH":""}get _renderAccountsAndCardsTab(){return"BOTH"===this.paymentMethod&&this.accountList.length>=1&&this.cardList.length>=1?a`
          <bbva-tab-default id="tabSelectOrigin" ambient="primary" .options="${[{title:"account-transaction-servicing-scheduled-bill-payments-tab-accounts"},{title:"account-transaction-servicing-scheduled-bill-payments-tab-cards"}]}">
            <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
              ${this._renderContent("accounts",this.accountList,this._hasList)}
            </div>
            <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
              ${this._renderContent("cards",this.cardList,this._hasList)}
            </div>
          </bbva-tab-default>
        `:this._renderOnlyAccountOrCard()}get _isOnlyCards(){return"CREDIT_CARD"===this.paymentMethod||"BOTH"===this.paymentMethod&&this.cardList.length>=1&&0===this.accountList.length}_renderOnlyAccountOrCard(){return this._isOnlyCards?this._renderContent("cards",this.cardList,this._hasList):this._renderContent("accounts",this.accountList,this._hasList)}_renderContent(e,t,i){const s="cards"===e?"cards":"accounts";return a`
      <div>
        <div class="align-items">
          ${this._renderHeaderDescription(s)} ${this._renderViewAll(e)}
        </div>
        ${this._renderListDetail(e,t,i)}
      </div>
    `}get _validateOriginProducts(){return this._hasOneAndMoreThanOne||this._hasMultipleAndIsEmpty||this._hasMultipleInBoth||this._hasOneInBothAndPaymentIsBoth}get _hasOneAndMoreThanOne(){const e=1===this.accountList.length,t=this.cardList.length>=2,i=this.accountList.length>=2,s=1===this.cardList.length;return e&&t||i&&s}get _hasMultipleAndIsEmpty(){const e=this.accountList.length>1,t=this.cardList.length>1,i=0===this.cardList.length,s=0===this.accountList.length;return e&&i||s&&t}get _hasMultipleInBoth(){const e=this.accountList.length>1,t=this.cardList.length>1;return e&&t}get _hasOneInBothAndPaymentIsBoth(){const e=1===this.accountList.length,t=1===this.cardList.length,i="BOTH"===this.paymentMethod;return e&&t&&i}_renderHeaderDescription(e){return this._validateOriginProducts?a`
          <bbva-type-text
            text-color="${f.secondary500}"
            font-weight="${v.fontWeight40}"
            text="${this.t(`account-transaction-servicing-scheduled-bill-payments-step-origin-${e}`)}"
            tag="p"
          >
          </bbva-type-text>
        `:b}_renderViewAll(e){return this.accountList.length>this.maximumProductsShowed&&"accounts"===e||this.cardList.length>this.maximumProductsShowed&&"cards"===e?a`
          <bbva-type-link
            id="${e}"
            class="button-link"
            ambient="primary-alt"
            @click="${()=>Et(this,"accounts-cards-show",e)}"
          >
            ${this.t("account-transaction-servicing-scheduled-bill-payments-step-origin-see-all")}
          </bbva-type-link>
        `:b}_renderListDetail(e,t,i){return"BOTH"===i?t.map(((i,s)=>s<3?a`
                <bbva-type-link
                  class="content-card-title"
                  @click="${()=>this._selectOriginCharge(i)}"
                >
                  <div class="align-items">
                    <bbva-type-link id="${s}"> ${null==i?void 0:i.productName} </bbva-type-link>
                    <bbva-type-amount
                      type="bold"
                      amount="${null==i?void 0:i.amount}"
                      currency-code="${null==i?void 0:i.currency}"
                      local-currency="${null==i?void 0:i.currency}"
                      language="${this.language}"
                    >
                    </bbva-type-amount>
                  </div>
                  <div class="align-items">
                    <div class="num-card">
                      ${this._renderAccountOrCardImage(e,i)}
                      <bbva-type-text
                        data-acoustic-obfuscate
                        ambient="primary-alt"
                        inherit=""
                        font-style="${C.fontStyle20}"
                        text="${At(null==i?void 0:i.number)}"
                        tag="p"
                        unset
                      >
                      </bbva-type-text>
                    </div>
                    <bbva-type-text
                      inherit
                      text="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-available-balance-text")}"
                      tag="p"
                      unset
                    >
                    </bbva-type-text>
                  </div>
                </bbva-type-link>
                ${s<t.length-1?a`
                      <bbva-divider-default id=${t.length} size="full"></bbva-divider-default>
                    `:b}
              `:b)):this.renderOnlyOneCardOrAccount(t[0],t.length,e)}renderOnlyOneCardOrAccount(e,t,i){return this._paymentType=i,1===this.accountList.length&&0===this.cardList.length||1===this.cardList.length&&0===this.accountList.length?a`
          <div class="content-card-title">
            <div class="align-items">
              <bbva-type-text
                text=${null==e?void 0:e.productName}
                id="${t}"
                inherit
                tag="p"
                font-weight="${v.fontWeight40}"
              >
              </bbva-type-text>
              <bbva-type-amount
                type="bold"
                amount="${null==e?void 0:e.amount}"
                currency-code=${null==e?void 0:e.currency}
                local-currency=${null==e?void 0:e.currency}
                language=${this.language}
              >
              </bbva-type-amount>
            </div>
            <div class="align-items">
              <div class="num-card">
                ${this._renderAccountOrCardImage(i,e)}
                <bbva-type-text
                  data-acoustic-obfuscate
                  ambient="primary-alt"
                  inherit=""
                  font-style="${C.fontStyle20}"
                  text="${At(null==e?void 0:e.number)}"
                  tag="p"
                  unset
                >
                </bbva-type-text>
              </div>
              <bbva-type-text
                inherit
                text="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-available-balance-text")}"
                tag="p"
                unset
              >
              </bbva-type-text>
            </div>
          </div>
        `:b}_renderAccountOrCardImage(e,t){return"cards"===e?a`
          <bbva-clip-card logo="bbva" card-type="visa" card-image="${null==t?void 0:t.image}" size="xs">
          </bbva-clip-card>
        `:a`
          <bbva-clip-box ambient="primary-alt" .group=${this._accountEntity}> </bbva-clip-box>
        `}get _renderButtonContinue(){const e="cards"===this._paymentType?this.cardList:this.accountList;return 1===this.accountList.length&&0===this.cardList.length||1===this.cardList.length&&0===this.accountList.length?a`
          <div class="button-content">
            <bbva-button-default
              id="bodyAccount"
              ambient="primary-alt"
              fullwidth
              text="${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}"
              @click="${()=>this._selectOriginCharge(e[0])}"
            >
            </bbva-button-default>
          </div>
        `:b}_selectOriginCharge(e){Et(this,"origin-select",e),Et(this,"complete")}render(){return a`
      ${this._renderDescription} ${this._renderAccountsAndCardsTab} ${this._renderButtonContinue}
    `}}var wt=l`
[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1.25rem;
}

[data-tag-name=bbva-form-input].edit-amount {
  text-align: center;
}
`;class kt extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-maximum-amount"}static get scopedElements(){const e=[xe,j,L,...kt.configurationScopedElements()];return kt.scopedElementsFromClasses(e)}static get properties(){return{currency:{type:String},editParams:{type:Object},exceptionEditAmount:{type:Array},isEditScheduled:{type:Boolean,attribute:"is-edit-scheduled"},isValidateEdit:{type:Boolean,attribute:"is-validate-edit"},minimumAmountEdit:{type:Number,attribute:"minimum-amount-edit"},resetAmount:{type:Boolean,attribute:"reset-amount"},serviceSelected:{type:String,attribute:"service-selected"},_amountValue:{type:Number},_invalid:{type:Boolean},_isEditAmount:{type:Boolean},_maximumAmount:{type:Number},_minimumAmount:{type:Number}}}constructor(){super(),this.currency="",this.editParams={},this.exceptionEditAmount=[],this.isEditScheduled=!1,this.isValidateEdit=!1,this.language="",this.minimumAmountEdit=0,this.resetAmount=!1,this.serviceSelected="",this._amountValue=0,this._invalid=!1,this._isEditAmount=!1,this._maximumAmount=0,this._minimumAmount=0}static get styles(){return[wt,Te.primaryAlt,H.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-maximum-amount-shared-styles")]}updated(e){if(super.updated&&super.updated(e),e.has("isEditScheduled")&&this.isEditScheduled){var t,i;if(Object.prototype.hasOwnProperty.call(this.editParams,"amount"))this._amountValue=null===(t=this.editParams)||void 0===t?void 0:t.amount,this._maximumAmount=null===(i=this.editParams)||void 0===i?void 0:i.amount,this._isEditAmount=!0;this._minimumAmount=this.minimumAmountEdit}else e.has("resetAmount")&&this.resetAmount&&(this._amountValue=0)}_completeStep(){!this.isEditScheduled||this.isValidateEdit?Et(this,"periodicity-items-get"):Et(this,"complete"),Et(this,"maximum-amount-select",this._maximumAmount)}_validateAmount({detail:e}){this._maximumAmount=e.amount,this.isEditScheduled&&(this.exceptionEditAmount.includes(this.serviceSelected)?this._minimumAmount=0:this._invalid=this._maximumAmount<=this._minimumAmount)}get _renderBodyAmount(){return a`
      <bbva-notification-message
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-maximum-amount-message")}"
      ></bbva-notification-message>
      <bbva-button-default
        id="amountContinueButton"
        ambient="primary"
        ?disabled="${this._maximumAmount<=this._minimumAmount}"
        fullwidth
        text="${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}"
        @click="${e=>this._completeStep(e)}"
      ></bbva-button-default>
    `}get _renderInputAmount(){return a`
      <bbva-form-input
        id="amountInput"
        class="${E({"edit-amount":this._isEditAmount})}"
        ambient="primary-alt"
        type="amount"
        currency-code="${this.currency}"
        ?reset-value="${this.resetAmount}"
        local-currency="${this.currency}"
        language="${this.language}"
        amount="${0===this._amountValue?b:this._amountValue}"
        label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-maximum-amount-text")}"
        label-out="${this.t("account-transaction-servicing-scheduled-bill-payments-step-maximum-amount-label-out")}"
        ?invalid="${this._invalid}"
        error-message="${this.t("account-transaction-servicing-scheduled-bill-payments-maximum-amount-error-message",{editNumber:this.minimumAmountEdit+1})}"
        @form-amount-input-change="${this._validateAmount}"
        @form-input-value-change="${()=>{this._isEditAmount=!1}}"
      ></bbva-form-input>
    `}render(){return a` ${this._renderInputAmount} ${this._renderBodyAmount} `}}var Nt=l`
[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1.25rem;
}
`;const Rt={FORTNIGHTLY:"BIWEEKLY",HALFYEAR:"SIX_MONTHLY",ANNUAL:"YEARLY"},Mt={BIWEEKLY:"FORTNIGHTLY",SIX_MONTHLY:"HALFYEAR",YEARLY:"ANNUAL"},Lt={WEEKLY:"account-transaction-servicing-scheduled-bill-payments-periodicity-weekly",FORTNIGHTLY:"account-transaction-servicing-scheduled-bill-payments-periodicity-biweekly",MONTHLY:"account-transaction-servicing-scheduled-bill-payments-periodicity-monthly",BIMONTHLY:"account-transaction-servicing-scheduled-bill-payments-periodicity-bimonthly",HALFYEAR:"account-transaction-servicing-scheduled-bill-payments-periodicity-halfyear",ANNUAL:"account-transaction-servicing-scheduled-bill-payments-periodicity-yearly"};class Vt extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-periodicity"}static get scopedElements(){const e=[De,Pe,j,L,...Vt.configurationScopedElements()];return Vt.scopedElementsFromClasses(e)}static get properties(){return{editParams:{type:Object},isEditScheduled:{type:Boolean,attribute:"is-edit-scheduled"},periodicityItems:{type:Array},_periodicity:{type:Object},_periodicitySelected:{type:String}}}constructor(){super(),this.editParams={},this.isEditScheduled=!1,this.periodicityItems=[],this._periodicity={},this._periodicitySelected=""}static get styles(){return[Nt,H.primaryAlt,Oe.primaryAlt,Ie.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-periodicity-shared-styles")]}updated(e){super.updated&&super.updated(e),e.has("isEditScheduled")&&this.isEditScheduled&&(this._periodicitySelected=this.editParams.value,this._periodicity={value:this.editParams.value})}_completeStep(e){Et(e.target,"complete"),Et(this,"periodicity-select",this._periodicity)}_validatePeriodicity(e){this._periodicity={value:e.value}}get _renderFormSelect(){return a`
      <bbva-form-select
        id="periodicitySelect"
        ambient="primary-alt"
        remove-labelledby-button
        optional-label=""
        label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-text")}"
        info-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-periodicity-label-out")}"
        @bbva-form-select-selected-item="${e=>this._validatePeriodicity(e.detail)}"
      >
        ${this._showOptions}
      </bbva-form-select>
    `}get _showOptions(){return this.periodicityItems.map((e=>a`
        <bbva-form-option
          id="${e.value.charAt(0)+e.value.slice(1).toLowerCase()}"
          ambient="primary-alt"
          value="${e.value}"
          ?selected="${e.value===this._periodicitySelected}"
        >
          ${this.t(Lt[e.value])}
        </bbva-form-option>
      `))}get _renderPeriodicityBody(){return a`
      <bbva-notification-message
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-periodicity-message")}"
      ></bbva-notification-message>
      <bbva-button-default
        id="periodicityContinueButton"
        ambient="primary"
        ?disabled="${0===Object.keys(this._periodicity).length}"
        fullwidth
        text="${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}"
        @click="${e=>this._completeStep(e)}"
      ></bbva-button-default>
    `}render(){return a` ${this._renderFormSelect} ${this._renderPeriodicityBody} `}}var Bt=l`
[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

.link-text {
  display: flex;
  flex-direction: column;
}

.select-link {
  padding: 0.625rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1.25rem;
}

.terms-and-conditions-checkbox {
  row-gap: 0.5rem;
  display: flex;
  flex-direction: column;
  margin-top: 1rem;
}
`;class Ht extends(w(k(h(t)))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-terms-and-conditions"}static get scopedElements(){const e=[j,R,he,L,Ht.configurationScopedElements()];return Ht.scopedElementsFromClasses(e)}static get properties(){return{cancelParams:{type:Object},isCancelScheduled:{type:Boolean,attribute:"is-cancel-scheduled"},isValidateOperation:{type:Boolean,attribute:"is-validate-operation"},originNumber:{type:String,attribute:"origin-number"},_agreementCheckbox:{type:Boolean},_authorizationCheckbox:{type:Boolean},_cancelCheckbox:{type:Boolean},_pdfId:{type:String}}}constructor(){super(),this.cancelParams={},this.isCancelScheduled=!1,this.isValidateOperation=!1,this.originNumber="",this._agreementCheckbox=!1,this._authorizationCheckbox=!1,this._cancelCheckbox=!1,this._pdfId=""}static get styles(){return[Bt,B.primaryAlt,me.primaryAlt,H.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-terms-and-conditions-shared-styles")]}get _cancelScheduled(){return a`
      <bbva-notification-message
        variant="caution"
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-message-cancel-box-one")}"
      >
      </bbva-notification-message>
      <bbva-notification-message
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-message-cancel-box-two")}"
      >
      </bbva-notification-message>
      <div class="link-text">
        <bbva-type-link
          id="termsAndConditionsCancelLink"
          class="select-link"
          ambient="primary"
          icon="${x()}"
          @click="${this._showPdf}"
        >
          ${this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-link-cancel")}
        </bbva-type-link>
      </div>
      <div class="terms-and-conditions-checkbox">${this._checksListCancel}</div>
    `}get _checksListScheduled(){var e;const t=this.isValidateOperation?"domiciliation":"recurring-charge";return(null===(e=this.originNumber)||void 0===e?void 0:e.length)>0?a`
          <bbva-form-checkbox
            id="agreementCheckbox"
            label="${this.t(`account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-checkbox-one-${t}`)}"
            @change="${this._handlerCheckedAgreement}"
          >
          </bbva-form-checkbox>
          <bbva-form-checkbox
            id="authorizationCheckbox"
            label="${this.t(`account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-checkbox-two-${t}`,{account:this.originNumber})}"
            @change="${this._handlerCheckedAuthorization}"
          >
          </bbva-form-checkbox>
        `:b}get _checksListCancel(){const e=this.isValidateOperation?"domiciliation":"recurring-charge";return a`
      <bbva-form-checkbox
        id="cancelCheckbox"
        ambient="primary-alt"
        label="${this.t(`account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-checkbox-cancel-${e}`,{origin:this.cancelParams.originNumber})}"
        @change="${this._handlerCheckedCancel}"
      >
      </bbva-form-checkbox>
    `}static _completeStep(e){Et(e.target,"complete"),Et(e.target,"step-collapse")}_handlerCheckedAgreement(e){this._agreementCheckbox=e.detail.checked}_handlerCheckedAuthorization(e){this._authorizationCheckbox=e.detail.checked}_handlerCheckedCancel(e){this._cancelCheckbox=e.detail.checked}get _disabledButton(){return this.isCancelScheduled?!this._cancelCheckbox:!this._agreementCheckbox||!this._authorizationCheckbox}_selectRender(){return this.isCancelScheduled?this._cancelScheduled:this._scheduledService}_showPdf(){this.isCancelScheduled?this._pdfId=this.isValidateOperation?this.t("account-transaction-servicing-scheduled-bill-payments-pdf-id-domiciliation-low"):this.t("account-transaction-servicing-scheduled-bill-payments-pdf-id-recurring-charge-low"):this._pdfId=this.isValidateOperation?this.t("account-transaction-servicing-scheduled-bill-payments-pdf-id-domiciliation"):this.t("account-transaction-servicing-scheduled-bill-payments-pdf-id-recurring-charge"),Et(this,"pdf-document-select",this._pdfId)}get _scheduledService(){return a`
      <bbva-notification-message
        book-title
        message-title="${this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-message")}"
      >
      </bbva-notification-message>
      <div class="link-text" ambient="primary">
        <bbva-type-link
          id="termsAndConditionsScheduledLink"
          class="select-link"
          icon="${x()}"
          @click=${this._showPdf}
        >
          ${this.isValidateOperation?this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-link-text"):this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-link-text-two")}
        </bbva-type-link>
      </div>
      <div class="terms-and-conditions-checkbox" ambient="primary-alt">
        ${this._checksListScheduled}
      </div>
    `}render(){return a`
      ${this._selectRender()}
      <bbva-button-default
        id="termsAndConditionsButton"
        ambient="primary"
        fullwidth
        ?disabled="${this._disabledButton}"
        @click="${Ht._completeStep}"
      >
        ${this.t("account-transaction-servicing-scheduled-bill-payments-step-button-continue")}
      </bbva-button-default>
    `}}class Ft extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-multistep"}static get scopedElements(){const e=[L,z,q,pe,ve,M,Ce,N,G,K,$t,Pt,It,kt,Vt,Ht,...Ft.configurationScopedElements()];return Ft.scopedElementsFromClasses(e)}static get properties(){return{accountList:{type:Array},cancelParams:{type:Object},cardList:{type:Array},editParams:{type:Object},exceptionEditAmount:{type:Array},isAccount:{type:Boolean,attribute:"is-account"},isCancelScheduled:{type:Boolean,attribute:"is-cancel-scheduled"},isEditScheduled:{type:Boolean,attribute:"is-edit-scheduled"},isFirstStepCompleted:{type:Boolean,attribute:"is-first-step-completed"},isThreeStepCompleted:{type:Boolean,attribute:"is-three-step-completed"},isValidateEdit:{type:Boolean,attribute:"is-validate-edit"},maximumProductsShowed:{type:Number,attribute:"maximum-products-showed"},minimumAmountEdit:{type:Number,attribute:"minimum-amount-edit"},originSelected:{type:Object},paymentMethod:{type:String,attribute:"payment-method"},periodicityItems:{type:Array},resetInputs:{type:Boolean,attribute:"reset-inputs"},resetProgressMultistep:{type:Boolean,attribute:"reset-progress-multistep"},scannerReference:{type:String,attribute:"scanner-reference"},secondStepCollapsed:{type:String,attribute:"second-step-collapsed"},selectedService:{type:Object},serviceDetail:{type:Object},showMultistep:{type:Boolean,attribute:"show-multistep"},_buildScheduledData:{type:Object},_editSteps:{type:Array},_isCheckTermsAndConditions:{type:Boolean},_isEditMaximumAmount:{type:Boolean},_isEditPeriodicity:{type:Boolean},_isHeaderStyle:{type:Boolean},_isMaximumAmountCompleted:{type:Boolean},_isServiceDetailCompleted:{type:Boolean},_maximumAmountSelected:{type:Number},_originSelected:{type:Object},_periodicitySelected:{type:String},_typeScheduledBillPayment:{type:String}}}constructor(){super(),this.accountList=[],this.cancelParams={},this.cardList=[],this.editParams={},this.exceptionEditAmount=[],this.isAccount=!1,this.isCancelScheduled=!1,this.isEditScheduled=!1,this.isFirstStepCompleted=!1,this.isThreeStepCompleted=!1,this.isValidateEdit=!1,this.iOSFixedHeader=!1,this.language="",this.maximumProductsShowed=0,this.minimumAmountEdit=0,this.originSelected={},this.paymentMethod="",this.periodicityItems=[],this.resetInputs=!1,this.resetProgressMultistep=!1,this.scannerReference="",this.secondStepCollapsed="",this.selectedService={},this.serviceDetail={},this.showMultistep=!1,this._buildScheduledData={},this._editSteps=[0,2,3,4,5],this._isCheckTermsAndConditions=!1,this._isEditMaximumAmount=!1,this._isEditPeriodicity=!1,this._isHeaderStyle=!1,this._isMaximumAmountCompleted=!1,this._isServiceDetailCompleted=!1,this._maximumAmountSelected=0,this._originSelected={},this._periodicitySelected={},this._typeScheduledBillPayment=""}static get styles(){return[St,H.primary,V.primaryAlt,V.secondary,F.secondary,Ee.secondary,W.secondary,W.primaryAlt,Y.secondary,ft,m("account-transaction-servicing-scheduled-bill-payments-multistep-shared-styles")]}updated(e){if(super.updated(e),e.has("secondStepCollapsed")&&"serviceDetail"===this.secondStepCollapsed&&(this._isServiceDetailCompleted=!0,this.secondStepCollapsed=""),e.has("isEditScheduled")&&this.isEditScheduled){var t,i,s,a;if(!this.isValidateEdit)this._isMaximumAmountCompleted=!0,this._isPeriodicityCompleted=!0,this._isTermsAndConditionsCompleted=!0,this._maximumAmountSelected=null===(s=this.editParams)||void 0===s?void 0:s.amount,this._periodicitySelected=Lt[null===(a=this.editParams)||void 0===a?void 0:a.periodicity.value];this._isHeaderStyle=!0,this._originSelected=null===(t=this.editParams)||void 0===t?void 0:t.origin,null!==(i=this._originSelected)&&void 0!==i&&i.isCard&&(this._originSelected.cardType=!0)}else if(e.has("isCancelScheduled")&&this.isCancelScheduled){this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').activeSteps=["selectServiceMultiStep","termsAndConditionsMultiStep"],this._typeScheduledBillPayment="cancelScheduled"}e.has("isFirstStepCompleted")&&this.isFirstStepCompleted&&this._completeServiceSelected(),e.has("resetProgressMultistep")&&this.resetProgressMultistep&&this.resetMultistepProperties(),e.has("isThreeStepCompleted")&&this.isThreeStepCompleted&&(this._completeOriginSelected(this.originSelected),this.isThreeStepCompleted=!0)}static _parseValue(e){return null==e?void 0:e.toLowerCase()}static _listServices(e){return[{text:null==e?void 0:e.name,size:"xl",bgColor:f.primaryMedium,bitone:"true"}]}_sendData(e){e.stopPropagation(),this.isEditScheduled?this.isValidateEdit?Et(this,"edit-info-send"):(this._isEditMaximumAmount&&this._isEditPeriodicity?Et(this,"edit-info-send"):this._isEditMaximumAmount?Et(this,"edit-send","editAmount"):this._isEditPeriodicity?Et(this,"edit-send","editPeriodicity"):Et(this,"edit-service-send"),Et(this,"confirm-edit",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-confirm-edit")})):(this._buildScheduledData={...this._buildScheduledData,applicationProcess:this.t("account-transaction-servicing-scheduled-bill-payments-application-process-schedule")},Et(this,"info-send"),Et(this,"scheduled-bill-payment-data-share",this._buildScheduledData))}static get _entityAccount(){return a`
      <bbva-clip-box
        ambient="secondary"
        .group="${[{icon:p(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}]}"
      >
      </bbva-clip-box>
    `}static _imageCard(e){return a`
      <bbva-clip-card
        ambient="secondary"
        logo="bbva"
        card-type="visa"
        card-image="${e}"
        size="s"
      >
      </bbva-clip-card>
    `}get _summarySelectService(){var e,t,i,s,n,r,o,c,l,d,u;return this.isCancelScheduled?a`
          <div class="detail-content">
            <div class="service-cancel" ambient="secondary">
              <bbva-clip-box
                class="image"
                .group="${Ft._listServices(this.cancelParams)}"
              >
              </bbva-clip-box>
              <bbva-type-text
                font-weight="${v.fontWeight40}"
                text="${null===(t=this.cancelParams)||void 0===t?void 0:t.name}"
                inherit
              >
              </bbva-type-text>
            </div>
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-multistep-reference-text"
                inherit
              >
              </bbva-type-text>
              <bbva-type-text
                font-weight="${v.fontWeight40}"
                text="${null===(i=this.cancelParams)||void 0===i?void 0:i.reference}"
                inherit
              >
              </bbva-type-text>
            </div>
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-multistep-service-owner-text"
                inherit
              >
              </bbva-type-text>
              <bbva-type-text
                class="align-detail"
                font-weight="${v.fontWeight40}"
                text="${null===(s=this.cancelParams)||void 0===s?void 0:s.serviceOwner}"
                inherit
              >
              </bbva-type-text>
            </div>
            ${this._showContractDetail}
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-multistep-operation-type-text"
                inherit
              >
              </bbva-type-text>
              <bbva-type-text
                class="align-detail"
                font-weight="${v.fontWeight40}"
                text="${this.isAccount?"account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-scheduled":"account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-recurring-charge"}"
                inherit
              >
              </bbva-type-text>
            </div>
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-ticket-body-origin"
                inherit
              >
              </bbva-type-text>
              <bbva-type-text
                font-weight="${v.fontWeight40}"
                text="${`${null===(n=this.cancelParams)||void 0===n?void 0:n.originName} ${null===(r=this.cancelParams)||void 0===r?void 0:r.originNumber}`}"
                inherit
              >
              </bbva-type-text>
            </div>
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-multistep-maximum-amount-text"
                inherit
              >
              </bbva-type-text>
              <bbva-type-amount
                class="cancel-amount"
                type="bold"
                amount="${null===(o=this.cancelParams)||void 0===o?void 0:o.maximumAmount}"
                currency-code="${null===(c=this.cancelParams)||void 0===c?void 0:c.currency}"
                local-currency="${null===(l=this.cancelParams)||void 0===l?void 0:l.currency}"
                language="${this.language}"
                inherit
              >
              </bbva-type-amount>
            </div>
            <div class="body-cancel" ambient="secondary">
              <bbva-type-text
                font-weight="${v.fontWeight30}"
                text="account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-text"
                inherit
              >
              </bbva-type-text>
              <bbva-type-text
                font-weight="${v.fontWeight40}"
                text="${(null===(d=this.cancelParams)||void 0===d||null===(u=d.periodicity)||void 0===u?void 0:u.text)||"account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-label-default"}"
                inherit
              >
              </bbva-type-text>
            </div>
          </div>
        `:a`
          <div class="service-selected" ambient="secondary">
            <bbva-clip-box
              class="image"
              .group="${Ft._listServices(this.selectedService)}"
            >
            </bbva-clip-box>
            <bbva-type-text
              unset
              font-weight="${v.fontWeight40}"
              text="${null===(e=this.selectedService)||void 0===e?void 0:e.name}"
            >
            </bbva-type-text>
          </div>
        `}get _showContractDetail(){var e,t;return null!==(e=this.cancelParams)&&void 0!==e&&e.contractId?a`
          <div class="body-cancel" ambient="secondary">
            <bbva-type-text
              font-weight="${v.fontWeight30}"
              text="account-transaction-servicing-scheduled-bill-payments-multistep-contract-text"
              inherit
            >
            </bbva-type-text>
            <bbva-type-text
              font-weight="${v.fontWeight40}"
              text="${null===(t=this.cancelParams)||void 0===t?void 0:t.contractId}"
              inherit
            >
            </bbva-type-text>
          </div>
        `:b}get _summaryServiceDetail(){var e,t;return a`
      <div class="content-summary" ambient="secondary">
        <bbva-type-text
          font-weight="${v.fontWeight30}"
          text="account-transaction-servicing-scheduled-bill-payments-multistep-reference-text"
          inherit
        >
        </bbva-type-text>
        <bbva-type-text
          font-weight="${v.fontWeight40}"
          text="${null===(e=this.serviceDetail)||void 0===e?void 0:e.reference}"
          inherit
        >
        </bbva-type-text>
      </div>
      <div class="content-summary" ambient="secondary">
        <bbva-type-text
          class="service-owner-title"
          font-weight="${v.fontWeight20}"
          text="account-transaction-servicing-scheduled-bill-payments-multistep-service-owner-text"
          inherit
        >
        </bbva-type-text>
        <bbva-type-text
          class="align-detail"
          font-weight="${v.fontWeight40}"
          text="${null===(t=this.serviceDetail)||void 0===t?void 0:t.serviceOwner}"
          inherit
        >
        </bbva-type-text>
      </div>
    `}get _summarySelectOrigin(){var e,t,i,s,n;return a`
      <div class="content-account" ambient="secondary">
        <bbva-type-text
          font-weight="${v.fontWeight40}"
          text="${null===(e=this._originSelected)||void 0===e?void 0:e.productName}"
          inherit
        >
        </bbva-type-text>
        <bbva-type-amount
          type="bold"
          amount="${null===(t=this._originSelected)||void 0===t?void 0:t.amount}"
          currency-code="${null===(i=this._originSelected)||void 0===i?void 0:i.currency}"
          local-currency="${null===(s=this._originSelected)||void 0===s?void 0:s.currency}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
      <div class="description-account" ambient="secondary">
        <div class="num-account">
          ${"cardType"in this._originSelected?Ft._imageCard(this._originSelected.image):Ft._entityAccount}
          <bbva-type-text
            data-acoustic-obfuscate
            unset
            font-style="${C.fontStyle20}"
            text="${At(null===(n=this._originSelected)||void 0===n?void 0:n.number)}"
          >
          </bbva-type-text>
        </div>
        <bbva-type-text
          unset
          text="account-transaction-servicing-scheduled-bill-payments-multistep-available-balance-text"
        >
        </bbva-type-text>
      </div>
    `}get _summarySelectMaximumAmount(){return a`
      <div class="max-amount" ambient="secondary">
        <bbva-type-text
          font-weight="${v.fontWeight30}"
          text="account-transaction-servicing-scheduled-bill-payments-multistep-maximum-amount-text"
        >
        </bbva-type-text>
        <bbva-type-amount
          type="bold"
          amount="${this._maximumAmountSelected}"
          currency-code="${this._originSelected.currency}"
          local-currency="${this._originSelected.currency}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}get _summarySelectPeriodicity(){return a`
      <div class="content-summary" ambient="secondary">
        <bbva-type-text
          font-weight="${v.fontWeight30}"
          text="account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-text"
        >
        </bbva-type-text>
        <bbva-type-text
          font-weight="${v.fontWeight40}"
          text="${this.t(this._periodicitySelected)}"
        >
        </bbva-type-text>
      </div>
    `}get _summaryTermsAndConditions(){return a`
      <bbva-notification-help
        ambient="secondary"
        accessibility-label-icon="${this.t("account-transaction-servicing-scheduled-bill-payments-accessibility-success")}"
        variant="${this.isEditScheduled?"warning":"success"}"
        text="${this.isEditScheduled?"account-transaction-servicing-scheduled-bill-payments-multistep-terms-and-conditions-text-edit":"account-transaction-servicing-scheduled-bill-payments-multistep-terms-and-conditions-text"}"
      >
      </bbva-notification-help>
    `}get _summaryButton(){return this.isCancelScheduled?a` <div class="button-cancel">
          <bbva-button-default
            id="buttonCancel"
            variant="positive"
            fullwidth
            @click="${e=>Et(e.target,"scheduled-cancel")}"
            text="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-button-summary-confirm")}"
          >
          </bbva-button-default>
        </div>`:a`
          <div class="panel-summary" ambient="primary-alt">
            <bbva-type-text
              text="account-transaction-servicing-scheduled-bill-payments-multistep-maximum-amount-text"
            >
            </bbva-type-text>
            <bbva-type-amount
              class="amount-value"
              type="bold"
              amount="${this._maximumAmountSelected}"
              currency-code="${this._originSelected.currency}"
              local-currency="${this._originSelected.currency}"
              language="${this.language}"
            >
            </bbva-type-amount>
            <bbva-type-text
              font-style="${C.fontStyle20}"
              text="account-transaction-servicing-scheduled-bill-payments-multistep-button-summary-text"
            >
            </bbva-type-text>
            <div class="button-continue">
              <bbva-button-default
                id="buttonContinue"
                variant="positive"
                fullwidth
                ?disabled="${this._isCheckTermsAndConditions}"
                @click="${this._sendData}"
                text="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-button-summary-confirm")}"
              >
              </bbva-button-default>
            </div>
          </div>
        `}resetMultistepProperties(){this.selectedService={},this.serviceDetail={},this.paymentMethod="",this._isHeaderStyle=!1,this._originSelected={},this._maximumAmountSelected=0,this._periodicitySelected=""}_completeServiceSelected(){this._isHeaderStyle=!0,this._buildScheduledData={nameService:Ft._parseValue(this.selectedService.name)},Et(this,"scheduled-bill-payment-open",this._buildScheduledData)}_completeServiceDetail(){this._isHeaderStyle=!0,Et(this,"service-detail-step-continue",this._buildScheduledData)}_completeOriginSelected(e){var t;this._originSelected=e,this._isHeaderStyle=!0,this._buildScheduledData={...this._buildScheduledData,primaryCategory:"accountType"in this._originSelected?this.t("account-transaction-servicing-scheduled-bill-payments-accounts"):this.t("account-transaction-servicing-scheduled-bill-payments-cards"),productSubType:"accountType"in this._originSelected?"":this.t("account-transaction-servicing-scheduled-bill-payments-credit-card"),productName:Ft._parseValue(null===(t=this._originSelected)||void 0===t?void 0:t.productName)},Et(this,"origin-step-continue",this._buildScheduledData),this._isMaximumAmountCompleted=!1}_completeMaximumAmount(e){this._maximumAmountSelected=e,this._isMaximumAmountCompleted=!0,this._isHeaderStyle=!0,this.isEditScheduled||this.isCancelScheduled||(this._buildScheduledData={...this._buildScheduledData,amount:e,currency:this._originSelected.currency},Et(this,"maximum-amount-step-continue",this._buildScheduledData))}_completePeriodicity(e){this._periodicitySelected=Lt[e.value],this._isHeaderStyle=!0,Et(this,"periodicity-step-continue",this._buildScheduledData)}_termsAndConditionschecked(){this.isEditScheduled&&(this._isCheckTermsAndConditions=!1),this.isCancelScheduled||this.isEditScheduled||Et(this,"customer-contact-details-get"),this._isHeaderStyle=!0,Et(this,"terms-and-conditions-step-continue",this._buildScheduledData)}_editStep(e){e.stopPropagation();const{detail:t}=e;this.isEditScheduled?0===t?(this._isHeaderStyle=!1,this._isMaximumAmountCompleted=!1,this._isEditMaximumAmount=!0,this._isCheckTermsAndConditions=!0,Et(this,"maximum-amount-edit",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-maximum-amount-edit")})):1===t?(this._isHeaderStyle=!1,this._isEditPeriodicity=!0,this._isCheckTermsAndConditions=!0,Et(this,"periodicity-items-get"),Et(this,"periodicity-edit",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-periodicity-edit")})):2===t?(this._isHeaderStyle=!1,Et(this,"terms-and-conditions-check",{textLinkName:this.t("account-transaction-servicing-scheduled-bill-payments-consult-terms-and-conditions")})):this._isHeaderStyle=!1:(2===t&&Et(this,"origin-properties-clear"),3===t&&(this._isMaximumAmountCompleted=!1),this._editSteps.includes(t)&&(this._isHeaderStyle=!1))}get _selectVariant(){return this.isCancelScheduled||this.isEditScheduled&&this._isHeaderStyle||this._isHeaderStyle?"modal-initial-secondary":"modal-sequential"}get _selectHeaderText(){return this.isCancelScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-cancel"):this.isEditScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-edit"):this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header")}_getVariableStepInfo(e){return{step:e,total:"cancelScheduled"===this._typeScheduledBillPayment?1:6}}get _selectServiceStep(){return a`
      <bbva-expandable-step
        id="selectServiceMultiStep"
        header-completed-ellipsis
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-one")}"
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(1))}"
        view-label=""
        edit-label="account-transaction-servicing-scheduled-bill-payments-multistep-edit-label"
        ?prefilled="${this.isCancelScheduled||this.isEditScheduled}"
        show-link
        ?is-dynamic-handler="${this.isCancelScheduled||this.resetProgressMultistep}"
        ?completed="${this.isFirstStepCompleted}"
        ?active="${!this.isFirstStepCompleted}"
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-select-service
            id="selectServiceStep"
            .serviceSelected="${this.selectedService}"
            @account-transaction-servicing-scheduled-bill-payments-step-one-continue="${()=>{this._isHeaderStyle=!0}}"
          >
          </account-transaction-servicing-scheduled-bill-payments-select-service>
        </div>
        <div class="summary" slot="summary">${this._summarySelectService}</div>
      </bbva-expandable-step>
    `}get _serviceDeatilStep(){var e;return a`
      <bbva-expandable-step
        id="serviceDetailMultiStep"
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-two")}"
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(2))}"
        view-label
        edit-label="account-transaction-servicing-scheduled-bill-payments-multistep-edit-label"
        ?completed="${this._isServiceDetailCompleted}"
        ?active="${!this._isServiceDetailCompleted&&!this.isCancelScheduled}"
        ?prefilled="${this.isEditScheduled}"
        show-link
        hide-padding-top
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-service-detail
            id="serviceDetailStep"
            ?check-origin="${this._isServiceDetailCompleted}"
            scanner-reference="${this.scannerReference}"
            ?reset-inputs="${this.resetInputs}"
            name-service="${Ft._parseValue(null===(e=this.selectedService)||void 0===e?void 0:e.name)}"
            @account-transaction-servicing-scheduled-bill-payments-service-detail="${this._completeServiceDetail}"
          >
          </account-transaction-servicing-scheduled-bill-payments-service-detail>
        </div>
        <div class="summary detail-content" slot="summary">${this._summaryServiceDetail}</div>
      </bbva-expandable-step>
    `}get _selectOriginStep(){return a`
      <bbva-expandable-step
        id="selectOriginMultiStep"
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-three")}"
        hide-padding-top
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(3))}"
        view-label
        edit-label="account-transaction-servicing-scheduled-bill-payments-multistep-edit-label"
        ?prefilled="${this.isEditScheduled}"
        ?completed="${this.isThreeStepCompleted}"
        ?active="${!this.isThreeStepCompleted&&!this.isCancelScheduled}"
        show-link
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-select-origin
            id="selectOriginStep"
            language="${this.language}"
            payment-method="${this.paymentMethod}"
            .accountList="${this.accountList}"
            .cardList="${this.cardList}"
            maximum-products-showed="${this.maximumProductsShowed}"
            @account-transaction-servicing-scheduled-bill-payments-origin-select="${({detail:e})=>this._completeOriginSelected(e)}"
          >
          </account-transaction-servicing-scheduled-bill-payments-select-origin>
        </div>
        <div class="summary" slot="summary">${this._summarySelectOrigin}</div>
      </bbva-expandable-step>
    `}get _selectMaximumAmountStep(){var e,t,i;return a`
      <bbva-expandable-step
        id="maximumAmountMultiStep"
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-four")}"
        hide-padding-top
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(4))}"
        edit-label="account-transaction-servicing-scheduled-bill-payments-multistep-edit-label"
        ?completed="${this._isMaximumAmountCompleted}"
        ?active="${!this._isMaximumAmountCompleted&&!this.isCancelScheduled}"
        show-link
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-maximum-amount
            id="maximumAmountStep"
            currency="${this.isEditScheduled?null===(e=this.editParams)||void 0===e?void 0:e.currency:null===(t=this._originSelected)||void 0===t?void 0:t.currency}"
            language="${this.language}"
            ?reset-amount="${this.resetInputs}"
            ?is-edit-scheduled="${this.isEditScheduled}"
            ?is-validate-edit="${this.isValidateEdit}"
            .editParams="${this.editParams}"
            service-selected="${this.isEditScheduled?null===(i=this.selectedService)||void 0===i?void 0:i.name:b}"
            .exceptionEditAmount="${this.exceptionEditAmount}"
            minimum-amount-edit="${this.minimumAmountEdit}"
            @account-transaction-servicing-scheduled-bill-payments-maximum-amount-select="${({detail:e})=>this._completeMaximumAmount(e)}"
          >
          </account-transaction-servicing-scheduled-bill-payments-maximum-amount>
        </div>
        <div class="summary" slot="summary">${this._summarySelectMaximumAmount}</div>
      </bbva-expandable-step>
    `}get _selectPeriodicityStep(){var e;return a`
      <bbva-expandable-step
        id="selectPeriodicityMultiStep"
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-five")}"
        hide-padding-top
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(5))}"
        edit-label="account-transaction-servicing-scheduled-bill-payments-multistep-edit-label"
        ?completed="${this._isPeriodicityCompleted}"
        ?active="${!this._isPeriodicityCompleted&&!this.isCancelScheduled}"
        show-link
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-periodicity
            id="periodicityStep"
            .periodicityItems="${this.periodicityItems}"
            ?is-edit-scheduled="${this.isEditScheduled}"
            .editParams="${null===(e=this.editParams)||void 0===e?void 0:e.periodicity}"
            @account-transaction-servicing-scheduled-bill-payments-periodicity-select="${({detail:e})=>this._completePeriodicity(e)}"
          >
          </account-transaction-servicing-scheduled-bill-payments-periodicity>
        </div>
        <div class="summary" slot="summary">${this._summarySelectPeriodicity}</div>
      </bbva-expandable-step>
    `}get _termsAndConditionsStep(){var e;const t=this.isCancelScheduled?1:6;return a`
      <bbva-expandable-step
        id="termsAndConditionsMultiStep"
        header-completed-ellipsis
        header="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-step-six")}"
        current-step-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-current-step-label",this._getVariableStepInfo(t))}"
        edit-label=${this.isCancelScheduled?"account-transaction-servicing-scheduled-bill-payments-multistep-edit-label":"account-transaction-servicing-scheduled-bill-payments-multistep-edit-label-consult"}
        ?completed="${this._isTermsAndConditionsCompleted}"
        show-link
      >
        <div class="content">
          <account-transaction-servicing-scheduled-bill-payments-terms-and-conditions
            id="termsAndConditionsStep"
            origin-number="${At(null===(e=this._originSelected)||void 0===e?void 0:e.number)||""}"
            ?is-validate-operation="${this.isAccount}"
            .cancelParams="${this.cancelParams}"
            ?is-cancel-scheduled="${this.isCancelScheduled}"
            @account-transaction-servicing-scheduled-bill-payments-step-collapse="${this._termsAndConditionschecked}"
          >
          </account-transaction-servicing-scheduled-bill-payments-terms-and-conditions>
        </div>
        <div class="summary" slot="summary">${this._summaryTermsAndConditions}</div>
      </bbva-expandable-step>
    `}get _renderMultistep(){return a`
      <bbva-expandable-multistep
        id="expandableMultistep"
        step-selector='[data-tag-name="bbva-expandable-step"]'
        scroll-to-step-index="${-1}"
        @expandable-step-edit-step="${this._editStep}"
      >
        <div slot="content">
          ${this._selectServiceStep} ${this._serviceDeatilStep} ${this._selectOriginStep}
          ${this._selectMaximumAmountStep} ${this._selectPeriodicityStep}
          ${this._termsAndConditionsStep}
        </div>
        <div class="confirm-step" slot="confirmation" ambient="primary-alt">
          ${this._summaryButton}
        </div>
      </bbva-expandable-multistep>
    `}get _renderModalMultiStep(){return a`
      <bbva-help-modal
        class="modal-multistep"
        full-height
        ?visible="${this.showMultistep}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        ambient="primary-alt"
      >
        <div slot="slot-content-header">
          <bbva-header-main
            id="headerMultistep"
            variant="${this._selectVariant}"
            text="${this._selectHeaderText}"
            close-icon-aria-label="${this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-icon-close")}"
            @header-main-icon-click="${()=>Et(this,"multistep-exit","MULTISTEP")}"
          ></bbva-header-main>
        </div>
        <div class="content" slot="slot-content">${this._renderMultistep}</div>
      </bbva-help-modal>
    `}render(){return a` ${super.render()} ${this._renderModalMultiStep}`}}var jt=l`
.success-illustration {
  display: flex;
}

.content-summary {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
  margin-bottom: 2rem;
}

.body-summary {
  display: flex;
  justify-content: space-between;
}
.body-summary .service-text {
  text-align: right;
}

.footer-notification-message {
  padding-bottom: 1rem;
}
`;class qt extends(w(k(h(t)))){static get is(){return"account-transaction-servicing-scheduled-bill-payments-ticket"}static get scopedElements(){const e=[X,J,N,G,j,...qt.configurationScopedElements()];return qt.scopedElementsFromClasses(e)}static get properties(){return{scheduledInfo:{type:Object},isCancelScheduled:{type:Boolean,attribute:"is-cancel-scheduled"},_optionAction:{type:Array}}}constructor(){super(),this.isCancelScheduled=!1,this.language="",this.scheduledInfo={},this._optionAction=[{icon:T(),label:"account-transaction-servicing-scheduled-bill-payments-share",id:"Share"}]}static get styles(){return[jt,Q.primaryAlt,Z.primaryAlt,V.primaryAlt,V.secondary,W.secondary,W.primaryAlt,m("account-transaction-servicing-scheduled-bill-payments-ticket-shared-styles")]}_dataToReceipt(e){e.stopPropagation(),Et(this,"share-receipt-show")}get _validateOperationType(){var e,t;return this.isCancelScheduled?null!==(t=this.scheduledInfo)&&void 0!==t&&t.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-scheduled"):this.t("account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-recurring-charge"):null!==(e=this.scheduledInfo)&&void 0!==e&&e.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-body-domiciliation-registration"):this.t("account-transaction-servicing-scheduled-bill-payments-ticket-body-recurring-charge")}get _validateHeader(){var e;return this.isCancelScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-span-cancel"):null!==(e=this.scheduledInfo)&&void 0!==e&&e.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-span-title-one"):this.t("account-transaction-servicing-scheduled-bill-payments-ticket-span-title-two")}get _secondNotificationMessage(){var e;return`${this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-two")} ${null!==(e=this.scheduledInfo)&&void 0!==e&&e.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-domiciliation"):this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-recurring-charge")}, ${this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-two-lines")}`}get _headerTicket(){var e,t,i;return a`
      <bbva-clip-microillustration
        class="success-illustration"
        microillustration="success"
        size="M"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        size="3XL"
        font-weight="${v.fontWeight50}"
        text="${this._validateHeader}"
      >
      </bbva-type-text>
      <div ?hidden="${this.isCancelScheduled}">
        <bbva-type-text
          text="account-transaction-servicing-scheduled-bill-payments-multistep-maximum-amount-text"
        >
        </bbva-type-text>
        <bbva-type-amount
          id="maximunAmount"
          variant="2xl"
          type="bold"
          amount="${null===(e=this.scheduledInfo)||void 0===e?void 0:e.amount}"
          currency-code="${null===(t=this.scheduledInfo)||void 0===t?void 0:t.currency}"
          local-currency="${null===(i=this.scheduledInfo)||void 0===i?void 0:i.currency}"
          language="${this.language}"
        >
        </bbva-type-amount>
        <bbva-type-text
          font-style="${C.fontStyle20}"
          text="account-transaction-servicing-scheduled-bill-payments-ticket-span-two"
        >
        </bbva-type-text>
      </div>
    `}get _bodyTicket(){var e,t,i,s,n,r,o,c,l;return a`
      <div class="content-summary">
        <div class="body-summary">
          <bbva-type-text
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-ticket-date"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            font-weight="${v.fontWeight40}"
            text="${null===(e=this.scheduledInfo)||void 0===e||null===(t=e.date)||void 0===t?void 0:t.shortDate}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            id="serviceLabel"
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-ticket-body-service"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            class="service-text"
            font-weight="${v.fontWeight40}"
            text="${null===(i=this.scheduledInfo)||void 0===i?void 0:i.serviceName}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            id="referenceLabel"
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-one"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            font-weight="${v.fontWeight40}"
            text="${null===(s=this.scheduledInfo)||void 0===s?void 0:s.reference}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-step-service-detail-input-label-two"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            class="service-text"
            inherit
            font-weight="${v.fontWeight40}"
            text="${null===(n=this.scheduledInfo)||void 0===n?void 0:n.serviceOwner}"
            size="S"
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-ticket-body-operation-type"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            class="service-text"
            font-weight="${v.fontWeight40}"
            text="${this._validateOperationType}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-ticket-body-origin"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            data-acoustic-obfuscate
            font-weight="${v.fontWeight40}"
            text="${`${null===(r=this.scheduledInfo)||void 0===r?void 0:r.originName} ${null===(o=this.scheduledInfo)||void 0===o?void 0:o.originNumber}`}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-text"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            font-weight="${v.fontWeight40}"
            text="${this.t(null===(c=this.scheduledInfo)||void 0===c?void 0:c.periodicity)}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
        <div class="body-summary">
          <bbva-type-text
            id="folioLabel"
            font-weight="${v.fontWeight30}"
            text="account-transaction-servicing-scheduled-bill-payments-ticket-operation-folio"
            inherit
          >
          </bbva-type-text>
          <bbva-type-text
            font-weight="${v.fontWeight40}"
            text="${null===(l=this.scheduledInfo)||void 0===l?void 0:l.id}"
            size="S"
            inherit
          >
          </bbva-type-text>
        </div>
      </div>
    `}get _footerTicket(){return a`
      <div class="footer-notification-message">
        <bbva-notification-message
          variant="${this.isCancelScheduled?"caution":"default"}"
          book-title
          message-title="${this.isCancelScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-step-terms-and-conditions-message-cancel-box-one"):this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-one")}"
        >
        </bbva-notification-message>
      </div>
      <div class="footer-notification-message">
        <bbva-notification-message
          message-title="${this.isCancelScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-message-cancel"):this._secondNotificationMessage}"
          book-title
        >
        </bbva-notification-message>
      </div>
      <bbva-button-row
        id="shareButton"
        accessibility-text="${this.t("account-transaction-servicing-scheduled-bill-payments-share")}"
        .options="${this._optionAction}"
        @button-row-item-click="${this._dataToReceipt}"
      >
      </bbva-button-row>
    `}render(){return a`
      <div ambient="primary-alt">
        ${this._headerTicket} ${this._bodyTicket} ${this._footerTicket}
      </div>
    `}}var Gt=l`
.new-service-container {
  display: flex;
  column-gap: 1rem;
  align-items: center;
  padding: 1rem 0;
}

.saved-service-detail {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}

.content {
  padding: 1rem 0;
  display: flex;
  flex-direction: column;
}

.content-row {
  display: flex;
  justify-content: space-between;
}

.content-row-space {
  column-gap: 0.5rem;
}

.without-saved-services {
  padding-top: 2rem;
}
`;class Ut extends(u(w(k(h(t))))){static get is(){return"dynamic-content-modal"}static get scopedElements(){const e=[J,Ce,U,q,G,N,R,xe,M,K];return Ut.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object},visible:{type:Boolean},_accountEntity:{type:Array},_filterList:{type:Array},_invalid:{type:Boolean}}}constructor(){super(),this._filterList=[],this.iOSFixedHeader=!1,this.language="",this.modalConfig={},this._invalid=!1,this.visible=!1,this._accountEntity=[{icon:p(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}]}static get styles(){return[Gt,Z.primaryAlt,Ee.primaryAlt,ee.primaryAlt,Y.primaryAlt,W.primaryAlt,B.primaryAlt,V.primaryAlt,Te.primaryAlt,F.primaryAlt,m("dynamic-content-modal-shared-styles")]}updated(e){super.updated(e),e.has("modalConfig")&&this.modalConfig.response&&(this._filterList=this.modalConfig.response)}_filterService({detail:e}){var t;const i=null===(t=e.value)||void 0===t?void 0:t.replace(/\s/g,"");if(this._invalid=/[\W\d]/g.test(i),this.inputValue=""!==e.value,""===e.value){var s,a;this._filterList=null===(s=this.modalConfig)||void 0===s||null===(a=s.response)||void 0===a?void 0:a.slice(0,10)}else{var n,r;const t=new RegExp(e.value,"i");this._filterList=null===(n=this.modalConfig)||void 0===n||null===(r=n.response)||void 0===r?void 0:r.filter((e=>t.test(JSON.stringify(e.name))))}}headerMainClick(e){e.stopPropagation(),this.modalConfig={}}get _renderModal(){var e,t,i,s,n,r,o,c;return a`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .headerType="${null===(e=this.modalConfig)||void 0===e?void 0:e.headerType}"
        header-text="${this.t(null===(t=this.modalConfig)||void 0===t?void 0:t.headerText)}"
        ?fixed-footer="${null===(i=this.modalConfig)||void 0===i?void 0:i.fixedFooter}"
        ?full-height="${null===(s=this.modalConfig)||void 0===s?void 0:s.fullHeight}"
        ?hide-content-padding-top="${null===(n=this.modalConfig)||void 0===n?void 0:n.hideContentPaddingTop}"
        ?visible="${this.visible}"
        @header-main-icon-click="${this.headerMainClick}"
        @help-modal-header-click="${null===(r=this.modalConfig)||void 0===r?void 0:r.headerPrimaryClick}"
        @help-modal-veil-click="${null===(o=this.modalConfig)||void 0===o?void 0:o.veilClick}"
        @help-modal-content-scroll-bottom-reach="${this._managePaginationScroll}"
        ambient="primary-alt"
      >
        <div slot="slot-content">
          ${null!==(c=this.modalConfig)&&void 0!==c&&c.isServiceModal?this._renderServiceContent:this._renderCardsAndAccountsContent}
        </div>
      </bbva-help-modal>
    `}get _renderCardsAndAccountsContent(){return a` ${this._renderCardsOrAccoutns} `}get _renderServiceContent(){return a` ${this._renderInput} ${this._renderServices} ${this._renderModalWithoutData} `}get _renderInput(){var e;return null!==(e=this.modalConfig)&&void 0!==e&&e.isNewService?a`
          <bbva-form-input
            id="serviceSearchInput"
            type="text"
            label="${this.t("account-transaction-servicing-scheduled-bill-payments-modal-service-search")}"
            label-out="${this.t("account-transaction-servicing-scheduled-bill-payments-modal-service-name")}"
            ?invalid="${this._invalid}"
            ?reset-value="${this._resetInput}"
            error-message="${this.t("account-transaction-servicing-scheduled-bill-payments-modal-invalid-character")}"
            info-message="${this.t("account-transaction-servicing-scheduled-bill-payments-modal-service-search-info-message-special-characteres")}"
            @form-input-value-change="${this._filterService}"
          >
          </bbva-form-input>
          <bbva-type-text
            ?hidden="${this.inputValue}"
            class="quick-access"
            font-weight="${v.fontWeight40}"
            text-color="${f.secondary500}"
            text="account-transaction-servicing-scheduled-bill-payments-modal-quick-access"
            tag="p"
          >
          </bbva-type-text>
        `:b}static _listServices(e,t){var i,s;const a=[{text:e,size:"xl",bgColor:`${f.primaryMedium}`,bitone:"true"}],n=[{image:null==t||null===(i=t.logo)||void 0===i?void 0:i.url,size:"xl"}];return null!=t&&null!==(s=t.logo)&&void 0!==s&&s.url?n:a}get _listServicesFilter(){var e;return null!==(e=this.modalConfig)&&void 0!==e&&e.isNewService?this._filterList.slice(0,10):this._filterList}get _renderServices(){return a`
      ${this._listServicesFilter.map(((e,t)=>{var i,s,n;return a`
          <bbva-type-link
            @click=${()=>this._sendDataServices(e)}
            class="new-service-container"
            id="${t}"
          >
            ${Ut._renderImage(e)}
            <div
              class=${E({"saved-service-detail":!(null!==(i=this.modalConfig)&&void 0!==i&&i.isNewService)})}
            >
              <bbva-type-link> ${e.name||(null==e||null===(s=e.service)||void 0===s?void 0:s.name)}</bbva-type-link>
              ${null!==(n=this.modalConfig)&&void 0!==n&&n.isNewService?b:a` <bbva-type-text text=${e.alias} tag="span"></bbva-type-text>`}
            </div>
          </bbva-type-link>
          ${t<this.modalConfig.response.length-1?a` <bbva-divider-default size="full"></bbva-divider-default>`:b}
        `}))}
    `}static _renderImage(e){var t,i,s;const n=null!=e&&null!==(t=e.logo)&&void 0!==t&&t.url?null==e||null===(i=e.logo)||void 0===i?void 0:i.url:e.name||(null==e||null===(s=e.service)||void 0===s?void 0:s.name);return a` <bbva-clip-box .group=${Ut._listServices(n,e)}>
    </bbva-clip-box>`}get _renderModalWithoutData(){var e,t,i;const s=null!==(e=this.modalConfig)&&void 0!==e&&e.isNewService?"list":"saved",n=(null===(t=this.modalConfig)||void 0===t?void 0:t.isNewService)&&0===this._filterList.length&&!this._invalid,r=!(null!==(i=this.modalConfig)&&void 0!==i&&i.isNewService)&&0===this._filterList.length;return n||r?a`
          <div id="withoutStoredServices" class="without-saved-services">
            <bbva-clip-microillustration microillustration="emptystateday" size="M">
            </bbva-clip-microillustration>
            <bbva-type-text
              tag="h4"
              size="XL"
              font-weight="${v.fontWeight50}"
              text="${`account-transaction-servicing-scheduled-bill-payments-modal-without-${s}-services-title`}"
              inherit
            >
            </bbva-type-text>
            <bbva-type-text
              tag="p"
              text="${`account-transaction-servicing-scheduled-bill-payments-modal-without-${s}-services-body`}"
            >
            </bbva-type-text>
          </div>
        `:b}get _renderCardsOrAccoutns(){var e,t;return null===(e=this.modalConfig)||void 0===e||null===(t=e.response)||void 0===t?void 0:t.map(((e,t)=>a` <bbva-type-link @click=${()=>this._sendAccountsOrCardsData(e)} class="content">
            <div class="content-row">
              <bbva-type-link> ${null==e?void 0:e.productName} </bbva-type-link>
              <bbva-type-amount
                amount="${null==e?void 0:e.amount}"
                currency-code=${null==e?void 0:e.currency}
                local-currency=${null==e?void 0:e.currency}
                type="bold"
              ></bbva-type-amount>
            </div>
            <div class="content-row">
              ${this._isCardOrAccount(e)}
              <bbva-type-text
                inherit
                text="account-transaction-servicing-scheduled-bill-payments-multistep-available-balance-text"
                tag="span"
              ></bbva-type-text>
            </div>
          </bbva-type-link>
          ${t<this.modalConfig.response.length-1?a` <bbva-divider-default size="full"></bbva-divider-default>`:b}`))}_isCardOrAccount(e){var t;return null!==(t=this.modalConfig)&&void 0!==t&&t.isCards?a`
          <div class="content-row content-row-space">
            <bbva-clip-card
              logo="bbva"
              card-type="visa"
              size="xs"
              card-image=${null==e?void 0:e.image}
            ></bbva-clip-card>
            <bbva-type-text
              inherit
              data-acoustic-obfuscate
              font-style="${C.fontStyle20}"
              text="${At(null==e?void 0:e.number)}"
              tag="span"
            ></bbva-type-text>
          </div>
        `:a`
          <div class="content-row content-row-space">
            <bbva-clip-box .group=${this._accountEntity}> </bbva-clip-box>
            <bbva-type-text
              inherit
              data-acoustic-obfuscate
              font-style="${C.fontStyle20}"
              text="${At(null==e?void 0:e.number)}"
              tag="span"
            >
            </bbva-type-text>
          </div>
        `}_sendAccountsOrCardsData(e){Et(this,"modal-cards-accounts-hide",e)}_sendDataServices(e){Et(this,"modal-hide",e)}render(){return a` ${super.render()} ${this._renderModal}`}}class Wt extends(u(w(k(h(t))))){static get is(){return"dynamic-modal"}static get scopedElements(){const e=[q,N,J,...Wt.configurationScopedElements()];return Wt.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}static get styles(){return[V.primaryAlt,Z.primaryAlt,m("dynamic-modal-shared-styles")]}get _renderDynamicModal(){var e,t,i,s,n,r,o,c,l,d,u,h,m,p,v,g,b,_,y,S,f,C,E;return a`
      <bbva-help-modal
        id="${null===(e=this.modalConfig)||void 0===e?void 0:e.id}"
        ?full-height="${null===(t=this.modalConfig)||void 0===t?void 0:t.fullHeight}"
        ?fixed-footer="${null===(i=this.modalConfig)||void 0===i?void 0:i.fixedFooter}"
        header-text="${this.t(null===(s=this.modalConfig)||void 0===s?void 0:s.headerText)}"
        button-text="${this.t(null===(n=this.modalConfig)||void 0===n?void 0:n.buttonText)}"
        link-text="${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.linkText)}"
        ?visible="${this.visible}"
        ambient="primary-alt"
        @help-modal-footer-button-click="${null===(o=this.modalConfig)||void 0===o?void 0:o.footerButtonClick}"
      >
        <div slot="slot-content">
          <bbva-clip-microillustration
            microillustration="${null===(c=this.modalConfig)||void 0===c||null===(l=c.content)||void 0===l?void 0:l.microillustration}"
            size="${null===(d=this.modalConfig)||void 0===d||null===(u=d.content)||void 0===u?void 0:u.microillustrationSize}"
          ></bbva-clip-microillustration>
          <bbva-type-text
            tag="${null===(h=this.modalConfig)||void 0===h||null===(m=h.content)||void 0===m||null===(p=m.texts[0])||void 0===p?void 0:p.tag}"
            text="${this.t(null===(v=this.modalConfig)||void 0===v||null===(g=v.content)||void 0===g||null===(b=g.texts[0])||void 0===b?void 0:b.text)}"
          ></bbva-type-text>
          <bbva-type-text
            tag="${null===(_=this.modalConfig)||void 0===_||null===(y=_.content)||void 0===y||null===(S=y.texts[1])||void 0===S?void 0:S.tag}"
            text="${this.t(null===(f=this.modalConfig)||void 0===f||null===(C=f.content)||void 0===C||null===(E=C.texts[1])||void 0===E?void 0:E.text)}"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>
    `}render(){return a` ${super.render()} ${this._renderDynamicModal}`}}class zt extends(u(w(k(h(t))))){static get is(){return"half-content-modal"}static get scopedElements(){const e=[q,...zt.configurationScopedElements()];return zt.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}static get styles(){return[m("half-content-modal-shared-styles")]}get _renderHalfModals(){var e,t,i,s,n,r,o,c,l,d,u,h,m;return a`
      <bbva-help-modal
        id="${null===(e=this.modalConfig)||void 0===e?void 0:e.id}"
        header-text="${this.t(null===(t=this.modalConfig)||void 0===t?void 0:t.headerText)}"
        modal-type="${null===(i=this.modalConfig)||void 0===i?void 0:i.modalType}"
        title-icon="${null===(s=this.modalConfig)||void 0===s?void 0:s.titleIcon}"
        title-text="${this.t(null===(n=this.modalConfig)||void 0===n?void 0:n.titleText)}"
        button-text="${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.buttonText)}"
        body-text="${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.bodyText)}"
        description-text="${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.descriptionText)}"
        link-text="${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.linkText)}"
        ?visible="${this.visible}"
        @help-modal-footer-button-click="${null===(d=this.modalConfig)||void 0===d?void 0:d.footerButtonClick}"
        @help-modal-header-click="${null===(u=this.modalConfig)||void 0===u?void 0:u.headerPrimaryClick}"
        @help-modal-veil-click="${null===(h=this.modalConfig)||void 0===h?void 0:h.veilClick}"
        @help-modal-footer-link-click="${null===(m=this.modalConfig)||void 0===m?void 0:m.footerLinkClick}"
      >
      </bbva-help-modal>
    `}render(){return a` ${super.render()} ${this._renderHalfModals}`}}var Kt=l`
.main [data-tag-name=bbva-list-bullet] {
  padding: 0;
  margin-top: 1rem;
}
`;class Yt extends(u(w(k(h(t))))){static get is(){return"info-content-modal"}static get scopedElements(){const e=[q,ge,...Yt.configurationScopedElements()];return Yt.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}static get styles(){return[Kt,be.primaryAlt,m("info-content-modal-shared-styles")]}get _renderModal(){var e,t,i,s,n,r,o,c,l,d;const u=Object.keys(this.modalConfig);return a`
      <bbva-help-modal
        id="${null===(e=this.modalConfig)||void 0===e?void 0:e.id}"
        ?full-height="${null===(t=this.modalConfig)||void 0===t?void 0:t.fullHeight}"
        ?fixed-footer="${null===(i=this.modalConfig)||void 0===i?void 0:i.fixedFooter}"
        title-icon="${null===(s=this.modalConfig)||void 0===s?void 0:s.titleIcon}"
        header-text="${this.t(null===(n=this.modalConfig)||void 0===n?void 0:n.headerText)}"
        title-text="${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.titleText)}"
        button-text="${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.buttonText)}"
        ambient="primary-alt"
        ?hide-content-padding-top="${null===(c=this.modalConfig)||void 0===c?void 0:c.hideContentPaddingTop}"
        ?visible="${this.visible}"
      >
        <div class="main" slot="slot-content">
          <bbva-list-bullet id="${u.indexOf("firstParagraph")}"> ${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.firstParagraph)} </bbva-list-bullet>
          <bbva-list-bullet id="${u.indexOf("secondParagraph")}"> ${this.t(null===(d=this.modalConfig)||void 0===d?void 0:d.secondParagraph)} </bbva-list-bullet>
        </div>
      </bbva-help-modal>
    `}render(){return a` ${super.render()} ${this._renderModal}`}}const Xt=[{id:"btn-close",icon:A(),accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accessibility-close-button"}],Jt=({footerLinkClick:e,footerButtonClick:t,veilClick:i,headerPrimaryClick:s})=>({ERROR_SERVICE_RETRY:{id:"errorModalRetry",fullHeight:!1,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerButtonClick:t,footerLinkClick:e,veilClick:i,headerPrimaryClick:s},ERROR_SERVICE_EXIT:{id:"retryErrorModal",fullHeight:!1,titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",linkText:"",headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerButtonClick:t,footerLinkClick:e,veilClick:i,headerPrimaryClick:s},OTP_RETRY:{id:"errorModalOtpRetry",fullHeight:!1,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-otp-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-otp-body-one",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerButtonClick:t,footerLinkClick:e,veilClick:i,headerPrimaryClick:s},OTP_EXIT:{id:"errorModalOtpExit",fullHeight:!1,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-otp-body-two",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",linkText:"",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerButtonClick:t,footerLinkClick:e,veilClick:i,headerPrimaryClick:s}}),Qt=({footerLinkClick:e,footerButtonClick:t,veilClick:i,headerPrimaryClick:s})=>({id:"errorBarcode",fullHeight:!1,titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-barcode-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-barcode-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-barcode-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerButtonClick:t,footerLinkClick:e,veilClick:i,headerPrimaryClick:s}),Zt=({footerLinkClick:e,footerButtonClick:t,veilClick:i,headerPrimaryClick:s})=>({INVALID_REFERENCE:{id:"invalidReference",fullHeight:!1,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-invalid-reference-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-invalid-reference-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-invalid-reference-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerLinkClick:e,footerButtonClick:t,veilClick:i,headerPrimaryClick:s},SCHEDULED_SERVICE:{id:"scheduledService",fullHeight:!1,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-error-existing-scheduled-title",descriptionText:"account-transaction-servicing-scheduled-bill-payments-modal-error-existing-scheduled-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-invalid-reference-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",titleIcon:$(),modalType:"warning",bodyText:"",subtitleText:"",headerButtons:Xt,footerLinkClick:e,footerButtonClick:t,veilClick:i,headerPrimaryClick:s}}),ei=({footerButtonClick:e})=>({MULTISTEP:{id:"modalExitOperative",fullHeight:!1,titleText:"",descriptionText:"",headerText:"account-transaction-servicing-scheduled-bill-payments-multistep-exit-operative-header",titleIcon:D(),modalType:"caution",bodyText:"account-transaction-servicing-scheduled-bill-payments-multistep-exit-operative-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",linkText:"account-transaction-servicing-scheduled-bill-payments-multistep-exit-operative-link",subtitleText:"",footerButtonClick:e,headerButtons:Xt},SELECT_SERVICE:{id:"modalChangeService",fullHeight:!1,titleText:"",descriptionText:"",headerText:"account-transaction-servicing-scheduled-bill-payments-deleted-service-header",titleIcon:D(),modalType:"caution",bodyText:"account-transaction-servicing-scheduled-bill-payments-deleted-service-body",buttonText:"account-transaction-servicing-scheduled-bill-payments-deleted-service-button",linkText:"account-transaction-servicing-scheduled-bill-payments-deleted-service-link",subtitleText:"",footerButtonClick:e,headerButtons:Xt}}),ti=()=>({REFERENCE:{id:"referenceInfoModal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!1,titleIcon:S(),headerText:"account-transaction-servicing-scheduled-bill-payments-modal-info-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-info-title-reference",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-info-button",firstParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-one-reference",secondParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-two-reference",headerButtons:Xt},SERVICE_OWNER:{id:"rerviceOwnerInfoModal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!1,titleIcon:S(),headerText:"account-transaction-servicing-scheduled-bill-payments-modal-info-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-info-title-service-owner",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-info-button",firstParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-one-service-owner",secondParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-two-service-owner",headerButtons:Xt},ORIGIN:{id:"originInfoModal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!1,titleIcon:S(),headerText:"account-transaction-servicing-scheduled-bill-payments-modal-info-header",titleText:"account-transaction-servicing-scheduled-bill-payments-modal-info-title",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-info-button",firstParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-one",secondParagraph:"account-transaction-servicing-scheduled-bill-payments-modal-info-list-two",headerButtons:Xt}}),ii=e=>({id:"newServiceModal",headerText:`account-transaction-servicing-scheduled-bill-payments-step-select-service-button-link-${e.servideHeaderId}`,headerType:"modal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,isServiceModal:e.isServiceModal,isNewService:e.isNewService,subtitleText:"account-transaction-servicing-scheduled-bill-payments-modal-quick-access",response:e.response,headerButtons:Xt}),si=e=>({id:"cardsOrAccountsModal",headerText:`account-transaction-servicing-scheduled-bill-payments-step-origin-${e.headerId}`,headerType:"modal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,isCards:e.isCards,response:e.response,headerButtons:Xt}),ai=({footerButtonClick:e})=>({id:"nativeSettings",fullHeight:!0,fixedFooter:!0,headerText:"account-transaction-servicing-scheduled-bill-payments-modal-native-settings-header",buttonText:"account-transaction-servicing-scheduled-bill-payments-modal-native-settings-button",linkText:"account-transaction-servicing-scheduled-bill-payments-modal-error-generic-link",content:{microillustration:"camera",microillustrationSize:"S",texts:[{text:"account-transaction-servicing-scheduled-bill-payments-modal-native-settings-body-paragraph-one",tag:"p"},{text:"account-transaction-servicing-scheduled-bill-payments-modal-native-settings-body-paragraph-two",tag:"p"}]},footerButtonClick:e,headerButtons:Xt});var ni=l`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ri extends(u(w(k(h(t))))){static get is(){return"account-transaction-servicing-scheduled-bill-payments"}static get scopedElements(){const e=[Ke,P,te,ie,se,ae,ce,ht,q,Ft,qt,Ut,Wt,zt,Yt,...ri.configurationScopedElements()];return ri.scopedElementsFromClasses(e)}static get properties(){return{accountsApiVersion:{type:String,attribute:"accounts-api-version"},additionalInformationId:{type:String,attribute:"additional-information-id"},amountId:{type:String,attribute:"amount-id"},cancelScheduled:{type:Boolean,attribute:"cancel-scheduled"},cardsApiVersion:{type:String,attribute:"cards-api-version"},cardTypeId:{type:String,attribute:"card-type-id"},catalogId:{type:String,attribute:"catalog-id"},catalogRecordsApiVersion:{type:String,attribute:"catalog-records-api-version"},country:{type:String,attribute:"country"},customerId:{type:String,attribute:"customer-id"},customersApiVersion:{type:String,attribute:"customers-api-version"},directDebitApiVersion:{type:String,attribute:"direct-debit-api-version"},directDebitId:{type:String,attribute:"direct-debit-id"},directDebitsApiVersion:{type:String,attribute:"direct-debits-api-version"},editScheduled:{type:Boolean,attribute:"edit-scheduled"},endScheduledPayment:{type:String,attribute:"end-scheduled-payment"},exceptionEditAmount:{type:Array,attribute:"exception-edit-amount"},idProduct:{type:String,attribute:"id-product"},idSubProduct:{type:String,attribute:"id-sub-product"},imageId:{type:String,attribute:"image-id"},maximumProductsShowed:{type:Number,attribute:"maximum-products-showed"},maxRetries:{type:Number,attribute:"max-retries"},minimumAmountEdit:{type:Number,attribute:"minimum-amount-edit"},pdfId:{type:String,attribute:"pdf-id"},priority:{type:Number},productDomiciliationId:{type:String,attribute:"product-domiciliation-id"},productRecurringChargeId:{type:String,attribute:"product-recurring-charge-id"},resetMultistep:{type:Boolean,attribute:"reset-multistep"},serviceSelectedId:{type:String,attribute:"service-selected-id"},scannerReference:{type:String,attribute:"scanner-reference"},servicesApiVersion:{type:String,attribute:"services-api-version"},subProductDomiciliationLowValue:{type:String,attribute:"sub-product-domiciliation-low-value"},subProductDomiciliationValue:{type:String,attribute:"sub-product-domiciliation-value"},subProductRecurringChargeLowValue:{type:String,attribute:"sub-product-recurring-charge-low-value"},subProductRecurringChargeValue:{type:String,attribute:"sub-product-recurring-charge-value"},storedServicesApiVersion:{type:String,attribute:"stored-services-api-version"},_accountCurrency:{type:String},_accountName:{type:String},_accountNumber:{type:String},_accountList:{type:Array},_additionalInformationsData:{type:Object},_cancelParams:{type:Object},_cardCurrency:{type:String},_cardName:{type:String},_cardNumber:{type:String},_cardList:{type:Array},_checkOrigin:{type:Object},_closeModalListeners:{type:Object},_configDynamicModal:{type:Object},_configInfoModal:{type:Object},_configModal:{type:Object},_configOriginModal:{type:Object},_configServicesModal:{type:Object},_currency:{type:String},_customerEmail:{type:String},_dateTicket:{type:Object},_editParams:{type:Object},_isAccount:{type:Boolean},_isCancelScheduled:{type:Boolean},_isCard:{type:Boolean},_isEditScheduled:{type:Boolean},_isErrorOrigin:{type:Boolean},_isFirstStepCompleted:{type:Boolean},_isThreeStepCompleted:{type:Boolean},_isShowErrorOrigin:{type:Boolean},_isStoredService:{type:Boolean},_isValidateEdit:{type:Boolean},_isVisibleCardsOrAccount:{type:Boolean},_isVisibleServices:{type:Boolean},_maximumAmount:{type:Number},_multiStepDetail:{type:Object},_originDetail:{type:String},_originSelected:{type:Object},_paramsUpdate:{type:Object},_paymentMethod:{type:String},_periodicity:{type:String},_periodicityItems:{type:Array},_productName:{type:String},_productNumber:{type:String},_serviceReference:{type:String},_retriesConfig:{type:Object,state:!0},_resetInputs:{type:Boolean},_scheduledServices:{type:Array},_shareScheduledData:{type:Object},_secondStepCollapsed:{type:String},_selectedService:{type:Object},_sendEditParams:{type:Object},_serviceDetail:{type:Object},_serviceName:{type:String},_serviceOwner:{type:String},_showMultiStep:{type:Boolean},_showDynamicModal:{type:Boolean},_showSuccesTicket:{type:Boolean},_showHalfModal:{type:Boolean},_showInfoModal:{type:Boolean},_showMultistepModal:{type:Boolean},_statusScheduledBillPayment:{type:String},_startDate:{type:String},_storedServices:{type:Array},_storedServiceSelected:{type:Object},_ticketParams:{type:Object}}}constructor(){super(),this.accountsApiVersion="2",this.additionalInformationId="",this.amountId="",this.cancelScheduled=!1,this.cardsApiVersion="1",this.cardTypeId="",this.catalogId="",this.catalogRecordsApiVersion="0",this.country="",this.config={loader:!0},this.customerId="",this.customersApiVersion="3",this.directDebitsApiVersion="2",this.directDebitApiVersion="2",this.directDebitId="",this.editScheduled=!1,this.endScheduledPayment="",this.exceptionEditAmount=[],this.idProduct="",this.idSubProduct="",this.imageId="",this.iOSFixedHeader=!1,this.language="",this.maximumProductsShowed=0,this.maxRetries=3,this.minimumAmountEdit=0,this.native=!1,this.pdfId="",this.priority=0,this.productDomiciliationId="",this.productRecurringChargeId="",this.resetMultistep=!1,this.scannerReference="",this.servicesApiVersion="1",this.serviceSelectedId="",this.storedServicesApiVersion="1",this.subProductDomiciliationLowValue="",this.subProductDomiciliationValue="",this.subProductRecurringChargeLowValue="",this.subProductRecurringChargeValue="",this._accountCurrency="",this._accountName="",this._accountNumber="",this._accountList=[],this._additionalInformationsData={},this._cancelParams={},this._cardCurrency="",this._cardName="",this._cardNumber="",this._cardList=[],this._checkOrigin={accounts:!1,cards:!1},this._closeModalListeners={SERVICEUNAVAILABLE:this._exitOperative.bind(this),GETSTOREDSERVICES:this._exitOperative.bind(this),GETLISTSERVICES:this._exitOperative.bind(this),GETPERIODICITYOPTIONS:this._exitOperative.bind(this),GETACCOUNTS:this._exitOperative.bind(this),GETCARDS:this._exitOperative.bind(this),OTPSIGNING:this._exitOperative.bind(this),SHOWORIGIN:this._exitOperative.bind(this),SERVICEGETDETAIL:this._exitOperative.bind(this)},this._configDynamicModal={},this._configInfoModal={},this._configModal={},this._configOriginModal={},this._configServicesModal={},this._currency="",this._customerEmail="",this._dateTicket={},this._editParams={},this._isAccount=!1,this._isCard=!1,this._isCancelScheduled=!1,this._isEditScheduled=!1,this._isErrorOrigin=!1,this._isFirstStepCompleted=!1,this._isShowErrorOrigin=!1,this._isStoredService=!1,this._isThreeStepCompleted=!1,this._isVisibleCardsOrAccount=!1,this._isVisibleServices=!1,this._maximumAmount=0,this._multiStepDetail={},this._originDetail="",this._originSelected={},this._paramsUpdate={},this._paymentMethod="",this._periodicity="",this._periodicityItems=[],this._productName="",this._productNumber="",this._serviceReference="",this._retriesConfig={SERVICEUNAVAILABLE:0,GETSTOREDSERVICES:0,GETLISTSERVICES:0,GETPERIODICITYOPTIONS:0,GETACCOUNTS:0,GETCARDS:0,SHOWORIGIN:0,OTPSIGNING:0,SERVICEGETDETAIL:0},this._resetInputs=!1,this._scheduledServices=[],this._secondStepCollapsed="",this._selectedService={},this._sendEditParams={},this._serviceDetail={},this._serviceName="",this._serviceOwner="",this._shareScheduledData={},this._showDynamicModal=!1,this._showHalfModal=!1,this._showInfoModal=!1,this._showMultiStep=!1,this._showMultistepModal=!1,this._showSuccesTicket=!1,this._startDate="",this._statusScheduledBillPayment="",this._storedServices=[],this._storedServiceSelected={},this._ticketParams={}}static get styles(){return[ni,m("account-transaction-servicing-scheduled-bill-payments-shared-styles")]}firstUpdated(){this._multiStepDetail=this.shadowRoot.querySelector('[data-tag-name="account-transaction-servicing-scheduled-bill-payments-multistep"]')}_getDirectDebit(e){this._updateDirectDebitDm.getDirectDebit(e)}_scanCodeService(){Et(this,"code-camera-scan")}cameraCodeErrorActions(){this._configModal=Qt({footerButtonClick:this._scanCodeService.bind(this),footerLinkClick:this._exitOperative.bind(this),veilClick:this._exitOperative.bind(this),headerPrimaryClick:this._exitOperative.bind(this)}),this._showHalfModal=!0,Et(this,"barcode-error-modal-show")}openAllowAccess(){this._configDynamicModal=ai({footerButtonClick:this._openNativeSettings.bind(this)}),this._showDynamicModal=!0}_openNativeSettings(){Et(this,"native-settings-main-open")}static _parseName(e){var t;return e?`${null==e?void 0:e.charAt(0)}${null===(t=e.slice(1))||void 0===t?void 0:t.toLowerCase()}`:""}_handleListServicesSuccess(){this.clearLoader(),0!==this.serviceSelectedId.length?this._getServiceInfo():this._isStoredService?this._completeDataStoredService():(this._resetInputs=!1,this._isVisibleServices=!0,this._configServicesModal=ii({response:this._scheduledServices,isServiceModal:!0,isNewService:!0,servideHeaderId:"one"}))}_getServiceInfo(){const e=this._scheduledServices.find((e=>e.id===this.serviceSelectedId))||{};0===Object.keys(e).length?this._manageError("SERVICEGETDETAIL"):(this._showMultiStep=!0,this._showMultistepModal=!0,this._getServiceSelected(e))}_completeStoredService(e){this._isStoredService=!0,this._storedServiceSelected=e,this._getServices()}_completeDataStoredService(){var e,t;const i=this._scheduledServices.filter((e=>{var t,i;return e.id===(null===(t=this._storedServiceSelected)||void 0===t||null===(i=t.service)||void 0===i?void 0:i.id)}));[this._selectedService]=i,this._paymentMethod=null===(e=this._selectedService)||void 0===e||null===(t=e.paymentMethod)||void 0===t?void 0:t.id,this._isFirstStepCompleted=!0,this._resetInputs=!1,this._isStoredService=!1}get _getPeriodicityOptionsDm(){return this.shadowRoot.querySelector(`[data-tag-name="${ce.is}"]`)}_getPeriodicityOptions(){this._getPeriodicityOptionsDm.getCatalogRecords(this.catalogId)}_catalogRecordsSuccess(e){e.stopPropagation(),this._periodicityItems=e.detail.map((e=>({value:e.descriptions.find((e=>"ENG"===e.language)).value})))}_handleCardsAndAccounts(){this._getAccounts(),this._getCards()}_getPeriodicityItems(e){e.stopPropagation(),this._getPeriodicityOptions()}_validateOperation(){this.editScheduled?(this._buildUpdateParams(this._updateData),this._editScheduled(),Et(this,"scheduled-bill-payments-edit")):this._cancelScheduled(this._updateData)}get _getAccountsDM(){return this.shadowRoot.querySelector(`[data-tag-name="${Ke.is}"]`)}_getAccounts(){0===this._accountList.length&&this._getAccountsDM.getAccounts()}_setAccounts(e){e.stopPropagation(),this._filterAccounts(null==e?void 0:e.detail),this.editScheduled||this.cancelScheduled?this._validateOperation():(this._checkOrigin.accounts=!0,this._isErrorOrigin||this._validateSuccessOrigin())}_filterAccounts(e){this._accountList=e.map((e=>{var t,i,s,a,n,r;return{productName:ri._parseName(null==e||null===(t=e.product)||void 0===t?void 0:t.name),amount:null==e||null===(i=e.availableBalance)||void 0===i||null===(s=i.currentBalances[0])||void 0===s?void 0:s.amount,currency:null==e||null===(a=e.availableBalance)||void 0===a||null===(n=a.currentBalances[0])||void 0===n?void 0:n.currency,number:null==e?void 0:e.number,accountType:null==e||null===(r=e.accountType)||void 0===r?void 0:r.id}}))}get _getCardsDM(){return this.shadowRoot.querySelector(`[data-tag-name="${P.is}"]`)}_getCards(){0===this._cardList.length&&this._getCardsDM.getCards({"cardType.id":this.cardTypeId})}_setCards(e){e.stopPropagation(),this._filterCards(null==e?void 0:e.detail),this.editScheduled||this.cancelScheduled?this._validateOperation():(this._checkOrigin.cards=!0,this._isErrorOrigin||this._validateSuccessOrigin())}_filterCards(e){this._cardList=e.map((e=>{var t,i,s,a,n,r,o;return{productName:ri._parseName(null==e||null===(t=e.product)||void 0===t?void 0:t.name),amount:null===(i=e.availableBalance)||void 0===i||null===(s=i.currentBalances[0])||void 0===s?void 0:s.amount,currency:null===(a=e.availableBalance)||void 0===a||null===(n=a.currentBalances[0])||void 0===n?void 0:n.currency,number:e.number,image:(null===(r=e.images.find((e=>e.id===this.imageId)))||void 0===r?void 0:r.url)||"",cardType:null===(o=e.cardType)||void 0===o?void 0:o.id}}))}_validateSuccessOrigin(){this._checkOrigin.accounts&&this._checkOrigin.cards&&(this._validatePaymentMethod(),this._isShowErrorOrigin||(this._secondStepCollapsed="serviceDetail",this._checkOrigin={accounts:!1,cards:!1}))}_validatePaymentMethod(){var e,t,i;(0===(null===(e={DEBIT_CARD:this._accountList,CREDIT_CARD:this._cardList}[this._paymentMethod])||void 0===e?void 0:e.length)||"BOTH"===this._paymentMethod&&0===(null===(t=this._accountList)||void 0===t?void 0:t.length)&&0===(null===(i=this._cardList)||void 0===i?void 0:i.length))&&(this._manageError("SHOWORIGIN"),this._isShowErrorOrigin=!0,this._isErrorOrigin=!0)}get _getListServicesDm(){return this.shadowRoot.querySelector(`[data-tag-name="${te.is}"]`)}_getServices(){this.showLoader(),this._getListServicesDm.getServices()}get _getStoredServicesDm(){return this.shadowRoot.querySelector(`[data-tag-name="${ie.is}"]`)}_getStoredServices(){this._getStoredServicesDm.getStoredServices()}_getListStoredServices(e){this._storedServices=e.detail,this._isVisibleServices=!0,this._configServicesModal=ii({response:this._storedServices,isServiceModal:!0,isNewService:!1,servideHeaderId:"two"})}_openDocument(e){e.stopPropagation(),this.pdfId=null==e?void 0:e.detail,Et(this,"document-open",this.pdfId)}_getDate(){const e=Tt();this._startDate=e.now,this._dateTicket={longDate:e.longDate,shortDate:e.shortDate}}get _sendDirectDebitsDm(){return this.shadowRoot.querySelector(`[data-tag-name="${se.is}"]`)}_buildSendDirectDebitsParams(e,t,i,s,a,n,r,o){var c,l;const d={startDate:this._startDate,endDate:this.endScheduledPayment,service:{id:this._selectedService.id,serviceType:{id:null===(c=this._selectedService)||void 0===c||null===(l=c.serviceType)||void 0===l?void 0:l.id}},reference:this._serviceReference,maximumAmount:{amount:this._maximumAmount,currency:i},contactDetails:[{contact:{contactDetailType:"EMAIL",address:this._customerEmail}}],relatedContracts:[{priority:this.priority,number:s,numberType:{id:e},id:s,product:{id:t}}],bill:{holderName:this._serviceOwner},period:{id:this._periodicity},additionalInformations:[{id:a,value:n},{id:r,value:o},{id:this.additionalInformationId,value:s}]};this._sendDirectDebitsDm.postDirectDebits(d)}_sendDirectDebits(){this._showMultistepModal=!1,this._getDate(),this._isAccount?this._buildSendDirectDebitsParams("SIMPLE_ACCOUNT","ACCOUNTS",this._accountCurrency,this._accountNumber,this.idProduct,this.productDomiciliationId,this.idSubProduct,this.subProductDomiciliationValue):this._buildSendDirectDebitsParams("PAN","CARDS",this._cardCurrency,this._cardNumber,this.idProduct,this.productRecurringChargeId,this.idSubProduct,this.subProductRecurringChargeValue)}_directDebitsCreate(e){var t,i,s,a,n,r,o,c,l,d,u;e.stopPropagation();const h={date:this._dateTicket,amount:null==e||null===(t=e.detail)||void 0===t||null===(i=t.maximumAmount)||void 0===i?void 0:i.amount,currency:null==e||null===(s=e.detail)||void 0===s||null===(a=s.maximumAmount)||void 0===a?void 0:a.currency,serviceName:this._selectedService.name,reference:null==e||null===(n=e.detail)||void 0===n?void 0:n.reference,serviceOwner:null==e||null===(r=e.detail)||void 0===r||null===(o=r.bill)||void 0===o?void 0:o.holderName,originName:this._isAccount?this._accountName:this._cardName,originNumber:At(null==e||null===(c=e.detail)||void 0===c?void 0:c.relatedContracts[0].number),periodicity:Lt[null==e||null===(l=e.detail)||void 0===l||null===(d=l.period)||void 0===d?void 0:d.id],id:null==e||null===(u=e.detail)||void 0===u?void 0:u.id,validateProduct:this._isAccount};this._ticketParams=h,this._showSuccesTicket=!0,this._shareScheduledData={...this._shareScheduledData,operationNumber:h.id};const m=this._selectOperation();this._shareReceiptData(this._dateTicket.longDate,this._ticketParams,m),Et(this,"scheduled-bill-payments-finish",this._shareScheduledData)}_shareReceiptData(e,t,i){let s={};const a=`${null==t?void 0:t.originName} ${null==t?void 0:t.originNumber}`;s={operationType:i,date:e,operationFolio:null==t?void 0:t.id,serviceName:null==t?void 0:t.serviceName,serviceOwner:null==t?void 0:t.serviceOwner,reference:null==t?void 0:t.reference,amount:(null==t?void 0:t.amount)||"",origin:a,periodicity:this.t(null==t?void 0:t.periodicity)},Et(this,"receipt-data-share",s)}_changeMultistepModal(){this._showMultistepModal=!0}_showErrorService(e){this._configModal=Zt({footerButtonClick:this._changeMultistepModal.bind(this),veilClick:this._exitOperative.bind(this),headerPrimaryClick:this._exitOperative.bind(this),footerLinkClick:this._exitOperative.bind(this)})[e],this._showHalfModal=!0}_manageErrorDirectDebits(e){this._showMultistepModal=!1;const{code:t}=e.messages[0];"resourceAlreadyExists"===t?(this._showErrorService("SCHEDULED_SERVICE"),Et(this,"scheduled-service-error-modal-show")):"referenceNotFound"===t?(this._showErrorService("INVALID_REFERENCE"),Et(this,"invalid-reference-error-modal-show")):(this._manageError("OTPSIGNING"),Et(this,"unavailable-error-modal-show"))}signCancelled(){this._showMultiStep=!0,this._showMultistepModal=!0}async initOperative(){this.editScheduled||this.cancelScheduled?this._getDirectDebit(this.directDebitId):(Et(this,"scheduled-bill-payments-start"),0!==this.serviceSelectedId.length?this._getServices():(this._showMultiStep=!0,this._showMultistepModal=!0)),await this.updateComplete}_findDetailProduct(e){var t;const i=null==e||null===(t=e.numberType)||void 0===t?void 0:t.id,s=null==e?void 0:e.number.slice(-4);let a={};if("SIMPLE_ACCOUNT"===i){const e=this._accountList.find((e=>e.number.slice(-4)===s));a={productName:null==e?void 0:e.productName,amount:null==e?void 0:e.amount,currency:null==e?void 0:e.currency,accountType:!(null==e||!e.accountType)}}if("PAN"===i){const e=this._cardList.find((e=>e.number.slice(-4)===s));a={productName:null==e?void 0:e.productName,amount:null==e?void 0:e.amount,currency:null==e?void 0:e.currency,image:null==e?void 0:e.image,cardType:!(null==e||!e.cardType)}}return a}static _validateDetail(e){return e.amounts.some((e=>0===e.amountValue.amount))}_buildUpdateParams(e){var t,i,s,a,n,r,o,c,l;const d=null==e?void 0:e.amounts.find((e=>e.id===this.amountId));this._serviceName=null==e||null===(t=e.service)||void 0===t?void 0:t.name,this._statusScheduledBillPayment=null==e||null===(i=e.status)||void 0===i?void 0:i.id,this._serviceOwner=ri._parseName(null==e||null===(s=e.relatedContract)||void 0===s||null===(a=s.participants[0])||void 0===a?void 0:a.fullName),this._productNumber=null==e||null===(n=e.relatedContract)||void 0===n?void 0:n.number,this._maximumAmount=null==d||null===(r=d.amountValue)||void 0===r?void 0:r.amount,this._currency=null==d||null===(o=d.amountValue)||void 0===o?void 0:o.currency,this._periodicity=Mt[null==e||null===(c=e.frequency)||void 0===c?void 0:c.id]||(null==e||null===(l=e.frequency)||void 0===l?void 0:l.id),this._productName=this._findDetailProduct(null==e?void 0:e.relatedContract).productName,this._isCard=this._findDetailProduct(null==e?void 0:e.relatedContract).cardType||!1,this._isAccount=this._findDetailProduct(null==e?void 0:e.relatedContract).accountType||!1,this.editScheduled&&(this._isValidateEdit=ri._validateDetail(e),this._completeUpdateParams(e))}_completeUpdateParams(e){this._serviceDetail={reference:null==e?void 0:e.reference,serviceOwner:this._serviceOwner},this._selectedService={name:this._serviceName},this._paramsUpdate={origin:{number:this._productNumber,productName:this._productName,amount:this._findDetailProduct(null==e?void 0:e.relatedContract).amount,currency:this._findDetailProduct(null==e?void 0:e.relatedContract).currency,image:this._findDetailProduct(null==e?void 0:e.relatedContract).image||"",isCard:this._isCard,isAccount:this._isAccount},amount:this._maximumAmount,currency:this._currency,periodicity:{value:this._periodicity}},this._isValidateEdit&&(delete this._paramsUpdate.amount,delete this._paramsUpdate.periodicity)}_editScheduled(){this._showMultiStep=!0,this._showMultistepModal=!0,this._editParams=this._paramsUpdate,this._isEditScheduled=!0}_buildAdditionalData(){this._isAccount?this._additionalInformationsData={additionalInformations:[{id:this.idProduct,value:this.productDomiciliationId},{id:this.idSubProduct,value:this.subProductDomiciliationValue}]}:this._additionalInformationsData={additionalInformations:[{id:this.idProduct,value:this.productRecurringChargeId},{id:this.idSubProduct,value:this.subProductRecurringChargeValue}]}}get _updateDirectDebitDm(){return this.shadowRoot.querySelector(`[data-tag-name="${ae.is}"]`)}_editScheduledParams(e){this._showMultiStep=!1,this._buildAdditionalData();const t=[{id:"HAS_CERTAIN_DEADLINE",isActive:"true"}];if("editAmount"===e){var i;const e={amounts:[{id:"MAXIMUM_AMOUNT",amountValue:{amount:this._maximumAmount,currency:null===(i=this._paramsUpdate)||void 0===i?void 0:i.currency}}],indicators:t};"DEACTIVATED"===this._statusScheduledBillPayment?this._sendEditParams={...e,...this._additionalInformationsData,status:{id:"REACTIVATED"}}:this._sendEditParams={...e,...this._additionalInformationsData}}else{const e={frequency:{id:Rt[this._periodicity]||this._periodicity},indicators:t};"DEACTIVATED"===this._statusScheduledBillPayment?this._sendEditParams={...e,...this._additionalInformationsData,status:{id:"REACTIVATED"}}:this._sendEditParams={...e,...this._additionalInformationsData}}this._updateDirectDebitDm.patchDirectDebit(this.directDebitId,this._sendEditParams)}_editScheduledInfo(){var e;this._showMultiStep=!1,this._buildAdditionalData();const t={amounts:[{id:"MAXIMUM_AMOUNT",amountValue:{amount:this._maximumAmount,currency:null===(e=this._paramsUpdate)||void 0===e?void 0:e.currency}}],frequency:{id:Rt[this._periodicity]||this._periodicity},indicators:[{id:"HAS_CERTAIN_DEADLINE",isActive:"true"}]};"DEACTIVATED"===this._statusScheduledBillPayment?this._sendEditParams={...t,...this._additionalInformationsData,status:{id:"REACTIVATED"}}:this._sendEditParams={...t,...this._additionalInformationsData},this._updateDirectDebitDm.patchDirectDebit(this.directDebitId,this._sendEditParams)}_editScheduledService(){this._showMultiStep=!1,this._buildAdditionalData();const e=[{id:"HAS_CERTAIN_DEADLINE",isActive:"true"}];"DEACTIVATED"===this._statusScheduledBillPayment?this._sendEditParams={...this._additionalInformationsData,status:{id:"REACTIVATED"},indicators:e}:this._sendEditParams={...this._additionalInformationsData,indicators:e},this._updateDirectDebitDm.patchDirectDebit(this.directDebitId,this._sendEditParams)}_cancelScheduled(e){var t,i,s,a,n,r;this._serviceName=null==e||null===(t=e.service)||void 0===t?void 0:t.name,this._serviceOwner=ri._parseName(null==e||null===(i=e.relatedContract)||void 0===i||null===(s=i.participants[0])||void 0===s?void 0:s.fullName),this._productName=this._findDetailProduct(null==e?void 0:e.relatedContract).productName,this._productNumber=null==e?void 0:e.relatedContract.number,this._isCard=this._findDetailProduct(null==e?void 0:e.relatedContract).cardType||!1,this._isAccount=this._findDetailProduct(null==e?void 0:e.relatedContract).accountType||!1;const o=null==e?void 0:e.amounts.find((e=>e.id===this.amountId));this._showMultiStep=!0,this._showMultistepModal=!0;const c={name:this._serviceName,reference:null==e?void 0:e.reference,serviceOwner:this._serviceOwner,contractId:null==e?void 0:e.id,originName:this._productName,originNumber:At(this._productNumber),maximumAmount:null==o||null===(a=o.amountValue)||void 0===a?void 0:a.amount,currency:null==o||null===(n=o.amountValue)||void 0===n?void 0:n.currency,periodicity:{text:ri._parseName(null==e||null===(r=e.frequency)||void 0===r?void 0:r.name)}};this._cancelParams=c,this._isCancelScheduled=!0}_buildAdditionalCancelParams(e,t){this._sendEditParams={status:{id:"DEACTIVATED"},additionalInformations:[{id:this.idProduct,value:e},{id:this.idSubProduct,value:t}]},this._showMultiStep=!1,this._updateDirectDebitDm.patchDirectDebit(this.directDebitId,this._sendEditParams)}_sendCancelScheduled(){this._isAccount?this._buildAdditionalCancelParams(this.productDomiciliationId,this.subProductDomiciliationLowValue):this._buildAdditionalCancelParams(this.productRecurringChargeId,this.subProductRecurringChargeLowValue)}_directDebitUpdate(e){var t,i,s,a,n,r,o,c,l,d,u,h,m,p,v;const g=null==e||null===(t=e.detail)||void 0===t?void 0:t.amounts.find((e=>e.id===this.amountId));this._getDate();const b={date:Tt(null==e||null===(i=e.detail)||void 0===i?void 0:i.updateDate)||this._dateTicket,amount:null==g||null===(s=g.amountValue)||void 0===s?void 0:s.amount,currency:null==g||null===(a=g.amountValue)||void 0===a?void 0:a.currency,serviceName:this._serviceName,reference:null==e||null===(n=e.detail)||void 0===n?void 0:n.reference,serviceOwner:this._serviceOwner,originName:this._productName,originNumber:At(this._productNumber),periodicity:Lt[Mt[null==e||null===(r=e.detail)||void 0===r||null===(o=r.frequency)||void 0===o?void 0:o.id]||(null==e||null===(c=e.detail)||void 0===c||null===(l=c.frequency)||void 0===l?void 0:l.id)]||"account-transaction-servicing-scheduled-bill-payments-multistep-periodicity-label-default",id:`${null==e||null===(d=e.detail)||void 0===d||null===(u=d.service)||void 0===u?void 0:u.id}${null==e||null===(h=e.detail)||void 0===h?void 0:h.reference}`,validateProduct:this._isAccount};this._ticketParams=b,this._showSuccesTicket=!0;const _=this._selectOperation(),y=(null===(m=this._ticketParams)||void 0===m||null===(p=m.date)||void 0===p?void 0:p.longDate)||(null===(v=this._dateTicket)||void 0===v?void 0:v.longDate);this._shareReceiptData(y,this._ticketParams,_)}_selectOperation(){var e,t;return this._isCancelScheduled?null!==(t=this._ticketParams)&&void 0!==t&&t.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-scheduled"):this.t("account-transaction-servicing-scheduled-bill-payments-multistep-label-cancel-recurring-charge"):null!==(e=this._ticketParams)&&void 0!==e&&e.validateProduct?this.t("account-transaction-servicing-scheduled-bill-payments-ticket-body-domiciliation-registration"):this.t("account-transaction-servicing-scheduled-bill-payments-ticket-body-recurring-charge")}_getServiceDetail(e){this._serviceReference=e.reference,this._serviceOwner=e.serviceOwner,this._serviceDetail={reference:this._serviceReference,serviceOwner:this._serviceOwner}}_getOrigin(e){"accountType"in e?(this._accountName=null==e?void 0:e.productName,this._accountNumber=null==e?void 0:e.number,this._accountCurrency=null==e?void 0:e.currency,this._isAccount=!0):(this._cardName=null==e?void 0:e.productName,this._cardNumber=null==e?void 0:e.number,this._cardCurrency=null==e?void 0:e.currency,this._isCard=!0)}_clearOriginProperties(e){e.stopPropagation(),this._accountName="",this._accountNumber="",this._accountCurrency="",this._isAccount=!1,this._cardName="",this._cardNumber="",this._cardCurrency="",this._isCard=!1}_getPeriodicity(e){this._periodicity=null==e?void 0:e.value}get _getCustomerContact(){return this.shadowRoot.querySelector(`[data-tag-name="${ht.is}"]`)}_getCustomerContactDetails(){this._getCustomerContact.getCustomerContactDetails(this.customerId)}_exitOperative(){this.reset(),Et(this,"scheduled-bill-payments-exit")}reset(){this._resetProperties()}_resetMultiStep(){this._multiStepDetail=this.shadowRoot.querySelector('[data-tag-name="account-transaction-servicing-scheduled-bill-payments-multistep"]');const e=this._multiStepDetail.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').querySelectorAll('[data-tag-name="bbva-expandable-step"]');e.forEach(((t,i)=>{e[i].completed=!1,e[i].disabled=!0,e[i].active=!1}));const t=e[0];t.disabled=!1,t.active=!0,this._multiStepDetail.resetMultistepProperties(),this.resetMulti()}_successChanged(e){e.stopPropagation(),this._showSuccesTicket=null==e?void 0:e.detail}_resetProperties(){this.cancelScheduled=!1,this.directDebitId="",this.editScheduled=!1,this.iOSFixedHeader=!1,this.native=!1,this.pdfId="",this.scannerReference="",this.resetMultistep=!1,this._accountCurrency="",this._accountName="",this._accountNumber="",this._additionalInformationsData={},this._cancelParams={},this._customerEmail="",this._checkOrigin={accounts:!1,cards:!1},this._secondStepCollapsed="",this._currency="",this._dateTicket={},this._editParams={},this._isShowErrorOrigin=!1,this._isCancelScheduled=!1,this._isEditScheduled=!1,this._isAccount=!1,this._isCard=!1,this._accountList=[],this._cardList=[],this._maximumAmount=0,this._multiStepDetail={},this._originDetail="",this._originSelected={},this._paramsUpdate={},this._paymentMethod="",this._periodicity="",this._periodicityItems=[],this._productName="",this._productNumber="",this._serviceReference="",this._retriesConfig={SERVICEUNAVAILABLE:0,GETSTOREDSERVICES:0,GETLISTSERVICES:0,GETPERIODICITYOPTIONS:0,GETACCOUNTS:0,GETCARDS:0,SHOWORIGIN:0,OTPSIGNING:0,SERVICEGETDETAIL:0},this._resetInputs=!1,this._scheduledServices=[],this._sendEditParams={},this._serviceDetail={},this._serviceName="",this._serviceOwner="",this._selectedService={},this._shareScheduledData={},this._showDynamicModal=!1,this._showHalfModal=!1,this._showInfoModal=!1,this._showMultiStep=!1,this._showMultistepModal=!1,this._showSuccesTicket=!1,this._statusScheduledBillPayment="",this._startDate="",this._isStoredService=!1,this._storedServices=[],this._storedServiceSelected={},this._isErrorOrigin=!1,this._isVisibleServices=!1,this._isFirstStepCompleted=!1,this._isThreeStepCompleted=!1,this._isValidateEdit=!1}_retryUpdateScheduledServices(){this._updateDirectDebitDm.patchDirectDebit(this.directDebitId,this._sendEditParams)}_retryShowOrigin(){this._isShowErrorOrigin=!1,this._isErrorOrigin=!1,this._handleCardsAndAccounts()}_closeMultistep(){this._resetMultiStep()}_retryService(e){this[{SERVICEUNAVAILABLE:"_retryUpdateScheduledServices",GETSTOREDSERVICES:"_getStoredServices",GETLISTSERVICES:"_getServices",GETPERIODICITYOPTIONS:"_getPeriodicityOptions",GETACCOUNTS:"_handleCardsAndAccounts",GETCARDS:"_handleCardsAndAccounts",SHOWORIGIN:"_retryShowOrigin",OTPSIGNING:"_sendDirectDebits",SERVICEGETDETAIL:"initOperative"}[e]]()}_commonModalActions(e,t){return{veilClick:t?this._retryService.bind(this,e):this._closeModalListeners[e],footerLinkClick:this._closeModalListeners[e]}}_getErrorModalActions({service:e,showRetries:t}){return{...this._commonModalActions(e,t),footerButtonClick:t?this._retryService.bind(this,e):this._exitOperative.bind(this),headerPrimaryClick:this._exitOperative.bind(this)}}_getModalConfig({service:e,showRetries:t}){const i=`${"OTPSIGNING"===e?"OTP":"ERROR_SERVICE"}${t?"_RETRY":"_EXIT"}`;return Jt({service:e,...this._getErrorModalActions({configLabel:i,service:e,showRetries:t})})[i]}_manageError(e){const t=this._retriesConfig[e]<this.maxRetries;this._retriesConfig[e]+=1,this._configModal=this._getModalConfig({service:e,showRetries:t}),this._showHalfModal=!0}_setShareScheduledData(e){this._shareScheduledData=e}get _renderDynamicModal(){return a`
      <dynamic-modal
        .modalConfig="${this._configDynamicModal}"
        ?visible="${this._showDynamicModal}"
        @visible-changed="${e=>{e.stopPropagation(),this._showDynamicModal=null==e?void 0:e.detail}}"
      >
      </dynamic-modal>
    `}get _renderHalfModal(){return a`
      <half-content-modal
        .modalConfig="${this._configModal}"
        ?visible="${this._showHalfModal}"
        @visible-changed="${e=>{e.stopPropagation(),this._showHalfModal=null==e?void 0:e.detail}}"
      >
      </half-content-modal>
    `}get _renderInfoModal(){return a`
      <info-content-modal
        .modalConfig="${this._configInfoModal}"
        ?visible="${this._showInfoModal}"
        @visible-changed="${e=>{e.stopPropagation(),this._showInfoModal=null==e?void 0:e.detail}}"
      >
      </info-content-modal>
    `}_handleContactDetailsFetch({detail:e}){var t,i;const s=null===(t=(e||[]).find((({contact:e})=>"EMAIL"===(null==e?void 0:e.contactDetailType))))||void 0===t||null===(i=t.contact)||void 0===i?void 0:i.address,a=s.indexOf("@");if(-1!==a){const e=s.substring(a-3,s.length);this._customerEmail=e}}_handleContactDetailsFetchError(){this._customerEmail=""}get _globalApiDm(){return a`
      ${this._cardsDM} ${this._accountsDM} ${this._getServicesListApi} ${this._getStoredServicesApi}
      ${this._getPeriodicityOptionsApi} ${this._sendDirectDebitsApi} ${this._updateDirectDebitApi}
      ${this._contactDetailsApi}
    `}get _contactDetailsApi(){return a`
      <bbva-global-customer-contact-details-api-dm
        id="contactDetailsDm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native=${this.native}
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${this._handleContactDetailsFetch}"
        @customer-contact-details-api-dm-fetch-error="${this._handleContactDetailsFetchError}"
        @api-dm-error="${this._handleContactDetailsFetchError}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}get _getServicesListApi(){return a`
      <bbva-global-services-api-dm
        id="servicesApiDm"
        .host="${this.host}"
        .version="${this.servicesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @services-api-dm-fetch="${e=>{this._scheduledServices=e.detail,this._handleListServicesSuccess()}}"
        @services-api-dm-fetch-error="${()=>{this.clearLoader(),this._manageError("GETLISTSERVICES")}}"
        @api-dm-error="${()=>{this.clearLoader(),this._manageError("GETLISTSERVICES")}}"
      ></bbva-global-services-api-dm>
    `}get _getStoredServicesApi(){return a`
      <bbva-global-stored-services-api-dm
        id="storedServicesApiDm"
        .host="${this.host}"
        .version="${this.storedServicesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @stored-services-api-dm-fetch="${e=>{this._getListStoredServices(e)}}"
        @stored-services-api-dm-fetch-error="${()=>this._manageError("GETSTOREDSERVICES")}"
        @api-dm-response-error="${()=>this._manageError("GETSTOREDSERVICES")}"
      ></bbva-global-stored-services-api-dm>
    `}get _getPeriodicityOptionsApi(){return a`
      <bbva-global-catalog-records-api-dm
        id="catalogRecordsApiDm"
        .host="${this.host}"
        .version="${this.catalogRecordsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @catalog-records-api-dm-fetch="${this._catalogRecordsSuccess}"
        @catalog-records-api-dm-fetch-error="${()=>this._manageError("GETPERIODICITYOPTIONS")}"
        @api-dm-error="${()=>this._manageError("GETPERIODICITYOPTIONS")}"
      ></bbva-global-catalog-records-api-dm>
    `}get _sendDirectDebitsApi(){return a`
      <bbva-global-direct-debits-api-dm
        id="directDebitsApiDm"
        .host="${this.host}"
        .version="${this.directDebitsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        requiredOTP
        @direct-debits-api-dm-create="${this._directDebitsCreate}"
        @direct-debits-api-dm-create-error="${({detail:e})=>this._manageErrorDirectDebits(e)}"
        @api-dm-error="${({detail:e})=>this._manageErrorDirectDebits(e)}"
      ></bbva-global-direct-debits-api-dm>
    `}get _updateDirectDebitApi(){return a`
      <bbva-global-direct-debit-api-dm
        id="directDebitApiDm"
        .host="${this.host}"
        .version="${this.directDebitApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOTP
        @direct-debit-api-dm-fetch="${this._responseDetailDirectDebit}"
        @direct-debit-api-dm-fetch-error="${()=>this._manageError("SERVICEGETDETAIL")}"
        @direct-debit-api-dm-update="${this._directDebitUpdate}"
        @direct-debit-api-dm-update-error="${()=>this._manageError("SERVICEUNAVAILABLE")}"
        @api-dm-error="${()=>this._manageError("SERVICEUNAVAILABLE")}"
      ></bbva-global-direct-debit-api-dm>
    `}_responseDetailDirectDebit(e){var t,i,s;e.stopPropagation(),this._updateData=e.detail,this._originDetail=null===(t=e.detail)||void 0===t||null===(i=t.relatedContract)||void 0===i||null===(s=i.numberType)||void 0===s?void 0:s.id,"PAN"===this._originDetail?this._getCards():this._getAccounts()}get _accountsDM(){return a`
      <bbva-global-accounts-api-dm
        id="accountsDm"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @accounts-api-dm-fetch="${this._setAccounts}"
        @api-dm-error="${()=>this._manageError("GETACCOUNTS")}"
        @accounts-api-dm-fetch-error="${()=>this._manageError("GETACCOUNTS")}"
      ></bbva-global-accounts-api-dm>
    `}get _cardsDM(){return a`
      <bbva-global-cards-api-dm
        id="cardsDm"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @cards-api-dm-fetch="${this._setCards}"
        @cards-api-dm-fetch-error="${()=>this._manageError("GETCARDS")}"
        @api-dm-error="${()=>this._manageError("GETCARDS")}"
      >
      </bbva-global-cards-api-dm>
    `}_manageInfoModal(e){this._configInfoModal=ti()[e],this._showInfoModal=!0}_exitOperation(e){this._configModal=ei({footerButtonClick:"MULTISTEP"===e?this._exitOperative.bind(this):this._closeMultistep.bind(this)})[e],this._showHalfModal=!0}resetMulti(){this.serviceSelected={},this._selectedService={},this._periodicityItems=[],this._paymentMethod="",this._originSelected={},this._resetInputs=!0,this._isFirstStepCompleted=!1,this._secondStepCollapsed=""}_getServiceSelected(e){this._isVisibleServices=!1;var t;"alias"in e?this._completeStoredService(e):(this._selectedService=e,this._paymentMethod=null==e||null===(t=e.paymentMethod)||void 0===t?void 0:t.id,this._isFirstStepCompleted=!0)}showCardsOrAccounts(e){e.stopPropagation();const t="cards"===(null==e?void 0:e.detail),i="cards"===(null==e?void 0:e.detail)?this._cardList:this._accountList;this._isVisibleCardsOrAccount=!0,this._isThreeStepCompleted=!1,this._configOriginModal=si({response:i,isCards:t,headerId:null==e?void 0:e.detail,isServiceModal:!1})}_getCardsOrAccountSelected(e){this._isVisibleCardsOrAccount=!1,this._originSelected=e,this._isThreeStepCompleted=!0,this._getOrigin(this._originSelected)}get _renderAccountsOrCardsModal(){return a`
      <dynamic-content-modal
        id="cardsAccountsModal"
        .modalConfig=${this._configOriginModal}
        @visible-changed=${e=>{e.stopPropagation(),this._isVisibleCardsOrAccount=null==e?void 0:e.detail}}
        @account-transaction-servicing-scheduled-bill-payments-modal-cards-accounts-hide=${e=>this._getCardsOrAccountSelected(e.detail)}
        ?visible=${this._isVisibleCardsOrAccount}
      >
      </dynamic-content-modal>
    `}get _renderDynamicContentModal(){return a`
      <dynamic-content-modal
        id="servicesModal"
        .modalConfig=${this._configServicesModal}
        @visible-changed="${e=>{e.stopPropagation(),this._isVisibleServices=null==e?void 0:e.detail}}"
        @account-transaction-servicing-scheduled-bill-payments-modal-hide=${e=>this._getServiceSelected(e.detail)}
        ?visible=${this._isVisibleServices}
      >
      </dynamic-content-modal>
    `}get _renderMultistep(){return this._showMultiStep?a`
          <account-transaction-servicing-scheduled-bill-payments-multistep
            id="multiStep"
            language="${this.language}"
            maximum-products-showed="${this.maximumProductsShowed}"
            minimum-amount-edit="${this.minimumAmountEdit}"
            scanner-reference="${this.scannerReference}"
            second-step-collapsed="${this._secondStepCollapsed}"
            payment-method="${this._paymentMethod}"
            ?show-multistep="${this._showMultistepModal}"
            ?is-account="${this._isAccount}"
            ?is-cancel-scheduled="${this._isCancelScheduled}"
            ?is-edit-scheduled="${this._isEditScheduled}"
            ?reset-inputs="${this._resetInputs}"
            ?is-first-step-completed="${this._isFirstStepCompleted}"
            ?is-three-step-completed="${this._isThreeStepCompleted}"
            ?is-validate-edit="${this._isValidateEdit}"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?reset-progress-multistep="${this.resetMultistep}"
            .accountList="${this._accountList}"
            .cardList="${this._cardList}"
            .cancelParams="${this._cancelParams}"
            .editParams="${this._editParams}"
            .exceptionEditAmount="${this.exceptionEditAmount}"
            .originSelected="${this._originSelected}"
            .periodicityItems="${this._periodicityItems}"
            .selectedService="${this._selectedService}"
            .serviceDetail="${this._serviceDetail}"
            @account-transaction-servicing-scheduled-bill-payments-origin-properties-clear="${this._clearOriginProperties}"
            @account-transaction-servicing-scheduled-bill-payments-service-detail="${({detail:e})=>this._getServiceDetail(e)}"
            @account-transaction-servicing-scheduled-bill-payments-origin-select="${({detail:e})=>this._getOrigin(e)}"
            @account-transaction-servicing-scheduled-bill-payments-maximum-amount-select="${e=>{this._maximumAmount=e.detail}}"
            @account-transaction-servicing-scheduled-bill-payments-periodicity-select="${e=>{this._periodicity=e.detail.value}}"
            @account-transaction-servicing-scheduled-bill-payments-customer-contact-details-get="${this._getCustomerContactDetails}"
            @account-transaction-servicing-scheduled-bill-payments-saved-services-get="${this._getStoredServices}"
            @account-transaction-servicing-scheduled-bill-payments-list-services-get="${this._getServices}"
            @account-transaction-servicing-scheduled-bill-payments-pdf-document-select="${this._openDocument}"
            @account-transaction-servicing-scheduled-bill-payments-info-send="${this._sendDirectDebits}"
            @account-transaction-servicing-scheduled-bill-payments-scheduled-bill-payment-data-share="${e=>this._setShareScheduledData(e.detail)}"
            @account-transaction-servicing-scheduled-bill-payments-edit-info-send="${this._editScheduledInfo}"
            @account-transaction-servicing-scheduled-bill-payments-edit-send="${({detail:e})=>this._editScheduledParams(e)}"
            @account-transaction-servicing-scheduled-bill-payments-edit-service-send="${this._editScheduledService}"
            @account-transaction-servicing-scheduled-bill-payments-scheduled-cancel="${this._sendCancelScheduled}"
            @account-transaction-servicing-scheduled-bill-payments-multistep-reset="${this.reset}"
            @account-transaction-servicing-scheduled-bill-payments-info-get="${({detail:e})=>this._manageInfoModal(e)}"
            @account-transaction-servicing-scheduled-bill-payments-multistep-exit="${({detail:e})=>this._exitOperation(e)}"
            @account-transaction-servicing-scheduled-bill-payments-accounts-cards-get="${this._handleCardsAndAccounts}"
            @account-transaction-servicing-scheduled-bill-payments-periodicity-items-get="${this._getPeriodicityItems}"
            @account-transaction-servicing-scheduled-bill-payments-accounts-cards-show="${this.showCardsOrAccounts}"
            @account-transaction-servicing-scheduled-bill-payments-camera-open="${this._scanCodeService}"
          >
          </account-transaction-servicing-scheduled-bill-payments-multistep>
        `:b}get _successScheduledBillPayment(){return a`
      <bbva-help-modal
        header-type="modal"
        full-height
        header-text="${this._isCancelScheduled?this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header-cancel"):this.t("account-transaction-servicing-scheduled-bill-payments-multistep-header")}"
        header-close-icon-aria-label="${this.t("account-transaction-servicing-scheduled-bill-payments-accessibility-close-button")}"
        ?visible="${this._showSuccesTicket}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @visible-changed="${this._successChanged}"
        @help-modal-close="${e=>{e.stopPropagation(),this._exitOperative()}}"
        ambient="primary-alt"
      >
        <div slot="slot-content">
          <account-transaction-servicing-scheduled-bill-payments-ticket
            id="successTicket"
            .language="${this.language}"
            .scheduledInfo="${this._ticketParams}"
            ?is-cancel-scheduled="${this._isCancelScheduled}"
          ></account-transaction-servicing-scheduled-bill-payments-ticket>
        </div>
      </bbva-help-modal>
    `}render(){return a`
      ${super.render()} ${this._globalApiDm} ${this._renderMultistep} ${this._renderHalfModal}
      ${this._renderDynamicContentModal} ${this._renderAccountsOrCardsModal}
      ${this._successScheduledBillPayment} ${this._renderInfoModal} ${this._renderDynamicModal}
    `}}customElements.define(ri.is,ri);var oi=Object.freeze({__proto__:null});export{Fe as B,ze as a,oi as s};
