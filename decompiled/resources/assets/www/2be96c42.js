import{J as e,L as t,aZ as i,a7 as o,z as a,a8 as n,aY as r,an as s,h as l,dJ as d,aV as c,cT as u,f5 as p,aU as m,aD as h,V as g,ak as v,bW as _,H as y,cU as b,aN as f,ar as S,a as T,y as x,ah as C,ai as E,i as A,ac as R,a9 as I,ap as $,ag as O,F as w,b$ as N,bx as P,b1 as k,c0 as M,f as D,g as H,aX as L,v as q,u as F,cI as B,cJ as z}from"./952f98a9.js";import{R as U,S as j,D as V,T as G,a1 as Y,M as W,L as X,V as K,G as J,a2 as Q,f as Z,z as ee,A as te,a3 as ie,Q as oe,H as ae,F as ne,a4 as re,E as se,x as le,I as de,h as ce,e as ue,N as pe,ao as me,K as he,an as ge,t as ve}from"./216055dc.js";import{by as _e,bg as ye,bQ as be,bP as fe,bS as Se,bf as Te,bT as xe,aI as Ce,aH as Ee}from"./7f3d7ca9.js";import{a as Ae}from"./def1c0af.js";import{B as Re}from"./9152f74c.js";import{a as Ie}from"./4656db6d.js";import{b as $e,c as Oe,a as we,B as Ne}from"./e3d898b2.js";import{b as Pe,B as ke}from"./30ef6f1f.js";import{b as Me,B as De}from"./d335c75d.js";import{b as He,B as Le}from"./972f570a.js";import{B as qe,a as Fe}from"./5b8531e8.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./7306257d.js";import"./854beed0.js";import"./84dff06e.js";class Be extends Re{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loans/v${this.version}/suggest-loans`)}toString(){return super.toString("BGADPSuggestLoansPostV1")}}class ze extends Re{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loans/v${this.version}/suggest-loans/{suggest-loan-id}/simulate`)}toString(){return super.toString("BGADPSuggestLoansSuggestLoanSimulatePostV1")}}class Ue extends Ae{static get is(){return"bbva-global-suggest-loans-api-dm"}constructor(){super()}postSuggestLoans(e){this._generateGetService(this._getService("post",e),{customEvent:"suggest-loans-api-dm-create",errorFireEventHandler:"suggest-loans-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}SuggestLoans`,this._getBgadp(o))}_getBgadp(e){return{postSuggestLoansV1:()=>new Be(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class je extends Ae{static get is(){return"bbva-global-suggest-loan-simulate-api-dm"}static get properties(){return{suggestLoanSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.suggestLoanSimulate={}}resetSuggestLoanSimulate(){this.suggestLoanSimulate={}}postSuggestLoanSimulate(e,t){if(Object.keys(this.suggestLoanSimulate).length)return;const i={"suggest-loan-id":e};this._generateGetService(this._getService("post",t,i),{customEvent:"suggest-loan-simulate-api-dm-fetch",errorFireEventHandler:"suggest-loan-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}SuggestLoanSimulate`,this._getBgadp(o))}_getBgadp(e){return{postSuggestLoanSimulateV1:()=>new ze(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ve extends(e(t)){}let Ge=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),o=i.length>>>0;if(0===o)return!1;let a=0|t,n=Math.max(a>=0?a:o-Math.abs(a),0);for(;n<o;){if((r=i[n])===(s=e)||"number"==typeof r&&"number"==typeof s&&isNaN(r)&&isNaN(s))return!0;n++}var r,s;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],o=0,a="",n=0,r=arguments.length;n!==r;++n){var s=+arguments[n];if(!(s<1114111&&s>>>0===s))throw RangeError("Invalid code point: "+s);s<=65535?o=i.push(s):(s-=65536,o=i.push(55296+(s>>10),s%1024+56320)),o>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},Ye=class extends Ge{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const We=0,Xe=1,Ke="jwt",Je="tsec",Qe="none";let Ze=class extends Ge{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=We,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ye,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Je:this.requiredToken=Qe,this.requiresJWT=!1):this.requiredToken===Je?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ke?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Qe?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Je)}_setJwtHandler(){this._setTokenHandler(Ke)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,o)=>{t=Object.assign(t,{resolve:i,reject:o}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),o=t[i];return o?delete t[i]:this._error(9,`Missing ${i} param value`),o})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Xe?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Je,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ke,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var o=t.getItem(i);o&&"null"!==o&&(e[i]=o)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,o)=>(t[o.replace(e,"")]=i.getItem(o),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,o=e===Ke?"JWT ":"",a=e===Ke?"Authorization":Je;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(n);r?t[a]=t[a]||o+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const o=new Promise(((e,t)=>{i=(i,o)=>{i?t(i):e(o)}}));return t.addEventListener("loadend",(function e(o){t.removeEventListener("loadend",e),o.error?i(o.error):i(null,t.result)})),t.readAsText(e),o}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let o=e[i],a=0,n=0;if(o<=127?(a=0,n=255&o):o<=223?(a=1,n=31&o):o<=239?(a=2,n=15&o):o<=244&&(a=3,n=7&o),e.length-i-a>0){let t=0;for(;t<a;)o=e[i+t+1],n=n<<6|63&o,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let o=": ",a=i[e].split(o);t[a.shift().toLowerCase()]=a.join(o)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,o){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(o)>=0&&(a=t.getResponseHeader(o));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[o])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,o,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),o=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,o=r.authenticationstate,a=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:i,state:o,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const o=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:o}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",o=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,o)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",o)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,o)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,o=e.split(",");if(o.length>1){i=o.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),o=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(o),{type:n,data:r,state:s,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(c),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(o)?(this._notifySignatureTypeUsingErrorCode(o,c,n,r,s,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,n,r,s,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),o=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(o),n=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(n),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,o){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,o),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,o,a,n){this._defineSignatureValue(t,i,o);const r={type:t,data:i,challenge:a,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const o=t.split(";").findIndex((t=>t===e));return i?i.split(";")[o]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,o,a,n){o?this._notifySignatureRequired(e,t,i,o,a,n):this._notifySignatureRequiredFirstStep(e,t,i,o)}_notifySignatureTypeUsingErrorCode(e,t,i,o,a,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,o,a):this._notifySignatureRequired(t,i,o,a,n,r)}},et=class extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}},tt=class extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class it extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`mortgages/v${this.version}/amortization-plans/simulate`)}toString(){return super.toString("BGADPMortgagesAmortizationPlansSimulatePostV1")}}class ot extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`mortgages/v${this.version}/digital-certificates`)}toString(){return super.toString("BGADPMortgagesDigitalCertificatesPostV1")}}class at extends et{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`mortgages/v${this.version}/documents`)}toString(){return super.toString("BGADPMortgagesDocumentsGetV1")}}class nt extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`mortgages/v${this.version}/documents`)}toString(){return super.toString("BGADPMortgagesDocumentsPostV1")}}class rt extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`mortgages/v${this.version}/documents/authorization`)}toString(){return super.toString("BGADPMortgagesDocumentsAuthorizationPostV1")}}class st extends Ve{static get is(){return"bbva-global-mortgages-documents-base-api-dm"}getDocuments(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postDocuments(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}Documents`,this._getBgadp(o))}_getBgadp(e){return{getDocumentsV1:()=>new at(e),postDocumentsV1:()=>new nt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}o(st,"GET_EVENTS",{customEvent:"documents-api-dm-fetch",paginationEvent:"documents-api-dm-pagination",errorFireEventHandler:"documents-api-dm-fetch-error"}),o(st,"POST_EVENTS",{customEvent:"documents-api-dm-create",errorFireEventHandler:"documents-api-dm-create-error"}),customElements.define(st.is,st);class lt extends Ve{static get is(){return"bbva-global-mortgages-documents-authorization-base-api-dm"}postDocumentsAuthorization(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}DocumentsAuthorization`,this._getBgadp(o))}_getBgadp(e){return{postDocumentsAuthorizationV1:()=>new rt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}o(lt,"POST_EVENTS",{customEvent:"documents-authorization-api-dm-create",errorFireEventHandler:"documents-authorization-api-dm-create-error"}),customElements.define(lt.is,lt);class dt extends Ve{static get is(){return"bbva-global-amortization-plans-simulate-api-dm"}static get properties(){return{amortizationPlansSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.amortizationPlansSimulate={}}resetAmortizationPlansSimulate(){this.amortizationPlansSimulate={}}postAmortizationPlansSimulate(e){if(Object.keys(this.amortizationPlansSimulate).length)return;this._generateGetService(this._getService("post",e),{customEvent:"amortization-plans-simulate-api-dm-fetch",errorFireEventHandler:"amortization-plans-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}AmortizationPlansSimulate`,this._getBgadp(o))}_getBgadp(e){return{postAmortizationPlansSimulateV1:()=>new it(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ct extends Ve{static get is(){return"bbva-global-digital-certificates-api-dm"}constructor(){super()}postDigitalCertificates(e){this._generateGetService(this._getService("post",e),{customEvent:"digital-certificates-api-dm-create",errorFireEventHandler:"digital-certificates-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}DigitalCertificates`,this._getBgadp(o))}_getBgadp(e){return{postDigitalCertificatesV1:()=>new ot(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ut{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),o=i.length>>>0;if(0===o)return!1;let a=0|t,n=Math.max(a>=0?a:o-Math.abs(a),0);for(;n<o;){if((r=i[n])===(s=e)||"number"==typeof r&&"number"==typeof s&&isNaN(r)&&isNaN(s))return!0;n++}var r,s;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],o=0,a="",n=0,r=arguments.length;n!==r;++n){var s=+arguments[n];if(!(s<1114111&&s>>>0===s))throw RangeError("Invalid code point: "+s);s<=65535?o=i.push(s):(s-=65536,o=i.push(55296+(s>>10),s%1024+56320)),o>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class pt extends ut{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const mt=0,ht=1,gt="jwt",vt="tsec",_t="none";class yt extends ut{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=mt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new pt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=vt:this.requiredToken=_t,this.requiresJWT=!1):this.requiredToken===vt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===gt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===_t?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(vt)}_setJwtHandler(){this._setTokenHandler(gt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,o)=>{t=Object.assign(t,{resolve:i,reject:o}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),o=t[i];return o?delete t[i]:this._error(9,`Missing ${i} param value`),o})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===ht?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(vt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(gt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var o=t.getItem(i);o&&"null"!==o&&(e[i]=o)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,o)=>(t[o.replace(e,"")]=i.getItem(o),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,o=e===gt?"JWT ":"",a=e===gt?"Authorization":vt;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const n=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(n);r?t[a]=t[a]||o+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const o=new Promise(((e,t)=>{i=(i,o)=>{i?t(i):e(o)}}));return t.addEventListener("loadend",(function e(o){t.removeEventListener("loadend",e),o.error?i(o.error):i(null,t.result)})),t.readAsText(e),o}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let o=e[i],a=0,n=0;if(o<=127?(a=0,n=255&o):o<=223?(a=1,n=31&o):o<=239?(a=2,n=15&o):o<=244&&(a=3,n=7&o),e.length-i-a>0){let t=0;for(;t<a;)o=e[i+t+1],n=n<<6|63&o,t+=1}else n=65533,a=e.length-i;t+=String.fromCodePoint(n),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let o=": ",a=i[e].split(o);t[a.shift().toLowerCase()]=a.join(o)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,o){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(o)>=0&&(a=t.getResponseHeader(o));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[o])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,o,a,n;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),o=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),n=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,o=r.authenticationstate,a=r.authenticationchallenge,n=r.authenticationresponse}return{type:t,data:i,state:o,challenge:a,response:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const o=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:o}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",o=""){let a;if("object"==typeof e&&e){const n=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(n,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,o)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",o)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,o)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,o=e.split(",");if(o.length>1){i=o.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),o=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(o),{type:n,data:r,state:s,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(c),i=!0;else if(n)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(o)?(this._notifySignatureTypeUsingErrorCode(o,c,n,r,s,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,n,r,s,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),o=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(o),n=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(n),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,o){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,o),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,o,a,n){this._defineSignatureValue(t,i,o);const r={type:t,data:i,challenge:a,metadata:e};n&&(r.response=n),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const o=t.split(";").findIndex((t=>t===e));return i?i.split(";")[o]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,o,a,n){o?this._notifySignatureRequired(e,t,i,o,a,n):this._notifySignatureRequiredFirstStep(e,t,i,o)}_notifySignatureTypeUsingErrorCode(e,t,i,o,a,n,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,o,a):this._notifySignatureRequired(t,i,o,a,n,r)}}class bt extends yt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class ft extends yt{constructor(e=null){super(Object.assign(e||{},{method:"HEAD"}))}toString(e=""){return super.toString(e||"BGADPRequestHEAD")}}class St extends yt{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Tt extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV0")}}class xt extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV1")}}class Ct extends St{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersPostV1")}}class Et extends ft{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersHeadV1")}}class At extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Rt extends St{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class It extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class $t extends St{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class Ot extends(e(t)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class wt extends Ot{static get is(){return"bbva-global-customers-api-dm"}static get properties(){return{customers:{type:Array,attribute:!1}}}constructor(){super(),this.customers=[]}resetCustomers(){this.customers=[]}getCustomers(e={}){if(Object.keys(this.customers).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"customers-api-dm-fetch",errorFireEventHandler:"customers-api-dm-fetch-error"},this._responseMapping,e.fields)}postCustomers(e){this._generateGetService(this._getService("post",e),{customEvent:"customers-api-dm-create",errorFireEventHandler:"customers-api-dm-create-error"},this._responseMapping),this.resetCustomers()}headCustomers(){this._generateGetService(this._getService("head",{},{}),{customEvent:"customers-api-dm-head-fetch",errorFireEventHandler:"customers-api-dm-head-fetch-error"},this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}Customers`,this._getBgadp(o))}_getBgadp(e){return{getCustomersV0:()=>new Tt(e),getCustomersV1:()=>new xt(e),postCustomersV1:()=>new Ct(e),headCustomersV1:()=>new Et(e),default:()=>"BGADP called not exist"}}_responseMapping(e){const t=["membershipDate","arrivalReference"];if(e.length)for(let i=0;i<e.length;i++)this._renameProperty(e[i],"customerId","id"),this._mappingBank(e[i]),this._mappingGender(e[i]),this._mappingIdentityDocuments(e[i]),this._mappingMaritalStatus(e[i]),e[i].nationalities&&this._mappingNationalities(e[i]),this._mappingPersonalTitle(e[i]),this._mappingResidence(e[i]),this._removeFields(t,e[i]);return e}}class Nt extends Ot{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1}}}constructor(){super(),this.customerTerms=[]}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t={}){if(Object.keys(this.customerTerms).length)return;t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"},this._responseMapping,t.fields)}postCustomerTerms(e,t){const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"},this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(o))}_getBgadp(e){return{getCustomerTermsV1:()=>new It(e),postCustomerTermsV1:()=>new $t(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Pt extends Ot{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(o))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new _e(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}o(Pt,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Pt.is,Pt);class kt extends Ot{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(o))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new Ie(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}o(kt,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(kt.is,kt);class Mt extends Ot{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},i={}){const o=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(o))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new At(e),postCustomerIdentificationProcessDocumentsV1:()=>new Rt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}o(Mt,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),o(Mt,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(Mt.is,Mt);var Dt=a`
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

  [data-tag-name='bbva-notification-message'] {
    margin: 1rem 1rem;
  }

  [data-tag-name='bbva-type-link'][icon] {
    padding-top: 2rem;
    padding-left: 0;
  }

  [data-tag-name='bbva-button-default'] {
    margin-bottom: 1rem;
  }

  .step-credit-simulation__content-padding {
    padding: 0 1rem;
  }
  .step-credit-simulation__credit-usage-form {
    padding-top: 1rem;
  }
  .step-credit-simulation__simulation-type-form {
    padding-top: 1rem;
  }
  .step-credit-simulation__credit-simulation-label {
    padding-top: 1.5rem;
    padding-bottom: 1rem;
  }
  .step-credit-simulation__income-input-form {
    padding-top: 1rem;
  }
  .step-credit-simulation__terms-form {
    padding-top: 1rem;
  }
  .step-credit-simulation__notification-message-dm {
    padding-top: 0.5rem;
    padding-left: 1rem;
    padding-right: 1rem;
  }
  .step-credit-simulation__fees-and-rates-label {
    padding-top: 1.5rem;
    padding-bottom: 1rem;
  }
  .step-credit-simulation-summary {
    padding: 0;
  }
  .step-credit-simulation-summary__calculated-amount-value {
    margin-bottom: 0.5rem;
    color: ${U("secondarySurfaceAmbienDefault",j)};
  }

  .sticky-section {
    position: sticky;
    background-color: ${U("colorPrimaryAltSurfaceAmbientDefault",j)};
    padding: 1rem;
  }

  .sticky-section-shadowed {
    position: sticky;
    background-color: ${U("colorPrimaryAltSurfaceAmbientDefault",j)};
    padding: 1rem;
    box-shadow: 0 -0.125rem 0.25rem 0 rgba(18, 18, 18, 0.1);
  }
`;const Ht={primary:a`
    ${V.primary}
    ${G.primary}
    ${Y.primary}
  `,primaryAlt:a`
    ${V.primaryAlt}
    ${G.primaryAlt}
    ${Y.primary}
  `,secondary:a`
    ${V.secondary}
    ${G.secondary}
    ${Y.primary}
  `,secondaryAlt:a`
    ${V.secondaryAlt}
    ${G.secondaryAlt}
    ${Y.primary}
  `},Lt=Object.values(Ht);var qt=a`
  :host {
    display: block;
    box-sizing: border-box;
    margin-bottom: 1rem;
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

  .content-list {
    display: flex;
    width: 100%;
    justify-content: space-between;
  }

  .content-list-align-left {
    min-width: 30%;
    max-width: 70%;
    position: relative;
    display: flex;
  }
  .content-list-align-left [data-tag-name='bbva-type-text'] {
    display: inline;
    margin: auto 0;
  }

  .content-list-align-right {
    display: flex;
    align-items: flex-start;
  }

  .content-list-align-left > [data-tag-name='bbva-type-text'] {
    text-align: left;
  }

  .content-list-align-right > [data-tag-name='bbva-type-text'] {
    text-align: right;
    text-align-last: right;
  }

  .font-weight-bold {
    --bbva-type-amount-font-weight: var(
      --fontWeightOptionsFontWeight40,
      ${n(r.fontWeight40)}
    );
  }

  .text-color-secondary {
    color: ${U("colorSecondaryText01Default",j)};
  }
`;class Ft extends(W(X(s(t)))){static get is(){return"oc-mortgage-list"}static get scopedElements(){const e=[J,Q,Z];return Ft.scopedElementsFromClasses(e)}static get properties(){return{listConfig:{type:Object},rightValue:{type:String,attribute:"right-value"}}}constructor(){super(),this.listConfig={},this.rightValue="",this.language=""}get _listContent(){var e,t,i,o,a,n,r,s,u,p,m,h,g;return l`
      <div class="content-list">
        <div class="content-list-align-left">
          <bbva-type-text
            text="${null===(e=this.listConfig)||void 0===e||null===(t=e.left)||void 0===t?void 0:t.text}"
            tag="${(null===(i=this.listConfig)||void 0===i||null===(o=i.left)||void 0===o?void 0:o.tag)??"span"}"
            size="${(null===(a=this.listConfig)||void 0===a||null===(n=a.left)||void 0===n?void 0:n.size)??"S"}"
          >
          </bbva-type-text>
          ${null!==(r=this.listConfig)&&void 0!==r&&r.iconConfig?l` <bbva-button-default
                variant="icon no-background"
                .icon="${null===(s=this.listConfig)||void 0===s||null===(u=s.iconConfig)||void 0===u?void 0:u.icon}"
                icon-size="${(null===(p=this.listConfig)||void 0===p||null===(m=p.iconConfig)||void 0===m?void 0:m.size)??d.fontSize50}"
                icon-color="${null===(h=this.listConfig)||void 0===h||null===(g=h.iconConfig)||void 0===g?void 0:g.color}"
                aria-label="${this.t("loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-help-button-aria-label")}"
                @click="${()=>{var e;return this._fireCustomEvent(`${Ft.is}-${(null===(e=this.listConfig)||void 0===e?void 0:e.id)??"generic"}-icon-click`,{})}}"
              >
              </bbva-button-default>`:c}
        </div>
        <div class="content-list-align-right">${this._tplRigthText}</div>
      </div>
    `}get _tplRigthText(){var e,t,i,o,a,n,s,d,c,u,p,m,h,g,v,_,y,b,f,S,T,x;return"text"===(null===(e=this.listConfig)||void 0===e||null===(t=e.right)||void 0===t?void 0:t.type)?l`
        <bbva-type-text
          class="${(null===(p=this.listConfig)||void 0===p||null===(m=p.right)||void 0===m?void 0:m.class)??""}"
          text="${this.rightValue??""}"
          tag="${(null===(h=this.listConfig)||void 0===h||null===(g=h.right)||void 0===g?void 0:g.tag)??"span"}"
          font-style="${(null===(v=this.listConfig)||void 0===v||null===(_=v.right)||void 0===_?void 0:_.fontStyle)??""}"
          size="${(null===(y=this.listConfig)||void 0===y||null===(b=y.right)||void 0===b?void 0:b.size)??"S"}"
          font-weight="${(null===(f=this.listConfig)||void 0===f||null===(S=f.right)||void 0===S?void 0:S.fontWeight)??r.fontWeight40}"
          text-color="${(null===(T=this.listConfig)||void 0===T||null===(x=T.right)||void 0===x?void 0:x.textColor)??""}"
        >
        </bbva-type-text>
      `:l`
      <bbva-type-amount
        amount="${this.rightValue}"
        currency-code="${(null===(i=this.listConfig)||void 0===i||null===(o=i.right)||void 0===o?void 0:o.currencyCode)??"EUR"}"
        .variant="${(null===(a=this.listConfig)||void 0===a||null===(n=a.right)||void 0===n?void 0:n.variant)??"S"}"
        local-currency="${(null===(s=this.listConfig)||void 0===s||null===(d=s.right)||void 0===d?void 0:d.localCurrency)??"EUR"}"
        class="${(null===(c=this.listConfig)||void 0===c||null===(u=c.right)||void 0===u?void 0:u.class)??"font-weight-bold"}"
        language="${this.language??"es-ES"}"
        @amount-formatted=${this._sendAmountFormatted}
      >
      </bbva-type-amount>
    `}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${e}`,{bubbles:!0,composed:!0,detail:t}))}_sendAmountFormatted({detail:e}){const t={amountFormated:null==e?void 0:e.full,listConfigId:this.listConfig.id};this._fireCustomEvent("oc-mortgage-list-amount-formated",t)}static get styles(){return[qt,Lt,K.primaryAlt]}render(){return l` ${this._listContent} `}}const Bt={options:[{icon:u(),label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-button-share",id:"button-share"},{icon:p(),label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-button-download",id:"button-download"}]},zt=(e="",t="",i="",o="",a="",n="",r="",s="")=>({clearAccesibilityLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-accesibility-clear-label",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-title",step:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-current-step",subTitle:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-subtitle",editLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-edit",buttonText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-footer-button-label",termOption:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-term-option",commonPercentage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-common-percentage",creditUsage:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-title",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-place-holder",commonAmountTypes:{[n]:"PROPERTY_VALUE",[r]:"REQUESTED_AMOUNT",[s]:"INSTALLMENT_AMOUNT"},options:[{value:e,isSimple:!1,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-buy-house",simulationTypeOptions:[{value:n,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-property-value",amountType:"PROPERTY_VALUE",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-property-value-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-property-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-property-value-place-holder"},{value:r,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-requested-amount",amountType:"REQUESTED_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-requested-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-requested-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-requested-amount-place-holder"},{value:s,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-installment-amount",amountType:"INSTALLMENT_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-installment-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-installment-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-house-installment-amount-place-holder"}]},{value:t,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-change-mortgage",isSimple:!0,simulationTypeOptions:[{value:r,amountType:"REQUESTED_AMOUNT",label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-change-mortgage-requested-amount-label",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-change-mortgage-requested-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-change-mortgage-requested-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-change-mortgage-requested-amount-place-holder"}]},{value:i,isSimple:!1,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-mortgage",simulationTypeOptions:[{value:n,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-property-value",amountType:"PROPERTY_VALUE",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-property-value-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-property-value-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-property-value-place-holder"},{value:r,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-requested-amount",amountType:"REQUESTED_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-requested-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-requested-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-requested-amount-place-holder"},{value:s,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-installment-amount",amountType:"INSTALLMENT_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-installment-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-installment-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-mortgage-installment-amount-place-holder"}]},{value:o,isSimple:!1,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-remodel",simulationTypeOptions:[{value:n,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-property-value",amountType:"PROPERTY_VALUE",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-property-value-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-property-value-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-property-value-place-holder"},{value:r,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-requested-amount",amountType:"REQUESTED_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-requested-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-requested-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-requested-amount-place-holder"},{value:s,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-installment-amount",amountType:"INSTALLMENT_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-installment-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-installment-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-remodel-installment-amount-place-holder"}]},{value:a,isSimple:!1,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-buy-land",simulationTypeOptions:[{value:n,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-property-value",amountType:"PROPERTY_VALUE",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-property-value-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-property-value-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-property-value-place-holder"},{value:r,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-requested-amount",amountType:"REQUESTED_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-requested-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-requested-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-requested-amount-place-holder"},{value:s,label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-installment-amount",amountType:"INSTALLMENT_AMOUNT",creditCostLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-installment-amount-credit-cost",infoMessage:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-installment-amount-info-message",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-option-buy-land-installment-amount-place-holder"}]}]},simulationType:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-title",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-simulation-type-place-holder"},creditSimulationLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-simulation-label",monthlyIncome:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-monthly-income-title",helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-monthly-income-help-label",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-monthly-income-place-holder"},term:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-term-title",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-term-place-holder"},helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-help-label",amortizationTable:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-amortization-table-title",helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-amortization-table-help-label",icon:{type:m(),size:"24"}},feesAndRates:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-opening-title",options:[{name:"openingCommission",helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-opening-commission-modal",listConfig:{id:"openning-commission",right:{type:"text",text:""},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-opening-commission-title"},iconConfig:{icon:h()}}},{name:"interestRate",helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-interest-rate-modal",listConfig:{id:"interest-rate",right:{type:"text",text:""},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-interest-rate-title"},iconConfig:{icon:h()}}},{name:"cat",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-cat-title",helpLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-cat-modal",listConfig:{id:"cat",right:{type:"text",text:""},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-fees-rates-cat-title"},iconConfig:{icon:h()}}}]},pdfSizeLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-pdf-size",catInformationLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-cat-information",catInformationLabelAdditional:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-cat-information-additional",monthlyFeeLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-monthly-fee-label",buttonLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-button-label",calculatedRequested:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-calculated-requested",class:"text-color-secondary"},summaryOptions:{creditUsage:{isSimple:!1,id:"credit-usage",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-credit-usage"}},simulationType:{isSimple:!1,id:"simulation-type",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-simmulation-type"}},monthlyIncome:{isSimple:!1,id:"monthly-income",right:{type:"amount",class:"text-color-secondary",text:""},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-monthly-income"}},term:{isSimple:!1,id:"term",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-term"}},monthlyFee:{isSimple:!1,id:"monthly-fee",right:{type:"amount",class:"text-color-secondary",text:""},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-montlhy-fee"}},openingCommission:{isSimple:!1,id:"opening-commission",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-opening-commission"}},interestRate:{isSimple:!1,id:"interest-rate",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-interest-rate"}},cat:{isSimple:!1,id:"cat",right:{type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-summary-cat"}}}}),Ut={buttonLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-button-key",considerationOptions:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-consideration-real-information"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-consideration-certificate-to-init"}],considerationText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-consideration-text",descriptionText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-description-text",microillustrationName:"mortgagestages",titleText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-title-text",headerMainText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-header-title"},jt={title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-title",currentStep:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-current-step",buttonLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-button-label",subtitle:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-subtitle",occupationRadioGroup:{id:"occupation-type",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-occupation-title",options:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-occupation-option-employye",value:"EMPLOYEE"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-occupation-option-other",value:"OTHER"}]},typeOfCompanyRadioGroup:{id:"company-type",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-company-title",options:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-company-option-private",value:"PRIVATE"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-company-option-public",value:"PUBLIC"}]},yearsWorking:{id:"years-working",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-title",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-place-holder",options:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-option-1",value:"LESS_THAN_OR_EQUAL_TO_4_YEARS"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-option-2",value:"FROM_5_TO_8_YEARS"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-option-3",value:"FROM_9_TO_10_YEARS"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-option-4",value:"MORE_THAN_10_YEARS"}]},typeOfHousing:{id:"housing-type",title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-title",placeHolder:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-place-holder",options:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-option-1",value:"OWN"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-option-2",value:"RENTED"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-option-3",value:"OF_RELATIVES"}]},advisoryRadioGroup:{title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-advisor-title",options:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-advisor-option-1",value:"YES"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-advisor-option-2",value:"NO"}]},summaryOptions:[{listConfig:{id:"occupation-type",right:{text:"",type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-occupation-summary-left"}}},{listConfig:{id:"company-type",right:{text:"",type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-company-summary-left"}}},{listConfig:{id:"years-working",right:{text:"",type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-years-working-summary-left"}}},{listConfig:{id:"housing-type",right:{text:"",type:"text",fontWeight:"350"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-type-housing-summary-left"}}}]},Vt={title:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-title",subheader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-subheader",messageDefault:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-notification-message-info",messageCaution:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-notification-message-caution",buttonShare:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-button-share",buttonDownload:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-button-download",receiptSuccessDateCalculation:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-date-format-calculation",receiptSuccessDateExpiration:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-date-format-expiration"},Gt={calculationDate:{listReceipt:{id:"calculation-date",right:{text:"",type:"text",fontStyle:"italic"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-calculation-date"}}},purpose:{listReceipt:{right:{text:"",type:"text"},options:[{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-buy-house",value:"BUY_A_HOUSE_OR_APARTMENT"},{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-change-mortgage",value:"CHANGE_MY_MORTGAGE"},{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-mortgage",value:"OBTAIN_LIQUIDITY"},{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-remodel",value:"REMODEL_HOUSE"},{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-credit-usage-option-buy-land",value:"BUY_LAND"}],left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-purpose-id"}}},productName:{listReceipt:{id:"product-name",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-product-name"}}},termNumber:{listReceipt:{id:"term-number",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-term-number"}}},calculatedAmount:{listReceipt:{id:"calculated-amount",right:{text:"",type:"amount"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-calculated-amount"}}},openCommision:{listReceipt:{id:"open-commmision",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-open-commmision"}}},initialRate:{listReceipt:{id:"initial-rate",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-initial-rate"}}},cat:{listReceipt:{id:"cat",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-cat"}}},expirationDate:{listReceipt:{id:"expiration-date",right:{text:"",type:"text",fontStyle:"italic"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-expiration-date"}}},contactEmail:{listReceipt:{id:"contact-email",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-contact-email"}}},certificateId:{listReceipt:{id:"certificate-id",right:{text:"",type:"text"},left:{text:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-certificate-id"}}}},Yt={buttonKeyLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-button-key-label",descriptionText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-description-text",termsAndConditionsCheckBoxConsentData:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-checkbox-label-consent-data",termsAndConditionsCheckBoxAcceptInformation:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-checkbox-label-accept-information",termsAndConditionsCheckBoxCreditBureau:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-checkbox-label-credit-bureau",termsAndConditionsLinkCreditHistory:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-text-credit-history",termsAndConditionsLinkNoticePrivate:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-text-notice-private",termsAndConditionsLinkTermsAndConditions:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-text-terms-and-conditions"},Wt={modalButtonLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-button-label",creditHistory:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-credit-bureau-paragraph-one"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-credit-bureau-paragraph-two"}],creditHistoryTitleModal:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-credit-bureau-title-modal",noticePrivate:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-notice-private-paragraph-one"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-notice-private-paragraph-two"}],noticePrivateTitleModal:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-notice-private-title-modal",termsAndConditions:[{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-one"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-two"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-three"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-four"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-five"},{label:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-paragraph-six"}],termsAndConditionsCurrentStepLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-current-step",termsAndConditionsExpandableStepEditLabel:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-expandable-step-edit-label",termsAndConditionsStepHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-step-header",termsAndConditionsSummaryBadgeIconDescription:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-summary-badge-icon-description",termsAndConditionsTitleModal:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-modal-terms-and-conditions-title-modal"},Xt="loan-and-mortgage-origination-oc-mortgage-non-preapproved-main-exit-modal-aria-label",Kt="loan-and-mortgage-origination-oc-mortgage-non-preapproved-generic-selector-label",Jt={commissionHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-opening-commission-header",commissionBody:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-opening-commission-body",interestRateHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-interest-rate-header",interestRateBody:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-interest-rate-body",headerModalHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-header-modal-header",headerModalBody:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-header-modal-body",headerModalButton:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-header-modal-button",headerModalLink:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-header-modal-link",catHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-cat-header",catBody:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-modal-cat-body",successModalHeaderMainText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-receipt-success-modal-header-text",opNotAvailableRetryCertificateTitle:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-certificate-title-text",opNotAvailableRetryCertificateBody:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-certificate-body-text",opNotAvailableRetryCertificateHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-certificate-header-text",opNotAvailableRetryCertificateButton:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-certificate-button-text",financialHealthConcernHeader:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-financial-health-concern-header-text",financialHealthConcernButton:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-financial-health-concern-button-text",financialHealthConcernTitle:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-financial-health-concern-title-text",financialHealthConcernDescription:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-financial-health-concern-description-text",opNotAvailableExitHeaderText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-exit-header-text",opNotAvailableExitButtonText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-exit-button-text",opNotAvailableExitSubtitle:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-exit-subtitle",opNotAvailableExitDescription:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-exit-description",opNotAvailableRetryTitleText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-title-text",opNotAvailableRetryBodyText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-body-text",opNotAvailableRetryHeaderText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-header-text",opNotAvailableRetryButtonText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-op-not-available-retry-button-text",noOfferExitHeaderText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-exit-header-text",noOfferExitBodyText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-exit-body-text",noOfferExitButtonText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-exit-button-text",noOfferRetrySettingsTitleText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-retry-settings-title-text",noOfferRetrySettingsBodyText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-retry-settings-body-text",noOfferRetrySettingsHeaderText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-retry-settings-header-text",noOfferRetrySettingsButtonText:"loan-and-mortgage-origination-oc-mortgage-non-preapproved-mixin-modals-no-offer-retry-settings-button-text"},Qt=(e,t,i="es-MX")=>{switch(t){case"long":return new Intl.DateTimeFormat(i,{month:"long",year:"numeric",day:"numeric"}).format(new Date(e));case"2-digit-day":return Intl.DateTimeFormat(i,{day:"2-digit"}).format(new Date(e));case"short-month":return Intl.DateTimeFormat(i,{month:"short"}).format(new Date(e));case"month":return Intl.DateTimeFormat(i,{month:"long"}).format(new Date(e));case"year":return Intl.DateTimeFormat(i,{year:"numeric"}).format(new Date(e));default:return Intl.DateTimeFormat(i).format(new Date(e))}},Zt={visible:!1,ambient:"primary-alt"};class ei extends(W(X(s(t)))){static get is(){return"credit-simulation"}static get scopedElements(){const e=[J,we,Ne,oe,Z,ke,Ft,ye,ae,ne,Q,re];return ei.scopedElementsFromClasses(e)}static get properties(){return{appSettings:{type:Object},buyLandId:{type:String,attribute:"buy-land-id"},buyHouseId:{type:String,attribute:"buy-house-id"},creditSimulationDm:{type:Object},changeMortgageId:{type:String,attribute:"change-mortgage-id"},stickyShadow:{type:String,attribute:"sticky-shadow"},paddingMultistep:{type:Number,attribute:"padding-multistep"},notFirstTryCreditSimulation:{type:Boolean,attribute:"not-first-try-credit-simulation"},currency:{type:String},propertyValueId:{type:String,attribute:"property-value-id"},requestedAmountId:{type:String,attribute:"requested-amount-id"},mortgagePropertyId:{type:String,attribute:"mortgage-property-id"},remodelPropertyId:{type:String,attribute:"remodel-property-id"},installmentAmountId:{type:String,attribute:"installment-amount-id"},_creditUsageId:{type:String,state:!0},_simulationTypeId:{type:String,state:!0},_simulationType:{type:String,state:!0},_showCreditSimulationSection:{type:Boolean,state:!0},_consideredAmount:{type:Number,state:!0},_monthlyIncome:{type:Number,state:!0},_termNumber:{type:Number,state:!0},_showResultsDm:{type:Boolean,state:!0}}}constructor(){super(),this.propertyValueId="",this.requestedAmountId="",this.buyHouseId="",this.changeMortgageId="",this.mortgagePropertyId="",this.remodelPropertyId="",this.buyLandId="",this.installmentAmountId="",this.appSettings={},this.creditSimulationDm={},this.stickyShadow="",this.paddingMultistep=0,this.notFirstTryCreditSimulation=!1,this.language="",this.currency="",this.iOSFixedHeader=!1,this._creditUsageId="",this._simulationTypeId="",this._simulationType="",this._showCreditSimulationSection=!1,this._consideredAmount=0,this._monthlyIncome=0,this._termNumber=0,this._showResultsDm=!1,this.ambient="primary-alt"}reset(){this._simulationTypeId="",this._simulationType="",this._creditUsageId="";const e=this._creditUsageSelector||{},t=this._simulationTypeSelector||{},i=this._costInputForm||{},o=this._incomeInputForm||{},a=this._termsForm||{};if(this._monthlyIncome="",this._termNumber="",this._consideredAmount="",this._simulationTypeId="",this._showCreditSimulationSection=!1,a.value="",e.value="",this.iOSFixedHeader){var n;((null==e||null===(n=e.shadowRoot)||void 0===n?void 0:n.querySelector("#selector"))||{}).value="default"}t.value="",i.resetValue=!0,o.resetValue=!0,this._showResultsDm=!1,this._fireCustomEvent("data-clear",{}),this._allCompleted()}get hasSomeData(){return this._creditUsageId||this._simulationTypeId||this._monthlyIncome||this._termNumber||this._consideredAmount}get _costInputForm(){return this.shadowRoot.querySelector(".step-credit-simulation__cost-input-form")}get _creditUsageSelector(){return this.shadowRoot.querySelector(".step-credit-simulation__credit-usage-form")}get _incomeInputForm(){return this.shadowRoot.querySelector(".step-credit-simulation__income-input-form")}get _simulationTypeSelector(){return this.shadowRoot.querySelector(".step-credit-simulation__simulation-type-form")}get _termsForm(){return this.shadowRoot.querySelector(".step-credit-simulation__terms-form")}get _tplAmortizationTableInfo(){var e,t;const{amortizationTable:i,pdfSizeLabel:o}=zt(),{pdfSize:a}=this.creditSimulationDm;return l` <bbva-type-link
        icon="${null==i||null===(e=i.icon)||void 0===e?void 0:e.type}"
        icon-size="${null==i||null===(t=i.icon)||void 0===t?void 0:t.size}"
        class="step-credit-simulation__amortization-table-link"
        @click="${()=>this._fireCustomEvent("amortization-table-click",{})}"
        text="${this.t(null==i?void 0:i.title)}"
      ></bbva-type-link>
      <bbva-type-text
        unset
        text="${this.t(o,{size:a})}"
        tag="p"
        font-style="italic"
      ></bbva-type-text>
      <bbva-notification-help
        variant="info"
        text="${null==i?void 0:i.helpLabel}"
      ></bbva-notification-help>`}get _tplCalculatedAmount(){const{monthlyFeeLabel:e}=zt(),{calculatedAmount:t,currency:i}=this.creditSimulationDm,o=`-${this.paddingMultistep}`;return l`
      <div
        class="${"shadowed"===this.stickyShadow?"sticky-section-shadowed":"sticky-section"}"
        style="bottom:${this.notFirstTryCreditSimulation?o:"-1rem"}"
      >
        <bbva-type-text tag="h3" text="${e}" unset></bbva-type-text>
        <bbva-type-amount
          currency-code="${i}"
          local-currency="${i}"
          language="${this.language}"
          amount="${t}"
          variant="3xl"
          bold
        >
        </bbva-type-amount>
      </div>
    `}get _tplCatText(){const{catInformationLabel:e,catInformationLabelAdditional:t}=zt(),{cat:i,calculationDate:o,offerDate:a}=this.creditSimulationDm,n={catValue:i,calculationDate:Qt(o,"long"),offerDate:Qt(a,"long"),highLightOpen:"<span class='highlight'>",highLightClose:"</span>"};return l`
      <bbva-type-text
        size="2XS"
        tag="p"
        text="${this.t(e,n)}"
      ></bbva-type-text>
      <bbva-type-text size="2XS" tag="p" text="${t}"></bbva-type-text>
    `}get _tplContent(){return l`
      <div class="step-credit-simulation__content-padding">
        ${this._tplDescriptionStep} ${this._tplCreditUsageForm} ${this._tplSimulationTypeForm}
        ${this._showCreditSimulationSection?this._tplCreditSimulationForms:c}
        ${this._tplResultsDm}
      </div>
      ${this._tplFooter}
    `}get _tplContentResultsDm(){var e,t,i,o;const{feesAndRates:a,commonPercentage:n}=zt(),{cat:r,openingCommission:s,interestRate:d,calculationDate:u}=this.creditSimulationDm,p=null==a||null===(e=a.options)||void 0===e?void 0:e.find((e=>"openingCommission"===(null==e?void 0:e.name))),m=null==a||null===(t=a.options)||void 0===t?void 0:t.find((e=>"interestRate"===(null==e?void 0:e.name))),h=null==a||null===(i=a.options)||void 0===i?void 0:i.find((e=>"cat"===(null==e?void 0:e.name)));return p.listConfig.right.text=this.t(n,{value:s}),m.listConfig.right.text=this.t(n,{value:d}),h.listConfig.right.text=this.t(n,{value:r}),l`
      ${this._tplAmortizationTableInfo}
      <bbva-header-category
        class="step-credit-simulation__fees-and-rates-label"
        text-size="S"
        text="${null==a?void 0:a.title}"
        level="3"
      ></bbva-header-category>
      ${null==a||null===(o=a.options)||void 0===o?void 0:o.map((e=>{var t,i;return l` <oc-mortgage-list
            .listConfig="${null==e?void 0:e.listConfig}"
            right-value="${null==e||null===(t=e.listConfig)||void 0===t||null===(i=t.right)||void 0===i?void 0:i.text}"
          >
          </oc-mortgage-list>`}))}
      ${u?this._tplCatText:c}
    `}get _tplCreditSimulationForms(){var e,t,i,o,a,n,r;const{creditUsage:s,creditSimulationLabel:d,term:c,monthlyIncome:u,termOption:p,clearAccesibilityLabel:m}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),h=null==s||null===(e=s.options)||void 0===e?void 0:e.find((e=>(null==e?void 0:e.value)===this._creditUsageId)),g=null==h?void 0:h.value;let v=null===(t=this.appSettings)||void 0===t||null===(i=t.data)||void 0===i||null===(o=i.ocMortgageTerms)||void 0===o||null===(a=o.find((e=>{var t;return(null==e||null===(t=e.purpose)||void 0===t?void 0:t.id)===g})))||void 0===a?void 0:a.terms;const _=null==h||null===(n=h.simulationTypeOptions)||void 0===n?void 0:n.find((e=>(null==e?void 0:e.value)===this._simulationTypeId));return this.iOSFixedHeader&&(v=[{value:"default",text:this.t(Kt),disabled:!0,selected:!0},...v]),l`
      <bbva-header-category
        class="step-credit-simulation__credit-simulation-label"
        text-size="S"
        text="${d}"
        level="3"
      ></bbva-header-category>
      <bbva-form-input
        type="amount"
        mode-input="decimal"
        clear-accessible-text="${this.t(m)}"
        label="${this.t(null==_?void 0:_.placeHolder)}"
        label-out="${this.t(null==_?void 0:_.creditCostLabel)}"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
        class="step-credit-simulation__cost-input-form"
        decimalDigits="2"
        info-message="${this.t((null==_?void 0:_.infoMessage)||"")}"
        @form-amount-input-change="${this._onChangeCreditCost}"
        @form-field-input-blur="${this._blurCreditCost}"
      ></bbva-form-input>
      <bbva-form-input
        type="amount"
        mode-input="decimal"
        clear-accessible-text="${this.t(m)}"
        label="${this.t(null==u?void 0:u.placeHolder)}"
        label-out="${this.t(null==u?void 0:u.title)}"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
        class="step-credit-simulation__income-input-form"
        decimalDigits="2"
        info-message="${this.t((null==u?void 0:u.helpLabel)||"")}"
        @form-amount-input-change="${this._onChangeMonthlyIncome}"
        @form-field-input-blur="${this._blurMonthlyIncome}"
      ></bbva-form-input>
      <bbva-form-select
        label="${this.t(null==c?void 0:c.placeHolder)}"
        info-title="${this.t(null==c?void 0:c.title)}"
        @bbva-form-select-selected-item="${this._onChangeTerms}"
        ?native-selector="${this.iOSFixedHeader}"
        class="step-credit-simulation__terms-form"
      >
        ${null===(r=v)||void 0===r?void 0:r.map((e=>l` <bbva-form-option
              value="${(null==e?void 0:e.value)??e}"
              ?disabled="${e.disabled}"
              ?selected="${e.selected}"
            >
              ${e.text??this.t(p,{year:e})}
            </bbva-form-option>`))}
      </bbva-form-select>
    `}get _tplCreditUsageForm(){var e;const{creditUsage:t}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId);let i=t.options;return this.iOSFixedHeader&&(i=[{value:"default",text:this.t(Kt),disabled:!0,selected:!0},...i]),l` <bbva-form-select
      label="${this.t(null==t?void 0:t.placeHolder)}"
      info-title="${this.t(null==t?void 0:t.title)}"
      @bbva-form-select-selected-item="${this._onChangeCreditUsage}"
      class="step-credit-simulation__credit-usage-form"
      ?native-selector="${this.iOSFixedHeader}"
    >
      ${null===(e=i)||void 0===e?void 0:e.map((e=>l`
          <bbva-form-option
            value="${this.t(null==e?void 0:e.value)}"
            ?disabled="${e.disabled}"
            ?selected="${e.selected}"
          >
            ${e.text??this.t(null==e?void 0:e.label)}
          </bbva-form-option>
        `))}
    </bbva-form-select>`}get _tplDescriptionStep(){const{subTitle:e}=zt();return l` <bbva-type-text unset tag="p" text="${e}"></bbva-type-text> `}get _tplFooter(){const{helpLabel:e,buttonLabel:t}=zt();return l`
      <bbva-notification-message
        class="${Object.keys(this.creditSimulationDm).length&&this._showResultsDm?"step-credit-simulation__notification-message-dm":""}"
      >
        ${this.t(e)}
      </bbva-notification-message>
      ${Object.keys(this.creditSimulationDm).length&&this._showResultsDm?this._tplCalculatedAmount:c}
      <div class="step-credit-simulation__continue-button step-credit-simulation__content-padding">
        <bbva-button-default
          id="continue-credit-simulation-button"
          @click="${this._continueButtonClick}"
          fullwidth
          ?disabled="${!(Object.keys(this.creditSimulationDm).length&&this._showResultsDm)}"
          text="${this.t(t)}"
        ></bbva-button-default>
      </div>
    `}get _tplResultsDm(){return l`
      ${Object.keys(this.creditSimulationDm).length&&this._showResultsDm?this._tplContentResultsDm:c}
    `}get _tplSimulationTypeForm(){var e;const{creditUsage:t,simulationType:i}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),o=null==t||null===(e=t.options)||void 0===e?void 0:e.find((e=>(null==e?void 0:e.value)===this._creditUsageId));let{simulationTypeOptions:a}=o||[];const n=o&&!o.isSimple;return this.iOSFixedHeader&&n&&(a=[{value:"default",label:this.t(Kt),disabled:!0,selected:!0},...a]),l` ${n?l`<bbva-form-select
          ?native-selector="${this.iOSFixedHeader}"
          label="${this.t(null==i?void 0:i.placeHolder)}"
          info-title="${this.t(null==i?void 0:i.title)}"
          @bbva-form-select-selected-item="${this._onChangeSimulationType}"
          class="step-credit-simulation__simulation-type-form"
        >
          ${a.map((e=>l`
              <bbva-form-option
                ?disabled="${e.disabled}"
                ?selected="${e.selected}"
                value="${this.t(null==e?void 0:e.value)}"
              >
                ${this.t(null==e?void 0:e.label)}
              </bbva-form-option>
            `))}
        </bbva-form-select>`:c}`}_allCompleted(){const{creditUsage:e}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),t=[this._creditUsageId,this._simulationTypeId,this._monthlyIncome,this._termNumber,this._consideredAmount].some((e=>!e));this._showResultsDm=!t,this._simulationType=null==e?void 0:e.commonAmountTypes[this._simulationTypeId];const i={creditUsageId:this._creditUsageId,simulationTypeId:this._simulationTypeId,monthlyIncome:this._monthlyIncome,termNumber:this._termNumber,consideredAmount:this._consideredAmount,simulationType:this._simulationType};t||this._fireCustomEvent("step-complete",i),this.requestUpdate()}_blurCreditCost(){this._allCompleted()}_blurMonthlyIncome(){this._allCompleted()}_continueButtonClick(){var e,t;const{creditUsage:i}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),o=null==i||null===(e=i.options)||void 0===e?void 0:e.find((e=>(null==e?void 0:e.value)===this._creditUsageId)),a=null==o||null===(t=o.simulationTypeOptions)||void 0===t?void 0:t.find((e=>(null==e?void 0:e.value)===this._simulationTypeId)),n={consideredAmount:this._consideredAmount,monthlyIncome:this._monthlyIncome,termNumber:this._termNumber,creditUsage:null==o?void 0:o.label,simulationType:null==a?void 0:a.label,isSimple:null==o?void 0:o.isSimple};this._fireCustomEvent("continue-click",n),this.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${ei.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_onChangeCreditCost(e){const{detail:{amount:t}}=e;this._consideredAmount=t}_onChangeCreditUsage(e){var t,i,o,a;const{detail:{value:n}}=e;this._creditUsageId=n;const{creditUsage:r}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),s=null==r||null===(t=r.options)||void 0===t?void 0:t.find((e=>(null==e?void 0:e.value)===this._creditUsageId)),l=this._simulationTypeSelector||{},d=this._costInputForm||{},c=this._incomeInputForm||{},u=this._termsForm||{},p=(null==u||null===(i=u.shadowRoot)||void 0===i?void 0:i.querySelector("#selector"))||{},m=(null==l||null===(o=l.shadowRoot)||void 0===o?void 0:o.querySelector("#selector"))||{},h=null==r||null===(a=r.options)||void 0===a?void 0:a.find((e=>(null==e?void 0:e.value)===this._creditUsageId));var g;(this._monthlyIncome="",this._termNumber="",this._consideredAmount="",this._showCreditSimulationSection=!1,this.creditSimulationDm={},null!=s&&s.isSimple)?(this._simulationTypeId=null==s||null===(g=s.simulationTypeOptions[0])||void 0===g?void 0:g.value,this._showCreditSimulationSection=!0,this.iOSFixedHeader&&(p.value="default")):(this.iOSFixedHeader&&(m.value="default"),l.value="",this._simulationTypeId="",this._showCreditSimulationSection=!1);this._showCreditSimulationSection&&(u.value="",d.resetValue=!0,c.resetValue=!0),this._showResultsDm=!1,this._fireCustomEvent("credit-usage-change",null==h?void 0:h.label),this._fireCustomEvent("data-clear",{}),this._allCompleted()}_onChangeMonthlyIncome(e){const{detail:{amount:t}}=e;this._monthlyIncome=t}_onChangeSimulationType(e){var t,i;const{detail:{value:o}}=e;this._simulationTypeId=o;const{creditUsage:a}=zt(this.buyHouseId,this.changeMortgageId,this.mortgagePropertyId,this.remodelPropertyId,this.buyLandId,this.propertyValueId,this.requestedAmountId,this.installmentAmountId),n=this._costInputForm||{},r=this._incomeInputForm||{},s=this._termsForm||{},l=null==a||null===(t=a.options)||void 0===t?void 0:t.find((e=>(null==e?void 0:e.value)===this._creditUsageId)),d=null==l||null===(i=l.simulationTypeOptions)||void 0===i?void 0:i.find((e=>(null==e?void 0:e.value)===this._simulationTypeId));if(this._monthlyIncome="",this._termNumber="",this._consideredAmount="",n.resetValue=!0,r.resetValue=!0,this.creditSimulationDm={},this.iOSFixedHeader){var c;((null==s||null===(c=s.shadowRoot)||void 0===c?void 0:c.querySelector("#selector"))||{}).value="default"}s.value="",this._showCreditSimulationSection=!0,this._showResultsDm=!1,this._fireCustomEvent("simulation-type-change",null==d?void 0:d.label),this._fireCustomEvent("data-clear",{}),this._allCompleted()}_onChangeTerms(e){const{detail:{value:t}}=e;this._termNumber=t,this._allCompleted()}static get styles(){return[Dt,K.primaryAlt,Y.primaryAlt,V.primaryAlt,Pe.primaryAlt,$e.primaryAlt,ee.primaryAlt,te.primaryAlt,Oe.primaryAlt,ie.primaryAlt,v("credit-simulation-shared-styles")]}render(){return l`${this._tplContent}`}}class ti extends(W(X(s(t)))){static get is(){return"credit-simulation-summary"}static get scopedElements(){const e=[Ft,Q,J,...ti.configurationScopedElements()];return ti.scopedElementsFromClasses(e)}static get properties(){return{dataToSummaryCreditSim:{type:Object},currency:{type:String}}}constructor(){super(),this.dataToSummaryCreditSim={},this.currency="",this.language=""}get _tplCreditSimulation(){const{summaryOptions:e,calculatedRequested:t,termOption:i,commonPercentage:o}=zt(),{calculatedMonthlyIncome:a,termNumber:n,creditUsage:r,simulationType:s,calculatedAmount:d,calculatedRequestedAmount:c,openingCommission:u,interestRate:p,cat:m,isSimple:h,currency:g,currencyInstallment:v}=this.dataToSummaryCreditSim;return e.creditUsage.right.text=r,e.simulationType.right.text=s,e.simulationType.isSimple=h,e.monthlyIncome.right.text=a,e.monthlyIncome.right.localCurrency=g,e.monthlyIncome.right.currencyCode=g,e.term.right.text=this.t(i,{year:n}),e.monthlyFee.right.text=d,e.monthlyFee.right.localCurrency=v,e.monthlyFee.right.currencyCode=v,e.openingCommission.right.text=this.t(o,{value:u}),e.interestRate.right.text=this.t(o,{value:p}),e.cat.right.text=this.t(o,{value:m}),l` <bbva-type-text unset tag="p" text=${null==t?void 0:t.title}></bbva-type-text>
      <bbva-type-amount
        class="step-credit-simulation-summary__calculated-amount-value"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
        amount="${c}"
        variant="3xl"
        bold
        unset
      >
      </bbva-type-amount>
      ${Object.keys(e).map((t=>{var i,o;return l`<oc-mortgage-list
            .listConfig="${e[t]}"
            .rightValue="${null===(i=e[t])||void 0===i||null===(o=i.right)||void 0===o?void 0:o.text}"
            language="${this.language}"
          >
            ></oc-mortgage-list
          >`}))}`}static get styles(){return[Dt,Y.primaryAlt,V.primaryAlt,v("oc-mortgage-multistep-shared-styles")]}render(){return l`<div class="step-credit-simulation-summary">${this._tplCreditSimulation}</div> `}}var ii=a`
  :host {
    color: black;
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

  .content-selector {
    padding-bottom: 1rem;
    padding-top: 1rem;
  }

  [data-tag-name='bbva-form-radio-group'] {
    padding-bottom: 0.5rem;
    margin-left: -1rem;
  }

  .border-text {
    padding-left: 0.5rem;
    padding-right: 0.5rem;
  }

  .content-padding {
    padding-left: 1rem;
    padding-right: 1rem;
  }
`;class oi extends(W(X(s(t)))){static get is(){return"additional-information"}static get scopedElements(){const e=[J,Le,De,we,Ne,Z,ye,Ft];return oi.scopedElementsFromClasses(e)}static get properties(){return{_occupationData:{type:String,state:!0},_typeOfCompanyData:{type:String,state:!0},_advisoryData:{type:String,state:!0},_yearsWorkingData:{type:String,state:!0},_typeOfHousingData:{type:String,state:!0},_continueButton:{type:Boolean,state:!0}}}constructor(){super(),this.iOSFixedHeader=!1,this._occupationData="",this._typeOfCompanyData="",this._advisoryData="",this._yearsWorkingData="",this._typeOfHousingData="",this._continueButton=!1,this.ambient="primary-alt"}reset(){const e=this._radioGroupsReset,t=this._selectorsReset;this._occupationData="",this._typeOfCompanyData="",this._advisoryData="",this._yearsWorkingData="",this._typeOfHousingData="",this._continueButton=!1,null==e||e.forEach(((t,i)=>{e[i].checked=!1})),null==t||t.forEach(((e,i)=>{if(this.iOSFixedHeader){var o,a;((null===(o=t[i])||void 0===o||null===(a=o.shadowRoot)||void 0===a?void 0:a.querySelector("#selector"))||{}).value="default"}t[i].value=""}))}get _radioGroupsReset(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-radio-button"]')}get _selectorsReset(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-select"]')}get _tplAdvisoryRadioGroup(){var e;const{advisoryRadioGroup:t}=jt;return l`
      <bbva-form-radio-group
        class="content-form-radio"
        name="Advisory"
        label-out="${this.t(null==t?void 0:t.title)}"
        two-option
        optional-label
        label-medium-out
        @form-radio-group-item-change="${this._onAdvisoryChange}"
      >
        ${null==t||null===(e=t.options)||void 0===e?void 0:e.map((e=>l`
            <bbva-form-radio-button
              value="${null==e?void 0:e.value}"
              label="${this.t(null==e?void 0:e.label)}"
            ></bbva-form-radio-button>
          `))}
      </bbva-form-radio-group>
    `}get _tplOccupationRadioGroup(){var e;const{occupationRadioGroup:t}=jt;return l`
      <bbva-form-radio-group
        class="content-form-radio"
        name="Occupation"
        label-out="${this.t(null==t?void 0:t.title)}"
        two-option
        optional-label
        label-medium-out
        @form-radio-group-item-change="${this._onOccupationChange}"
      >
        ${null==t||null===(e=t.options)||void 0===e?void 0:e.map((e=>l`
            <bbva-form-radio-button
              value="${null==e?void 0:e.value}"
              label="${this.t(null==e?void 0:e.label)}"
            ></bbva-form-radio-button>
          `))}
      </bbva-form-radio-group>
    `}get _tplTypeOfCompanyRadioGroup(){var e;const{typeOfCompanyRadioGroup:t}=jt;return l`
      <bbva-form-radio-group
        class="content-form-radio"
        name="TypeOfCompany"
        label-out="${this.t(null==t?void 0:t.title)}"
        two-option
        optional-label
        label-medium-out
        @form-radio-group-item-change="${this._onTypeOfCompanyChange}"
      >
        ${null==t||null===(e=t.options)||void 0===e?void 0:e.map((e=>l`
            <bbva-form-radio-button
              value="${null==e?void 0:e.value}"
              label="${this.t(null==e?void 0:e.label)}"
            ></bbva-form-radio-button>
          `))}
      </bbva-form-radio-group>
    `}get _tplTypeOfHousing(){var e;const{typeOfHousing:t}=jt;let i=null==t?void 0:t.options;return this.iOSFixedHeader&&(i=[{value:"default",text:this.t(Kt),disabled:!0,selected:!0},...i]),l`
      <bbva-form-select
        class="content-selector"
        info-title="${this.t(null==t?void 0:t.title)}"
        label="${this.t(null==t?void 0:t.placeHolder)}"
        @bbva-form-select-selected-item="${this._onChangeTypeOfHousing}"
        ?native-selector="${this.iOSFixedHeader}"
      >
        ${null===(e=i)||void 0===e?void 0:e.map((e=>l`
            <bbva-form-option
              value="${null==e?void 0:e.value}"
              ?disabled="${e.disabled}"
              ?selected="${e.selected}"
            >
              ${e.text??this.t(e.label)}
            </bbva-form-option>
          `))}
      </bbva-form-select>
    `}get _tplYearsWorking(){var e;const{yearsWorking:t}=jt;let i=null==t?void 0:t.options;return this.iOSFixedHeader&&(i=[{value:"default",text:this.t(Kt),disabled:!0,selected:!0},...i]),l`
      <bbva-form-select
        class="content-selector"
        info-title="${this.t(null==t?void 0:t.title)}"
        label="${this.t(null==t?void 0:t.placeHolder)}"
        @bbva-form-select-selected-item="${this._onChangeYearsWorking}"
        ?native-selector="${this.iOSFixedHeader}"
      >
        ${null===(e=i)||void 0===e?void 0:e.map((e=>l`
            <bbva-form-option
              value="${null==e?void 0:e.value}"
              ?disabled="${e.disabled}"
              ?selected="${e.selected}"
            >
              ${e.text??this.t(e.label)}
            </bbva-form-option>
          `))}
      </bbva-form-select>
    `}_evaluateContinueButton(){const e=[this._occupationData,this._typeOfCompanyData,this._advisoryData,this._yearsWorkingData,this._typeOfHousingData].some((e=>!e));this._continueButton=!e}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${e}`,{bubbles:!0,composed:!0,detail:t}))}_onAdvisoryChange({detail:e}){this._advisoryData=e.value,this._evaluateContinueButton()}_onChangeTypeOfHousing({detail:e}){var t;const{typeOfHousing:i,summaryOptions:o}=jt,a=null==o?void 0:o.find((e=>{var t;return(null==e||null===(t=e.listConfig)||void 0===t?void 0:t.id)===(null==i?void 0:i.id)})),n=null==i||null===(t=i.options)||void 0===t?void 0:t.find((t=>(null==t?void 0:t.value)===(null==e?void 0:e.value)));a.listConfig.right.text=null==n?void 0:n.label,this._typeOfHousingData=e,this._evaluateContinueButton()}_onChangeYearsWorking({detail:e}){var t;const{yearsWorking:i,summaryOptions:o}=jt,a=null==o?void 0:o.find((e=>{var t;return(null==e||null===(t=e.listConfig)||void 0===t?void 0:t.id)===(null==i?void 0:i.id)})),n=null==i||null===(t=i.options)||void 0===t?void 0:t.find((t=>(null==t?void 0:t.value)===(null==e?void 0:e.value)));a.listConfig.right.text=n.label,this._yearsWorkingData=e.value,this._evaluateContinueButton()}_onOccupationChange({detail:e}){var t;const{occupationRadioGroup:i,summaryOptions:o}=jt,a=null==o?void 0:o.find((e=>{var t;return(null==e||null===(t=e.listConfig)||void 0===t?void 0:t.id)===(null==i?void 0:i.id)})),n=null==i||null===(t=i.options)||void 0===t?void 0:t.find((t=>(null==t?void 0:t.value)===(null==e?void 0:e.value)));a.listConfig.right.text=null==n?void 0:n.label,this._occupationData=e.value,this._evaluateContinueButton()}_onTypeOfCompanyChange({detail:e}){var t;const{typeOfCompanyRadioGroup:i,summaryOptions:o}=jt,a=null==o?void 0:o.find((e=>{var t;return(null==e||null===(t=e.listConfig)||void 0===t?void 0:t.id)===(null==i?void 0:i.id)})),n=null==i||null===(t=i.options)||void 0===t?void 0:t.find((t=>(null==t?void 0:t.value)===(null==e?void 0:e.value)));a.listConfig.right.text=null==n?void 0:n.label,this._typeOfCompanyData=e.value,this._evaluateContinueButton()}_sendInfo(){const{summaryOptions:e}=jt,t={occupation:this._occupationData,typeOfCompany:this._typeOfCompanyData,advisory:this._advisoryData,yearsWorking:this._yearsWorkingData,typeOfHousing:this._typeOfHousingData},i={...e};this._fireCustomEvent("additional-information-continue-click",{dataAdditionalInfo:t,dataToSummary:i}),this.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}static get styles(){return[ii,V.primaryAlt,He.primaryAlt,$e.primaryAlt,K.primaryAlt,Me.primaryAlt,Oe.primaryAlt,v("additional-information-shared-styles")]}render(){return l`
      <div class="content-padding">
        <bbva-type-text tag="p" text="${jt.subtitle}"></bbva-type-text>
        ${this._tplOccupationRadioGroup} ${this._tplTypeOfCompanyRadioGroup}
        ${this._tplYearsWorking}
        <div class="additional-information-content__type-housing-form">
          ${this._tplTypeOfHousing}
        </div>
        ${this._tplAdvisoryRadioGroup}
        <bbva-button-default
          class="additional-information-content__continue-button"
          fullwidth
          alignment="center"
          text="${this.t(jt.buttonLabel)}"
          @click="${this._sendInfo}"
          ?disabled="${!this._continueButton}"
        ></bbva-button-default>
      </div>
    `}}var ai=a`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.content-terms-and-conditions {
  padding-top: 1rem;
  padding-bottom: 1rem;
  margin-left: -0.5rem;
  margin-right: -0.5rem;
}

.content-padding {
  padding-left: 1rem;
  padding-right: 1rem;
}

.content-form-checkbox {
  padding-top: 1rem;
  margin-left: -1rem;
  margin-right: -1rem;
}
`;class ni extends(W(X(s(t)))){static get is(){return"terms-and-conditions"}static get scopedElements(){const e=[Z,ae,J,le,fe,de];return ni.scopedElementsFromClasses(e)}static get properties(){return{_checkedTermsAndConditions:{type:Boolean,state:!0},_checkedAcceptInformation:{type:Boolean,state:!0},_checkedCreditBureau:{type:Boolean,state:!0},_enableButton:{type:Boolean,state:!0}}}constructor(){super(),this._checkedTermsAndConditions=!1,this._checkedAcceptInformation=!1,this._checkedCreditBureau=!1,this._enableButton=!1}reset(){const e=this._costInputForm||[];null==e||e.forEach(((t,i)=>{e[i].checked=!1})),this._checkedTermsAndConditions=!1,this._checkedAcceptInformation=!1,this._checkedCreditBureau=!1,this._enableButton=!1}get _costInputForm(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-checkbox"]')}get _tplTermsAndConditions(){const{buttonKeyLabel:e,descriptionText:t,termsAndConditionsCheckBoxAcceptInformation:i,termsAndConditionsCheckBoxConsentData:o,termsAndConditionsCheckBoxCreditBureau:a,termsAndConditionsLinkCreditHistory:n,termsAndConditionsLinkNoticePrivate:r,termsAndConditionsLinkTermsAndConditions:s}=Yt;return l`
      <bbva-type-text
        class="description-terms-and-conditions"
        size="M"
        tag="p"
        text=${t}
      ></bbva-type-text>
      <div class="wrap content-terms">
        <bbva-type-link
          class="content-terms-and-conditions"
          @click="${this._clickTermsAndConditions}"
          icon="${_()}"
          icon-size="24"
          size="M"
          text="${this.t(s)}"
        ></bbva-type-link>
        <bbva-divider-default></bbva-divider-default>
        <bbva-type-link
          @click="${this._clickNoticePrivate}"
          class="content-terms-and-conditions"
          icon="${_()}"
          icon-size="24"
          size="M"
          text="${this.t(r)}"
        ></bbva-type-link>
        <bbva-divider-default></bbva-divider-default>
        <bbva-type-link
          @click="${this._clickCreditHistory}"
          class="content-terms-and-conditions"
          icon="${_()}"
          icon-size="24"
          size="M"
          text="${this.t(n)}"
        ></bbva-type-link>
      </div>
      <div>
        <bbva-form-checkbox
          @bbva-form-checkbox-input="${this._handleCheckBoxTerms}"
          ?checked="${this._checkedTermsAndConditions}"
          class="content-form-checkbox"
          name="checked-acept-information"
          label="${this.t(i)}"
          value="1"
        ></bbva-form-checkbox>
        <bbva-divider-default></bbva-divider-default>
        <bbva-form-checkbox
          @bbva-form-checkbox-input="${this._handleCheckBoxAccept}"
          ?checked="${this._checkedAcceptInformation}"
          class="content-form-checkbox"
          name="checked-consent-data-info"
          label="${this.t(o)}"
          value="2"
        ></bbva-form-checkbox>
        <bbva-divider-default></bbva-divider-default>
        <bbva-form-checkbox
          @bbva-form-checkbox-input="${this._handleCheckBoxCredit}"
          ?checked="${this._checkedCreditBureau}"
          name="checked-credit-buro"
          class="content-form-checkbox"
          label="${this.t(a)}"
          value="3"
        ></bbva-form-checkbox>
      </div>
      <bbva-button-default
        class="terms-and-conditions__continue-button"
        @click="${this._continueButtonClick}"
        ?disabled="${!this._enableButton}"
        alignment="center"
        fullwidth
        text="${this.t(e)}"
      ></bbva-button-default>
    `}_checkboxComplete(){const e=[this._checkedTermsAndConditions,this._checkedAcceptInformation,this._checkedCreditBureau].some((e=>!e));this._enableButton=!e}_clickCreditHistory(){this._fireCustomEvent("link-credit-history-click",{})}_clickNoticePrivate(){this._fireCustomEvent("link-private-notice-click",{})}_clickTermsAndConditions(){this._fireCustomEvent("link-terms-conditions-click",{})}_continueButtonClick(){this._fireCustomEvent("all-complete",{}),this.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${ni.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_handleCheckBoxAccept(e){const{detail:{checked:t}}=e;this._checkedAcceptInformation=t,this._checkboxComplete(),this._fireCustomEvent("box-accept-check",{})}_handleCheckBoxCredit(e){const{detail:{checked:t}}=e;this._checkedCreditBureau=t,this._checkboxComplete(),this._fireCustomEvent("box-credit-check",{})}_handleCheckBoxTerms(e){const{detail:{checked:t}}=e;this._checkedTermsAndConditions=t,this._checkboxComplete(),this._fireCustomEvent("box-terms-check",{})}static get styles(){return[ai,K.primaryAlt,ee.primaryAlt,V.primaryAlt,be.primaryAlt,se.primaryAlt,G.primaryAlt,v("terms-and-conditions-shared-styles")]}render(){return l`
      <div class="content-padding" ambient="primary-alt">${this._tplTermsAndConditions}</div>
    `}}var ri=a`
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

  .summary {
    padding-left: 1rem;
    padding-right: 1rem;
  }

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0;
    --bbva-help-modal-padding-bottom: 0;
  }

  [data-tag-name='bbva-expandable-multistep'] {
    overflow-x: hidden;
  }

  .expandable-step-content {
    --bbva-expandable-step-content-max-height: auto;
  }

  .confirm-step {
    background-color: var(
      --loan-and-morgage-origination-oc-mortgage-non-preapproved-confirm-step-background-color,
      ${U("colorPrimarySurfaceAmbientDefault",j)}
    );
    width: 100%;
  }

  .oc-mortgage-multistep__container-footer {
    padding-right: 1rem;
    padding-bottom: 0.5rem;
  }
  .oc-mortgage-multistep__calculated-amount-text {
    margin-bottom: -1rem;
  }
  .oc-mortgage-multistep__calculated-amount-value {
    padding-bottom: 1rem;
  }
  .oc-mortgage-multistep__modal-text-content {
    padding-left: 1rem;
    padding-right: 1rem;
    padding-top: 3rem;
  }
  .oc-mortgage-multistep__modal-text-content__ios {
    padding-left: 1rem;
    padding-right: 1rem;
    padding-top: 1rem;
  }
`;class si extends(W(X(s(t)))){static get is(){return"oc-mortgage-multistep"}static get scopedElements(){const e=[ce,Te,ue,ye,ei,ti,oi,ni,Z,Q,J,xe,Ft];return si.scopedElementsFromClasses(e)}static get properties(){return{appSettings:{type:Object},buyHouseId:{type:String,attribute:"buy-house-id"},buyLandId:{type:String,attribute:"buy-land-id"},changeMortgageId:{type:String,attribute:"change-mortgage-id"},creditSimulationData:{type:Object},showMultistepModal:{type:Boolean,attribute:"show-multistep-modal"},currency:{type:String},propertyValueId:{type:String,attribute:"property-value-id"},requestedAmountId:{type:String,attribute:"requested-amount-id"},mortgagePropertyId:{type:String,attribute:"mortgage-property-id"},remodelPropertyId:{type:String,attribute:"remodel-property-id"},installmentAmountId:{type:String,attribute:"installment-amount-id"},_notFirstTryCreditSimulation:{type:Boolean,state:!0},_varianHeader:{type:String,state:!0},_dataToSummaryCreditSim:{type:Object,state:!0},_dataSummaryAdditionalInfo:{type:Object,state:!0},_paddingMultistep:{type:Number,state:!0},_stickyShadow:{type:String,state:!0},_showModalTerms:{type:Boolean,state:!0},_showModalPrivateNotice:{type:Boolean,state:!0},_showModalCreditHistory:{type:Boolean,state:!0}}}constructor(){super(),this.propertyValueId="",this.requestedAmountId="",this.buyHouseId="",this.changeMortgageId="",this.mortgagePropertyId="",this.remodelPropertyId="",this.buyLandId="",this.installmentAmountId="",this.appSettings={},this.creditSimulationData={},this.showMultistepModal=!1,this.language="",this.currency="",this.iOSFixedHeader=!1,this._notFirstTryCreditSimulation=!1,this._varianHeader="modal-initial",this._dataToSummaryCreditSim={},this._dataSummaryAdditionalInfo={},this._paddingMultistep=0,this._stickyShadow="",this._showModalTerms=!1,this._showModalPrivateNotice=!1,this._showModalCreditHistory=!1,this.ambient="primary-alt"}async update(e){super.update(e);this._multistepModalHeader&&(this._multistepModalHeader.style.zIndex="0")}reset(){const e=[],t=this._steps;for(let i=0;i<t.length;i+=1)t[i].completed=!1,0===i?(t[i].disabled=!1,t[i].active=!0):(t[i].active=!1,t[i].disabled=!0,e.push(i));this._multistep.stepsToReset=e,this._varianHeader="modal-initial",this.showMultistepModal=!1,this._notFirstTryCreditSimulation=!1,this._dataToSummaryCreditSim={},this._dataSummaryAdditionalInfo={},this._paddingMultistep=0,this._stickyShadow="",this._showModalTerms=!1,this._showModalPrivateNotice=!1,this._showModalCreditHistory=!1}get _multistepModalHeader(){var e,t,i;return null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector("#multistep-modal"))||void 0===t||null===(i=t.shadowRoot)||void 0===i?void 0:i.querySelector(".modal-header")}get _creditSimulation(){return this.shadowRoot.querySelector('[data-tag-name="credit-simulation"]')}get _multistep(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}get _tplAdditionalInformation(){return l`
      <bbva-expandable-step
        header="${this.t(jt.title)}"
        total-steps="3"
        id="step-1"
        step="1"
        current-step-label="${jt.currentStep}"
        show-link
        edit-label="${this.t("loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-summary")}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        disabled-target=".action"
      >
        <div class="content">
          <additional-information
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-continue-click="${this._handleButtonAddInfo}"
          ></additional-information>
        </div>
        <div class="summary" slot="summary">
          ${Object.keys(this._dataSummaryAdditionalInfo).map((e=>{var t,i,o,a;return l`<oc-mortgage-list
                .listConfig="${null===(t=this._dataSummaryAdditionalInfo[e])||void 0===t?void 0:t.listConfig}"
                .rightValue="${null===(i=this._dataSummaryAdditionalInfo[e])||void 0===i||null===(o=i.listConfig)||void 0===o||null===(a=o.right)||void 0===a?void 0:a.text}"
              ></oc-mortgage-list>`}))}
        </div>
      </bbva-expandable-step>
    `}get _tplContainerFooter(){const{calculatedRequestedAmount:e,currency:t}=this._dataToSummaryCreditSim,{calculatedRequested:i,buttonText:o}=zt();return l`
      <div class="oc-mortgage-multistep__container-footer">
        <bbva-type-text
          class="oc-mortgage-multistep__calculated-amount-text"
          tag="p"
          text="${i.title}"
        ></bbva-type-text>
        <bbva-type-amount
          class="oc-mortgage-multistep__calculated-amount-value"
          currency-code="${t}"
          local-currency="${t}"
          language="${this.language}"
          amount="${e}"
          variant="3xl"
          bold
        >
        </bbva-type-amount>
        <bbva-button-default
          id="oc-mortgage-multistep__continue-button"
          @click="${this._continueMultistepButtonClick}"
          fullwidth
          variant="positive"
          text="${this.t(o)}"
        ></bbva-button-default>
      </div>
    `}get _tplCreditHistory(){const{creditHistory:e,creditHistoryTitleModal:t}=Wt;return l`
      <bbva-help-modal
        class="oc-mortgage-multistep__modals-terms"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t(t)}"
        header-close-icon-aria-label="${this.t(Xt)}"
        ?visible="${this._showModalCreditHistory}"
        @header-main-close-icon-click="${this._closeGenericModal}"
        @help-modal-veil-click="${this._closeGenericModal}"
        header-position="fixed"
        hide-content-padding-top
        full-height
      >
        <div class="content" slot="slot-content">
          <div
            class="${this.iOSFixedHeader?"oc-mortgage-multistep__modal-text-content__ios":"oc-mortgage-multistep__modal-text-content"}"
          >
            ${e.map(((e,t)=>this._renderParagraph(e,t)))}
          </div>
        </div>
      </bbva-help-modal>
    `}get _tplCreditSimulation(){const{title:e,step:t,editLabel:i}=zt();return l`
      <bbva-expandable-step
        class=${this._notFirstTryCreditSimulation?"expandable-step-content":""}
        total-steps="3"
        id="step-0"
        step="0"
        header="${this.t(e)}"
        current-step-label="${t}"
        show-link
        edit-label="${this.t(i)}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        disabled-target=".action"
      >
        <div class="content">
          <credit-simulation
            language="${this.language}"
            property-value-id="${this.propertyValueId}"
            requested-amount-id="${this.requestedAmountId}"
            buy-house-id="${this.buyHouseId}"
            change-mortgage-id="${this.changeMortgageId}"
            mortgage-property-id="${this.mortgagePropertyId}"
            remodel-property-id="${this.remodelPropertyId}"
            buy-land-id="${this.buyLandId}"
            installment-amount-id="${this.installmentAmountId}"
            class="oc-mortgage-multistep__credit-simulation"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            .notFirstTryCreditSimulation="${!this._notFirstTryCreditSimulation}"
            .appSettings="${this.appSettings}"
            .currency="${this.currency}"
            .creditSimulationDm="${this.creditSimulationData}"
            .stickyShadow="${this._stickyShadow}"
            .paddingMultistep="${this._paddingMultistep}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-continue-click="${this._continueCreditSimButton}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-step-complete="${this._addBottomSticky}"
          ></credit-simulation>
        </div>
        <div class="summary" slot="summary">
          <credit-simulation-summary
            language="${this.language}"
            .dataToSummaryCreditSim="${this._dataToSummaryCreditSim}"
            .currency="${this.currency}"
          ></credit-simulation-summary>
        </div>
      </bbva-expandable-step>
    `}get _tplModalHeader(){return l`
      <bbva-header-main
        id-header="multistepHeader"
        text="${this.t("loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-header-main-text")}"
        variant="${this._varianHeader||"modal-initial-secondary"}"
        @header-main-icon-click="${this._manageCloseClick}"
        close-icon-aria-label="${this.t(Xt)}"
      >
      </bbva-header-main>
    `}get _tplNoticePrivate(){const{noticePrivate:e,noticePrivateTitleModal:t}=Wt;return l`
      <bbva-help-modal
        class="oc-mortgage-multistep__modals-terms"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t(t)}"
        header-close-icon-aria-label="${this.t(Xt)}"
        ?visible="${this._showModalPrivateNotice}"
        @header-main-close-icon-click="${this._closeGenericModal}"
        @help-modal-veil-click="${this._closeGenericModal}"
        header-position="fixed"
        hide-content-padding-top
        full-height
      >
        <div class="content" slot="slot-content">
          <div class="${this.iOSFixedHeader?"oc-mortgage-multistep__modal-text-content__ios":"oc-mortgage-multistep__modal-text-content"}">
              ${e.map(((e,t)=>this._renderParagraph(e,t)))}
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}get _tplTermsAndConditions(){const{termsAndConditionsStepHeader:e,termsAndConditionsExpandableStepEditLabel:t,termsAndConditionsCurrentStepLabel:i,termsAndConditionsSummaryBadgeIconDescription:o}=Wt;return l`
      <bbva-expandable-step
        total-steps="3"
        id="step-2"
        step="2"
        header="${this.t(e)}"
        current-step-label="${i}"
        show-link
        edit-label="${this.t(t)}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        disabled-target=".action"
      >
        <div class="content">
          <terms-and-conditions
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-terms-conditions-click="${this._handleModalTermsAndConditions}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-private-notice-click="${this._handleModalPrivateNotice}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-terms-and-conditions-link-credit-history-click="${this._handleModalCreditHistory}"
          ></terms-and-conditions>
        </div>
        <div class="summary" slot="summary">
          <bbva-badge-icon
            ambient="secondary"
            class="badge-icon-content"
            status="checked"
            description=${this.t(o)}
          ></bbva-badge-icon>
        </div>
      </bbva-expandable-step>
    `}get _tplTermsAndConditionsModal(){const{termsAndConditions:e,termsAndConditionsTitleModal:t}=Wt;return l`
      <bbva-help-modal
        class="oc-mortgage-multistep__modals-terms"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @header-main-close-icon-click="${this._closeGenericModal}"
        @help-modal-veil-click="${this._closeGenericModal}"
        header-close-icon-aria-label="${this.t(Xt)}"
        full-height
        header-text="${this.t(t)}"
        header-position="fixed"
        hide-content-padding-top
        ?visible="${this._showModalTerms}"
      >
        <div class="content" slot="slot-content">
          <div
            class="${this.iOSFixedHeader?"oc-mortgage-multistep__modal-text-content__ios":"oc-mortgage-multistep__modal-text-content"}"
          >
            ${e.map((e=>this._renderParagraph(e)))}
          </div>
        </div>
      </bbva-help-modal>
    `}_addBottomSticky(){var e;const t=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]');this._paddingMultistep=null==t||null===(e=t.style)||void 0===e?void 0:e.paddingBottom}_checkVisibleElement(e){var t,i;const o=e.getBoundingClientRect(),a=Math.max(null===(t=document)||void 0===t||null===(i=t.documentElement)||void 0===i?void 0:i.clientHeight,window.innerHeight);return!(o.bottom<0||o.top-a>=0)}_closeGenericModal(){this._showModalTerms=!1,this._showModalCreditHistory=!1,this._showModalPrivateNotice=!1}_continueCreditSimButton({detail:e}){this._dataToSummaryCreditSim={...e,...this.creditSimulationData},this._fireCustomEvent("credit-simulation-continue-click",this._dataToSummaryCreditSim),this._notFirstTryCreditSimulation=!0}_continueMultistepButtonClick(){this._fireCustomEvent("all-complete",{})}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${si.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_handleButtonAddInfo(e){const{detail:{dataToSummary:t}}=e;this._dataSummaryAdditionalInfo={...t}}_handleSpecificStepScroll({detail:e}){const{completed:t}=e;this._varianHeader=t?"modal-initial-secondary":"modal-initial"}_handleModalCreditHistory(){this._showModalCreditHistory=!0}_handleModalPrivateNotice(){this._showModalPrivateNotice=!0}_handleModalTermsAndConditions(){this._showModalTerms=!0}_manageCloseClick(){const e=this._creditSimulation;this._fireCustomEvent("header-close-click",{hasSomeData:e.hasSomeData})}_removeFooterShadow(){const e=this.shadowRoot.querySelector(".oc-mortgage-multistep__credit-simulation").shadowRoot.querySelector('[data-tag-name="bbva-button-default"]');this._checkVisibleElement(e)?this._stickyShadow="":this._stickyShadow="shadowed"}_renderParagraph(e){return l`
      <bbva-type-text
        class="description-modals"
        size="M"
        tag="p"
        text="${e.label}"
      ></bbva-type-text>
    `}static get styles(){return[ri,K.primaryAlt,Y.primaryAlt,V.primaryAlt,Se.primaryAlt,v("oc-mortgage-multistep-shared-styles")]}render(){return l`
      <bbva-help-modal
        ?visible="${this.showMultistepModal}"
        header-text=" "
        full-height
        hide-content-padding-top
        id="multistep-modal"
      >
        <div slot="slot-header">${this._tplModalHeader}</div>
        <div class="content" slot="slot-content">
          ${this._tplTermsAndConditionsModal} ${this._tplNoticePrivate} ${this._tplCreditHistory}
          <bbva-expandable-multistep
            @expandable-multistep-specific-step-scroll="${this._handleSpecificStepScroll}"
            @scroll="${this._removeFooterShadow}"
          >
            <div slot="content">
              ${this._tplCreditSimulation} ${this._tplAdditionalInformation}
              ${this._tplTermsAndConditions}
            </div>
            <div class="confirm-step" slot="confirmation">${this._tplContainerFooter}</div>
          </bbva-expandable-multistep>
        </div>
      </bbva-help-modal>
    `}}const li=y((e=>class extends e{constructor(){super(),this.messages={},this.modals={"opening-commission":()=>this._tplOpeningCommission,"interest-rate":()=>this._tplInterestRate,cat:()=>this._tplCat,"exit-step-header":()=>this._tplExitStepHeader,"receipt-success":()=>this._tplReceiptSuccessModal,"op-not-available-retry-settings":()=>this._tplOpNotAvailableRetrySettings,"op-not-available-retry":()=>this._tplOpNotAvailableRetry,"op-not-available-exit":()=>this._tplOpNotAvailableExit,"no-offer-exit":()=>this._tplNoOfferExit,"op-not-available-retry-certificate-services":()=>this._tplOpNotAvailableRetryCertificate,"financial-health-concern":()=>this._tplFinancialHealthConcern}}get _tplOpeningCommission(){const{commissionHeader:e,commissionBody:t}=Jt;return l`
          <bbva-help-modal
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            header-text="${this.t(e)}"
            header-close-icon-aria-label="${this.t(Xt)}"
            ?visible=${this._showModal}
            hide-content-padding-top
            .scrollable=${!0}
            @header-main-close-icon-click=${this._closeGenericModal}
            @help-modal-veil-click=${this._closeGenericModal}
            @help-modal-swipe-close=${this._closeGenericModal}
          >
            <div class="content" slot="slot-content">
              <span class="text-content">${this.t(t)}</span>
            </div>
          </bbva-help-modal>
        `}get _tplInterestRate(){const{interestRateHeader:e,interestRateBody:t}=Jt;return l`
          <bbva-help-modal
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            header-text="${this.t(e)}"
            header-close-icon-aria-label="${this.t(Xt)}"
            body-text="${this.t(t)}"
            ?visible=${this._showModal}
            hide-content-padding-top
            @header-main-close-icon-click=${this._closeGenericModal}
            @help-modal-veil-click=${this._closeGenericModal}
            @help-modal-swipe-close=${this._closeGenericModal}
          >
          </bbva-help-modal>
        `}get _tplCat(){const{catHeader:e,catBody:t}=Jt;return l`
          <bbva-help-modal
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            header-text="${this.t(e)}"
            header-close-icon-aria-label="${this.t(Xt)}"
            body-text="${this.t(t)}"
            ?visible=${this._showModal}
            hide-content-padding-top
            @header-main-close-icon-click=${this._closeGenericModal}
            @help-modal-veil-click=${this._closeGenericModal}
            @help-modal-swipe-close=${this._closeGenericModal}
          >
          </bbva-help-modal>
        `}get _tplExitStepHeader(){const{headerModalHeader:e,headerModalBody:t,headerModalButton:i,headerModalLink:o}=Jt;return l`
          <bbva-help-modal
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            header-text="${this.t(e)}"
            header-close-icon-aria-label="${this.t(Xt)}"
            body-text="${this.t(t)}"
            ?visible=${this._showModal}
            button-text="${this.t(i)}"
            link-text="${this.t(o)}"
            modal-type="caution"
            title-icon="${b()}"
            @header-main-close-icon-click=${this._closeGenericModal}
            @help-modal-veil-click=${this._closeGenericModal}
            @help-modal-swipe-close=${this._closeGenericModal}
            @help-modal-footer-button-click=${this.reset}
            @help-modal-footer-link-click=${this._closeGenericModal}
          >
          </bbva-help-modal>
        `}get _tplReceiptSuccessModal(){return l`
          <bbva-help-modal
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._handleFlowExit}
            header-close-icon-aria-label="${this.t(Xt)}"
            ?visible=${this._showModal}
            header-text="${this.t(Jt.successModalHeaderMainText)}"
            hide-content-padding-top
            full-height
          >
            <div class="content" slot="slot-content">
              <receipt-success
                language="${this.language}"
                .configurationButtons="${Bt}"
                .receiptSuccessData=${this._normalizeResDigitalCertificates}
                .currency=${this.currency}
              ></receipt-success>
            </div>
          </bbva-help-modal>
        `}get _tplOpNotAvailableExit(){const{opNotAvailableExitButtonText:e,opNotAvailableExitDescription:t,opNotAvailableExitHeaderText:i,opNotAvailableExitSubtitle:o}=Jt;return this._fireCustomEvent("op-not-available-visible"),l`
          <bbva-help-modal
            id="opNotAvailableExit"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._handleFlowExit}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._handleFlowExit}
            ?visible=${this._showModal}
            modal-type="warning"
            header-text="${this.t(i)}"
            button-text="${this.t(e)}"
            fixed-footer
            hide-content-padding-top
            full-height
          >
            <div class="content" slot="slot-content">
              <bbva-clip-microillustration
                microillustration="error"
                size="M"
              ></bbva-clip-microillustration>
              <bbva-type-text
                text=${o}
                size="3XL"
                tag="span"
                font-weight="${r.fontWeight50}"
              ></bbva-type-text>
              <bbva-type-text
                size="M"
                tag="p"
                text=${t}
              ></bbva-type-text>
            </div>
          </bbva-help-modal>
        `}get _tplOpNotAvailableRetry(){const{opNotAvailableRetryBodyText:e,opNotAvailableRetryButtonText:t,opNotAvailableRetryHeaderText:i,opNotAvailableRetryTitleText:o}=Jt;return l`
          <bbva-help-modal
            id="opNotAvailableRetry"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._closeGenericModal}
            @help-modal-veil-click=${this._closeGenericModal}
            @help-modal-swipe-close=${this._closeGenericModal}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._retryOfferServices}
            ?visible=${this._showModal}
            modal-type="warning"
            title-icon="${f()}"
            title-text="${this.t(o)}"
            body-text="${this.t(e)}"
            header-text="${this.t(i)}"
            button-text="${this.t(t)}"
            hide-content-padding-top
          >
          </bbva-help-modal>
        `}get _tplNoOfferExit(){const{noOfferExitBodyText:e,noOfferExitButtonText:t,noOfferExitHeaderText:i}=Jt;return l`
          <bbva-help-modal
            id="noOfferExit"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._closeGenericModal}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._closeGenericModal}
            ?visible=${this._showModal}
            modal-type="caution"
            title-icon="${b()}"
            body-text="${this.t(e)}"
            header-text="${this.t(i)}"
            button-text="${this.t(t)}"
            hide-content-padding-top
          >
          </bbva-help-modal>
        `}get _tplOpNotAvailableRetrySettings(){const{noOfferRetrySettingsBodyText:e,noOfferRetrySettingsButtonText:t,noOfferRetrySettingsHeaderText:i,noOfferRetrySettingsTitleText:o}=Jt;return l`
          <bbva-help-modal
            id="opNotAvailableRetrySettings"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this.reset}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._retrySettingsServices}
            @help-modal-veil-click=${this.reset}
            ?visible=${this._showModal}
            modal-type="warning"
            title-icon="${f()}"
            title-text="${this.t(o)}"
            body-text="${this.t(e)}"
            header-text="${this.t(i)}"
            button-text="${this.t(t)}"
            hide-content-padding-top
          >
          </bbva-help-modal>
        `}get _tplOpNotAvailableRetryCertificate(){const{opNotAvailableRetryCertificateBody:e,opNotAvailableRetryCertificateButton:t,opNotAvailableRetryCertificateHeader:i,opNotAvailableRetryCertificateTitle:o}=Jt;return l`
          <bbva-help-modal
            id="opNotAvailableRetryCertificate"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._closeGenericModal}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._retryCertificateServices}
            ?visible=${this._showModal}
            modal-type="warning"
            title-icon="${f()}"
            title-text="${this.t(o)}"
            body-text="${this.t(e)}"
            header-text="${this.t(i)}"
            button-text="${this.t(t)}"
            hide-content-padding-top
          >
          </bbva-help-modal>
        `}get _tplFinancialHealthConcern(){const{financialHealthConcernButton:e,financialHealthConcernDescription:t,financialHealthConcernHeader:i,financialHealthConcernTitle:o}=Jt;return this._fireCustomEvent("financial-health-concern-visible"),l`
          <bbva-help-modal
            id="financialHealthConcern"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            @header-main-close-icon-click=${this._handleFlowExit}
            header-close-icon-aria-label="${this.t(Xt)}"
            @help-modal-footer-button-click=${this._handleFlowExit}
            ?visible=${this._showModal}
            header-text="${this.t(i)}"
            button-text="${this.t(e)}"
            fixed-footer
            hide-content-padding-top
            full-height
          >
            <div class="content" slot="slot-content">
              <bbva-clip-microillustration
                microillustration="mortgagefixed"
                size="M"
              ></bbva-clip-microillustration>
              <bbva-type-text
                text=${o}
                size="XL"
                tag="span"
                font-weight="${r.fontWeight50}"
              ></bbva-type-text>
              <bbva-type-text
                size="M"
                tag="p"
                text=${t}
              ></bbva-type-text>
            </div>
          </bbva-help-modal>
        `}}));var di=a`
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

  .content-notification {
    padding-bottom: 1rem;
    padding-top: 0.5rem;
  }

  .content-list {
    padding-top: 1rem;
  }

  .border-amount {
    padding-top: 0.5rem;
    padding-bottom: 1rem;
  }

  .border-panel-info {
    padding-top: -0.5rem;
  }

  .content-button {
    padding-top: 1rem;
  }

  .sub-header-content {
    padding-top: 1rem;
  }
`;class ci extends(W(X(s(t)))){static get is(){return"receipt-success"}static get scopedElements(){const e=[he,J,oe,Q,ge,Ft];return ci.scopedElementsFromClasses(e)}static get properties(){return{configurationButtons:{type:Object},receiptSuccessData:{type:Object},currency:{type:String},_formattedValues:{type:Object,state:!0}}}constructor(){super(),this.configurationButtons={},this.receiptSuccessData={},this.language="",this.currency="",this._formattedValues={}}reset(){this._formattedValues={}}get _getStaticData(){return{sectionTitle:{microillustration:"success"}}}get _tplContent(){return l`
      <div class="border-panel-info">${this._tplHeaderBanner}</div>
      <div class="border-panel-info">${this._tplSubHeader}</div>
      <div class="content-list">${this._tplReceiptList}</div>
      <div class="content-notification">${this._tplNotificationDefault}</div>
      <div class="content-notification">${this._tplNotificationCaution}</div>
    `}get _tplHeaderBanner(){var e,t;return l`
      <bbva-clip-microillustration
        microillustration="${null===(e=this._getStaticData)||void 0===e||null===(t=e.sectionTitle)||void 0===t?void 0:t.microillustration}"
      ></bbva-clip-microillustration>
      <bbva-type-text
        text="${Vt.title}"
        tag="h2"
        unset
        size="3XL"
        font-weight="${r.fontWeight50}"
      ></bbva-type-text>
    `}get _tplNotificationCaution(){var e;return l`
      <bbva-notification-message variant="caution">
        ${this.t(Vt.messageCaution)}
      </bbva-notification-message>
      <bbva-button-row
        class="content-button"
        .options="${(null===(e=this.configurationButtons)||void 0===e?void 0:e.options)??[]}"
        @button-row-item-click="${this._handleActionButton}"
        @button-row-item-button-share-click="${this._shareReceipt}"
        @button-row-item-button-download-click="${()=>this._fireCustomEvent("button-download-click")}"
      >
      </bbva-button-row>
    `}get _tplNotificationDefault(){return l`
      <bbva-notification-message
        variant="default"
        message-title="${Vt.messageDefault}"
        book-title=""
      >
      </bbva-notification-message>
    `}get _tplReceiptList(){const e=this._normalizedReceiptSuccessDataList();return l`
      ${Object.keys(e).map((t=>{var i,o,a,n;return l`<oc-mortgage-list
            language="${this.language}"
            .listConfig="${null===(i=e[t])||void 0===i?void 0:i.listReceipt}"
            right-value="${null===(o=e[t])||void 0===o||null===(a=o.listReceipt)||void 0===a||null===(n=a.right)||void 0===n?void 0:n.text}"
            @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-list-amount-formated="${this._formattedAmount}"
          ></oc-mortgage-list>`}))}
    `}get _tplSubHeader(){const{calculatedRequestedAmount:e,calculatedRequestedCurrency:t}=this.receiptSuccessData;return l`
      <div class="sub-header-content">
        <bbva-type-text
          text="${Vt.subheader}"
          size="S"
          tag="span"
          font-weight="${r.fontWeight10}"
        ></bbva-type-text>
        <bbva-type-amount
          class="border-amount"
          variant="3xl"
          type="bold"
          amount="${e}"
          currency-code="${t}"
          local-currency="${t}"
          language="${this.language}"
          @amount-formatted="${this._handleSubHeaderAmount}"
        >
        </bbva-type-amount>
        <div></div>
      </div>
    `}_fireCustomEvent(e,t={}){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${ci.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_normalizedReceiptSuccessDataList(){var e,t,i,o,a,n,r,s,l,d,c,u,p,m,h,v,_,y,b,f,S,T,x,C,E,A,R,I,$,O,w,N,P,k;const{calculationDate:M,purposeId:D,productName:H,termNumber:L,calculatedAmount:q,openCommision:F,initialRate:B,cat:z,expirationDate:U,contactEmail:j,certificateId:V,calculatedAmountCurrency:G}=this.receiptSuccessData,{termOption:Y,commonPercentage:W}=zt(),{receiptSuccessDateCalculation:X,receiptSuccessDateExpiration:K}=Vt,J={day:Qt(M,"2-digit-day"),month:Qt(M,"short-month"),year:Qt(M,"year")},Q=this.t(X,J),Z={day:Qt(U,"2-digit-day"),month:Qt(U,"month"),year:Qt(U,"year")},ee=this.t(K,Z);return Gt.calculationDate.listReceipt.right.text=Q,this._formattedValues["calculation-date"]=null==Gt||null===(e=Gt.calculationDate)||void 0===e||null===(t=e.listReceipt)||void 0===t||null===(i=t.right)||void 0===i?void 0:i.text,Gt.purpose.listReceipt.right.text=null==Gt||null===(o=Gt.purpose)||void 0===o||null===(a=o.listReceipt)||void 0===a||null===(n=a.options)||void 0===n||null===(r=n.find((e=>(null==e?void 0:e.value)===D)))||void 0===r?void 0:r.text,this._formattedValues["simulation-type"]=this.t(null==Gt||null===(s=Gt.purpose)||void 0===s||null===(l=s.listReceipt)||void 0===l||null===(d=l.right)||void 0===d?void 0:d.text),Gt.productName.listReceipt.right.text=H,this._formattedValues["purpose-id"]=this.t(null==Gt||null===(c=Gt.productName)||void 0===c||null===(u=c.listReceipt)||void 0===u||null===(p=u.right)||void 0===p?void 0:p.text),Gt.termNumber.listReceipt.right.text=this.t(Y,{year:L}),this._formattedValues["term-number"]=null==Gt||null===(m=Gt.termNumber)||void 0===m||null===(h=m.listReceipt)||void 0===h||null===(v=h.right)||void 0===v?void 0:v.text,Gt.calculatedAmount.listReceipt.right.text=q,Gt.calculatedAmount.listReceipt.right.localCurrency=G,Gt.calculatedAmount.listReceipt.right.currencyCode=G,Gt.openCommision.listReceipt.right.text=this.t(W,{value:F}),this._formattedValues["open-comission"]=null==Gt||null===(_=Gt.openCommision)||void 0===_||null===(y=_.listReceipt)||void 0===y||null===(b=y.right)||void 0===b?void 0:b.text,Gt.initialRate.listReceipt.right.text=this.t(W,{value:B}),this._formattedValues["initial-rate"]=null==Gt||null===(f=Gt.initialRate)||void 0===f||null===(S=f.listReceipt)||void 0===S||null===(T=S.right)||void 0===T?void 0:T.text,Gt.cat.listReceipt.right.text=this.t(W,{value:z}),this._formattedValues.cat=null==Gt||null===(x=Gt.cat)||void 0===x||null===(C=x.listReceipt)||void 0===C||null===(E=C.right)||void 0===E?void 0:E.text,Gt.expirationDate.listReceipt.right.text=ee,this._formattedValues["expiration-date"]=null==Gt||null===(A=Gt.expirationDate)||void 0===A||null===(R=A.listReceipt)||void 0===R||null===(I=R.right)||void 0===I?void 0:I.text,Gt.contactEmail.listReceipt.right.text=(e=>{const t=null==e?void 0:e.split("@")[1],i=t?t.length+4:0;return g(e,"•",!0,i)})(j),this._formattedValues["contact-email"]=null==Gt||null===($=Gt.contactEmail)||void 0===$||null===(O=$.listReceipt)||void 0===O||null===(w=O.right)||void 0===w?void 0:w.text,Gt.certificateId.listReceipt.right.text=V,this._formattedValues["certificate-id"]=null==Gt||null===(N=Gt.certificateId)||void 0===N||null===(P=N.listReceipt)||void 0===P||null===(k=P.right)||void 0===k?void 0:k.text,Gt}_formattedAmount(e){const{detail:{amountFormated:t,listConfigId:i}}=e;this._formattedValues[i]=t}_handleSubHeaderAmount({detail:e}){this._formattedValues["calculated-requested-amount"]=e.full}_shareReceipt(){this._fireCustomEvent("button-share-click",this._formattedValues)}static get styles(){return[di,pe.primaryAlt,Y.primaryAlt,V.primaryAlt,me.primaryAlt,v("receipt-success-shared-styles")]}render(){return l`
      <div class="receipt-success-content" ambient="primary-alt">${this._tplContent}</div>
    `}}var ui=a`
  :host {
    display: block;
    box-sizing: border-box;
    margin-bottom: 1rem;
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

  [data-tag-name='bbva-button-default'] {
    padding: 1rem 0;
    margin-top: 1.5rem;
  }

  [data-tag-name='bbva-list-bullet'] {
    padding: 0;
  }

  [data-tag-name='bbva-list-bullet']:first-of-type {
    padding-top: 1rem;
  }
`;class pi extends(W(X(s(t)))){static get is(){return"initial-offer"}static get properties(){return{isOpen:{type:Boolean,attribute:"is-open"}}}constructor(){super(),this.isOpen=!1,this.iOSFixedHeader=!1}static get scopedElements(){const e=[Z,he,Ee,J,ue,re];return pi.scopedElementsFromClasses(e)}reset(){this.isOpen=!0}get _tplContentInitialOffer(){const{buttonLabel:e,considerationOptions:t,considerationText:i,descriptionText:o,microillustrationName:a,titleText:n}=Ut;return l`
      <bbva-clip-microillustration
        microillustration="${a}"
        size="M"
      ></bbva-clip-microillustration>
      <bbva-type-text
        font-weight="${r.fontWeight50}"
        tag="h2"
        size="3XL"
        unset
        text="${n}"
      ></bbva-type-text>
      <bbva-type-text size="M" tag="p" text="${o}"></bbva-type-text>
      <bbva-header-category
        text-size="S"
        text="${i}"
        level="3"
      ></bbva-header-category>
      ${t.map((e=>this._renderListBullet(e)))}
      <bbva-button-default
        id="continue-initial-offer"
        @click="${this._closeInitialOffer}"
        alignment="center"
        fullwidth
        text="${this.t(e)}"
      ></bbva-button-default>
    `}_closeInitialOffer(){this.isOpen=!1,this._fireCustomEvent("continue",{})}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`loan-and-mortgage-origination-oc-mortgage-non-preapproved-${pi.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_manageCloseClick(){this._fireCustomEvent("close-click",{})}_renderListBullet(e){return l` <bbva-list-bullet> ${this.t(e.label)} </bbva-list-bullet> `}static get styles(){return[ui,pe.primaryAlt,K.primaryAlt,Ce.primaryAlt,V.primaryAlt,ie.primaryAlt,v("initial-offer-styles")]}render(){return l`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this.isOpen}"
        header-text="${Ut.headerMainText}"
        hide-content-padding-top
        avoid-icon-close-modal
        .scrollable="${!0}"
        full-height
        class="initial-offer-modal"
        header-close-icon-aria-label="${this.t(Xt)}"
        @header-main-close-icon-click="${this._manageCloseClick}"
      >
        <div class="content" slot="slot-content">
          <div ambient="primary-alt">${this._tplContentInitialOffer}</div>
        </div>
      </bbva-help-modal>
    `}}const mi=y((e=>class extends e{static get properties(){return{}}_normalizeRequestDataAmortizationPlans(e,t){return((e,t,i)=>{var o,a,n,r,s,l,d,c,u,p,m,h,g,v,_,y,b,f,S,T,x,C,E,A,R,I,$,O,w,N,P,k,M,D,H,L,q,F,B,z,U,j,V,G,Y,W,X,K,J,Q;const{financialAmounts:{calculatedAmounts:Z},expenses:ee,financialFactors:te,rates:ie,incomes:oe}=e,{segmentTypeId:ae,initialRateType:ne,yearlyIncreaseType:re,maximumFinancingType:se,realFinancingType:le,totalInstallmentsLoans:de,termNumber:ce,termsFrecuency:ue}=i,pe=null===(o=t[0])||void 0===o?void 0:o.id,me=null==Z||null===(a=Z.find((e=>"PROPERTY_VALUE"===(null==e?void 0:e.amountType))))||void 0===a||null===(n=a.calculatedAmount)||void 0===n?void 0:n.amount,he=null==Z||null===(r=Z.find((e=>"PROPERTY_VALUE"===(null==e?void 0:e.amountType))))||void 0===r||null===(s=r.calculatedAmount)||void 0===s?void 0:s.currency,ge=null==Z||null===(l=Z.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===l||null===(d=l.calculatedAmount)||void 0===d?void 0:d.amount,ve=null==Z||null===(c=Z.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===c||null===(u=c.calculatedAmount)||void 0===u?void 0:u.currency,_e=null==Z||null===(p=Z.find((e=>"PAYMENT_BY_THOUSAND"===(null==e?void 0:e.amountType))))||void 0===p||null===(m=p.calculatedAmount)||void 0===m?void 0:m.amount,ye=null==Z||null===(h=Z.find((e=>"PAYMENT_BY_THOUSAND"===(null==e?void 0:e.amountType))))||void 0===h||null===(g=h.calculatedAmount)||void 0===g?void 0:g.currency,be=null==Z||null===(v=Z.find((e=>"DOWN_PAYMENT"===(null==e?void 0:e.amountType))))||void 0===v||null===(_=v.calculatedAmount)||void 0===_?void 0:_.amount,fe=null==Z||null===(y=Z.find((e=>"DOWN_PAYMENT"===e.amountType)))||void 0===y||null===(b=y.calculatedAmount)||void 0===b?void 0:b.currency,Se=null==Z||null===(f=Z.find((e=>"INITIAL_DISBURSEMENT"===(null==e?void 0:e.amountType))))||void 0===f||null===(S=f.calculatedAmount)||void 0===S?void 0:S.amount,Te=null==Z||null===(T=Z.find((e=>"INITIAL_DISBURSEMENT"===(null==e?void 0:e.amountType))))||void 0===T||null===(x=T.calculatedAmount)||void 0===x?void 0:x.currency,xe=null==ee||null===(C=ee.find((e=>{var t;return"CREDIT_INVESTIGATION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===C||null===(E=C.expenseAmount)||void 0===E?void 0:E.amount,Ce=null==ee||null===(A=ee.find((e=>{var t;return"CREDIT_INVESTIGATION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===A||null===(R=A.expenseAmount)||void 0===R?void 0:R.currency,Ee=null==ee||null===(I=ee.find((e=>{var t;return"NOTARIAL_EXPENSE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===I||null===($=I.expenseAmount)||void 0===$?void 0:$.amount,Ae=null==ee||null===(O=ee.find((e=>{var t;return"NOTARIAL_EXPENSE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===O||null===(w=O.expenseAmount)||void 0===w?void 0:w.currency,Re=null==ee||null===(N=ee.find((e=>{var t;return"APPRAISAL_FEE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===N||null===(P=N.expenseAmount)||void 0===P?void 0:P.amount,Ie=null==ee||null===(k=ee.find((e=>{var t;return"APPRAISAL_FEE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===k||null===(M=k.expenseAmount)||void 0===M?void 0:M.currency,$e=null==te||null===(D=te.find((e=>{var t;return"YEARLY_INCREASE"===(null==e||null===(t=e.factorType)||void 0===t?void 0:t.id)})))||void 0===D||null===(H=D.percentage)||void 0===H?void 0:H.percentage,Oe=null==Z||null===(L=Z.find((e=>"MAXIMUM_FINANCING"===(null==e?void 0:e.amountType))))||void 0===L||null===(q=L.calculatedAmount)||void 0===q?void 0:q.amount,we=null==Z||null===(F=Z.find((e=>"REAL_FINANCING"===(null==e?void 0:e.amountType))))||void 0===F||null===(B=F.calculatedAmount)||void 0===B?void 0:B.amount,Ne=null==ie||null===(z=ie.find((e=>{var t;return"INITIAL_RATE"===(null==e||null===(t=e.rateType)||void 0===t?void 0:t.id)})))||void 0===z||null===(U=z.unit)||void 0===U?void 0:U.percentage,Pe=null==ee||null===(j=ee.find((e=>{var t;return"DEFERRED_COMMISSION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===j||null===(V=j.expenseAmount)||void 0===V?void 0:V.amount,ke=null==ee||null===(G=ee.find((e=>{var t;return"OPENING_COMMISSION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===G||null===(Y=G.expenseAmount)||void 0===Y?void 0:Y.amount;return{segmentType:{id:ae},financialCondition:{id:pe},financingProgram:{supportType:{id:"NO_FINANCIAL_BACKING"}},financialAmount:{specificAmounts:[{id:"PROPERTY_VALUE",detailAmount:{amount:me,currency:he}},{id:"REQUESTED_AMOUNT",detailAmount:{amount:ge,currency:ve}},{id:"PAYMENT_BY_THOUSAND",detailAmount:{amount:_e,currency:ye}}]},incomes:[{amount:null==oe||null===(W=oe.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===W||null===(X=W.incomeValues)||void 0===X||null===(K=X.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===K?void 0:K.amount,currency:null===(J=oe.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===J||null===(Q=J.incomeValues.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===Q?void 0:Q.currency}],term:{number:ce,frequency:ue},totalInstallmentsLoans:de,product:{subproduct:{name:"HIPOTECA FIJA BBVA"}},rates:{itemizeRates:[{rateType:ne,itemizeRateUnits:[{unitType:"PERCENTAGE",percentage:Ne}]},{rateType:re,itemizeRateUnits:[{unitType:"PERCENTAGE",percentage:$e}]},{rateType:se,itemizeRateUnits:[{unitType:"PERCENTAGE",percentage:Oe}]},{rateType:le,itemizeRateUnits:[{unitType:"PERCENTAGE",percentage:we}]}]},fees:[{itemizeFees:[{feeType:"OPENING_COMMISSION",itemizeFeeUnit:{unitType:"PERCENTAGE",percentage:ke}},{feeType:"DEFERRED_COMMISSION",itemizeFeeUnit:{unitType:"PERCENTAGE",percentage:Pe}}]}],expenses:[{expenseType:{id:"CREDIT_INVESTIGATION"},expense:{amount:xe,currency:Ce}},{expenseType:{id:"NOTARIAL_EXPENSE"},expense:{amount:Ee,currency:Ae}},{expenseType:{id:"INITIAL_DISBURSEMENT"},expense:{amount:Se,currency:Te}},{expenseType:{id:"DOWN_PAYMENT"},expense:{amount:be,currency:fe}},{expenseType:{id:"APPRAISAL_FEE"},expense:{amount:Re,currency:Ie}}]}})(e,t,{segmentTypeId:this.segmentTypeId,initialRateType:this.initialRateType,yearlyIncreaseType:this.yearlyIncreaseType,maximumFinancingType:this.maximumFinancingType,realFinancingType:this.realFinancingType,totalInstallmentsLoans:this.totalInstallmentsLoans,termNumber:this._completeDataCreditSimulation.termNumber,termsFrecuency:this.termsFrecuency})}_normalizeRequestDataCustomerTerms(){return(e=>{const{termTypeId:t,acceptanceMessagesBdnType:i,acceptanceMessagesBduType:o,acceptanceMessagesBdaType:a}=e;return[{termType:{id:t},status:{id:"ACTIVE"},acceptanceMessages:[{value:i},{value:o},{value:a}]}]})({termTypeId:this.termTypeId,acceptanceMessagesBdnType:this.acceptanceMessagesBdnType,acceptanceMessagesBduType:this.acceptanceMessagesBduType,acceptanceMessagesBdaType:this.acceptanceMessagesBdaType})}_normalizeRequestDataSimulateSuggest(e){var t,i,o,a,n,r,s,l,d,c,u,p,m,h,g,v,_,y,b,f;const S=null===(t=e[0])||void 0===t||null===(i=t.financialAmounts)||void 0===i||null===(o=i.calculatedAmounts)||void 0===o||null===(a=o.find((e=>"REQUESTED_AMOUNT"===e.amountType)))||void 0===a||null===(n=a.calculatedAmount)||void 0===n?void 0:n.currency;return(e=>{const{financialRequestedAmount:t,financialRequestedAmountCurrency:i,financialPropertyValue:o,financialPropertyValueCurrency:a,financingProgramId:n,notarialExpenseType:r,holderInvestigationType:s,notarialExpensePercentage:l,notarialExpenseAmount:d,expenseAmountCurrency:c}=e;return{financingProgram:{id:n},financialAmounts:{consideredAmounts:[{amountType:"REQUESTED_AMOUNT",consideredAmount:{amount:t,currency:i}},{amountType:"PROPERTY_VALUE",consideredAmount:{amount:o,currency:a}}]},expenses:[{expenseType:{id:r,investigationType:s},expensePercentage:{percentage:l},expenseAmount:{amount:d,currency:c}}]}})({financialRequestedAmount:null===(r=e[0])||void 0===r||null===(s=r.financialAmounts)||void 0===s||null===(l=s.calculatedAmounts)||void 0===l||null===(d=l.find((e=>"REQUESTED_AMOUNT"===e.amountType)))||void 0===d||null===(c=d.calculatedAmount)||void 0===c?void 0:c.amount,financialRequestedAmountCurrency:S,financialPropertyValue:null===(u=e[0])||void 0===u||null===(p=u.financialAmounts)||void 0===p||null===(m=p.calculatedAmounts)||void 0===m||null===(h=m.find((e=>"PROPERTY_VALUE"===e.amountType)))||void 0===h||null===(g=h.calculatedAmount)||void 0===g?void 0:g.amount,financialPropertyValueCurrency:null===(v=e[0])||void 0===v||null===(_=v.financialAmounts)||void 0===_||null===(y=_.calculatedAmounts)||void 0===y||null===(b=y.find((e=>"PROPERTY_VALUE"===e.amountType)))||void 0===b||null===(f=b.calculatedAmount)||void 0===f?void 0:f.currency,financingProgramId:this.financingProgramId,notarialExpenseType:this.notarialExpenseType,holderInvestigationType:this.holderInvestigationType,notarialExpensePercentage:this.notarialExpensePercentage,notarialExpenseAmount:this.notarialExpenseAmount,expenseAmountCurrency:this.currency})}_normalizeRequestDataSuggestLoan(){return(e=>{const{totalSuggestedLoans:t,suggestLoanTypeId:i,requesterFullName:o,creditUsageId:a,segmentId:n,currency:r,consideredAmount:s,simulationTypeId:l,simulationType:d,termsFrecuency:c,termNumber:u,incomeTypeId:p,incomeFrecuency:m,monthlyIncome:h}=e;return{suggestLoanType:{id:i},requester:{fullName:o},purpose:{id:a},segment:{id:n},financialAmounts:{groupCode:l,consideredAmounts:[{amountType:d,consideredAmount:{amount:s,currency:r}}]},terms:{number:u,frequency:c},totalSuggestedLoans:t,incomes:[{incomeType:{id:p},incomesValues:{currency:r,amount:h,frequency:m}}]}})({totalSuggestedLoans:this.totalSuggestedLoans,suggestLoanTypeId:this.suggestLoanTypeId,requesterFullName:this.requesterFullName,creditUsageId:this._completeDataCreditSimulation.creditUsageId,segmentId:this.segmentId,currency:this.currency,consideredAmount:this._completeDataCreditSimulation.consideredAmount,simulationTypeId:this._completeDataCreditSimulation.simulationTypeId,simulationType:this._completeDataCreditSimulation.simulationType,termsFrecuency:this.termsFrecuency,termNumber:this._completeDataCreditSimulation.termNumber,incomeTypeId:this.incomeTypeId,incomeFrecuency:this.incomeFrecuency,monthlyIncome:this._completeDataCreditSimulation.monthlyIncome})}_normalizeRequestDigitalCertificates(){const{dataAdditionalInfo:{occupation:e,typeOfCompany:t,yearsWorking:i,typeOfHousing:o}}=this._additionalInformation,{termNumber:a}=this._summaryDataCreditSimulation;return((e,t,i,o,a,n,r)=>{var s,l,d,c,u,p,m,h,g,v,_,y,b,f,S,T,x,C,E,A,R,I,$,O,w,N,P,k,M,D,H,L,q,F,B,z,U,j,V,G,Y,W,X,K,J,Q,Z,ee,te,ie,oe,ae,ne,re,se,le,de,ce,ue,pe,me,he,ge,ve,_e,ye,be,fe,Se,Te;const{financialAmounts:xe,id:Ce}=t[0],{segmentTypeId:Ee,customerId:Ae,supportTypeId:Re,termsFrecuency:Ie,termNumber:$e,goodStatusId:Oe,totalInstallmentsLoans:we,providerId:Ne,employmentSituationId:Pe,employmentSeniorityId:ke,sectorId:Me}=e,{expenses:De,financialFactors:He,financialAmounts:Le,product:qe,incomes:Fe,rates:Be}=i,{rates:ze,folio:Ue}=o,{maritalStatus:je,gender:Ve}=a[0],Ge=Ue,Ye=null==Le||null===(s=Le.calculatedAmounts)||void 0===s||null===(l=s.find((e=>"PROPERTY_VALUE"===(null==e?void 0:e.amountType))))||void 0===l||null===(d=l.calculatedAmount)||void 0===d?void 0:d.amount,We=null==Le||null===(c=Le.calculatedAmounts)||void 0===c||null===(u=c.find((e=>"PROPERTY_VALUE"===(null==e?void 0:e.amountType))))||void 0===u||null===(p=u.calculatedAmount)||void 0===p?void 0:p.currency,Xe=null==Le||null===(m=Le.calculatedAmounts)||void 0===m||null===(h=m.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===h||null===(g=h.calculatedAmount)||void 0===g?void 0:g.amount,Ke=null==Le||null===(v=Le.calculatedAmounts)||void 0===v||null===(_=v.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===_||null===(y=_.calculatedAmount)||void 0===y?void 0:y.currency,Je=null==Le||null===(b=Le.calculatedAmounts)||void 0===b||null===(f=b.find((e=>"PAYMENT_BY_THOUSAND"===(null==e?void 0:e.amountType))))||void 0===f||null===(S=f.calculatedAmount)||void 0===S?void 0:S.amount,Qe=null==Le||null===(T=Le.calculatedAmounts)||void 0===T||null===(x=T.find((e=>"PAYMENT_BY_THOUSAND"===(null==e?void 0:e.amountType))))||void 0===x||null===(C=x.calculatedAmount)||void 0===C?void 0:C.currency,Ze=null==De||null===(E=De.find((e=>{var t;return"CREDIT_INVESTIGATION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===E||null===(A=E.expenseAmount)||void 0===A?void 0:A.amount,et=null==De||null===(R=De.find((e=>{var t;return"CREDIT_INVESTIGATION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===R||null===(I=R.expenseAmount)||void 0===I?void 0:I.currency,tt=null==De||null===($=De.find((e=>{var t;return"NOTARIAL_EXPENSE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===$||null===(O=$.expenseAmount)||void 0===O?void 0:O.amount,it=null==De||null===(w=De.find((e=>{var t;return"NOTARIAL_EXPENSE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===w||null===(N=w.expenseAmount)||void 0===N?void 0:N.currency,ot=null==Le||null===(P=Le.calculatedAmounts)||void 0===P||null===(k=P.find((e=>"INITIAL_DISBURSEMENT"===(null==e?void 0:e.amountType))))||void 0===k||null===(M=k.calculatedAmount)||void 0===M?void 0:M.amount,at=null==Le||null===(D=Le.calculatedAmounts)||void 0===D||null===(H=D.find((e=>"INITIAL_DISBURSEMENT"===(null==e?void 0:e.amountType))))||void 0===H||null===(L=H.calculatedAmount)||void 0===L?void 0:L.currency,nt=null==Le||null===(q=Le.calculatedAmounts)||void 0===q||null===(F=q.find((e=>"DOWN_PAYMENT"===(null==e?void 0:e.amountType))))||void 0===F||null===(B=F.calculatedAmount)||void 0===B?void 0:B.amount,rt=null==Le||null===(z=Le.calculatedAmounts)||void 0===z||null===(U=z.find((e=>"DOWN_PAYMENT"===(null==e?void 0:e.amountType))))||void 0===U||null===(j=U.calculatedAmount)||void 0===j?void 0:j.currency,st=null==De||null===(V=De.find((e=>{var t;return"APPRAISAL_FEE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===V||null===(G=V.expenseAmount)||void 0===G?void 0:G.amount,lt=null==De||null===(Y=De.find((e=>{var t;return"APPRAISAL_FEE"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===Y||null===(W=Y.expenseAmount)||void 0===W?void 0:W.currency,dt=null==He||null===(X=He.find((e=>{var t;return"YEARLY_INCREASE"===(null==e||null===(t=e.factorType)||void 0===t?void 0:t.id)})))||void 0===X||null===(K=X.percentage)||void 0===K?void 0:K.percentage,ct=null==Le||null===(J=Le.calculatedAmounts)||void 0===J||null===(Q=J.find((e=>"MAXIMUM_FINANCING"===(null==e?void 0:e.amountType))))||void 0===Q||null===(Z=Q.calculatedAmount)||void 0===Z?void 0:Z.amount,ut=null==Le||null===(ee=Le.calculatedAmounts)||void 0===ee||null===(te=ee.find((e=>"REAL_FINANCING"===(null==e?void 0:e.amountType))))||void 0===te||null===(ie=te.calculatedAmount)||void 0===ie?void 0:ie.amount,pt=null==Be||null===(oe=Be.find((e=>{var t;return(null==e||null===(t=e.rateType)||void 0===t?void 0:t.id)===n})))||void 0===oe||null===(ae=oe.unit)||void 0===ae?void 0:ae.percentage,mt=null==ze||null===(ne=ze.itemizeRates)||void 0===ne||null===(re=ne.find((e=>(null==e?void 0:e.rateType)===r)))||void 0===re||null===(se=re.itemizeRateUnits[0])||void 0===se?void 0:se.percentage,ht=null==De||null===(le=De.find((e=>{var t;return"OPENING_COMMISSION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===le||null===(de=le.expenseAmount)||void 0===de?void 0:de.amount,gt=null==De||null===(ce=De.find((e=>{var t;return"DEFERRED_COMMISSION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===ce||null===(ue=ce.expenseAmount)||void 0===ue?void 0:ue.amount,vt=null==xe||null===(pe=xe.calculatedAmounts)||void 0===pe||null===(me=pe.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===me||null===(he=me.calculatedAmount)||void 0===he?void 0:he.amount,_t=null==xe||null===(ge=xe.calculatedAmounts)||void 0===ge||null===(ve=ge.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===ve||null===(_e=ve.calculatedAmount)||void 0===_e?void 0:_e.currency,yt=null==Fe||null===(ye=Fe.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===ye||null===(be=ye.incomeValues)||void 0===be||null===(fe=be.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===fe?void 0:fe.amount,bt=null===(Se=Fe.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===Se||null===(Te=Se.incomeValues.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===Te?void 0:Te.currency,ft=Ce,St=null==qe?void 0:qe.name;return{folio:Ge,segmentType:{id:Ee},customer:{id:Ae,economicActivity:{sector:{id:Me},employmentSituation:{id:Pe},employmentSeniority:{id:ke},income:{amount:yt,currency:bt}},gender:{id:null==Ve?void 0:Ve.id},maritalStatus:{id:null==je?void 0:je.id}},financialCondition:{id:ft},financingProgram:{supportType:{id:Re}},goods:{status:{id:Oe}},financialAmount:{specificAmounts:[{id:"PROPERTY_VALUE",detailAmount:{amount:Ye,currency:We}},{id:"REQUESTED_AMOUNT",detailAmount:{amount:Xe,currency:Ke}},{id:"PAYMENT_BY_THOUSAND",detailAmount:{amount:Je,currency:Qe}}]},incomes:[{amount:vt,currency:_t}],term:{number:$e,frequency:Ie},expenses:[{expenseType:{id:"CREDIT_INVESTIGATION"},expense:{amount:Ze,currency:et}},{expenseType:{id:"NOTARIAL_EXPENSE"},expense:{amount:tt,currency:it}},{expenseType:{id:"INITIAL_DISBURSEMENT"},expense:{amount:ot,currency:at}},{expenseType:{id:"DOWN_PAYMENT"},expense:{amount:nt,currency:rt}},{expenseType:{id:"APPRAISAL_FEE"},expense:{amount:st,currency:lt}}],totalInstallmentsLoans:we,product:{subproduct:{name:St}},rates:[{itemizeRates:[{rateType:"INITIAL_RATE",itemizeRateUnit:{unitType:"PERCENTAGE",percentage:pt}},{rateType:"YEARLY_INCREASE",itemizeRateUnit:{unitType:"PERCENTAGE",percentage:dt}},{rateType:"MAXIMUM_FINANCING",itemizeRateUnit:{unitType:"PERCENTAGE",percentage:ct}},{rateType:"REAL_FINANCING",itemizeRateUnit:{unitType:"PERCENTAGE",percentage:ut}},{rateType:"CAT",itemizeRateUnit:{unitType:"PERCENTAGE",percentage:mt}}]}],fees:[{itemizeFees:[{feeType:"OPENING_COMMISSION",itemizeFeeUnit:{unitType:"PERCENTAGE",percentage:ht}},{feeType:"DEFERRED_COMMISSION",itemizeFeeUnit:{unitType:"PERCENTAGE",percentage:gt}}]}],provider:{id:Ne}}})({segmentTypeId:this.segmentTypeId,customerId:this.requesterFullName,supportTypeId:this.supportTypeId,termNumber:a,termsFrecuency:this.termsFrecuency,totalInstallmentsLoans:this.totalInstallmentsLoans,providerId:this.providerId,goodStatusId:null==o?void 0:o.value,employmentSituationId:e,employmentSeniorityId:i,sectorId:t},this._responseSuggestLoan,this._responseSimmulateSuggest,this._responseAmortizationPlans,this.responseCustomers,this.initialRateType,this.catRateType)}_normalizeResponseAmortizationPlans(e){var t,i,o,a,n,r,s,l,d;return{cat:null==e||null===(t=e.rates)||void 0===t||null===(i=t.itemizeRates)||void 0===i||null===(o=i.find((e=>(null==e?void 0:e.rateType)===this.catRateType)))||void 0===o||null===(a=o.itemizeRateUnits)||void 0===a||null===(n=a.find((e=>"PERCENTAGE"===(null==e?void 0:e.unitType))))||void 0===n?void 0:n.percentage,calculationDate:null==e||null===(r=e.rates)||void 0===r||null===(s=r.itemizeRates)||void 0===s||null===(l=s.find((e=>(null==e?void 0:e.rateType)===this.catRateType)))||void 0===l?void 0:l.calculationDate,offerDate:null==e||null===(d=e.offer)||void 0===d?void 0:d.expirationDate}}_normalizeResponseCustomers(e){const{gender:t,maritalStatus:i}=e[0];return{gender:t.id,maritalStatus:i.id}}_normalizeResponseDigitalCertificates(){return((e,t,i)=>{var o,a,n,r,s,l,d,c,u,p,m,h,g,v,_,y,b,f,S,T,x,C,E,A,R,I,$,O;const{simulationType:w}=i,{term:N,rates:P,fees:k,purpose:M,customer:D,expirationDate:H,calculationDate:L,folio:q,financialAmount:F}=e,{financialAmounts:B}=t[0];return{calculatedRequestedAmount:null==F||null===(o=F.specificAmounts)||void 0===o||null===(a=o.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.id))))||void 0===a||null===(n=a.detailAmount)||void 0===n?void 0:n.amount,calculatedRequestedCurrency:null==F||null===(r=F.specificAmounts)||void 0===r||null===(s=r.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.id))))||void 0===s||null===(l=s.detailAmount)||void 0===l?void 0:l.currency,calculatedAmount:null==B||null===(d=B.calculatedAmounts)||void 0===d||null===(c=d.find((e=>"INSTALLMENT_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===c||null===(u=c.calculatedAmount)||void 0===u?void 0:u.amount,calculatedAmountCurrency:null==B||null===(p=B.calculatedAmounts)||void 0===p||null===(m=p.find((e=>"INSTALLMENT_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===m||null===(h=m.calculatedAmount)||void 0===h?void 0:h.currency,calculationDate:L,purposeId:null==M?void 0:M.id,productName:w,termNumber:null==N?void 0:N.number,openCommision:null===(g=k[0])||void 0===g||null===(v=g.itemizeFees)||void 0===v||null===(_=v.find((e=>"OPENING_COMMISSION"===(null==e?void 0:e.feeType))))||void 0===_||null===(y=_.itemizeFeeUnit)||void 0===y?void 0:y.percentage,initialRate:null===(b=P[0])||void 0===b||null===(f=b.itemizeRates)||void 0===f||null===(S=f.find((e=>"INITIAL_RATE"===(null==e?void 0:e.rateType))))||void 0===S||null===(T=S.itemizeRateUnit)||void 0===T?void 0:T.percentage,cat:null===(x=P[0])||void 0===x||null===(C=x.itemizeRates)||void 0===C||null===(E=C.find((e=>"CAT"===(null==e?void 0:e.rateType))))||void 0===E||null===(A=E.itemizeRateUnit)||void 0===A?void 0:A.percentage,expirationDate:H,contactEmail:"EMAIL"===(null==D||null===(R=D.contactDetail)||void 0===R||null===(I=R.contact)||void 0===I?void 0:I.contactDetailType)?null==D||null===($=D.contactDetail)||void 0===$||null===(O=$.contact)||void 0===O?void 0:O.address:"",certificateId:q}})(this._responseDigitalCertificates,this._responseSuggestLoan,this._summaryDataCreditSimulation)}_normalizeResponseSimulateSuggest(e){var t,i,o,a,n,r,s,l,d,c,u,p;return{openingCommission:null==e||null===(t=e.expenses)||void 0===t||null===(i=t.find((e=>{var t;return"OPENING_COMMISSION"===(null==e||null===(t=e.expenseType)||void 0===t?void 0:t.id)})))||void 0===i||null===(o=i.expenseAmount)||void 0===o?void 0:o.amount,interestRate:null==e||null===(a=e.rates)||void 0===a||null===(n=a.find((e=>{var t;return(null==e||null===(t=e.rateType)||void 0===t?void 0:t.id)===this.initialRateType})))||void 0===n||null===(r=n.unit)||void 0===r?void 0:r.percentage,calculatedMonthlyIncome:null==e||null===(s=e.incomes.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===s||null===(l=s.incomeValues)||void 0===l||null===(d=l.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===d?void 0:d.amount,currency:null==e||null===(c=e.incomes.find((e=>{var t;return"ESTIMATION"===(null==e||null===(t=e.incomeType)||void 0===t?void 0:t.id)})))||void 0===c||null===(u=c.incomeValues)||void 0===u||null===(p=u.find((e=>"MONTHLY"===(null==e?void 0:e.frecuency))))||void 0===p?void 0:p.currency}}_normalizeResponseSuggestLoan(e){var t,i,o,a,n,r,s,l,d,c,u,p,m,h,g,v,_,y,b,f;const S=null===(t=e[0])||void 0===t||null===(i=t.financialAmounts)||void 0===i||null===(o=i.calculatedAmounts)||void 0===o||null===(a=o.find((e=>"INSTALLMENT_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===a||null===(n=a.calculatedAmount)||void 0===n?void 0:n.amount,T=null===(r=e[0])||void 0===r||null===(s=r.financialAmounts)||void 0===s||null===(l=s.calculatedAmounts)||void 0===l||null===(d=l.find((e=>"INSTALLMENT_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===d||null===(c=d.calculatedAmount)||void 0===c?void 0:c.currency;return{calculatedAmount:S,currency:null===(u=e[0])||void 0===u||null===(p=u.financialAmounts)||void 0===p||null===(m=p.calculatedAmounts)||void 0===m||null===(h=m.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===h||null===(g=h.calculatedAmount)||void 0===g?void 0:g.currency,currencyInstallment:T,calculatedRequestedAmount:null===(v=e[0])||void 0===v||null===(_=v.financialAmounts)||void 0===_||null===(y=_.calculatedAmounts)||void 0===y||null===(b=y.find((e=>"REQUESTED_AMOUNT"===(null==e?void 0:e.amountType))))||void 0===b||null===(f=b.calculatedAmount)||void 0===f?void 0:f.amount}}get _renderDatamanagers(){return l`
          <bbva-global-public-settings-api-dm
            id="public-settings-dm"
            .host=${this.publicSettingsHost}
            .version=${this.appSettingsApiVersion}
            ?native=${this.native}
            .requiredToken="${this.requiredToken}"
            @public-settings-api-dm-fetch="${this._handleSuccessAppSettings}"
            @public-settings-api-dm-fetch-error="${this._handleSettingsError}"
            @api-dm-error="${this._handleSettingsError}"
          ></bbva-global-public-settings-api-dm>
          <bbva-global-suggest-loans-api-dm
            id="suggest-loans-api-dm"
            ?native=${this.native}
            .host=${this.host}
            .version=${this.loansApiVersion}
            .requiredToken="${this.requiredToken}"
            @api-dm-error="${this._handleServerSuggestError}"
            @suggest-loans-api-dm-create="${this._handleSuccessSuggestLoan}"
            @suggest-loans-api-dm-create-error="${this._handleFuncSuggestError}"
          ></bbva-global-suggest-loans-api-dm>
          <bbva-global-suggest-loan-simulate-api-dm
            id="suggest-loan-simulation-api-dm"
            ?native=${this.native}
            .host=${this.host}
            .version=${this.loansApiVersion}
            .requiredToken="${this.requiredToken}"
            @suggest-loan-simulate-api-dm-fetch="${this._handleSuccessSimulateSuggest}"
            @suggest-loan-simulate-api-dm-fetch-error="${this._handleFuncSimulateError}"
            @api-dm-error="${this._handleServerSimulateError}"
          ></bbva-global-suggest-loan-simulate-api-dm>
          <bbva-global-amortization-plans-simulate-api-dm
            id="amortization-plans-simulate-dm"
            .host=${this.host}
            .version=${this.mortgagesApiVersion}
            ?native=${this.native}
            requiredToken="${this.requiredToken}"
            @amortization-plans-simulate-api-dm-fetch="${this._handleSuccessAmortizationPlans}"
            @amortization-plans-simulate-api-dm-fetch-error="${this._handleFuncAmortizationError}"
            @api-dm-error="${this._handleServerAmortizationError}"
          >
          </bbva-global-amortization-plans-simulate-api-dm>
          <bbva-global-customer-terms-api-dm
            id="customer-terms-dm"
            .host=${this.host}
            .version=${this.customersApiVersion}
            ?native=${this.native}
            .requiredToken="${this.requiredToken}"
            @customer-terms-api-dm-create="${this._handleSuccessCustomerTerms}"
            @customer-terms-api-dm-create-error="${this._handleErrorTerms}"
            @api-dm-error="${this._handleErrorTerms}"
            requiredOTP
          >
          </bbva-global-customer-terms-api-dm>
          <bbva-global-customers-api-dm
            id="customers-api-dm"
            .host=${this.host}
            .version=${this.customersApiVersion}
            ?native=${this.native}
            .requiredToken="${this.requiredToken}"
            @customers-api-dm-fetch="${this._handleSuccessCustomers}"
            @customers-api-dm-fetch-error="${this._handleErrorCustomers}"
            @api-dm-error="${this._handleErrorCustomers}"
          >
          </bbva-global-customers-api-dm>
          <bbva-global-digital-certificates-api-dm
            id="digital-certificates-dm"
            .host=${this.host}
            .version=${this.mortgagesApiVersion}
            ?native=${this.native}
            .requiredToken="${this.requiredToken}"
            @digital-certificates-api-dm-create="${this._handleSuccessDigitalCertificates}"
            @digital-certificates-api-dm-create-error="${this._handleFuncCertificateError}"
            @api-dm-error="${this._handleServerCertificateError}"
            requiredOTP
          >
          </bbva-global-digital-certificates-api-dm>
        `}}));var hi=a`
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

  [data-tag-name='bbva-expandable-multistep'] {
    background-color: ${U("colorPrimaryAltSurfaceAmbientDefault",j)};
  }
`;class gi extends(mi(li(W(X(s(t)))))){static get is(){return"loan-and-mortgage-origination-oc-mortgage-non-preapproved"}static get scopedElements(){const e=[pi,Te,ue,si,le,J,he,ci,Ue,je,ve,dt,wt,Nt,ct,...gi.configurationScopedElements()];return gi.scopedElementsFromClasses(e)}static get properties(){return{propertyValueId:{type:String,attribute:"property-value-id"},requestedAmountId:{type:String,attribute:"requested-amount-id"},buyHouseId:{type:String,attribute:"buy-house-id"},changeMortgageId:{type:String,attribute:"change-mortgage-id"},mortgagePropertyId:{type:String,attribute:"mortgage-property-id"},remodelPropertyId:{type:String,attribute:"remodel-property-id"},buyLandId:{type:String,attribute:"buy-land-id"},installmentAmountId:{type:String,attribute:"installment-amount-id"},typeMortgage:{type:String,attribute:"type-mortgage"},currency:{type:String},incomeFrecuency:{type:String,attribute:"income-frecuency"},incomeTypeId:{type:String,attribute:"income-type-id"},termsFrecuency:{type:String,attribute:"terms-frecuency"},totalSuggestedLoans:{type:Number,attribute:"total-suggested-loans"},suggestLoanTypeId:{type:String,attribute:"suggest-loan-type-id"},segmentId:{type:String,attribute:"segment-id"},requesterFullName:{type:String,attribute:"requester-full-name"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},financingProgramId:{type:String,attribute:"financing-program-id"},notarialExpenseType:{type:String,attribute:"notarial-expense-type"},holderInvestigationType:{type:String,attribute:"holder-investigation-type"},notarialExpensePercentage:{type:Number,attribute:"notarial-expense-percentage"},notarialExpenseAmount:{type:Number,attribute:"notarial-expense-amount"},segmentTypeId:{type:String,attribute:"segment-type-id"},initialRateType:{type:String,attribute:"initial-rate-type"},yearlyIncreaseType:{type:String,attribute:"yearly-increase-type"},maximumFinancingType:{type:String,attribute:"maximum-financing-type"},realFinancingType:{type:String,attribute:"real-financing-type"},totalInstallmentsLoans:{type:Number,attribute:"total-installments-loans"},catRateType:{type:String,attribute:"cat-rate-type"},customerId:{type:String,attribute:"customer-id"},termTypeId:{type:String,attribute:"term-type-id"},acceptanceMessagesBdnType:{type:String,attribute:"acceptance-messages-bdn-type"},acceptanceMessagesBduType:{type:String,attribute:"acceptance-messages-bdu-type"},acceptanceMessagesBdaType:{type:String,attribute:"acceptance-messages-bda-type"},supportTypeId:{type:String,attribute:"support-type-id"},providerId:{type:String,attribute:"provider-id"},loansApiVersion:{type:String,attribute:"loans-api-version"},customersApiVersion:{type:String,attribute:"customers-api-version"},mortgagesApiVersion:{type:String,attribute:"mortgages-api-version"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},appSettings:{type:String},publicSettingsHost:{type:String,attribute:"public-settings-host"},responseCustomers:{type:Object},showInitialOffer:{type:Boolean,attribute:"show-initial-offer"},maxAllowedRetries:{type:Number,attribute:"max-allowed-retries"},_triesAppSettings:{type:Number,state:!0},_creditSimulationData:{type:Object,state:!0},_showModal:{type:Boolean,state:!0},_typeModal:{type:String,state:!0},_showMultistepModal:{type:Boolean,state:!0},_failedOfferService:{type:String,state:!0},_offerServices:{type:Object,state:!0},_responseSuggestLoan:{type:Object,state:!0},_normalizeResSuggestLoan:{type:Object,state:!0},_triesSuggestLoan:{type:Number,state:!0},_completeDataCreditSimulation:{type:Object,state:!0},_summaryDataCreditSimulation:{type:Object,state:!0},_responseSimmulateSuggest:{type:Object},_normalizeResponseSimSuggestLoan:{type:Object},_triesSimmulateSuggest:{type:Number,state:!0},_responseAmortizationPlans:{type:Object,state:!0},_normalizeResAmortizationPlans:{type:Object,state:!0},_triesAmortizationPlans:{type:Number,state:!0},_failedCertificateService:{type:String,state:!0},_certificateServices:{type:Object,state:!0},_normalizeResCustomers:{type:Object,state:!0},_triesCustomers:{type:Number,state:!0},_triesCustomerTerms:{type:Number,state:!0},_triesCertificate:{type:Number,state:!0},_responseDigitalCertificates:{type:Object,state:!0},_normalizeResDigitalCertificates:{type:Object,state:!0},_additionalInformation:{type:Object,state:!0}}}constructor(){super(),this.propertyValueId="",this.requestedAmountId="",this.buyHouseId="",this.changeMortgageId="",this.mortgagePropertyId="",this.remodelPropertyId="",this.buyLandId="",this.installmentAmountId="",this.typeMortgage="",this.currency="",this.incomeFrecuency="",this.incomeTypeId="",this.termsFrecuency="",this.totalSuggestedLoans=0,this.suggestLoanTypeId="",this.segmentId="",this.requesterFullName="",this.publicSettingsId="",this.publicSettingsKey="",this.financingProgramId="",this.notarialExpenseType="",this.holderInvestigationType="",this.notarialExpensePercentage=0,this.notarialExpenseAmount=0,this.segmentTypeId="",this.initialRateType="",this.yearlyIncreaseType="",this.maximumFinancingType="",this.realFinancingType="",this.totalInstallmentsLoans=0,this.catRateType="",this.customerId="",this.termTypeId="",this.acceptanceMessagesBdnType="",this.acceptanceMessagesBduType="",this.acceptanceMessagesBdaType="",this.supportTypeId="",this.providerId="",this.loansApiVersion="",this.customersApiVersion="",this.mortgagesApiVersion="",this.appSettingsApiVersion="",this.config.loader=Zt,this.appSettings={},this.publicSettingsHost="",this.responseCustomers={},this.maxAllowedRetries=0,this._triesAppSettings=0,this._creditSimulationData={},this._showModal=!1,this._typeModal="",this._showMultistepModal=!1,this._failedOfferService="",this._offerServices={"suggest-loan":()=>this._callSuggestLoan(),"simulate-suggest-loan":()=>this._callSimulateSuggestLoan(),"amortization-plans":()=>this._callAmortizationPlans()},this.iOSFixedHeader=!1,this._responseSuggestLoan={},this._normalizeResSuggestLoan={},this._triesSuggestLoan=0,this._completeDataCreditSimulation={},this._summaryDataCreditSimulation={},this._responseSimmulateSuggest={},this._normalizeResponseSimSuggestLoan={},this._triesSimmulateSuggest=0,this._responseAmortizationPlans={},this._normalizeResAmortizationPlans={},this._triesAmortizationPlans=0,this._failedCertificateService="",this._certificateServices={customers:()=>this._callCustomers(),"customer-terms":()=>this._callCustomerTerms(),"digital-certificates":()=>this._callDigitalCertificates()},this._normalizeResCustomers={},this._triesCustomers=0,this._triesCustomerTerms=0,this._triesCertificate=0,this._responseDigitalCertificates={},this._normalizeResDigitalCertificates={},this._additionalInformation={},this.showInitialOffer=!1,this.language=""}obtainRequesterFullName(e){this.requesterFullName=null==e?void 0:e.grantingTicketUserId}get _additionalInformationElement(){var e,t,i,o;return null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector('[data-tag-name="oc-mortgage-multistep"]'))||void 0===t||null===(i=t.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]'))||void 0===i||null===(o=i.querySelectorAll('[data-tag-name="bbva-expandable-step"]')[1])||void 0===o?void 0:o.querySelector('[data-tag-name="additional-information"]')}get _amortizationPlansDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-amortization-plans-simulate-api-dm"]')}get _appSettingsDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]')}get _creditSimulationElement(){var e,t,i,o;return null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector('[data-tag-name="oc-mortgage-multistep"]'))||void 0===t||null===(i=t.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]'))||void 0===i||null===(o=i.querySelector('[data-tag-name="bbva-expandable-step"]'))||void 0===o?void 0:o.querySelector('[data-tag-name="credit-simulation"]')}get _customerTerms(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-terms-api-dm"]')}get _customersApi(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-customers-api-dm"]')}get _digitalCertificates(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-digital-certificates-api-dm"]')}get _initialOfferElement(){return this.shadowRoot.querySelector('[data-tag-name="initial-offer"]')}get _multistepElement(){return this.shadowRoot.querySelector('[data-tag-name="oc-mortgage-multistep"]')}get _receiptSuccessElement(){var e,t;return null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector('[data-tag-name="bbva-help-modal"]'))||void 0===t?void 0:t.querySelector('[data-tag-name="receipt-success"]')}get _suggestLoanSimulateDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-suggest-loan-simulate-api-dm"]')}get _suggestLoansDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-suggest-loans-api-dm"]')}get _termsAndConditionsElement(){var e,t,i,o;return null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector('[data-tag-name="oc-mortgage-multistep"]'))||void 0===t||null===(i=t.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]'))||void 0===i||null===(o=i.querySelectorAll('[data-tag-name="bbva-expandable-step"]')[2])||void 0===o?void 0:o.querySelector('[data-tag-name="terms-and-conditions"]')}get _tplModal(){return"function"==typeof this.modals[this._typeModal]?this.modals[this._typeModal]():c}_callAmortizationPlans(){const e=this._normalizeRequestDataAmortizationPlans(this._responseSimmulateSuggest,this._responseSuggestLoan);this._amortizationPlansDm.responseType="arraybuffer",this._amortizationPlansDm.postAmortizationPlansSimulate(e)}_callAppSettings(){this._showLoader(),Object.keys(this.appSettings).length?(this._appSettingsDm.publicSettings=this.appSettings,this._handleSuccessAppSettings()):this._appSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}_callCustomerTerms(){const e=this._normalizeRequestDataCustomerTerms();this._customerTerms.postCustomerTerms(this.customerId,e)}_callCustomers(){Object.keys(this.responseCustomers).length?(this._customersApi.customers=this.responseCustomers,this._handleSuccessCustomers()):this._customersApi.getCustomers()}_callDigitalCertificates(){const e=this._normalizeRequestDigitalCertificates();this._digitalCertificates.responseType="arraybuffer",this._digitalCertificates.postDigitalCertificates(e)}_callSimulateSuggestLoan(){const e=this._normalizeRequestDataSimulateSuggest(this._responseSuggestLoan),t=this._responseSuggestLoan[0].id;this._suggestLoanSimulateDm.postSuggestLoanSimulate(t,e)}_callSuggestLoan(){this._showLoader(),this._postSuggestedLoans()}_catModal(){this._showModal=!0,this._typeModal="cat"}_cleanRetries(e){const{detail:t}=e;this._summaryDataCreditSimulation=t,this._triesSuggestLoan=0,this._triesAmortizationPlans=0,this._triesAppSettings=0,this._triesSimmulateSuggest=0,this._triesCustomerTerms=0,this._triesCertificate=0,this._triesCustomers=0,this._failedCertificateService="",this._failedOfferService=""}_clearDataCreditSim(){this._creditSimulationData={}}reset(){var e,t,i,o,a,n;this._triesCustomers=0,this._triesCustomerTerms=0,this._triesCertificate=0,this._triesSuggestLoan=0,this._triesAmortizationPlans=0,this._triesSimmulateSuggest=0,this._triesAppSettings=0,this._responseSuggestLoan={},this._normalizeResSuggestLoan={},this._completeDataCreditSimulation={},this._summaryDataCreditSimulation={},this._responseSimmulateSuggest={},this._normalizeResponseSimSuggestLoan={},this._responseAmortizationPlans={},this._normalizeResAmortizationPlans={},this._failedCertificateService="",this._certificateServices={customers:()=>this._callCustomers(),"customer-terms":()=>this._callCustomerTerms(),"digital-certificates":()=>this._callDigitalCertificates()},this._normalizeResCustomers={},this._responseDigitalCertificates={},this._normalizeResDigitalCertificates={},this._additionalInformation={},null===(e=this._creditSimulationElement)||void 0===e||e.reset(),null===(t=this._termsAndConditionsElement)||void 0===t||t.reset(),null===(i=this._multistepElement)||void 0===i||i.reset(),null===(o=this._initialOfferElement)||void 0===o||o.reset(),null===(a=this._additionalInformationElement)||void 0===a||a.reset(),null===(n=this._receiptSuccessElement)||void 0===n||n.reset(),this.showInitialOffer=!0,this._showMultistepModal=!1,this.appSettings={},this._showModal=!1,this._typeModal="",this._fireCustomEvent("component-reset")}_closeGenericModal(){this._showModal=!1,this._typeModal=""}_closeMultistepModal(e){const{detail:{hasSomeData:t}}=e;t?(this._showModal=!0,this._typeModal="exit-step-header"):this.reset()}_continueInitialOffer(){this._showMultistepModal=!0,this._callAppSettings(),this._requestClientId()}_createDataCreditSim(){this._creditSimulationData={...this._normalizeResSuggestLoan,...this._normalizeResponseSimSuggestLoan,...this._normalizeResAmortizationPlans}}_fileSize(e){const t=3*e.replace(/=+$/,"").length/4;return parseFloat((t/1024).toFixed(0))}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`${gi.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}_handleContinueReceipt(){this._showLoader(),this._callCustomerTerms()}_handleErrorCustomers(){this._hideLoader(),this._showModal=!0,this._failedCertificateService="customers",this._triesCustomers+=1,this._triesCustomers<this.maxAllowedRetries?this._typeModal="op-not-available-retry-certificate-services":this._typeModal="op-not-available-exit"}_handleErrorTerms(){this._hideLoader(),this._showModal=!0,this._failedCertificateService="customer-terms",this._triesCustomerTerms+=1,this._triesCustomerTerms<this.maxAllowedRetries?this._typeModal="op-not-available-retry-certificate-services":this._typeModal="op-not-available-exit"}_handleFlowExit(){this.reset(),this._fireCustomEvent("flow-exit",{})}_handleFuncAmortizationError(){this._hideLoader(),this._showModal=!0,this._failedOfferService="amortization-plans",this._typeModal="no-offer-exit"}_handleFuncCertificateError(){this._hideLoader(),this._showModal=!0,this._failedCertificateService="digital-certificates",this._typeModal="financial-health-concern"}_handleFuncSimulateError(){this._hideLoader(),this._showModal=!0,this._failedOfferService="simulate-suggest-loan",this._typeModal="no-offer-exit"}_handleFuncSuggestError(){this._hideLoader(),this._failedOfferService="suggest-loan",this._showModal=!0,this._typeModal="no-offer-exit"}_handleServerAmortizationError(e){const{detail:t}=e,i=t["http-status"];this._failedOfferService="amortization-plans",this._hideLoader(),this._showModal=!0,this._triesAmortizationPlans+=1,i>=400&&i<500&&this._triesAmortizationPlans<this.maxAllowedRetries?(this._typeModal="no-offer-exit",this._clearDataCreditSim()):this._triesAmortizationPlans<this.maxAllowedRetries?this._typeModal="op-not-available-retry":this._typeModal="op-not-available-exit"}_handleServerCertificateError(e){const{detail:t}=e,i=t["http-status"];this._hideLoader(),this._showModal=!0,this._failedCertificateService="digital-certificates",this._triesCertificate+=1,i>=400&&i<500&&this._triesCertificate<this.maxAllowedRetries?this._typeModal="financial-health-concern":this._triesCertificate<this.maxAllowedRetries?this._typeModal="op-not-available-retry-certificate-services":this._typeModal="op-not-available-exit"}_handleServerSimulateError(e){const{detail:t}=e,i=t["http-status"];this._hideLoader(),this._failedOfferService="simulate-suggest-loan",this._showModal=!0,this._triesSimmulateSuggest+=1,i>=400&&i<500&&this._triesSimmulateSuggest<this.maxAllowedRetries?(this._typeModal="no-offer-exit",this._clearDataCreditSim()):this._triesSimmulateSuggest<this.maxAllowedRetries?this._typeModal="op-not-available-retry":this._typeModal="op-not-available-exit"}_handleServerSuggestError(e){const{detail:t}=e,i=t["http-status"];this._failedOfferService="suggest-loan",this._hideLoader(),this._showModal=!0,this._triesSuggestLoan+=1,i>=400&&i<500&&this._triesSuggestLoan<this.maxAllowedRetries?(this._typeModal="no-offer-exit",this._clearDataCreditSim()):this._triesSuggestLoan<this.maxAllowedRetries?this._typeModal="op-not-available-retry":this._typeModal="op-not-available-exit"}_handleSettingsError(){this._hideLoader(),this._showModal=!0,this._triesAppSettings+=1,this._triesAppSettings>=this.maxAllowedRetries?this._typeModal="op-not-available-exit":this._typeModal="op-not-available-retry-settings"}_handleSuccessAmortizationPlans(e){const{detail:t}=e,i=t.parts[1].content,o=JSON.parse(i),a=t.parts[0].content,n=this._fileSize(a);this._responseAmortizationPlans=o,this.addEventListener("loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-amortization-table-click",(()=>{this._fireCustomEvent("amortization-table-click",a)})),this._normalizeResAmortizationPlans=this._normalizeResponseAmortizationPlans(o),this._normalizeResAmortizationPlans.pdfSize=n,this._triesAmortizationPlans=0,this._createDataCreditSim(),this._hideLoader()}_handleSuccessAppSettings(e){this._hideLoader();const[t]=(null==e?void 0:e.detail)||this.appSettings,i=JSON.parse(null==t?void 0:t.value);this.appSettings=i,this._triesAppSettings=0}_handleSuccessCustomerTerms(){this._callCustomers()}_handleSuccessCustomers(e){const t=(null==e?void 0:e.detail)||this.responseCustomers;this.responseCustomers=t,this._normalizeResCustomers=this._normalizeResponseCustomers(t),this._callDigitalCertificates()}_handleSuccessDigitalCertificates(e){const{detail:t}=e,i=t.parts[1].content,o=JSON.parse(i),a=t.parts[0].content;this._responseDigitalCertificates=o,this.addEventListener("loan-and-mortgage-origination-oc-mortgage-non-preapproved-receipt-success-button-download-click",(()=>{this._fireCustomEvent("download-certificate-click",a)})),this._normalizeResDigitalCertificates=this._normalizeResponseDigitalCertificates(),this._hideLoader(),this._triesCertificate=0,this._showModal=!0,this._typeModal="receipt-success"}_handleSuccessSimulateSuggest(e){const{detail:t}=e;this._responseSimmulateSuggest=t,this._normalizeResponseSimSuggestLoan=this._normalizeResponseSimulateSuggest(t),this._triesSimmulateSuggest=0,this._callAmortizationPlans()}_handleSuccessSuggestLoan(e){const{detail:t}=e;this._responseSuggestLoan=t,this._normalizeResSuggestLoan=this._normalizeResponseSuggestLoan(t),this._triesSuggestLoan=0,this._callSimulateSuggestLoan()}_hideLoader(){this.clearLoader(),this.config.loader={visible:!1}}_interestRateModal(){this._showModal=!0,this._typeModal="interest-rate"}_openingCommisionModal(){this._showModal=!0,this._typeModal="opening-commission"}_postSuggestedLoans(){const e=this._suggestLoansDm,t=this._normalizeRequestDataSuggestLoan();e.postSuggestLoans(t)}_retryCertificateServices(){this._showLoader(),this._showModal=!1,this._typeModal="",this._certificateServices[this._failedCertificateService]()}_retryOfferServices(){this._showLoader(),this._showModal=!1,this._typeModal="",this._offerServices[this._failedOfferService]()}_retrySettingsServices(){this._showLoader(),this._showModal=!1,this._typeModal="",this._callAppSettings()}_requestClientId(){void 0===this.requesterFullName&&this._fireCustomEvent("global-get-from-storage",{key:"loginData",secure:!0})}_saveAdditionInformation(e){const{detail:t}=e;this._additionalInformation=t}_saveUserOfferInputs(e){const{detail:t}=e;this._completeDataCreditSimulation=t,this._callSuggestLoan()}_showLoader(){this.showLoader(),this.config.loader={visible:!0}}static get styles(){return[hi,V.primaryAlt,G.primaryAlt,pe.primaryAlt,v("loan-and-mortgage-origination-oc-mortgage-non-preapproved-shared-styles")]}render(){return l`
      ${super.render()}
      <initial-offer
        ?is-open="${this.showInitialOffer}"
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-continue="${this._continueInitialOffer}"
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-initial-offer-close-click="${this._handleFlowExit}"
      ></initial-offer>
      <oc-mortgage-multistep
        .appSettings="${this.appSettings}"
        language="${this.language}"
        property-value-id="${this.propertyValueId}"
        requested-amount-id="${this.requestedAmountId}"
        buy-house-id="${this.buyHouseId}"
        change-mortgage-id="${this.changeMortgageId}"
        mortgage-property-id="${this.mortgagePropertyId}"
        remodel-property-id="${this.remodelPropertyId}"
        buy-land-id="${this.buyLandId}"
        installment-amount-id="${this.installmentAmountId}"
        ?show-multistep-modal="${this._showMultistepModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .creditSimulationData="${this._creditSimulationData}"
        .currency="${this.currency}"
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-step-complete=${this._saveUserOfferInputs}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-continue-click=${this._cleanRetries}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-credit-simulation-data-clear=${this._clearDataCreditSim}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-list-openning-commission-icon-click=${this._openingCommisionModal}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-list-interest-rate-icon-click=${this._interestRateModal}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-list-cat-icon-click=${this._catModal}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-multistep-header-close-click=${this._closeMultistepModal}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-oc-mortgage-multistep-all-complete=${this._handleContinueReceipt}
        @loan-and-mortgage-origination-oc-mortgage-non-preapproved-additional-information-continue-click=${this._saveAdditionInformation}
      ></oc-mortgage-multistep>
      <slot class="modals"> ${this._typeModal?this._tplModal:c} </slot>
      <slot class="datamanagers"> ${this._renderDatamanagers} </slot>
    `}}customElements.define(gi.is,gi);class vi extends(qe(Fe(s(t)))){static get is(){return"bbva-analyticmanager-oc-mortgage-non-preapproved-mx"}fireAppStarted(){this.fireAppOnClickStart()}fireCreditSimulation(){this.onStep({currentStep:"credit-simulation"})}formatCreditSimulation(e){this._formattedCreditData(e)}fireViewStep(e){1===e.__step?this.onStep({currentStep:"additional-information"}):2===e.__step&&this.onStep({currentStep:"terms-and-conditions"})}formatAdditionalInformation(e){this._formattedAdditionalData(e)}fireMultistepCompleted(e){e&&this.onStep({currentStep:"multistep-completed"})}fireSignature(){this.onStep({currentStep:"signature-otp"})}fireSimmulationCompleted(){this.fireAppCompleted()}fireOperationNotAvailable(){this._dispatch("analytics-operation-not-available"),this.resetData()}fireFinancialConcern(){this._dispatch("analytics-financial-concern"),this.resetData()}_formattedCreditData(e){const{creditUsage:t,simulationType:i,calculatedRequestedAmount:o,currency:a,interestRate:n,calculatedAmount:r,openingCommission:s,termNumber:l}=e,d=this.parseDataToString(this.t(t)),c=this.parseDataToString(this.t(i));this.persistData({process:d,typology:c,amount:o,currency:a,interestRate:n,paymentAmount:r,serviceCharge:s,term:365*Number(l),numberOfPayments:12*Number(l)})}_formattedAdditionalData(e){var t;const{dataAdditionalInfo:{occupation:i,typeOfCompany:o}}=e,a={EMPLOYEE:{label:"empleado",types:[{PRIVATE:"privada"},{PUBLIC:"publica"}]},OTHER:{label:"otros"}}[i]||{},n=((null===(t=a.types)||void 0===t?void 0:t.find((e=>e[o])))||{})[o]||"";this.persistData({jobType:`${(null==a?void 0:a.label)||""} ${n||""}`})}}customElements.define(vi.is,vi);var _i=a`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
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
${(new S).mediaRules()}`;class yi extends(T(t)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":x}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:C(),warning:C(),error:f(),success:E()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:o=this.duration}={}){const a=i;this._stack.push({type:a,description:e,simpleLinkText:t,duration:o}),this._showNextInStack()}static get styles(){return[_i,v("bbva-notification-container-shared-styles")]}render(){return l`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${A(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${A(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var bi=a`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${n(I.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${n(I.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${n(I.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${n(I.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${n(I.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${n(I.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${n(I.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${n(I.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${n(I.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${n(R.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class fi extends(T($(s(t)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":O,"bbva-icon":w,"bbva-badge-notification":N}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,o=Math.max(t,i);return o in e?e[o]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[bi,v("bbva-header-main-shared-styles"),P("button:focus"),k.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return l`<bbva-icon icon="${A(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return l`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,o){const a=fi.toCamelCase(e),n=`icon${a}`,r=`accessibilityTextIcon${a}`;return l`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${A(this.t(this[r]))}"
      aria-expanded=${A(o)}
      ?hidden="${!this[n]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(n):this._icon(n)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return l` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${A(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return l`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:o,_hasMicroillustration:a}=this;return l`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(a||o)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${A(o)}" alt="" ?hidden="${!o}" id="image" aria-hidden="true" />

          <span
            class="${a}"
            ?hidden="${!a}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}H("colors.primaryCoreLightened"),H("colors.cool80"),H("colors.cool70"),H("colors.primaryCoreLightened"),H("colors.cool100"),H("colors.tertiaryType6Darkened"),H("colors.tertiaryType4Darkened"),H("colors.secondary300");const Si=y((e=>class extends(L(e)){static configurationScopedElements(){return[yi,q,fi,F]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),l`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||B();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&z()||this.config.faqs&&h())}_dispatchCustomEvent(e,t=!0,i=!0,o=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:o,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const o={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",o)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,o){const a={description:e,simpleLinkText:t,type:i,duration:o};this._dispatchCustomEvent("show-notification",a)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return l`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,o;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(o=this.config)||void 0===o?void 0:o.header}}}render(){const e=this._getElements();return l`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));class Ti extends(Si(X(s(t)))){static get is(){return"bbva-controller-oc-mortgage-non-preapproved"}createReceiptCertificate(e){const t=(e=>{const{"calculated-requested-amount":t,"calculation-date":i,"purpose-id":o,"simulation-type":a,"term-number":n,"calculated-amount":r,"open-comission":s,"initial-rate":l,cat:d,"expiration-date":c,"contact-email":u,"certificate-id":p}=e;return{title:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-operation-title",templateSelected:"ocMortgageNonPreapproved",details:[{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-requested-amount",value:t},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-date-time",value:i},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-credit-purpose",value:o},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-simulation-type",value:a},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-term",value:n},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-installment-amount",value:r},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-opening-commission",value:s},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-interest-rate",value:l},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-total-annual-fee",value:d},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-expiration-date",value:c},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-email-to-sent",value:u},{key:"cells-share-operative-receipt-oc-mortgage-non-pre-approved-certificate-folio",value:p}]}})(e);this._fireCustomEvent("operative-receipt-set",{operative:"ocMortgageNonPreapproved"}),this._fireCustomEvent("share-receipt",{result:t})}validatePdfAmortizationTable(e){const t={value:`${this._validateDoubleCodification(e).replaceAll(/(\r\n|\n|\r|\s)/gm,"")}`,mimeType:"application/pdf",headers:{"Content-Type":"application/json"},title:"Tabla de amortización",headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!0,titleColor:"000000",blackStatusBar:!1};this._fireCustomEvent("document-event-show",t)}validatePdfCertificate(e){const t={value:`${this._validateDoubleCodification(e).replaceAll(/(\r\n|\n|\r|\s)/gm,"")}`,mimeType:"application/pdf",headers:{"Content-Type":"application/json"},title:"Certificado Hipotecario",headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!0,titleColor:"000000",blackStatusBar:!1};this._fireCustomEvent("document-event-show",t)}_validateDoubleCodification(e){const t=e;try{const e=atob(t);return atob(e),e}catch(e){return t}}_fireCustomEvent(e,t){this.dispatchEvent(new CustomEvent(`${Ti.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(Ti.is,Ti);
