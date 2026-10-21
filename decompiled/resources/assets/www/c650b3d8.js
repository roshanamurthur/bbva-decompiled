import{J as e,L as t,aZ as i,a7 as s,dC as a,dD as n,dE as r,h as o,a as c,i as l,b as p,z as d,aX as h,an as u,ak as m,dH as b,aY as g,ch as _,ci as f,a9 as y}from"./952f98a9.js";import{L as v,M as A,e as S,K as T,G as C,x,H as $,f as R,N as E,D as P,T as N,z as w,V as O,a2 as D,I as M,Z as k,F as I,a1 as j,E as V,Y as L,A as B,h as F,Q as q,a4 as H,a3 as G,P as z,O as U}from"./216055dc.js";import{B as K}from"./f6b0e03b.js";import{B as W,a as X}from"./a0b89eb0.js";import{B as J,a as Y}from"./4eb8d874.js";import{B as Q}from"./40b41b3c.js";import{B as Z,a as ee}from"./a4e2d801.js";import"./f89161ad.js";import{B as te}from"./13014d63.js";import{B as ie}from"./c281d121.js";import{aH as se,aI as ae,bf as ne,bg as re,R as oe}from"./7f3d7ca9.js";import{B as ce,b as le}from"./41ed0536.js";import{B as pe,b as de,c as he,d as ue,e as me,f as be}from"./30ef6f1f.js";import{a as ge,B as _e,c as fe,b as ye}from"./e3d898b2.js";import{B as ve,b as Ae}from"./972f570a.js";import{B as Se,b as Te}from"./d335c75d.js";import"./ff2cdeea.js";class Ce extends(e(t)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==e[t].id&&e.splice(t,1);return e}}class xe{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,n=Math.max(a>=0?a:s-Math.abs(a),0);for(;n<s;){if((r=i[n])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;n++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",n=0,r=arguments.length;n!==r;++n){var o=+arguments[n];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class $e extends xe{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Re=0,Ee=1,Pe="jwt",Ne="tsec",we="none";class Oe extends xe{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Re,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new $e,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ne:this.requiredToken=we,this.requiresJWT=!1):this.requiredToken===Ne?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Pe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===we?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ne)}_setJwtHandler(){this._setTokenHandler(Pe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Ee?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Ne,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Pe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Pe?"JWT ":"",a=e===Pe?"Authorization":Ne;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(n);r?t[a]=t[a]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,n=0;if(s<=127?(a=0,n=255&s):s<=223?(a=1,n=31&s):s<=239?(a=2,n=15&s):s<=244&&(a=3,n=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],n=n<<6|63&s,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,a=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:n,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),p=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(p),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,p,n,r,o,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(p,n,r,o,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),n=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(n),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,n){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:a,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,n){s?this._notifySignatureRequired(e,t,i,s,a,n):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,n,r)}}class De extends Oe{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Me extends Oe{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class ke extends De{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Ie extends Me{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class je extends De{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class Ve extends De{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Le extends De{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Be extends De{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Fe extends Ce{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(s))}_getBgadp(e){return{getAccountsV1:()=>new Q(e),getAccountsV0:()=>new ke(e),postAccountsV0:()=>new Ie(e),postAccountsV1:()=>new J(e),getAccountsV2:()=>new W(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){if("0"==this.version&&Object.keys(e).length){const t=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],i=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];e["status.id"]&&t.includes(e["status.id"])&&this._removeFields(["status.id"],e),e["indicators.id"]&&i.includes(e["indicators.id"])&&this._removeFields(["indicators.id"],e),this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(e,"expand.id","expand"),e}_responseMapping(e){if(Array.isArray(e)&&e.length>0){if("0"==this.version)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product");["COMMON","CREDIT"].includes(e[t].accountType.id)||this._removeFields(["accountType"],e[t]),this._removeFields(["subType"],e[t].accountType),this._removeFields(["previousMonthAverageBalances"],e[t].availableBalance),"DORMANT"===e[t].status.id&&this._removeFields(["status"],e[t]),this._removeFields(["reason","reasonDescription","situation"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],e[t])}else if("1"==this.version)for(let t=0;t<e.length;t++)e[t].product&&this._removeFields(["subProduct"],e[t].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],e[t]),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){if("0"==this.version&&Object.keys(e).length){this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.status.reason&&(e.status.reason={id:e.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(e.accountType.id)||this._removeFields(["accountType"],e),e.participants.forEach((e=>{this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType||Object.keys(e).some((e=>"firstName"===e))?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):("LEGAL_PERSON"===e.personType||Object.keys(e).some((e=>"legalName"===e)))&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],e)),e.participantType.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination&&e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails&&e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],e)}return e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.status&&this._removeFields(["name"],e.status),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(e.participantType.id)&&this._removeFields(["participantType"],e),e.order&&(e.participantType={...e.participantType,order:e.order},this._removeFields(["order"],e)),e.customDetails.firstName&&(e.firstName=e.customDetails.firstName),e.customDetails.lastName&&(e.lastName=e.customDetails.lastName),e.customDetails.secondLastName&&(e.secondLastName=e.customDetails.secondLastName);const t=["DNI","NIE","NIF","CIF","PASSPORT"];e.customDetails.identityDocuments&&e.customDetails.identityDocuments.forEach((i=>{t.includes(i.documentType.id)&&(e.identityDocument={documentNumber:i.documentNumber,documentType:i.documentType.id})})),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),"DIGITAL_CONTACT"===e.destination.id&&this._removeFields(["id"],e.destination),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingType"],e)})))),e}_paginationMapping(e){return e}}s(Fe,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),s(Fe,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(Fe.is,Fe);class qe extends Ce{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(s))}_getBgadp(e){return{getAccountTransactionsV2:()=>new a(e),getAccountTransactionsV0:()=>new Be(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let s=t[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===e[s])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(e[t].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const a=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[a,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}s(qe,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(qe.is,qe);class He extends Ce{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const i={"account-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(s))}_getBgadp(e){return{getAccountParticipantsV2:()=>new Z(e),getAccountParticipantsV1:()=>new n(e),postAccountParticipantsV1:()=>new r(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}s(He,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),s(He,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(He.is,He);class Ge extends Ce{static get is(){return"bbva-global-account-participants-api-dm"}static get properties(){return{accountParticipants:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accountParticipants=[],this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accountParticipants"],this._loaded=!1,this._requestParams={},this._modules={Es:()=>import("./1b741766.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}AccountParticipants`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccountParticipants${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-account-participants-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-account-participants-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=He.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccountParticipants(){await this.module.updateComplete,this.module.resetAccountParticipants()}async getAccountParticipants(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({accountId:e,params:t}):this._requestParams={get:[{accountId:e,params:t}]}}async _getAccountParticipants(){await this.module.updateComplete,Object.keys(this.accountParticipants).length||(this._requestParams.get.forEach((e=>{this.module.getAccountParticipants(null==e?void 0:e.accountId,null==e?void 0:e.params)})),delete this._requestParams.get)}async postAccountParticipants(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({accountId:e,body:t}):this._requestParams={post:[{accountId:e,body:t}]}}async _postAccountParticipants(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postAccountParticipants(null==e?void 0:e.accountId,null==e?void 0:e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}const ze={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},Ue={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Ke extends(c(qe)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[p];return Ke.scopedElementsFromClasses(e)}render(){return o` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return o`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${l(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,s)=>(i[s.replace(e,"")]=t.getItem(s),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const i=this.shadowRoot.getElementById("accountTransactions"),s=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:i,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[s]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let s={};var a,n;i&&(s={id:"EUR"===(null===(a=i.currency)||void 0===a?void 0:a.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(n=i.currency)||void 0===n?void 0:n.id});let r={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;r={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const o=0===Object.keys(s).length,c=0===Object.keys(r).length;return o&&c?null:o?[r]:c?[s]:[s,r]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const s=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,a=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,n=ze[s];var r;return{id:s,name:n,category:{id:s,name:n,subcategory:{id:a,name:(r=a,Object.keys(Ue).find((e=>Ue[e].includes(r))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:s,body:a}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${s}`,e.method=i,e.body=a,e.generateRequest(!0)}}customElements.define(Ke.is,Ke);class We extends Ce{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(s))}_getBgadp(e){return{getAccountLimitsV0:()=>new Le(e),getAccountLimitsV2:()=>new Y(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}s(We,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(We.is,We);class Xe extends Ce{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(s))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new ee(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Xe,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(Xe.is,Xe);class Je extends Ce{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(e,t,i){i=Object.assign({"account-id":e,"financial-statement-id":t},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,i.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatement`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementV0:()=>new Ve(e),default:()=>"BGADP does not exist."}}}s(Je,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(Je.is,Je);class Ye extends Ce{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatements`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementsV0:()=>new je(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Ye,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define(Ye.is,Ye);class Qe extends Ce{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountRelatedContracts`,this._getBgadp(s))}_getBgadp(e){return{getAccountRelatedContractsV2:()=>new X(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Qe,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(Qe.is,Qe);class Ze extends(e(t)){}class et extends Ze{static get is(){return"bbva-local-accounts-participants-api-dm"}static get properties(){return{}}constructor(){super(),this.native=!1,this.requiredToken="tsec",this.requiredOTP=!1}getAccountParticipants(e,t={}){this._generateGetService(this._getService("get","AccountParticipants",{},{"account-id":e,...t}),{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"},this._responseMapping,null==t?void 0:t.fields)}postAccountParticipants(e,t={}){this._generateGetService(this._getService("post","AccountParticipants",t,{"account-id":e}),{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"},this._responseMapping,null==t?void 0:t.fields)}_getService(e,t="",i={},s={}){const a=this._getServiceParams(s,i);return this._getServicePath(`${e}Accounts${t}`,this._getBgadp(a))}_getBgadp(e){return{getAccountsAccountParticipantsV1:()=>new n(e),postAccountsAccountParticipantsV1:()=>new r(e),getAccountsAccountParticipantsV2:()=>new Z(e),default:()=>"BGADP called doesn't exist"}}_responseMapping(e){return e}}var tt=d`
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

.security-icon {
  width: auto;
  max-height: 6rem;
  margin: 0;
  padding: 0;
  gap: 0.5rem;
}

.description-header {
  width: auto;
  max-height: 2rem;
  gap: 0.5rem;
}

.paragraph {
  width: auto;
  font-size: 0.9375rem;
  margin: 0 0 1rem 0;
  --typographyTypeMedium: rem(1px);
}

.list-bullet-container {
  margin: 0 0 0.75rem 0;
  padding: 0;
}

.notice-privacy-text {
  width: 90%;
  margin: 0 0 0 0.5rem;
  padding: 0;
}

.notice-privacy-link {
  width: auto;
  margin: 0;
}

.container-onboarding {
  margin: 0;
  padding: 0;
}

.privacy-container {
  display: flex;
  flex-wrap: wrap;
  padding: 0;
  margin: 0 0 1.5rem 0;
}

.privacy-icon {
  padding: 0.75rem 0 0 0;
}
`;class it extends(h(u(v(A(t))))){static get is(){return"onboarding-profile-recipients"}static get scopedElements(){const e=[S,T,C,se,x,$,R,...it.configurationScopedElements()];return it.scopedElementsFromClasses(e)}static get properties(){return{_eventTagName:{type:String,state:!0},isVisibleOnboarding:{type:Boolean,attribute:"is-visible-onboarding"}}}constructor(){super(),this._eventTagName="bbva-feature-profile-recipients-mx",this.isVisibleOnboarding=!1}static get styles(){return[tt,E.primary,P.primary,ae.primary,N.primary,w.primary,O.primary,E.primaryAlt,P.primaryAlt,ae.primaryAlt,N.primaryAlt,w.primaryAlt,O.primaryAlt,m("onboarding-profile-recipients-shared-styles")]}_closePage(){this._dispatchCustomEvent(`${this._eventTagName}-onBoarding-close-icon-click`,{typeModal:"goToBack",idPage:"onBoardingPage"}),this.isVisibleOnboarding=!1}_fullModalOpen(e){e.stopPropagation(),this._dispatchCustomEvent(`${this._eventTagName}-onboarding-page-open`)}get _renderOnboardingProfileRecipients(){return o`
      <bbva-clip-microillustration
        id="securityIcon"
        class="security-icon"
        microillustration="security"
        variant="M"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        id="descriptionHeader"
        class="description-header"
        tag="h2"
        text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-description-header")}"
      >
      </bbva-type-text>
      <bbva-type-text
        class="paragraph"
        text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-paragraph")}"
      >
      </bbva-type-text>
      <bbva-list-bullet class="list-bullet-container">
        ${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-lower-age-paragraph")}
      </bbva-list-bullet>
      <bbva-list-bullet class="list-bullet-container">
        ${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-management-beneficiaries")}
      </bbva-list-bullet>
      <div class="privacy-container">
        <div class="privacy-icon">
        <bbva-type-icon 
          id="privacyIcon"
          icon="${b()}"
        >
        </bbva-type-icon>
        </div>
        <bbva-type-text
          class="notice-privacy-text"
          id="noticePrivacyText"
          text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-icon-notice-privacy")}"
          size="2XS"
        >
        </bbva-type-text>
          <bbva-type-link
          id="noticePrivacyLink"
          size="2XS"
          class="notice-privacy-link"
          @click="${()=>this._dispatchCustomEvent(`${this._eventTagName}-link-open-notice-privacy-click`,{typeModal:"privacy"})}"
        >
          ${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-notice-privacy-link")}
          </bbva-type-link>
      </div>

    `}get _renderModalContainer(){return o`
      <bbva-help-modal
        ambient="primary"
        aria-label="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title")}"
        full-height
        fixed-footer
        id="OnboardingProfileRecipientsModal"
        header-text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title")}"
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-icon-close-modals")}"
        button-text="${this.t("bbva-feature-profile-recipients-mx-continue")}"
        footer-button-aria-label="${this.t("bbva-feature-profile-recipients-mx-continue")}"
        @help-modal-footer-button-click="${()=>this._dispatchCustomEvent(`${this._eventTagName}-button-open-multi-step-click`)}"
        @header-main-close-icon-click="${()=>this._closePage()}"
        @help-modal-open="${this._fullModalOpen}"
        ?visible="${this.isVisibleOnboarding}"
      >
        <div slot="slot-content" class="container-onboarding">
          ${this._renderOnboardingProfileRecipients}
        </div>
      </bbva-help-modal>
    `}render(){return o`${super.render()} ${this._renderModalContainer}`}}const st={goToBack:{headerText:"bbva-feature-profile-recipients-mx-modal-exit-recipients",titleIcon:"bbva:caution",modalType:"caution",textOne:"bbva-feature-profile-recipients-mx-modal-exit-body-text",buttonText:"bbva-feature-profile-recipients-mx-modal-exit-button-exit",linkText:"bbva-feature-profile-recipients-mx-modal-exit-link-continue"},warning:{headerText:"bbva-feature-profile-recipients-mx-modal-warning-header-text",titleIcon:"bbva:warning",modalType:"warning",textOne:"bbva-feature-profile-recipients-mx-modal-warning-body-text",buttonText:"bbva-feature-profile-recipients-mx-modal-warning-button-retry",linkText:"bbva-feature-profile-recipients-mx-modal-warning-exit-link"},erase:{headerText:"bbva-feature-profile-recipients-mx-modal-erase-recipoents",titleIcon:"bbva:caution",modalType:"caution",buttonText:"bbva-feature-profile-recipients-mx-continue",linkText:"bbva-feature-profile-recipients-mx-modal-footer-link-cancel"},changeCount:{headerText:"bbva-feature-profile-recipients-mx-multi-step-header-text-modify-acount",titleIcon:"bbva:caution",modalType:"caution",textOne:"bbva-feature-profile-recipients-mx-multi-step-body-text-modify-acount",buttonText:"bbva-feature-profile-recipients-mx-continue"},privacy:{headerText:"bbva-feature-profile-recipients-mx-notice-privacy-modal-header",textOne:"bbva-feature-profile-recipients-mx-notice-privacy-modal-paragraph-one",textTwo:"bbva-feature-profile-recipients-mx-notice-privacy-modal-paragraph-two"},error:{headerText:"bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title",modalType:"warning",titleIcon:"error",buttonText:"bbva-feature-profile-recipients-mx-modal-warning-exit-link",bodyTitleText:"bbva-feature-profile-recipients-mx-modal-error-operation-not-performed-title-text",sizeTitleText:"3XL",bodyText:"bbva-feature-profile-recipients-mx-modal-eror-opertaion-not-performed-body-text",sizeSubText:"S"},blackList:{headerText:"bbva-feature-profile-recipients-mx-multistep-profile-recipients-add-recipients-link",modalType:"warning",titleIcon:"error",buttonText:"bbva-feature-profile-recipients-mx-modal-button-accept",bodyTitleText:"bbva-feature-profile-recipients-mx-modal-title-text-unable-register-beneficiary-error-two",sizeTitleText:"3XL",bodyText:"bbva-feature-profile-recipients-mx-modal-body-text-unable-register-beneficiary-error",sizeSubText:"S"},configRenderModal:{defaultModal:["erase","goToBack","changeCount","privacy","warning"],fullHeightModal:["error","blackList"]}};var at=d`
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
`;class nt extends(h(u(v(A(t))))){static get is(){return"modal-alert"}static get scopedElements(){const e=[S,C,$,x,T,...nt.configurationScopedElements()];return nt.scopedElementsFromClasses(e)}static get properties(){return{_eventTagName:{type:String,state:!0},isVisible:{type:Boolean,attribute:"is-visible"},modalConfigIndex:{type:String,attribute:"modal-config-index"},_objConfigModal:{type:Object,state:!0},firstNameRecipients:{type:String,attribute:"first-name-recipients"},idClosePage:{type:String,reflect:!0,attribute:"id-close-page"}}}constructor(){super(),this.isVisible=!1,this._eventTagName="bbva-feature-profile-recipients-mx",this.modalConfigIndex="",this._objConfigModal={},this.firstNameRecipients="",this.idClosePage=""}static get styles(){return[at,P.primary,w.primary,N.primary,E.primary,P.primaryAlt,w.primaryAlt,N.primaryAlt,E.primaryAlt,m("modal-alert-shared-styles")]}_closeModals(){this._hiddenModal(),"error"===this.modalConfigIndex&&this._footerButtonClick(),""!==this.idClosePage?this._dispatchCustomEvent(`${this._eventTagName}-${this.modalConfigIndex}-${this.idClosePage}-button-click`):this._dispatchCustomEvent(`${this._eventTagName}-button-click-close-modal-${this.modalConfigIndex}`),this.requestUpdate()}_hiddenModal(){this.isVisible=!1,this._dispatchCustomEvent(`${this._eventTagName}-close-generic-modal`)}_footerButtonClick(){this._hiddenModal(),""!==this.idClosePage?this._dispatchCustomEvent(`${this._eventTagName}-${this.modalConfigIndex}-${this.idClosePage}-footer-button-click`):this._dispatchCustomEvent(`${this._eventTagName}-${this.modalConfigIndex}-footer-button-click`),this.requestUpdate()}_typeRenderModal(e){let t="fullHeightModal";return st.configRenderModal.defaultModal.includes(e)&&(t="defaultModal"),t}_listRenderModal(e){this._objConfigModal=st[e],"erase"===e&&(this._objConfigModal.textOne=`${this.t("bbva-feature-profile-recipients-mx-modal-text-one-erase")} ${this.firstNameRecipients} ${this.t("bbva-feature-profile-recipients-mx-modal-text-two-erase")}`),"error"===e&&(this.isVisible=!0);const t=this._typeRenderModal(e);return{defaultModal:this._renderMediumModal,fullHeightModal:this._renderFullModal}[t]}_fullModalOpen(e){e.stopPropagation(),this._dispatchCustomEvent(`${this._eventTagName}-full-modal-error-open`,this.modalConfigIndex)}get _panelInfoRender(){return o`
      <div>
        <bbva-clip-microillustration
          microillustration="${this._objConfigModal&&this._objConfigModal.titleIcon||""}"
        ></bbva-clip-microillustration>
      </div>
      <div>
        <bbva-type-text
          id="titleText"
          text="${this.t(this._objConfigModal&&this._objConfigModal.bodyTitleText)||""}"
          size="${this._objConfigModal&&this._objConfigModal.sizeTitleText||""}"
          font-weight="${g.fontWeight50}"
        ></bbva-type-text>
        <bbva-type-text
          id="subTitleText"
          text="${this._objConfigModal&&this._objConfigModal.bodyText||""}"
          size="${this._objConfigModal&&this._objConfigModal.sizeSubText||""}"
        ></bbva-type-text>
      </div>
    `}get _renderMediumModal(){return o`
      <bbva-help-modal
        id="${this.modalConfigIndex}"
        header-text="${this.t(this._objConfigModal&&this._objConfigModal.headerText)}"
        title-icon="${this._objConfigModal&&this._objConfigModal.titleIcon||""}"
        modal-type="${this._objConfigModal&&this._objConfigModal.modalType||""}"
        button-text="${this.t(this._objConfigModal&&this._objConfigModal.buttonText)||""}"
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-icon-close-sub-modals")}"
        link-text="${this.t(this._objConfigModal&&this._objConfigModal.linkText)||""}"
        footer-link-aria-label="close"
        ?visible="${this.isVisible}"
        header-left-icon-aria-label="padlock"
        @header-main-close-icon-click="${this._closeModals}"
        @help-modal-footer-button-click="${this._footerButtonClick}"
        @help-modal-veil-click="${this._closeModals}"
        @help-modal-footer-link-click="${this._closeModals}"
        @help-modal-swipe-close="${this._closeModals}"
      >
        <div slot="slot-content">
          <bbva-type-text
            text="${this.t(this._objConfigModal&&this._objConfigModal.textOne)||""}"
            font-weight="${g.fontWeight20}"
            size="S"
          >
          </bbva-type-text>
          <bbva-type-text
            text="${this.t(this._objConfigModal&&this._objConfigModal.textTwo)||""}"
            font-weight="${g.fontWeight20}"
            size="S"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
    `}get _renderFullModal(){return o`
      <bbva-help-modal
        id="${this.modalConfigIndex}"
        header-text="${this.t(this._objConfigModal&&this._objConfigModal.headerText)}"
        modal-type="${this._objConfigModal&&this._objConfigModal.modalType}"
        button-text="${this.t(this._objConfigModal&&this._objConfigModal.buttonText)}"
        full-height
        fixed-footer
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-icon-close-sub-modals")}"
        ?visible="${this.isVisible}"
        @header-main-close-icon-click="${this._closeModals}"
        @help-modal-footer-button-click="${this._footerButtonClick}"
        @help-modal-open="${this._fullModalOpen}"
      >
        <div slot="slot-content">${this._panelInfoRender}</div>
      </bbva-help-modal>
    `}render(){return o`${this._listRenderModal(this.modalConfigIndex)}`}}var rt=d`
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

.account-content {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-bottom: 1rem;
  padding-top: 1rem;
  min-height: 3rem;
  box-sizing: border-box;
}
.account-content:active {
  background-color: var(--bbva-button-default--_ambient--secondary-bg-color-disabled);
}
.account-content-summary {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem;
  margin-bottom: 1rem;
  width: 100%;
  box-sizing: border-box;
}
.account-sub-list {
  pointer-events: none;
  display: flex;
  flex-flow: column;
  align-items: flex-end;
}

.disabled {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 1rem;
  width: 100%;
  box-sizing: border-box;
  pointer-events: none;
  cursor: not-allowed;
}

.margin-divider {
  margin: 1.25rem;
}

.list-item {
  display: flex;
  width: auto;
  padding-block: 1rem;
  padding: 0 0.5rem 0.5rem 0.5rem;
}
.list-item .list-value {
  align-content: center;
  margin-top: 0.5rem;
}
.list-item .list-key {
  display: grid;
  width: 100%;
  align-content: space-between;
  margin-left: 1rem;
}
.list-item .list-key .ellipsis-text {
  width: 50%;
  margin-top: 0.5rem;
}
.list-item .list-key .sub-list {
  display: flex;
  justify-content: space-between;
}
.list-item .icons {
  display: flex;
  margin-left: auto;
  align-items: center;
  right: 0.5rem;
  position: absolute;
}
.list-budget {
  display: flex;
  justify-content: space-between;
  margin: 1.25rem 0;
}

.sub-list-text {
  display: flex;
  justify-content: space-between;
  margin-left: 1rem;
}

.ellipsis-text-title {
  width: 90%;
}

.form-percentage {
  margin: 0.5rem 0 1.25rem;
}

.notification-message {
  margin: 0 0 1.25rem 0;
}

.title-card-text {
  color: var(--_type-text-spotlight-color);
}
`;class ot extends(h(u(v(A(t))))){static get is(){return"compositions-list-type"}static get scopedElements(){const e=[ce,D,M,C,k,x,pe,$,I,...ot.configurationScopedElements()];return ot.scopedElementsFromClasses(e)}static get properties(){return{arrayListCountCard:{type:Array},typeOfList:{type:String,attribute:"type-of-list"},_eventTagName:{type:String,state:!0},arrayRecipients:{type:Array},itemBoxClip:{type:Array},isVisibleTrash:{type:Boolean,attribute:"is-visible-trash"},totalPercentage:{type:Number,attribute:"total-percentage"},invalidInput:{type:Boolean,attribute:"invalid-input"},dividerCount:{type:Boolean,attribute:"divider-count"},currencyCode:{type:String,attribute:"currency-code"}}}constructor(){super(),this.arrayListCountCard=[],this.typeOfList="",this._eventTagName="bbva-feature-profile-recipients-mx",this.arrayRecipients=[],this.itemBoxClip=[],this.isVisibleTrash=!1,this.totalPercentage=0,this.invalidInput=!1,this.dividerCount=!1,this.currencyCode=""}static get styles(){return[rt,P.primaryAlt,P.secondary,le.primaryAlt,le.secondary,j.secondary,j.primaryAlt,V.secondary,V.primaryAlt,L.primaryAlt,L.secondary,N.primaryAlt,N.secondary,de.primaryAlt,de.secondary,w.primaryAlt,w.secondary,B.primaryAlt,B.secondary,m("compositions-list-type-shared-styles")]}_getImage(e){return this.itemBoxClip=[{text:e.customDetails.firstName.slice(0,1)+e.customDetails.lastName.slice(0,1),size:"l",bitone:"true",bgColor:"secondary"}],this.itemBoxClip}_getClassName(e){return["Cuenta Indistinta","Cuenta Mancomunada"].includes(e.signedAuthorization)?"disabled":this.dividerCount?"account-content-summary":"account-content"}_signedAuthorization(e){"Cuenta Indistinta"!==e.signedAuthorization&&this._dispatchCustomEvent(`${this._eventTagName}-container-count-click`,[e])}_listTpl(){return{budget:this._renderListBudget,card:this._renderListCard,contact:this._renderListContact,simple:this._listSimple,summaryList:this._renderListContactSummary}[this.typeOfList]}get _renderListCard(){return o`
      ${this.arrayListCountCard&&this.arrayListCountCard.length>0?o`
            ${this.arrayListCountCard.map((e=>o`
                <div
                  tabindex="${e.index}"
                  ambient="${e.ambient}"
                  id="${e.index}"
                  class="${this._getClassName(e)}"
                  @click="${()=>this._signedAuthorization(e)}"
                >
                  <div>
                    <bbva-type-text
                      id="titleCard"
                      class="${"Cuenta Indistinta"===e.signedAuthorization?"":e.color}"
                      text="${e.productName}"
                      size="S"
                      font-weight="${g.fontWeight40}"
                      alignment="left"
                      inherit
                    >
                    </bbva-type-text>
                    <bbva-badge-reference
                      id="numberProduct"
                      number="${e.number}"
                    >
                    </bbva-badge-reference>
                  </div>
                  <div class="account-sub-list">
                    <bbva-type-amount
                      id="amount"
                      currency-code="${this.currencyCode}"
                      local-currency="${this.currencyCode}"
                      amount="${e.amount}"
                      bold
                    >
                    </bbva-type-amount>
                    <bbva-type-text
                      id="description"
                      text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-available-balance")}"
                      size="S"
                      font-weight="${g.fontWeight20}"
                      alignment="right"
                      inherit
                    >
                    </bbva-type-text>
                  </div>
                </div>
                ${"Cuenta Indistinta"===e.signedAuthorization||"Cuenta Mancomunada"===e.signedAuthorization?o`
                      <div ambient="primary-alt">
                        <bbva-notification-help
                          class="notification-message"
                          accessibility-label-icon="Message Alert"
                          variant="alert"
                          text="${"Cuenta Indistinta"===e.signedAuthorization?this.t("bbva-feature-profile-recipients-mx-notification-help-error-account-supportive"):this.t("bbva-feature-profile-recipients-mx-notification-help-error-account-jointly")}"
                        ></bbva-notification-help>
                      </div>
                    `:o` ${this.dividerCount||e.index>=this.arrayListCountCard.length-1?"":o` <bbva-divider-default></bbva-divider-default> `}`}
              `))}
          `:""}
    `}get _renderListContact(){return o`
      ${this.arrayRecipients.length>0?o`
            ${this.arrayRecipients.map(((e,t)=>o`
                <div class="list-item" ambient="primary">
                  <span class="list-value">
                    <bbva-clip-box
                      ambient="primary-alt"
                      .group="${this._getImage(e)}"
                    ></bbva-clip-box>
                  </span>
                  <div class="list-key" id="recipient${t}">
                    <div class="ellipsis-text">
                      <bbva-type-text
                        size="S"
                        text="${e.customDetails.fullName}"
                        font-weight="${g.fontWeight40}"
                        inherit
                        ellipsis
                        alignment="left"
                      ></bbva-type-text>
                    </div>
                    <div class="sub-list">
                      <bbva-type-text
                        text="${e.customDetails.relationType.id}"
                        size="S"
                        alignment="left"
                        font-weight="${g.fontWeight20}"
                        inherit
                        ellipsis
                      ></bbva-type-text>
                    </div>
                    <div class="icons">
                      <bbva-type-link
                        aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-edit-icon-recipients")}"
                        variant="icon"
                        id="editIcon"
                        class="${this.isVisibleTrash?"edit-icon":"trash-icon"}"
                        icon="${_()}"
                        icon-size="24"
                        @click="${()=>this._dispatchCustomEvent(`${this._eventTagName}-edit-button-click`,{indexId:t,recipientsObj:e})}"
                      ></bbva-type-link>
                      ${this.isVisibleTrash?o`
                            <bbva-type-link
                              variant="icon"
                              id="trashIcon"
                              aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-icon-recipients")}"
                              class="trash-icon"
                              icon="${f()}"
                              icon-size="24"
                              @click="${()=>this._dispatchCustomEvent(`${this._eventTagName}-trash-button-click`,{indexId:t,recipientsObj:e})}"
                            ></bbva-type-link>
                          `:""}
                    </div>
                  </div>
                </div>
                <div class="form-percentage" ambient="primary-alt">
                  <bbva-form-input
                    id="percentage${t}"
                    clear-accessible-text="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-percentage-recipients")}"
                    class="input-percentage"
                    label="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-label-percentage")}"
                    amount="${e.customDetails.participationPercentage}"
                    error-message="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-error-message-percentage")}"
                    ?invalid="${this.invalidInput}"
                    type="amount"
                    @form-input-value-change="${e=>this._dispatchCustomEvent(`${this._eventTagName}-input-value-change`,{value:e.detail,index:t})}"
                    @form-field-input-focus="${()=>this._dispatchCustomEvent(`${this._eventTagName}-input-focus`)}"
                  ></bbva-form-input>
                </div>
              `))}
          `:""}
    `}get _renderListContactSummary(){return o`
      ${this.arrayRecipients.length>0?o`
            ${this.arrayRecipients.map(((e,t)=>o`
                <div class="list-item" ambient="secondary">
                  <span class="list-value">
                    <bbva-clip-box
                      .group="${this._getImage(e)}"
                    ></bbva-clip-box>
                  </span>
                  <div class="list-key" id="${t}">
                    <div class="ellipsis-text-title">
                      <bbva-type-text
                        size="S"
                        text="${e.customDetails.fullName}"
                        font-weight="${g.fontWeight40}"
                        inherit
                        ellipsis
                      ></bbva-type-text>
                    </div>
                    <div class="sub-list">
                      <bbva-type-text
                        text="${e.customDetails.relationType.id}"
                        size="S"
                        alignment="left"
                        font-weight="${g.fontWeight20}"
                        inherit
                      ></bbva-type-text>
                    </div>
                  </div>
                </div>
                <div class="sub-list-text">
                  <bbva-type-text
                    text="${this.t("bbva-feature-profile-recipients-mx-multi-step-two-percentage")} ${e.customDetails.participationPercentage}${this.t("bbva-feature-profile-recipients-mx-composition-list-type")}"
                    size="S"
                    alignment="left"
                    font-weight="${g.fontWeight20}"
                    inherit
                    ellipsis
                  >
                  </bbva-type-text>
                </div>
              `))}
          `:""}
    `}get _renderListBudget(){return o`
      <div class="list-budget" ambient="primary">
        <bbva-type-text
          id="titleCardPercentage"
          size="S"
          font-weight="${g.fontWeight40}"
          alignment="left"
          inherit
          text="${this.t("bbva-feature-profile-recipients-mx-percentage-assigned")}"
        >
        </bbva-type-text>
        <bbva-type-amount
          id="totalPercentage"
          amount="${this.totalPercentage}"
          symbol="${this.t("bbva-feature-profile-recipients-mx-composition-list-type")}"
          decimals-hidden
        >
        </bbva-type-amount>
      </div>
    `}render(){return o`${this._listTpl()}`}}var ct=d`
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

.container-modal {
  --bbva-help-modal-padding: 0;
}

.slot-content {
  margin-top: -1.5rem;
}

.step-two {
  padding-bottom: 0;
}

.wrapper {
  box-sizing: border-box;
  padding: 0 1rem 0 1rem;
  margin-top: -2.75rem;
  overflow-x: hidden;
  max-width: 100vw;
}

#addBeneficiariesLink {
  margin: 1rem 0 1rem 0;
}

.button-container-onboarding {
  margin-top: 16px;
}
.button-container-onboarding .button-container .footer-button {
  margin: 3.5rem 0 0 0;
}

.footer-button {
  margin: 1.25rem 0 1.5rem 0;
}

.list_item {
  display: flex;
  width: 100%;
  padding-block: 0.75rem;
}
.list_item .list-value {
  align-content: center;
}
.list_item .list-key {
  display: grid;
  width: 100%;
  align-content: space-between;
  margin-left: 1rem;
}
.list_item .list-key .ellipsis-text {
  width: 50%;
}
.list_item .list-key .sub-list {
  display: flex;
  justify-content: space-between;
}

.confirmation {
  width: 100%;
  padding: 1rem 1rem 1.5rem;
  background-color: white;
}

.six-beneficiaries-paragraph {
  margin-top: 1.75rem;
}

.more-beneficiaries-paragraph {
  margin-top: 2rem;
}

.composition-card {
  padding: 1rem;
}
`;class lt extends(h(u(v(A(t))))){static get is(){return"multistep-profile-recipients"}static get scopedElements(){const e=[ot,S,F,ne,re,C,$,R,q,...lt.configurationScopedElements()];return lt.scopedElementsFromClasses(e)}static get properties(){return{_eventTagName:{type:String,state:!0},isVisible:{type:Boolean,attribute:"is-visible"},_firstStepCompleted:{type:Boolean,state:!0},_handleActiveFirstStep:{type:Boolean,state:!0},listAccount:{type:Array},_contracts:{type:Array,state:!0},_showLink:{type:Boolean,state:!0},_handleActiveSecondStep:{type:Boolean,state:!0},_secondStepCompleted:{type:Boolean,state:!0},listRecipientsAccount:{type:Array},recipientsList:{type:Array},_visibleTrash:{type:Boolean,state:!0},_totalPercentage:{type:Number,state:!0},_isEnabled:{type:Boolean,state:!0},_oldContract:{type:Array,state:!0},isCompletedMultiStep:{type:Boolean,attribute:"is-completed-multi-step"},_notRecipient:{type:Boolean,state:!0},_isNotChangeActive:{type:Boolean,state:!0},proceedings:{type:Boolean,attribute:"proceedings"},_indexRecipient:{type:Number,state:!0},accountNumber:{type:String,attribute:"account-number"},_fireResetClick:{type:Boolean,state:!0},_variantModalInitial:{type:String,state:!0},hasRecipients:{type:Boolean,attribute:"has-recipients"},productName:{type:String,attribute:"product-name"},businessDocumentGuard:{type:String,attribute:"business-document-guard"},consentCodeGuard:{type:String,attribute:"consent-code-guard"},currencyCodeNationality:{type:String,attribute:"currency-code-nationality"}}}constructor(){super(),this.productName="",this.isVisible=!1,this._indexRecipient=0,this.hasRecipients=!1,this._firstStepCompleted=!1,this._handleActiveFirstStep=!1,this.proceedings=!1,this.listAccount=[],this._contracts=[],this._oldContract=[],this._showLink=!1,this._handleActiveSecondStep=!1,this._secondStepCompleted=!1,this._eventTagName="bbva-feature-profile-recipients-mx",this.listRecipientsAccount=[],this.recipientsList=[],this._visibleTrash=!1,this._totalPercentage=0,this._isEnabled=!1,this.isCompletedMultiStep=!1,this._notRecipient=!1,this._isNotChangeActive=!1,this.accountNumber="",this._fireResetClick=!1,this._variantModalInitial="modal-initial-secondary",this.businessDocumentGuard="",this.consentCodeGuard="",this.stepOneIsActive=!1,this.currencyCodeNationality=""}static get styles(){return[ct,P.primary,P.primaryAlt,w.primary,w.primaryAlt,O.primary,O.primaryAlt,m("multistep-profile-recipients-shared-styles")]}updated(){setTimeout((()=>{this._deleteSpacePercentage(),this._deletePaddingStepOneView(),this._deleteFixFooterModalIoS()}))}connectedCallback(){super.connectedCallback(),this.dispatchEvent(new CustomEvent(`${this._eventTagName}-multistep-profile-recipients-ready`,{bubbles:!0,composed:!0}))}reset(){this._firstStepCompleted=!1,this._handleActiveFirstStep=!1,this._oldContract=[],this._showLink=!1,this._handleActiveSecondStep=!1,this._secondStepCompleted=!1,this.listRecipientsAccount=[],this.recipientsList=[],this._visibleTrash=!1,this._totalPercentage=0,this._isEnabled=!1,this.isCompletedMultiStep=!1,this._fireResetClick=!1,this.resetSteps(),this.currencyCodeNationality=""}resetSteps(){this._fireResetClick=!0;const e=this.shadowRoot.querySelector('[id="step1"]').shadowRoot.querySelector('[id="editButton"]');e&&e.click(),this.editStep()}stepOneView(){this.shadowRoot.querySelector('[id="step1"]').active=!0;const e=this.shadowRoot.querySelector('[id="step2"]'),t=this.shadowRoot.querySelector('[id="expandableMultiStepContainer"]');t.hasAttribute("edition-enabled")&&!1===this.isCompletedMultiStep&&(e.active=!1,e.completed=!1,t.removeAttribute("edition-enabled"))}editStep(){this._firstStepCompleted=!1,this._handleActiveFirstStep=!0,this._isNotChangeActive=!1,this._resetStepTwo()}_resetStepTwo(){this._fireResetClick=!1,this._contracts=[],this._handleActiveSecondStep=!1,this._secondStepCompleted=!1,this.isCompletedMultiStep&&this._setSummaryStepTwo()}_editSecondStep(){this.isCompletedMultiStep=!1,this._contracts=this._oldContract;const e=this.shadowRoot.querySelector('[id="step2"]').shadowRoot.querySelector('[id="editButton"]');e&&e.click(),this._handleActiveSecondStep=!0,this._secondStepCompleted=!1}_setDataContracts(){this.isCompletedMultiStep?this._variantModalInitial="modal-initial-secondary":this._variantModalInitial="modal-initial",this._contracts=this.listAccount.slice(0,3).map(((e,t)=>({index:t,idCount:e.id,productName:e.product.name,number:e.number,ambient:"primary-alt",color:"title-card-text",signedAuthorization:e.signedAuthorization&&e.signedAuthorization.name,amount:e.detail&&e.detail.specificAmounts.flatMap((e=>e.amounts.map((e=>e.amount)))).slice(0,1),simpleCode:e.simpleCode})))}_setListAccount(){this.isVisible&&1===this._contracts.length?(this._handleActiveFirstStep=!0,this._firstStepCompleted=!0):this.isVisible&&this.listAccount.length>1?(this._setDataContracts(),this._showLink=!0):this.isVisible&&1===this.listAccount.length&&(this._setDataContracts(),this._setSummaryStepOne(this._contracts),this._handleActiveFirstStep=!0,this._firstStepCompleted=!0,this._showLink=!1)}_setSummaryStepOne(e){this._firstStepCompleted=!0,this._handleActiveFirstStep=!1,this._editSecondStep(),e.find((e=>void 0!==e.ambient)).ambient="secondary",e.find((e=>void 0!==e.color)).color="",this._variantModalInitial="modal-initial-secondary",this._oldContract=e,this._contracts=e,this.accountNumber=this._contracts.find((e=>e.number)).number,this.productName=e.find((e=>e.productName)).productName,!this._isNotChangeActive&&this._dispatchCustomEvent(`${this._eventTagName}-id-contract-send`,this._contracts.find((e=>e.idCount)).idCount)}_setSummaryStepTwo(){this.isCompletedMultiStep=!0,this._secondStepCompleted=!0,this._handleActiveSecondStep=!1,this.recipientsList=[...this.recipientsList],this._dispatchCustomEvent(`${this._eventTagName}-multi-step-two-button-click`,this.recipientsList.length)}_setContentStepTwo(){this.recipientsList.length>0&&(this._notRecipient||this.proceedings)?this._visibleTrash=!0:this._visibleTrash=this.recipientsList.length>1,this._getPercentage(),this.requestUpdate()}getRecipient(e){const t=e;t&&t.length>0&&(this.listRecipientsAccount=t),this.listRecipientsAccount.length?this.recipientsList=this.listRecipientsAccount.filter((e=>"HOLDER"!==e.participantType.id)):this.recipientsList=[],this._indexRecipient=this.recipientsList.length,this._notRecipient=0===this.recipientsList.length,this.clearLoader(),this.recipientsList.length>=0&&this.listAccount.length>1&&this._fullModalOpen(),this._removeBoldCardAccount()}_removeBoldCardAccount(){const e=this.shadowRoot.querySelector('[id="cardAccountSummary"]').shadowRoot.querySelector('[data-tag-name="bbva-type-amount"]');null!==e&&e.removeAttribute("bold")}_deleteSpacePercentage(){this.recipientsList.forEach(((e,t)=>{const i=this.shadowRoot.querySelector('[id="contact"]').shadowRoot.querySelector(`[id="percentage${t}"]`).shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]').shadowRoot.querySelector("div > span.back > span.back-currency");null!==i&&(i.style.color="var(--_form-field-input-color)",i.textContent=this.t("bbva-feature-profile-recipients-mx-composition-list-type"))}))}_deletePaddingStepOneView(){const e=this.shadowRoot.querySelector('[id="expandableMultiStepContainer"]');""!==e.style.paddingBottom&&e.style.removeProperty("padding-bottom")}_deleteFixFooterModalIoS(){if(this.isNativeIos){this.shadowRoot.querySelector('[id="MultistepProfileRecipientsModal"]').removeAttribute("style")}}sendDataManagerAnalytic(e){this._dispatchCustomEvent(`${this._eventTagName}-multistep-button-click`,e)}_getPercentage(){const e=this.recipientsList.map((e=>e.customDetails.participationPercentage)),t=e.reduce(((e,t)=>e+t),0);this._totalPercentage=t;const i=e.every((e=>e>0));this._isEnabled=!(100===this._totalPercentage&&i)}_updatePercentage({value:e,index:t}){const i=parseInt(e.value,10);t>=0&&t<this.recipientsList.length&&(this.recipientsList[t].customDetails.participationPercentage=i,this._getPercentage())}addNewRecipient(e){this.recipientsList=[...this.recipientsList,e],1===this.recipientsList.length&&(this.recipientsList.find((e=>void 0!==e.customDetails.participationPercentage)).customDetails.participationPercentage=100)}eraseRecipients(){this.recipientsList=this.recipientsList.filter(((e,t)=>t!==this._indexRecipient)),!0===this._notRecipient?this._visibleTrash=!0:this._visibleTrash=this.recipientsList.length>1,1===this.recipientsList.length&&(this.recipientsList.find((e=>void 0!==e.customDetails.participationPercentage)).customDetails.participationPercentage=100),this.requestUpdate()}_openModalChangeCount(){!this._fireResetClick&&this._dispatchCustomEvent(`${this._eventTagName}-multi-step-edit-step-one-click`,{typeModal:"changeCount"}),this.editStep(),this.isVisible=!1}noChangeCount(){this._isNotChangeActive=!0,this._setSummaryStepOne(this._oldContract)}_setEditRecipient(e){this.sendDataManagerAnalytic("editar beneficiario"),this.isVisible=!1,this._dispatchCustomEvent(`${this._eventTagName}-multi-step-edit-button-click`,e)}editRecipient(e,t){t>=0&&t<this.recipientsList.length&&(this.recipientsList[t]=e),this.recipientsList=[...this.recipientsList]}_closePage(){this._dispatchCustomEvent(`${this._eventTagName}-multi-step-header-close-icon-click`,{typeModal:"goToBack",idPage:"multiStep"}),this.isVisible=!1}_completeStepTwo(){if(this.proceedings){const e={participants:[]};return e.participants=this.recipientsList.map((e=>({...e}))),this._dispatchCustomEvent(`${this._eventTagName}-step-two-send-proceedings-button-click`,e)}return this.sendDataManagerAnalytic("continuar"),this._setSummaryStepTwo()}_sendRecipients(){const e={participants:[]};e.participants=this.recipientsList.map((e=>({...e}))),e.participants.forEach((e=>{"consentCode"in e||(e.consentCode=this.consentCodeGuard),"NATURAL_KNOWN"===e.customDetails.personType&&(e.customDetails.personType="NATURAL_UNKNOWN"),"businessDocument"in e||(e.businessDocument={id:this.businessDocumentGuard})})),this._dispatchCustomEvent(`${this._eventTagName}-final-multi-step-button-click`,e)}_addRecipients(){this.sendDataManagerAnalytic("agregar beneficiario"),this.isVisible=!1,this._dispatchCustomEvent(`${this._eventTagName}-multi-step-button-link-add-recipients-click`,this.recipientsList)}_openModalErase(e){this.sendDataManagerAnalytic("eliminar beneficiario"),this._indexRecipient=e&&e.indexId,this._dispatchCustomEvent(`${this._eventTagName}-multi-step-trash-button-click`,{typeModal:"erase",fullName:e.recipientsObj&&e.recipientsObj.customDetails.fullName})}errorRecipientPost(){this.shadowRoot.querySelector('[id="step2"]').shadowRoot.querySelector('[id="editButton"]').click(),this.recipientsList.splice(this._indexRecipient)}_fullModalOpen(e=""){this._handleActiveFirstStep=!0,""!==e&&e.stopPropagation(),this._handleActiveSecondStep?this._dispatchCustomEvent(`${this._eventTagName}-multi-step-two-open`,this.recipientsList.length):this._dispatchCustomEvent(`${this._eventTagName}-multi-step-select-account-open`,this.hasRecipients&&0===this.recipientsList.length?"1":this.recipientsList.length)}_scrollHeaderVariant({completed:e}){this.isCompletedMultiStep?this._variantModalInitial="modal-initial-secondary":this._variantModalInitial=e?"modal-initial-secondary":"modal-initial"}get _renderSummary(){return o`
      <compositions-list-type
        id="cardAccountSummary"
        type-of-list="card"
        currency-code="${this.currencyCodeNationality}"
        divider-count="true"
        .arrayListCountCard="${this._contracts}"
      ></compositions-list-type>
    `}get _renderItems(){switch(!0){case 1===this.recipientsList.length:return o`
          <compositions-list-type
            type-of-list="budget"
            currency-code="${this.currencyCodeNationality}"
            total-percentage="${this._totalPercentage}"
          ></compositions-list-type>
          ${this._tplLinkAdd} ${this._tplButtonStepTwo}
        `;case this.recipientsList.length>=2&&this.recipientsList.length<=5:return o`
          <compositions-list-type
            type-of-list="budget"
            currency-code="${this.currencyCodeNationality}"
            total-percentage="${this._totalPercentage}"
          >
          </compositions-list-type>
          ${this._tplLinkAdd}
          ${this._notRecipient?"":o`
                <bbva-notification-message
                  id="notificationMessage"
                  variant="caution"
                >
                  ${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-notification-message")}
                </bbva-notification-message>
              `}
          ${this._tplButtonStepTwo}
        `;case 6===this.recipientsList.length:return o`
          <compositions-list-type
            type-of-list="budget"
            currency-code="${this.currencyCodeNationality}"
            total-percentage="${this._totalPercentage}"
          >
          </compositions-list-type>
          <div id="buttonContainer">${this._tplButtonStepTwo}</div>
        `;default:return o`
          ${this._tplLinkAdd}
          <div class="button-container-onboarding">${this._tplButtonStepTwo}</div>`}}get _tplButtonStepTwo(){return o`
      <div id="buttonContainer" class="button-container">
        <bbva-button-default
          id="footerButtonCaseOne"
          fullwidth
          class="footer-button"
          text="${this.t("bbva-feature-profile-recipients-mx-continue")}"
          ?disabled="${this._isEnabled}"
          @click="${this._completeStepTwo}"
        >
        </bbva-button-default>
      </div>
    `}get _tplLinkAdd(){return o`
      <bbva-type-link
        id="addBeneficiariesLink"
        class="add-beneficiaries-link"
        text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-add-recipients-link")}"
        @click=${this._addRecipients}
      ></bbva-type-link>
    `}get _renderStepTwoContent(){return this._setContentStepTwo(),o`
      <div id="containerStepTwo" ambient="primary-alt">
        <bbva-type-text
          id="sixBeneficiariesParagraph"
          class="six-beneficiaries-paragraph"
          text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-paragraph-six-beneficiaries")}"
          size="S"
        >
        </bbva-type-text>
        <bbva-type-text
          id="moreBeneficiariesParagraph"
          class="more-beneficiaries-paragraph"
          text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-paragraph-more-beneficiaries")}"
          size="S"
        >
        </bbva-type-text>
        <compositions-list-type
          type-of-list="contact"
          currency-code="${this.currencyCodeNationality}"
          id="contact"
          .arrayRecipients="${this.recipientsList}"
          ?is-visible-trash="${this._visibleTrash}"
          ?invalid-input="${this._isEnabled}"
          @bbva-feature-profile-recipients-mx-input-value-change="${e=>this._updatePercentage(e.detail)}"
          @bbva-feature-profile-recipients-mx-trash-button-click="${e=>this._openModalErase(e.detail)}"
          @bbva-feature-profile-recipients-mx-edit-button-click="${e=>this._setEditRecipient(e.detail)}"
          @bbva-feature-profile-recipients-mx-input-focus="${()=>this.sendDataManagerAnalytic("porcentaje a asignar")}"
        >
        </compositions-list-type>
        ${this._renderItems}
      </div>
    `}get _renderSteps(){return o`
      <bbva-expandable-step
        id="step1"
        show-link
        hide-padding-left
        hide-padding-right
        hide-padding-top
        hide-padding-bottom
        disabled-target=".action"
        ?show-link="${this._showLink}"
        header="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-account-title")}"
        ?active="${this._handleActiveFirstStep}"
        ?completed="${this._firstStepCompleted}"
        current-step-label="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-account-step-one")}"
        edit-label="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-label-title")}"
        @expandable-step-edit-step="${()=>{!this._fireResetClick&&this._openModalChangeCount()}}"
      >
        <compositions-list-type
          type-of-list="card"
          currency-code="${this.currencyCodeNationality}"
          id="compositionCard"
          class="composition-card"
          .arrayListCountCard="${this._contracts}"
          @bbva-feature-profile-recipients-mx-container-count-click="${e=>this._setSummaryStepOne(e.detail)}"
        >
        </compositions-list-type>
        <div slot="summary" ambient="secondary">${this._renderSummary}</div>
      </bbva-expandable-step>
      <bbva-expandable-step
        header="${this._secondStepCompleted?this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title"):this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-header-step-two-title")}"
        show-link
        hide-padding-left
        hide-padding-right
        hide-padding-top
        hide-padding-bottom
        disabled-target=".action"
        ?active="${this._handleActiveSecondStep}"
        ?completed="${this._secondStepCompleted}"
        id="step2"
        class="step-two"
        edit-label="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-label-title")}"
        current-step-label="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-account-step-two")}"
        @expandable-step-edit-step="${this._editSecondStep}"
      >
        <div class="wrapper">${this._renderStepTwoContent}</div>
        <div slot="summary">
          <compositions-list-type
            type-of-list="summaryList"
            currency-code="${this.currencyCodeNationality}"
            .arrayRecipients="${this.recipientsList}"
          >
          </compositions-list-type>
        </div>
      </bbva-expandable-step>
    `}get _renderContentSteps(){return o`
      <bbva-expandable-multistep
        id="expandableMultiStepContainer"
        hide-animation
        @expandable-multistep-specific-step-scroll="${e=>this._scrollHeaderVariant(e.detail)}"
      >
        <div slot="content" class="steps">${this._renderSteps}</div>
        <div class="confirmation" slot="confirmation">
          <bbva-button-default
            id="buttonFinalStep"
            fullwidth
            variant="positive"
            text="${this.t("bbva-feature-profile-recipients-mx-multi-step-button-confirm")}"
            class="button"
            @click="${this._sendRecipients}"
          >
          </bbva-button-default>
        </div>
      </bbva-expandable-multistep>
    `}get _renderModalMultiStep(){return this._setListAccount(),o`
      <bbva-help-modal
        id="MultistepProfileRecipientsModal"
        ?visible="${this.isVisible}"
        full-height
        header-type="${this._variantModalInitial}"
        header-text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title")}"
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-icon-close-modals")}"
        class="container-modal"
        @help-modal-open="${this._fullModalOpen}"
        @header-main-close-icon-click="${this._closePage}"
      >
        <div slot="slot-content" class="slot-content">
          ${this._renderContentSteps}
        </div>
      </bbva-help-modal>
    `}render(){return o`${this._renderModalMultiStep}`}}const pt=[{id:"firstName",label:"bbva-feature-profile-recipients-mx-add-recipient-input-name-label",errorMessage:"bbva-feature-profile-recipients-mx-add-recipients-error-message-first-name",inputInvalid:!1},{id:"lastName",label:"bbva-feature-profile-recipients-mx-add-recipient-input-first-last-name-label",errorMessage:"bbva-feature-profile-recipients-mx-add-recipients-error-message-last-name",inputInvalid:!1},{id:"secondLastName",label:"bbva-feature-profile-recipients-mx-add-recipient-input-second-last-name-label",errorMessage:"bbva-feature-profile-recipients-mx-add-recipients-error-message-second-last-name",inputInvalid:!1}];var dt=d`
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

.form {
  margin-top: 1rem;
}

.footer-button {
  width: 90%;
  margin: 1rem;
  margin-top: 1.5rem;
}

.footer-button-new-participan {
  width: 100%;
}

.list-simple-address {
  margin: 0 0.75rem 0 3.5rem;
}

.address-data [data-tag-name=bbva-form-input] {
  padding: 0 0 1rem 0;
}

.postal-code {
  padding-top: 0.25rem;
}

.state {
  margin-top: -1rem;
  margin-bottom: 1.25rem;
}

.municipality {
  margin-top: -1rem;
  margin-bottom: 1.25rem;
}

.description {
  margin-left: -1rem;
  margin-bottom: -0.5rem;
  margin-top: 0.75rem;
}

.description-two {
  margin-left: -1rem;
  margin-top: -0.25rem;
  margin-bottom: 0.75rem;
}
`;class ht extends(h(u(v(A(t))))){static get is(){return"add-recipients"}static get scopedElements(){const e=[S,H,C,pe,he,ue,ge,_e,ve,Se,R,...ht.configurationScopedElements()];return ht.scopedElementsFromClasses(e)}static get properties(){return{isVisible:{type:Boolean,attribute:"is-visible"},_inputsList:{type:Array,state:!0},formData:{type:Object},_handleRadioButtonForm:{type:Boolean,state:!0},_handleRadioButtonTwoForm:{type:Boolean,state:!0},_isVisibleButton:{type:Boolean,state:!0},_eventTagName:{type:String,state:!0},resetValueInputs:{type:Boolean,attribute:"reset-value-inputs"},_indexReset:{type:Number,state:!0},valueDataBirthday:{type:String,attribute:"value-data-birthday"},relationships:{type:Array},_showAddress:{type:Boolean,state:!0},customerAddressObj:{type:Object},formDataNewAddress:{type:Object},geographicPlacesObject:{type:Array},selectedComponent:{type:Object},recipientEdit:{type:Object},relationsShipsFlag:{type:Boolean,attribute:"relations-ships-flag"},_interiorNumber:{type:String,state:!0},_resetValueInput:{type:Boolean,state:!0},countRecipients:{type:Number,attribute:"count-recipients"},addressMask:{type:Object},minDateNative:{type:String,attribute:"min-date-native"},businessDocumentGuard:{type:String,attribute:"business-document-guard"},consentCodeGuard:{type:String,attribute:"consent-code-guard"},_streetHasEmojis:{type:Boolean,state:!0},isNativeIos:{type:Boolean,attribute:"is-native-ios"}}}constructor(){super(),this.isNativeIos=!1,this._streetHasEmojis=!1,this.businessDocumentGuard="",this.consentCodeGuard="",this.isVisible=!1,this.countRecipients=0,this._inputsList=pt,this.minDateNative="",this.formData={recipientObj:{customDetails:{firstName:"",lastName:"",secondLastName:"",birthDate:"",relationType:{id:""}}}},this.formDataNewAddress={street:"",number:"",colony:"",zipCode:""},this.recipientEdit={},this.relationships=[],this._handleRadioButtonForm=!1,this._handleRadioButtonTwoForm=!1,this._isVisibleButton=!1,this._eventTagName="bbva-feature-profile-recipients-mx",this.resetValueInputs=!1,this._showAddress=!1,this._indexReset=0,this.valueDataBirthday="",this.customerAddressObj={},this.geographicPlacesObject=[],this.selectedComponent={},this.relationsShipsFlag=!1,this._interiorNumber="",this._resetValueInput=!1,this.addressMask={}}static get styles(){return[dt,G.primaryAlt,fe.primaryAlt,me.primaryAlt,de.primaryAlt,ye.primaryAlt,P.primaryAlt,be.primaryAlt,Ae.primaryAlt,Te.primaryAlt,O.primaryAlt,G.primary,de.primary,ye.primary,P.primary,be.primary,Ae.primary,Te.primary,O.primary,me.primary,fe.primary,m("add-recipients-shared-styles")]}updated(e){super.updated(e),e.has("relationships")&&(this._deleteFixFooterModalIoS(),this.requestUpdate())}_deleteFixFooterModalIoS(){if(this.isNativeIos){this.shadowRoot.querySelector('[id="addRecipientModal"]').removeAttribute("style")}}_handleRadioButton(e){this.relationsShipsFlag=!1;const t=e.target.id;"address"===t&&(this._handleRadioButtonForm=!0,this._handleRadioButtonTwoForm=!1,this.formData.handleRadioButtonForm="true"),"newAddress"===t&&(this._handleRadioButtonForm=!1,this._handleRadioButtonTwoForm=!0,this.formData.handleRadioButtonForm="true"),this._handleButton()}handleInput(e,t,i){if(this.formData.recipientObj.customDetails[t]=e,this._handleButton(),this.isVisible){const s="birthDate"===t;""===e&&!s?i.invalid=!0:s||(i.invalid=!1)}}_handleInputNewAddress(e,t,i){this.formDataNewAddress={...this.formDataNewAddress,[t]:e},this._validateInputsNewAddress(t,e,i);const s=""===this.formDataNewAddress[t].trim(),a="street"!==t;this.isVisible&&s?i.invalid=!0:a&&(i.invalid=!1),this._handleButton()}_validateInputsNewAddress(e,t,i){"street"===e&&t.length>50?(i.invalid=!0,i.errorMessage=this.t("bbva-feature-profile-recipients-mx-new-address-error-message-street")):"street"===e&&(i.invalid=!1,i.errorMessage=this.t("bbva-feature-profile-recipients-mx-new-address-error-message-steet-three")),"street"===e&&this._specialCharacters(t,i)}_specialCharacters(e,t){/[^a-zA-Z0-9\s\-.]/.test(e)?(this._streetHasEmojis=!0,t.invalid=!0,this._isVisibleButton=!0,t.errorMessage=this.t("bbva-feature-profile-recipients-mx-new-address-error-message-street-two")):this._streetHasEmojis=!1}_validationZipCode(e,t){const i=/^00/;5!==e.length||i.test(e)?(t.invalid=!0,this._isVisibleButton=!0,t.errorMessage=this.t("bbva-feature-profile-recipients-mx-new-address-error-message-postal-code-two")):(t.invalid=!1,this.formDataNewAddress.zipCode=e,this._dispatchCustomEvent(`${this._eventTagName}-search-zip-code-form-input`,e)),i.test(e)&&(t.invalid=!0,t.errorMessage=this.t("bbva-feature-profile-recipients-mx-new-address-error-message-postal-code-error"))}_checkIfAllValuesFilled(e){return Object.values(e).every((e=>e&&!("string"==typeof e&&(""===e.trim()||e.startsWith(" ")))&&("object"!=typeof e||this._checkIfAllValuesFilled(e))))}_handleButton(){if(this._handleRadioButtonTwoForm&&!this._streetHasEmojis){const e={...this.formData,...this.formDataNewAddress};this._isVisibleButton=!this._checkIfAllValuesFilled(e)}else this._handleRadioButtonForm&&(this._isVisibleButton=!this._checkIfAllValuesFilled(this.formData.recipientObj.customDetails))}_setGeographicPlaceTypes(){const e=this.geographicPlacesObject.find((e=>e.geographicPlaceTypes&&e.geographicPlaceTypes.length>0));return(e||{}).geographicPlaceTypes&&(e.geographicPlaceTypes.find((e=>void 0!==e.value))||{}).value||""}_setGeographicPlacesStateId(e){const t=this.geographicPlacesObject.find((t=>t.state&&void 0!==t.state[e]));return void 0!==t?t.state[e]:""}_sendNewParticipant(){const e={customDetails:{personType:this.formData&&this.formData.personType||"NATURAL_UNKNOWN",firstName:this.formData.recipientObj.customDetails.firstName,lastName:this.formData.recipientObj.customDetails.lastName,secondLastName:this.formData.recipientObj.customDetails.secondLastName,birthDate:this.formData.recipientObj.customDetails.birthDate,fullName:`${this.formData.recipientObj.customDetails.firstName} ${this.formData.recipientObj.customDetails.lastName} ${this.formData.recipientObj.customDetails.secondLastName}`,relationType:{id:this.formData.recipientObj.customDetails.relationType.id},participationPercentage:this.recipientEdit.recipientsObj&&this.recipientEdit.recipientsObj.customDetails.participationPercentage||0,address:null},participantType:{id:"BENEFICIARY"},consentCode:this.consentCodeGuard,businessDocument:{id:this.businessDocumentGuard}};if(this._handleRadioButtonTwoForm){const t={location:{addressComponents:[{name:this.formDataNewAddress.street,code:"",componentTypes:["STREET"]},{name:this.formDataNewAddress.number,code:"",componentTypes:["EXTERIOR_NUMBER"]},{name:this._interiorNumber,code:"",componentTypes:["INTERIOR_NUMBER"]},{name:this.formDataNewAddress.colony,code:"",componentTypes:["COLONY"]},{name:this._setGeographicPlaceTypes(),code:"",componentTypes:["ADMINISTRATIVE_AREA_LEVEL_2"]},{name:this._setGeographicPlacesStateId("id"),code:"",componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"]},{name:"",code:this.formDataNewAddress.zipCode,componentTypes:["POSTAL_CODE"]},{name:"MEX",code:"",componentTypes:["COUNTRY"]}]}};e.customDetails.address=t}return this.reset(),e}_sendNewParticipan(){if(this.recipientEdit.indexId>=0){const e=this.recipientEdit.indexId;this._dispatchCustomEvent(`${this._eventTagName}-edit-recipients-footer-button-click`,{data:this._sendNewParticipant(),index:e})}else this._dispatchCustomEvent(`${this._eventTagName}-add-recipients-footer-button-click`,this._sendNewParticipant());this._resetValueInput=!this._resetValueInput}reset(){this.addressMask={},this.countRecipients=0,this._indexReset=-1,this._resetValueInput=!this._resetValueInput,this.geographicPlacesObject=[],this.isVisible=!1,this.recipientEdit={},this.valueDataBirthday="",this.formDataNewAddress={street:"",number:"",colony:"",zipCode:""},this.formData={recipientObj:{customDetails:{firstName:"",lastName:"",secondLastName:"",birthDate:"",relationType:{id:""}}}},this._handleRadioButtonForm=!1,this._handleRadioButtonTwoForm=!1,this._isVisibleButton=!1,this.relationsShipsFlag=!1,this.resetValueInputs=!0,this.relationships=[],this._showAddress=!1}_showCustomerAddress(){this.customerAddressObj.STREET||(this.isVisible=!1,this.showLoader(),this._dispatchCustomEvent(`${this._eventTagName}-show-address-link-click`,this._showAddress)),this._showAddress=!this._showAddress}_findIndexRelationShips(){if(Array.isArray(this.relationships)){const e=this.formData.recipientObj&&this.formData.recipientObj.customDetails.relationType.id,t=this.relationships.findIndex((t=>t.description===e));t>=0&&(this.selectedComponent=this.shadowRoot.querySelector('[id="relationType"]'),this.selectedComponent&&(this.selectedComponent.selectedIndex=t))}}changeRecipient(e){this._handleRadioButtonForm=!0,this.recipientEdit=e,this._indexReset=e.indexId;const t=this.recipientEdit.recipientsObj.customDetails;Object.keys(t).forEach((e=>{Object.prototype.hasOwnProperty.call(this.formData.recipientObj.customDetails,e)&&(this.formData.recipientObj.customDetails[e]=t[e])})),this._handleButton()}_closePage(){this._dispatchCustomEvent(`${this._eventTagName}-add-recipients-close-icon-click`,{typeModal:"goToBack",idPage:"addRecipients"}),this.isVisible=!1}_getCurrentDate(){const e=new Date;return`${e.getFullYear()}-${String(e.getMonth()+1).padStart(2,"0")}-${String(e.getDate()).padStart(2,"0")}`}_connectNativePlugin(e){e.stopPropagation();const t=this._getCurrentDate(),i={dateFormat:"yyyy-MM-dd",defaultDate:t,minDate:this.minDateNative,maxDate:t};this._dispatchCustomEvent(`${this._eventTagName}-launch-date-picker`,i)}_fullModalOpen(e){this._isVisibleButton=!0,this.relationsShipsFlag=!0,e.stopPropagation(),this._dispatchCustomEvent(`${this._eventTagName}-add-recipients-open`,this.countRecipients),this._handleButton()}get _addRecipientsForm(){return o`
      ${this._inputsList.map((e=>o`
          <bbva-form-input
            id="${e.id}"
            class="form"
            type="text"
            label="${this.t(`${e.label}`)}"
            clear-accessible-text="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-input-recipients")}"
            ?resetValue="${this.resetValueInputs}"
            ?invalid="${e.inputInvalid}"
            value="${this.formData.recipientObj&&this.formData.recipientObj.customDetails[e.id]||""}"
            error-message="${this.t(e.errorMessage)}"
            allowed-pattern="[a-zA-Z a-zA-Z]"
            @form-input-value-change="${t=>this.handleInput(t.detail.value,e.id,t.target)}"
          >
          </bbva-form-input>
        `))}
    `}get _renderAddress(){const e=this.addressMask&&this.addressMask.ADMINISTRATIVE_AREA_LEVEL_1?this.addressMask.ADMINISTRATIVE_AREA_LEVEL_1.code:"",t=this.addressMask&&this.addressMask.COUNTRY?this.addressMask.COUNTRY.code:"",i=`${this.t("bbva-feature-profile-recipients-mx-add-recipients-dot-address")}${e}, ${t}`;return o`
      ${this.customerAddressObj.STREET&&this._showAddress?o`
            <bbva-type-text
              class="list-simple-address"
              font-style="italic"
              size="S"
              text="${`${this.customerAddressObj.STREET.name}\n                ${this.customerAddressObj.EXTERIOR_NUMBER.name}\n                ${this.customerAddressObj.COLONY.name}\n                ${this.customerAddressObj.COUNTRY.name}\n                ${this.t("bbva-feature-profile-recipients-mx-add-recipients-cp")}${this.customerAddressObj.POSTAL_CODE.code}\n              `}"
            >
            </bbva-type-text>
          `:o`
            <bbva-type-text
              class="list-simple-address"
              font-style="italic"
              size="S"
              text="${i}"
            >
            </bbva-type-text>
          `}
    `}get _renderPostalCode(){return o`
      <div class="postal-code">
        <bbva-form-input
          label="${this.t("bbva-feature-profile-recipients-mx-new-address-label-postal-code")}"
          type="text"
          id="zipCode"
          icon-variant="search"
          ambient="primary-alt"
          mode-input="numeric"
          maxlength="5"
          allowed-pattern="[0-9]"
          info-message="${this.t("bbva-feature-profile-recipients-mx-new-address-input-information-message")}"
          @form-input-value-change="${e=>this._validationZipCode(e.detail.value,e.target)}"
        >
        </bbva-form-input>
        <bbva-type-text
          text="${this.t("bbva-feature-profile-recipients-mx-new-address-label-state")}"
        ></bbva-type-text>
        <bbva-type-text
          id="state"
          class="state"
          text="${this.geographicPlacesObject&&this.geographicPlacesObject.length>0?this._setGeographicPlacesStateId("name"):""}"
          font-style="italic"
        ></bbva-type-text>
        <bbva-type-text
          text="${this.t("bbva-feature-profile-recipients-mx-new-address-label-city-hall")}"
        ></bbva-type-text>
        <bbva-type-text
          id="municipality"
          class="municipality"
          text="${this.geographicPlacesObject.length>0?this._setGeographicPlaceTypes():""}"
          font-style="italic"
          font-weight="350"
        ></bbva-type-text>
      </div>
    `}get _renderNewAddress(){return o`
      <div class="address-data">
        <bbva-form-select
          ?disabled="${!this.geographicPlacesObject.length>0}"
          id="colony"
          ambient="primary-alt"
          label="${this.t("bbva-feature-profile-recipients-mx-new-address-label-colony")}"
          accessibility-help-text="${this.t("bbva-feature-profile-recipients-mx-new-address-label-colony")}"
          close-button-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-close-select-option-recipients")}"
          selected-index="${this._indexReset}"
          @change="${e=>this._handleInputNewAddress(e.target.value,"colony",e.target)}"
        >
          ${this.geographicPlacesObject.length>0?o`
                ${this.geographicPlacesObject.map((e=>o`
                    <bbva-form-option value="${e.name}"
                      >${e.name}</bbva-form-option
                    >
                  `))}
              `:""}
        </bbva-form-select>
        <bbva-form-input
          label="${this.t("bbva-feature-profile-recipients-mx-new-address-label-street")}"
          clear-accessible-text="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-input-recipients")}"
          type="text"
          id="street"
          ambient="primary-alt"
          @form-input-value-change="${e=>this._handleInputNewAddress(e.detail.value,"street",e.target)}"
        >
        </bbva-form-input>
        <bbva-form-input
          clear-accessible-text="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-input-recipients")}"
          id="number"
          error-message="${this.t("bbva-feature-profile-recipients-mx-new-address-error-message-steet-four")}"
          label="${this.t("bbva-feature-profile-recipients-mx-new-address-label-exterior-number")}"
          type="text"
          ambient="primary-alt"
          allowed-pattern="[a-zA-Z0-9 ]"
          @form-input-value-change="${e=>this._handleInputNewAddress(e.detail.value,"number",e.target)}"
        >
        </bbva-form-input>
        <bbva-form-input
          clear-accessible-text="${this.t("bbva-feature-profile-recipients-mx-accessibility-erase-input-recipients")}"
          id="interiorNumber"
          label="${this.t("bbva-feature-profile-recipients-mx-new-address-label-interior-number")}"
          type="text"
          ambient="primary-alt"
          allowed-pattern="[a-zA-Z0-9 ]"
          @form-input-value-change="${e=>{this._interiorNumber=e.detail.value}}"
        >
        </bbva-form-input>
      </div>
    `}get _renderContainer(){return o`
      <bbva-header-category
        id="headerAdd"
        class="form"
        text="${this.t("bbva-feature-profile-recipients-mx-add-recipient-first-header-category")}"
      >
      </bbva-header-category>

      ${this._addRecipientsForm}

      <bbva-form-select
        ?disabled=${!this.relationships.length>0}
        class="form"
        id="relationType"
        label="${this.t("bbva-feature-profile-recipients-mx-add-recipient-select-relationship-label")}"
        accessibility-help-text="${this.t("bbva-feature-profile-recipients-mx-add-recipient-select-relationship-label")}"
        close-button-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-close-select-option-recipients")}"
        selected-index="${this._indexReset}"
        @change="${e=>{this.formData.recipientObj.customDetails.relationType.id=e.target.value,this.relationsShipsFlag=!1}}"
      >
        ${this.relationships.length>0?o`
              ${this.relationships.map((e=>o` <bbva-form-option value="${e.description}"
                    >${e.description}</bbva-form-option
                  >`))}
            `:""}
      </bbva-form-select>

      <bbva-form-date
        class="form"
        id="birthDate"
        label="${this.t("bbva-feature-profile-recipients-mx-add-recipient-data-calendar-label")}"
        pattern="d{4}-d{2}-d{2}"
        optional-label=""
        ?resetValue="${this._resetValueInput}"
        value="${this.formData.recipientObj&&this.formData.recipientObj.customDetails.birthDate||this.valueDataBirthday}"
        @click="${this._connectNativePlugin}"
        @change="${e=>this.handleInput(e.target.value,"birthDate",e.target)}"
      >
      </bbva-form-date>

      <bbva-header-category
        class="form"
        id="headerAddress"
        text="${this.t("bbva-feature-profile-recipients-mx-add-recipient-second-header-category")}"
        option-link="${this.customerAddressObj.STREET&&this._showAddress?this.t("bbva-feature-profile-recipients-mx-add-recipients-hidden-text-link"):this.t("bbva-feature-profile-recipients-mx-add-recipient-show-data-link")}"
        @header-category-link-click=${this._showCustomerAddress}
      >
      </bbva-header-category>

      <bbva-radio-group class="radio-group-left">
        <bbva-form-radio-button
          id="address"
          class="description"
          ?checked="${this._handleRadioButtonForm}"
          @change="${this._handleRadioButton}">
        ${this.t("bbva-feature-profile-recipients-mx-add-recipient-my-address-radio-button-text")}
        </bbva-form-radio-button>
        ${this._renderAddress}
        <bbva-form-radio-button
          id="newAddress"
          class="description-two"
          ?checked="${this._handleRadioButtonTwoForm}"
          @change="${this._handleRadioButton}">
        ${this.t("bbva-feature-profile-recipients-mx-add-recipient-other-address-radio-button-text")}
        </bbva-form-radio-button>
      </bbva-radio-group>

      ${this._handleRadioButtonTwoForm?o`${this._renderPostalCode} ${this._renderNewAddress}`:""}

      <bbva-button-default
        id="footerButton"
        class="footer-button-new-participan"
        text="${this.t("bbva-feature-profile-recipients-mx-continue")}"
        ?disabled="${this._isVisibleButton}"
        type="submit"
        @click="${this._sendNewParticipan}"
      >
      </bbva-button-default>
    `}get _renderModalAddRecipients(){return this.relationsShipsFlag&&this._findIndexRelationShips(),o`
      <bbva-help-modal
        id="addRecipientModal"
        hide-content-padding-top
        ?visible="${this.isVisible}"
        full-height
        header-text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-add-recipients-link")}"
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-accessibility-icon-close-modals")}"
        @header-main-close-icon-click="${this._closePage}"
        @help-modal-open="${this._fullModalOpen}"
      >
        <div slot="slot-content" ambient="primary-alt">
          ${this._renderContainer}
        </div>
      </bbva-help-modal>
    `}render(){return o`${this._renderModalAddRecipients}`}}var ut=d`
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

.date-hour-success {
  display: flex;
  justify-content: space-between;
}

.account-client-success {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.date-line {
  padding-top: 1rem;
}

.list-recipients-success {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
`;class mt extends(h(u(v(A(t))))){static get is(){return"success-page"}static get scopedElements(){const e=[S,T,C,z,$,D,q,ce,...mt.configurationScopedElements()];return mt.scopedElementsFromClasses(e)}static get properties(){return{_eventTagName:{type:String,state:!0},account:{type:String},listRecipients:{type:Array},typeAccount:{type:String,attribute:"type-account"},isVisible:{type:Boolean,attribute:"is-visible"},_formatDateHour:{type:Object,state:!0}}}constructor(){super(),this.isVisible=!1,this._eventTagName="bbva-feature-profile-recipients-mx",this.typeAccount="",this.account="",this.listRecipients=[],this._formatDateHour={day:"2-digit",month:"short",year:"numeric",hour:"2-digit",minute:"2-digit",hour12:!1}}static get styles(){return[ut,E.primary,P.primary,U.primary,w.primary,j.primary,le.primaryAlt,E.primaryAlt,P.primaryAlt,U.primaryAlt,w.primaryAlt,j.primaryAlt,le.primaryAlt,m("success-page-shared-styles")]}_fullModalOpen(e){e.stopPropagation(),this._extractCountry(),this._dispatchCustomEvent(`${this._eventTagName}-success-page-open`)}_extractCountry(){const e=this.typeAccount?this.typeAccount.match(/(?:Cuenta de) ([A-Za-zÁÉÍÓÚáéíóúñ]+)/i):null;if(e){const[,t]=e;this.typeAccount=t}}_validatedListRecipients(e){if("date"===e){const e=this.listRecipients.find((e=>e.registryDate));if(e)return e.registryDate}else if("customDetails"===e){return this.listRecipients.filter((e=>e.customDetails))}return""}get _tplDetailsSuccess(){return o`<div class="date-hour-success">
      <bbva-type-text
        text="${this.t("bbva-feature-profile-recipients-mx-success-page-date-hour")}"
      >
      </bbva-type-text>
      <bbva-type-date
        font-weight="${g.fontWeight40}"
        font-style="italic"
        .options="${this._formatDateHour}"
        date="${this._validatedListRecipients("date")}"
        class="date-line"
      >
      </bbva-type-date>
    </div>

    <div class="account-client-success">
      <bbva-type-text
        text="${this.t("bbva-feature-profile-recipients-mx-multistep-profile-recipients-account-title")}"
      >
      </bbva-type-text>

      <bbva-type-text
        id="account"
        text="${this.typeAccount} ${this.t("bbva-feature-profile-recipients-mx-add-recipients-dot-address")}${this.account.slice(-4)}"
        size="S"
        font-weight="${g.fontWeight40}"
        alignment="right"
      >
      </bbva-type-text>
    </div>`}get _tplListRecipientsSuccess(){return o`
      <bbva-type-text
        text-color="${y.secondary500}"
        text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-description-header")}"
        font-weight="${g.fontWeight40}"
        size="S"
      >
      </bbva-type-text>
      ${this._validatedListRecipients("customDetails")?this.listRecipients.map((e=>o`
          <div class="list-recipients-success">
            <bbva-type-text
              size="S"
              text="${`${e.customDetails.firstName} ${e.customDetails.lastName} ${e.customDetails.secondLastName}`}"
            >
            </bbva-type-text>
            <bbva-type-amount
              class="percentage-amount"
              amount="${e.customDetails.participationPercentage}"
              currency-code="${this.t("bbva-feature-profile-recipients-mx-composition-list-type")}"
              decimals-hidden
              variant="s"
              bold
            >
            </bbva-type-amount>
          </div>`)):""}
    `}get _tplProfileRecipientsSuccess(){return o`
      <bbva-clip-microillustration microillustration="success">
      </bbva-clip-microillustration>
      <bbva-type-text
        text="${this.t("bbva-feature-profile-recipients-mx-success-page-paragraph")}"
        font-weight="${g.fontWeight50}"
        size="XL"
      >
      </bbva-type-text>
      ${this._tplDetailsSuccess} ${this._tplListRecipientsSuccess}
      <bbva-notification-message
        class="message-recipients-success"
        font-weight="350"
        size="S"
      >
        ${this.t("bbva-feature-profile-recipients-mx-message-information")}
        <br/>
        ${this.t("bbva-feature-profile-recipients-mx-message-information-two")}
        <br/>
        ${this.t("bbva-feature-profile-recipients-mx-message-information-three")}
      </bbva-notification-message>
    `}get _tplContainerModal(){return o`
      <bbva-help-modal
        ambient="primary"
        full-height
        id="successModalPage"
        header-text="${this.t("bbva-feature-profile-recipients-mx-onboarding-profile-recipients-header-title")}"
        header-close-icon-aria-label="${this.t("bbva-feature-profile-recipients-mx-header-close-icon-arial-label")}"
        ?visible="${this.isVisible}"
        @header-main-close-icon-click="${()=>{this._dispatchCustomEvent(`${this._eventTagName}-close-success`)}}"
        @help-modal-open="${this._fullModalOpen}"
      >
        <div slot="slot-content">${this._tplProfileRecipientsSuccess}</div>
      </bbva-help-modal>
    `}render(){return o`${this._tplContainerModal}`}}var bt=d`
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
`;class gt extends(h(u(v(A(t))))){static get is(){return"bbva-feature-profile-recipients-mx"}static get scopedElements(){const e=[nt,it,lt,mt,K,et,Ge,te,ie,ht,...gt.configurationScopedElements()];return gt.scopedElementsFromClasses(e)}static get properties(){return{_eventTagName:{type:String,state:!0},_isVisibleModalAlert:{type:Boolean,state:!0},_isVisibleOnboarding:{type:Boolean,state:!0},_apiVersionCustomerAddress:{type:String,state:!0},_apiVersionAccountsParticipants:{type:String,state:!0},_apiVersionApplicationCatalogs:{type:String,state:!0},_apiVersionPlaces:{type:String,state:!0},financialOverContracts:{type:Object},_dmAccountRecipients:{type:Object,state:!0},_dmAccountGlobalRecipientsPost:{type:Object,state:!0},_isVisibleMultiStep:{type:Boolean,state:!0},_multiStepComponent:{type:Object,state:!0},_fullNameParticipants:{type:String,state:!0},_isVisibleAddRecipients:{type:Boolean,state:!0},_resetValueInputs:{type:Boolean,state:!0},_addRecipients:{type:Boolean,state:!0},_dmApplicationCatalogs:{type:Object,state:!0},_relationships:{type:Object,state:!0},_dmCustomerAddress:{type:Object,state:!0},_dmgPlaces:{type:Object,state:!0},customerId:{type:String,attribute:"customer-id"},_customerAddressObj:{type:Object,state:!0},_geographicPlacesObject:{type:Array,state:!0},_typeModal:{type:String,state:!0},_idPage:{type:String,reflect:!0,state:!0},_errorEvent:{type:String,state:!0},_idContractOld:{type:String,state:!0},_countErrorEvent:{type:Number,state:!0},_isVisibleSuccess:{type:Boolean,state:!0},_listRecipients:{type:Array,state:!0},hasRecipients:{type:Boolean,attribute:"has-recipients"},_proceedings:{type:Boolean,state:!0},_listContracts:{type:Array,state:!0},_addRecipientsComponent:{type:Object,state:!0},_contractProceedings:{type:Object,state:!0},_typeOtp:{type:Array,state:!0},_addressMask:{type:Object,state:!0},_otpAddress:{type:Boolean,state:!0},_repeatSendDataRecipients:{type:Boolean,state:!0},catalogIdPlaces:{type:String,attribute:"catalog-id-places"},geographicPlaceType:{type:String,attribute:"geographic-place-type"},minDateNative:{type:String,attribute:"min-date-native"},businessDocumentGuard:{type:String,attribute:"business-document-guard"},consentCodeGuard:{type:String,attribute:"consent-code-guard"},requiredOTP:{type:Boolean,attribute:"required-otp"},_valueDataBirthday:{type:String,state:!0},currencyCodeNationality:{type:String,attribute:"currency-code-nationality"},isNativeIosPage:{type:Boolean,attribute:"is-native-ios-page"}}}constructor(){super(),this.config={loader:!0},this._valueDataBirthday="",this.minDateNative="",this.businessDocumentGuard="",this.consentCodeGuard="",this.catalogIdPlaces="",this.geographicPlaceType="",this._eventTagName="bbva-feature-profile-recipients-mx",this._isVisibleModalAlert=!1,this._isVisibleOnboarding=!1,this._isVisibleMultiStep=!1,this._isVisibleAddRecipients=!1,this._isVisibleSuccess=!1,this._typeModal="",this._idPage="",this._apiVersionCustomerAddress="1",this._apiVersionAccountsParticipants="1",this._apiVersionPlaces="1",this._apiVersionApplicationCatalogs="0",this.financialOverContracts={},this._dmAccountRecipients={},this._dmApplicationCatalogs={},this._dmCustomerAddress={},this._multiStepComponent={},this._listRecipients=[],this._fullNameParticipants="",this._errorEvent="",this._addRecipients=!1,this._resetValueInputs=!1,this._relationships={},this.customerId="",this._customerAddressObj={},this._geographicPlacesObject=[],this._idContractOld="",this._countErrorEvent=0,this.hasRecipients=!1,this._proceedings=!1,this._listContracts=[],this._addRecipientsComponent={},this._contractProceedings={},this._typeOtp=[],this._addressMask={},this._otpAddress=!1,this._repeatSendDataRecipients={},this._dmgPlaces={},this._dmAccountGlobalRecipientsPost={},this.requiredOTP=!1,this.currencyCodeNationality="MXN"}static get styles(){return[bt,m("bbva-feature-profile-recipients-mx-shared-styles")]}firstUpdated(){this._dmgPlaces=this.shadowRoot.querySelector('[data-tag-name="bbva-global-places-api-dm"]'),this._dmAccountRecipients=this.shadowRoot.querySelector('[data-tag-name="bbva-local-accounts-participants-api-dm"]'),this._dmAccountGlobalRecipientsPost=this.shadowRoot.querySelector('[data-tag-name="bbva-global-account-participants-api-dm"]'),this._dmApplicationCatalogs=this.shadowRoot.querySelector('[data-tag-name="bbva-local-application-catalogs-api-dm"]'),this._dmCustomerAddress=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-addresses-api-dm"]'),this._addRecipientsComponent=this.shadowRoot.querySelector('[data-tag-name="add-recipients"]'),this._resetValueInputs=!0}initialMethod(e={}){if(void 0===this._contractProceedings.length&&e&&e.contracts&&(this._contractProceedings=e.contracts),void 0!==this._contractProceedings.length)this._listContracts=this._contractProceedings;else{const e=this.financialOverContracts.data&&this.financialOverContracts.data.contracts||[];this._listContracts=e.filter((e=>"ACCOUNT"===e.productType))}e&&e.previewPage&&"proceedings"===e.previewPage&&(this._proceedings=!0);const t=e&&e.participants&&e.participants.length>0;t||this.hasRecipients?(this.hasRecipients=!0,this._isVisibleOnboarding=!1,this._openMultiStepPage(),t&&this._multiStepComponent.getRecipient(e.participants)):this._isVisibleOnboarding=!0,this.requestUpdate()}reset(){this._eventTagName="bbva-feature-profile-recipients-mx",this._isVisibleModalAlert=!1,this._isVisibleMultiStep=!1,this._isVisibleAddRecipients=!1,this._isVisibleSuccess=!1,this._isVisibleOnboarding=!1,this._listRecipients=[],this._fullNameParticipants="",this._errorEvent="",this._addRecipients=!1,this._relationships={},this._customerAddressObj={},this._geographicPlacesObject=[],this._idContractOld="",this._countErrorEvent=0,this.hasRecipients=!1,this._proceedings=!1,this._listContracts=[],this._contractProceedings={},this._typeOtp=[],this._otpAddress=!1,this._multiStepComponent.reset(),this._valueDataBirthday="",this._addressMask={},this.currencyCodeNationality="MXN"}bridgeInit(e){e.value&&this.initialMethod()}_getRecipientsAccount(e){this._idContractOld=e,""!==this._errorEvent&&this.showLoader(),this._dmAccountRecipients.getAccountParticipants(e)}_setAddressComponents(e){const t=e.find((e=>e.location&&e.location.addressComponents));return t?t.location.addressComponents:""}_setCustomerAddress(e){this._isVisibleMultiStep=!1;const t=this._setAddressComponents(e).reduce(((e,t)=>(e[t.componentTypes.find((()=>!0))]=t,e)),{}),i=Object.values(t).some((e=>Object.values(e).some((e=>"string"==typeof e&&e.includes("*")))));0===Object.keys(this._addressMask).length?this._addressMask=t:this._customerAddressObj=i?{}:t,this.clearLoader(),this._isVisibleAddRecipients=!0}_requestGeographicPlaces(e){const t={"catalog.id":this.catalogIdPlaces,zipCode:e,"geographicPlaceType.id":this.geographicPlaceType};this._dmgPlaces.getPlaces(t)}_openMultiStepPage(){this._proceedings||this._multiStepComponent.stepOneView(),this.clearLoader(),this._isVisibleOnboarding=!1,this._isVisibleMultiStep=!0,this._isCompletedMultiStep=!1}_openMultiStepOne(){this._multiStepComponent.noChangeCount(),this._isVisibleMultiStep=!0}_openAddRecipients(e=null){this._getAddress(!1),this._dmApplicationCatalogs.getCatalogCustomersRecords("relationships"),e&&"object"==typeof e&&Object.keys(e).length>0&&this._addRecipientsComponent.changeRecipient(e),this._isVisibleMultiStep=!1,this._isVisibleAddRecipients=!0,this._resetValueInputs=!1,this._addRecipients=!1}_openSuccessPage(e){this._listRecipients=e,this.clearLoader(),this._isVisibleSuccess=!0}_openModalAlert(e){this._typeModal=e&&e.typeModal,this._idPage=e&&e.idPage||"",""!==this._idPage&&(this._isVisibleAddRecipients=!1,this._isVisibleMultiStep=!1),this._isVisibleOnboarding=!1,this._fullNameParticipants=e&&e.fullName,"changeCount"===this._typeModal&&(this._isVisibleMultiStep=!1),this._isVisibleModalAlert=!0}formDataSet(e){e&&e.selectedDate&&(this._valueDataBirthday=e.selectedDate,this._addRecipientsComponent.handleInput(e&&e.selectedDate,"birthDate"))}_closeMultiStep(){this.hasRecipients?this._goToBackPage():(this._isVisibleMultiStep=!1,this._isVisibleOnboarding=!0,this._multiStepComponent.reset())}_closeAddRecipients(e="",t=""){e&&""!==t?this._multiStepComponent.editRecipient(e,t):e&&this._multiStepComponent.addNewRecipient(e),this._geographicPlacesObject=[],this._valueDataBirthday="",this._relationships={},this._addRecipientsComponent.reset(),this._isVisibleAddRecipients=!1,this._isVisibleMultiStep=!0,this._resetValueInputs=!0,this._addRecipients=!0,this.requestUpdate()}_requestPostRecipients(e){this.showLoader(),this._isVisibleMultiStep=!1,this._dmAccountGlobalRecipientsPost.postAccountParticipants(this._idContractOld,e),this._repeatSendDataRecipients=e}_repeatRequest(){if(this._countErrorEvent+=1,this._countErrorEvent<3){switch(this._errorEvent){case"recipientList":this._getRecipientsAccount(this._idContractOld);break;case"recipientPost":this._requestPostRecipients(this._repeatSendDataRecipients);break;case"relationShips":this._dmApplicationCatalogs.getCatalogCustomersRecords("relationships")}this.showLoader()}else this._openModalAlert({typeModal:"error"}),this.clearLoader()}_errorClosePage(e,t){this._errorEvent=t,"recipientList"===this._errorEvent||"recipientPost"===this._errorEvent?this._isVisibleMultiStep=!1:this._isVisibleAddRecipients=!1;const i={typeModal:e,idPage:t};this._openModalAlert(i)}_errorRecipientPost(){this._multiStepComponent.errorRecipientPost(),this._isVisibleMultiStep=!0,this.clearLoader()}_getAddress(e){this._otpAddress=e,this._isVisibleAddRecipients=!1,this._dmCustomerAddress.getCustomerAddresses(this.customerId,{unmasked:e})}openAnalyticFunctionOtp(e){this._otpAddress||this._dispatchCustomEvent(`${this._eventTagName}-otp-app-step-three`,e)}cancelAfterError(){this._otpAddress?this._isVisibleAddRecipients=!0:this._isVisibleMultiStep=!0,this._otpAddress=!1,this.clearLoader()}_sendDataProceedings(e){this._dispatchCustomEvent(`${this._eventTagName}-send-data-proceedings`,e),this._isVisibleMultiStep=!1}_goToBackPage(){this.hasRecipients||(this._contractProceedings={}),this._isVisibleMultiStep=!1,this._multiStepComponent.reset(),this._dispatchCustomEvent(`${this._eventTagName}-go-to-back-page-events`)}_resetCompleted(){this.clearLoader(),this._multiStepComponent.reset(),this.reset(),this._goToBackPage()}_formatApplicationCatalogs(e){this._relationships=e.map((e=>({...e,description:e.description.split("/").map((e=>e.charAt(0).toUpperCase()+e.slice(1).toLowerCase())).join("/")})))}get _tplProfileRecipientsOnboarding(){return o`
      <onboarding-profile-recipients
        ?is-visible-onboarding="${this._isVisibleOnboarding}"
        @bbva-feature-profile-recipients-mx-link-open-notice-privacy-click="${e=>this._openModalAlert(e.detail)}"
        @bbva-feature-profile-recipients-mx-button-open-multi-step-click="${this._openMultiStepPage}"
        @bbva-feature-profile-recipients-mx-onBoarding-close-icon-click="${e=>this._openModalAlert(e.detail)}"
      >
      </onboarding-profile-recipients>
    `}get _tplMultiStepRecipients(){return o`
      <multistep-profile-recipients
        consent-code-guard="${this.consentCodeGuard}"
        currency-code-nationality="${this.currencyCodeNationality}"
        ?is-visible="${this._isVisibleMultiStep}"
        ?proceedings="${this._proceedings}"
        .listAccount="${this._listContracts}"
        ?is-completed-multi-step="${this._isCompletedMultiStep}"
        ?has-recipients="${this.hasRecipients}"
        business-document-guard="${this.businessDocumentGuard}"
        @bbva-feature-profile-recipients-mx-id-contract-send="${e=>this._getRecipientsAccount(e.detail)}"
        @bbva-feature-profile-recipients-mx-multi-step-trash-button-click="${e=>this._openModalAlert(e.detail)}"
        @bbva-feature-profile-recipients-mx-multi-step-edit-step-one-click="${e=>this._openModalAlert(e.detail)}"
        @bbva-feature-profile-recipients-mx-multi-step-button-link-add-recipients-click="${()=>this._openAddRecipients()}"
        @bbva-feature-profile-recipients-mx-multi-step-edit-button-click="${e=>this._openAddRecipients(e.detail)}"
        @bbva-feature-profile-recipients-mx-multi-step-header-close-icon-click="${e=>this._openModalAlert(e.detail)}"
        @bbva-feature-profile-recipients-mx-step-two-send-proceedings-button-click="${e=>this._sendDataProceedings(e.detail)}"
        @bbva-feature-profile-recipients-mx-final-multi-step-button-click="${e=>this._requestPostRecipients(e.detail)}"
        @bbva-feature-profile-recipients-mx-multistep-profile-recipients-ready="${e=>{this._multiStepComponent=e.target}}"
      ></multistep-profile-recipients>
    `}get _tplAddRecipients(){return o`
      <add-recipients
        min-date-native="${this.minDateNative}"
        business-document-guard="${this.businessDocumentGuard}"
        value-data-birthday="${this._valueDataBirthday}"
        consentCodeGuard="${this.consentCodeGuard}"
        ?is-visible="${this._isVisibleAddRecipients}"
        ?is-native-ios="${this.isNativeIosPage}"
        count-recipients="${this._multiStepComponent.recipientsList&&this._multiStepComponent.recipientsList.length}"
        ?reset-value-inputs="${this._resetValueInputs}"
        .relationships="${this._relationships}"
        .customerAddressObj="${this._customerAddressObj}"
        .addressMask="${this._addressMask}"
        .geographicPlacesObject="${this._geographicPlacesObject}"
        @bbva-feature-profile-recipients-mx-add-recipients-footer-button-click="${e=>this._closeAddRecipients(e.detail)}"
        @bbva-feature-profile-recipients-mx-show-address-link-click="${()=>this._getAddress(!0)}"
        @bbva-feature-profile-recipients-mx-search-zip-code-form-input="${e=>this._requestGeographicPlaces(e.detail)}"
        @bbva-feature-profile-recipients-mx-edit-recipients-footer-button-click="${e=>this._closeAddRecipients(e.detail.data,e.detail.index)}"
        @bbva-feature-profile-recipients-mx-add-recipients-close-icon-click="${e=>this._openModalAlert(e.detail)}"
      >
      </add-recipients>
    `}get _tplModalsAlert(){return this._isVisibleModalAlert?o`
      <modal-alert
        ?is-visible="${this._isVisibleModalAlert}"
        modal-config-index="${this._typeModal}"
        id-close-page="${this._idPage}"
        @bbva-feature-profile-recipients-mx-button-click-close-modal-privacy="${()=>{this._isVisibleOnboarding=!0}}"
        @bbva-feature-profile-recipients-mx-button-click-close-modal-changeCount="${this._openMultiStepOne}"
        @bbva-feature-profile-recipients-mx-erase-footer-button-click="${()=>this._multiStepComponent.eraseRecipients()}"
        @bbva-feature-profile-recipients-mx-goToBack-multiStep-footer-button-click="${this._closeMultiStep}"
        @bbva-feature-profile-recipients-mx-goToBack-addRecipients-footer-button-click="${()=>this._closeAddRecipients()}"
        @bbva-feature-profile-recipients-mx-goToBack-onBoardingPage-footer-button-click="${this._goToBackPage}"
        @bbva-feature-profile-recipients-mx-goToBack-multiStep-button-click="${()=>{this._isVisibleMultiStep=!0}}"
        @bbva-feature-profile-recipients-mx-warning-recipientList-button-click="${this._closeMultiStep}"
        @bbva-feature-profile-recipients-mx-goToBack-addRecipients-button-click="${()=>{this._isVisibleAddRecipients=!0}}"
        @bbva-feature-profile-recipients-mx-goToBack-onBoardingPage-button-click="${()=>{this._isVisibleOnboarding=!0}}"
        @bbva-feature-profile-recipients-mx-warning-relationShips-footer-button-click="${this._repeatRequest}"
        @bbva-feature-profile-recipients-mx-warning-recipientList-footer-button-click="${this._repeatRequest}"
        @bbva-feature-profile-recipients-mx-warning-recipientPost-footer-button-click="${this._repeatRequest}"
        @bbva-feature-profile-recipients-mx-warning-recipientPost-button-click="${this._openMultiStepPage}"
        @bbva-feature-profile-recipients-mx-warning-addRecipients-footer-button-click="${this._repeatRequest}"
        @bbva-feature-profile-recipients-mx-warning-relationShips-button-click="${()=>this._closeAddRecipients("")}"
        @bbva-feature-profile-recipients-mx-changeCount-footer-button-click="${this._openMultiStepPage}"
        @bbva-feature-profile-recipients-mx-blackList-recipientList-footer-button-click="${this._errorRecipientPost}"
        @bbva-feature-profile-recipients-mx-button-click-close-modal-blackList="${()=>this._resetCompleted()}"
        @bbva-feature-profile-recipients-mx-blackList-recipientList-button-click="${()=>this._resetCompleted()}"
        @bbva-feature-profile-recipients-mx-error-footer-button-click="${this._resetCompleted}"
        @bbva-feature-profile-recipients-mx-close-generic-modal="${()=>{this._isVisibleModalAlert=!1}}"
        first-name-recipients="${this._fullNameParticipants}"
      ></modal-alert>
    `:""}get _tplSuccess(){return o`
      <success-page
        .listRecipients="${this._listRecipients}"
        type-account="${this._multiStepComponent.productName}"
        account="${this._multiStepComponent.accountNumber}"
        ?is-visible="${this._isVisibleSuccess}"
        @bbva-feature-profile-recipients-mx-close-success="${()=>this._resetCompleted()}"
      ></success-page>
    `}get _tplApisDm(){return o`
      <bbva-local-accounts-participants-api-dm
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        version="${this._apiVersionAccountsParticipants}"
        ?native="${this.native}"
        ?requiredOTP="${this.requiredOTP}"
        @account-participants-api-dm-fetch="${e=>{this._multiStepComponent.getRecipient(e.detail),this._isVisibleMultiStep=!0}}"
        @account-participants-api-dm-fetch-error="${()=>this._errorClosePage("warning","recipientList")}"
        @api-dm-error="${()=>this._errorClosePage("warning","recipientList")}"
      >
      </bbva-local-accounts-participants-api-dm>
      <bbva-global-account-participants-api-dm
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        version="${this._apiVersionAccountsParticipants}"
        ?native="${this.native}"
        ?requiredOTP="${this.requiredOTP}"
        @account-participants-api-dm-create="${e=>this._openSuccessPage(e.detail)}"
        @api-dm-error="${()=>this._errorClosePage("blackList","recipientList")}"
        @account-participants-api-dm-create-error="${()=>this._errorClosePage("warning","recipientPost")}"
      ></bbva-global-account-participants-api-dm>
      <bbva-local-application-catalogs-api-dm
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        version="${this._apiVersionApplicationCatalogs}"
        ?native="${this.native}"
        @catalog-record-api-dm-fetch="${e=>this._formatApplicationCatalogs(e.detail)}"
        @catalog-record-api-dm-error="${()=>this._errorClosePage("warning","relationShips")}"
      >
      </bbva-local-application-catalogs-api-dm>
      <bbva-global-customer-addresses-api-dm
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        version="${this._apiVersionCustomerAddress}"
        ?native="${this.native}"
        ?requiredOTP="${this.requiredOTP}"
        @customer-addresses-api-dm-fetch="${e=>this._setCustomerAddress(e.detail)}"
      >
      </bbva-global-customer-addresses-api-dm>
      <bbva-global-places-api-dm
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        version="${this._apiVersionPlaces}"
        ?native="${this.native}"
        @places-api-dm-fetch="${e=>{this._geographicPlacesObject=e.detail}}"
      ></bbva-global-places-api-dm>
    `}render(){return o`
      ${super.render()}
      ${this.hasRecipients?"":o` ${this._tplProfileRecipientsOnboarding} `}
      ${this._tplMultiStepRecipients} ${this._tplAddRecipients}
      ${this._tplSuccess} ${this._tplModalsAlert} ${this._tplApisDm}
    `}}customElements.define("bbva-feature-profile-recipients-mx",gt);class _t extends(oe(t)){static get is(){return"bbva-analyticmanager-profile-recipients"}static get properties(){return{_eventTagName:{type:String},proceedingsData:{type:Object},segments:{type:Object},errorMessages:{type:Object},_countRecipients:{type:Number},_typeOfOtp:{type:Array},_flagsAnalyticsViewDispatch:{type:Boolean}}}constructor(){super(),this._eventTagName="bbva-feature-profile-recipients-mx",this.proceedingsData={},this.segments={warningNominees:"nominados alertados",proactiveNominees:"proactivos nominados",nonNominatedProactive:"proactivos no nominados",profile:"perfil"},this.errorMessages={error:"error operacion no realizada",blackList:"error registro de beneficiario"},this._countRecipients=0,this._typeOfOtp=[],this._flagsAnalyticsViewDispatch={flagPageViewOnboarding:!1,flagStepTwoView:!1,flagPageViewSelectAccount:!1,flagAppStartedClick:!1,flagPageViewAddRecipients:!1,flagCompletedStepTwo:!1,flagPageViewOtp:!1,flagErrorAnalytic:!1}}reset(){this._eventTagName="bbva-feature-profile-recipients-mx",this.proceedingsData={},this.segments={warningNominees:"nominados alertados",proactiveNominees:"proactivos nominados",nonNominatedProactive:"proactivos no nominados",profile:"perfil"},this._countRecipients=0,this._typeOfOtp=[],this._flagsAnalyticsViewDispatch={flagPageViewOnboarding:!1,flagStepTwoView:!1,flagPageViewSelectAccount:!1,flagAppStartedClick:!1,flagPageViewAddRecipients:!1,flagCompletedStepTwo:!1,flagPageViewOtp:!1,flagErrorAnalytic:!1}}_dispatchFlagAnalytic(e,t,i){this._flagsAnalyticsViewDispatch[e]||(this._dispatch(t,i),this._flagsAnalyticsViewDispatch[e]=!0)}pageViewOnboarding(){this._dispatchFlagAnalytic("flagPageViewOnboarding",`${this._eventTagName}-analytic-page-view-onboarding`,{level2:"informacion"})}_validateTypology(e){return null==e?"perfil":""===e?"ampliar cuenta":"cambiar nomina"}stepConfirmedView(e){var t,i,s,a,n;this._countRecipients=e;const r={stepLevel:"1 administrar beneficiarios",customFields:`${null!==(t=this.proceedingsData)&&void 0!==t&&t.completedModules?`modulos completados:${null===(i=this.proceedingsData)||void 0===i?void 0:i.completedModules}, `:""}beneficiarios:${this._countRecipients}`,profile:`${this.segments[(null===(s=this.proceedingsData)||void 0===s?void 0:s.segmentProfile)||"profile"]}`,typology:`${this._validateTypology(this.proceedingsData.entryPoint)}`,primaryCategory:(null===(a=this.proceedingsData)||void 0===a?void 0:a.primaryCategory)||"",productName:(null===(n=this.proceedingsData)||void 0===n?void 0:n.productName)||""};this._dispatchFlagAnalytic("flagStepTwoView",`${this._eventTagName}-analytic-multi-step-open`,r)}pageViewSelectAccount(e){const t={stepLevel:"seleccionar cuenta",customFields:`beneficiarios:${e}`};this._dispatchFlagAnalytic("flagPageViewSelectAccount",`${this._eventTagName}-analytic-select-account-view`,t)}appStartedClick(e){var t,i,s,a,n;const r={stepLevelTwo:"1 administrar beneficiarios",applicationStep:e,customFields:`${null!==(t=this.proceedingsData)&&void 0!==t&&t.completedModules?`modulos completados:${null===(i=this.proceedingsData)||void 0===i?void 0:i.completedModules}, `:""}beneficiarios:${this._countRecipients}`,profile:`${this.segments[(null===(s=this.proceedingsData)||void 0===s?void 0:s.segmentProfile)||"profile"]}`,typology:`${this._validateTypology(this.proceedingsData.entryPoint)}`,primaryCategory:(null===(a=this.proceedingsData)||void 0===a?void 0:a.primaryCategory)||"",productName:(null===(n=this.proceedingsData)||void 0===n?void 0:n.productName)||""};this._dispatchFlagAnalytic("flagAppStartedClick",`${this._eventTagName}-analytic-app-started-click`,r)}pageViewAddRecipients(e){const t={stepLevel:"agregar beneficiario",customFields:`beneficiarios:${e}`};this._dispatchFlagAnalytic("flagPageViewAddRecipients",`${this._eventTagName}-analytic-add-recipient-view`,t)}appStepCompleted(e){var t,i,s;this._countRecipients=e;const a={stepLevel:"2 confirmacion",customFields:`${null!==(t=this.proceedingsData)&&void 0!==t&&t.completedModules?`modulos completados:${null===(i=this.proceedingsData)||void 0===i?void 0:i.completedModules}, `:""}beneficiarios:${this._countRecipients}`,profile:`${this.segments[(null===(s=this.proceedingsData)||void 0===s?void 0:s.segmentProfile)||"profile"]}`,typology:`${this._validateTypology(this.proceedingsData.entryPoint)}`};this._dispatchFlagAnalytic("flagCompletedStepTwo",`${this._eventTagName}-analytic-page-view-app-step-completed`,a)}pageViewOtp(e){var t,i,s,a;this._typeOfOtp=null===(t=e.data)||void 0===t?void 0:t.match(/-(.*?);/);const n={stepLevel:"3 otp",customFields:`${null!==(i=this.proceedingsData)&&void 0!==i&&i.completedModules?`modulos completados:${null===(s=this.proceedingsData)||void 0===s?void 0:s.completedModules}, `:""}beneficiarios:${this._countRecipients},firma:${this._typeOfOtp[1]}`,profile:`${this.segments[(null===(a=this.proceedingsData)||void 0===a?void 0:a.segmentProfile)||"profile"]}`,typology:`${this._validateTypology(this.proceedingsData.entryPoint)}`};this._dispatchFlagAnalytic("flagPageViewOtp",`${this._eventTagName}-analytic-event-otp`,n)}pageViewSuccess(){var e,t,i;const s={stepLevel:"pagina exitosa",customFields:`${null!==(e=this.proceedingsData)&&void 0!==e&&e.completedModules?`modulos completados:${null===(t=this.proceedingsData)||void 0===t?void 0:t.completedModules}, `:""}beneficiarios:${this._countRecipients},firma:${this._typeOfOtp[1]}`,profile:`${this.segments[(null===(i=this.proceedingsData)||void 0===i?void 0:i.segmentProfile)||"profile"]}`,typology:`${this._validateTypology(this.proceedingsData.entryPoint)}`};this._dispatch(`${this._eventTagName}-analytic-page-view-app-completed`,s),this.reset()}errorAnalytic(e){const t=this.errorMessages[e]||"",i={errorPage:t,customFields:`beneficiarios:${this._countRecipients}`,level2:t};this._dispatchFlagAnalytic("flagErrorAnalytic",`${this._eventTagName}-analytic-error-page-view`,i)}}customElements.define(_t.is,_t);var ft=Object.freeze({__proto__:null});export{He as B,ft as p};
