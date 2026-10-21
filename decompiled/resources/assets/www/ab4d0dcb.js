import{z as t,a8 as o,ac as e,ad as i,ab as l,bf as a,a9 as r,L as n,ak as s,h as c,av as p}from"./952f98a9.js";import{R as b,S as h,u as m,D as d,v,W as u,G as g}from"./216055dc.js";import{B as y,a as _}from"./be12d7a2.js";var k=t`
:host {
  --_tooltip-width: var(--bbva-help-tooltip-width, 14.5rem);
  --_tooltip-spacing: var(--bbva-help-tooltip-spacing, 0.5rem);
  --_tooltip-spacing-center: var(--bbva-help-tooltip-spacing-center, 50%);
  --_transition-time: var(--bbva-help-tooltip-transition-time, 0.5s);
  --_transition-time-background-color: var(--bbva-help-tooltip-transition-time-background-color, 1s);
  --_transition-time-delay: var(--bbva-help-tooltip-transition-time-delay, 1s);
  --_transition-time-delay-tooltip: var(--bbva-help-tooltip-transition-time-delay-tooltip, 1s);
  --_z-index: var(--bbva-help-tooltip-z-index, 1);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.overlay {
  position: fixed;
  z-index: -1;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  background-color: var(--_help-tooltip-overlay-bg-color);
  opacity: 0;
  pointer-events: none;
  transition: opacity var(--_transition-time), visibility 0s var(--_transition-time), z-index 0s var(--_transition-time);
  visibility: hidden;
}
:host([opened]) .overlay {
  z-index: var(--_z-index);
  opacity: var(--bbva-help-tooltip-overlay-opacity, 0.85);
  pointer-events: auto;
  transition: opacity var(--_transition-time), visibility 0s 0s, z-index 0s 0s, background-color var(--_transition-time-background-color);
  visibility: visible;
}

:host([opened]) .overlay-observer {
  background-color: transparent;
}

.wrapper {
  position: relative;
}

.invoker {
  position: relative;
  background-color: var(--_help-tooltip-invoker-bg-color);
}
:host([opened]) .invoker {
  z-index: var(--_z-index);
}

.tooltip {
  position: absolute;
  z-index: -1;
  display: flex;
  max-width: var(--_tooltip-width);
  flex-direction: column;
  align-content: flex-start;
  background-color: var(--_help-tooltip-bg-color);
  box-shadow: var(--boxShadowType1, ${o(a.type1)});
  cursor: default;
  font-size: var(--typographyTypeSmall, ${o(e.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${o(l.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o(l.book.fontWeight)});
  inset: 0 0 none none;
  line-height: var(--lineHeightTypeSmall, ${o(i.typeSmall)});
  opacity: 0;
  pointer-events: none;
  transition: opacity var(--_transition-time), visibility 0s var(--_transition-time), z-index 0s var(--_transition-time);
  visibility: hidden;
}
:host([opened]) .tooltip {
  z-index: var(--_z-index);
  opacity: var(--bbva-help-tooltip-overlay-opacity, 1);
  pointer-events: auto;
  transition: opacity var(--_transition-time-delay), visibility 0s 0s, z-index 0s 0s;
  visibility: visible;
}

:host([active-observer-scroll-tooltip-overlay]) .tooltip {
  transition-delay: 0s;
}

:host([active-observer-scroll-tooltip-overlay][opened]) .tooltip {
  opacity: 0;
  transition-delay: var(--_transition-time-delay-tooltip);
}

:host([active-observer-scroll-tooltip-overlay][opened]) .tooltip-observer {
  opacity: 1;
}

:host([link-text]) .tooltip {
  cursor: pointer;
}

.content {
  max-width: var(--_tooltip-width);
  padding: 1rem 1rem;
}

:host([orientation]) .tooltip:after {
  position: absolute;
  width: 0.5rem;
  height: 0.375rem;
  background-color: var(--_help-tooltip-bg-color);
  content: "";
}

[data-tag-name=bbva-type-text] {
  width: 12.5rem;
}

:host([contextual][orientation]) .desktop .tooltip:after {
  background: var(--_help-tooltip-bg-color-contextual);
}

:host([orientation=bottom-right]) .tooltip {
  top: calc(100% + var(--_tooltip-spacing));
  right: 0.75rem;
}
:host([orientation=bottom-right]) .tooltip:after {
  right: 0;
  bottom: 100%;
  transform: skew(0, -40deg);
  transform-origin: top right;
}
:host([orientation=bottom-right]):host([center-position-tooltip]) .tooltip {
  top: 100%;
  right: var(--_tooltip-spacing-center);
}
:host([orientation=bottom-right]):host([overlay]) .tooltip {
  top: 100%;
}

:host([orientation=top-right]) .tooltip {
  right: 0.75rem;
  bottom: calc(100% + var(--_tooltip-spacing));
}
:host([orientation=top-right]) .tooltip:after {
  top: 100%;
  right: 0;
  transform: skew(0, 40deg);
  transform-origin: top right;
}
:host([orientation=top-right]):host([center-position-tooltip]) .tooltip {
  right: var(--_tooltip-spacing-center);
}

:host([orientation=bottom-left]) .tooltip {
  top: calc(100% + var(--_tooltip-spacing));
  left: 0.75rem;
}
:host([orientation=bottom-left]) .tooltip:after {
  bottom: 100%;
  left: 0;
  transform: skew(0, 40deg);
  transform-origin: top left;
}
:host([orientation=bottom-left]):host([center-position-tooltip]) .tooltip {
  top: 100%;
  left: var(--_tooltip-spacing-center);
}

:host([orientation=top-left]) .tooltip {
  bottom: calc(100% + var(--_tooltip-spacing));
  left: 0.75rem;
}
:host([orientation=top-left]) .tooltip:after {
  top: 100%;
  left: 0;
  transform: skew(0, -40deg);
  transform-origin: top left;
}
:host([orientation=top-left]):host([center-position-tooltip]) .tooltip {
  left: var(--_tooltip-spacing-center);
}

:host([orientation=bottom-center]) .tooltip {
  top: calc(100% - var(--_tooltip-spacing));
  left: 50%;
  transform: translateX(-50%);
}
:host([orientation=bottom-center]) .tooltip:after {
  top: -0.125rem;
  left: 50%;
  width: 0.75rem;
  height: 0.75rem;
  transform: rotate(45deg) translateX(-50%);
}

:host([orientation=top-center]) .tooltip {
  bottom: calc(100% - var(--_tooltip-spacing));
  left: 50%;
  transform: translateX(-50%);
}
:host([orientation=top-center]) .tooltip:after {
  bottom: -0.625rem;
  left: 50%;
  width: 0.75rem;
  height: 0.75rem;
  transform: rotate(45deg) translateX(-50%);
}

:host([contextual][orientation=middle-top-right]) .tooltip {
  right: calc(100% + var(--_tooltip-spacing));
  bottom: calc(100% - var(--_tooltip-spacing-center));
}
:host([contextual][orientation=middle-top-right]) .tooltip:after {
  right: 0;
  bottom: 0;
  transform: skew(40deg, 0deg);
  transform-origin: right top;
}

:host([contextual][orientation=middle-top-left]) .tooltip {
  bottom: calc(100% - var(--_tooltip-spacing-center));
  left: calc(100% + 0.625rem);
}
:host([contextual][orientation=middle-top-left]) .tooltip:after {
  bottom: 0;
  left: 0;
  transform: skew(-40deg, 0deg);
  transform-origin: left top;
}

:host([contextual][orientation=middle-bottom-left]) .tooltip {
  top: calc(100% - var(--_tooltip-spacing-center));
  left: calc(100% + var(--_tooltip-spacing));
}
:host([contextual][orientation=middle-bottom-left]) .tooltip:after {
  top: 0;
  left: 0;
  transform: skew(40deg, 0deg);
  transform-origin: left bottom;
}

:host([contextual][orientation=middle-bottom-right]) .tooltip {
  top: calc(100% - var(--_tooltip-spacing-center));
  right: calc(100% + 0.625rem);
}
:host([contextual][orientation=middle-bottom-right]) .tooltip:after {
  top: 0;
  right: 0;
  transform: skew(-40deg, 0deg);
  transform-origin: right bottom;
}

.link {
  align-self: flex-end;
  margin-top: 1rem;
  color: var(--_help-tooltip-link-color);
  cursor: pointer;
}

:host([active]) .tooltip,
:host([active]) .tooltip:after {
  background-color: var(--_help-tooltip-bg-color-pressed);
}

:host([active]) .content .link {
  color: var(--_help-tooltip-link-pressed-color);
}

:host([contextual]) .desktop.tooltip {
  background: var(--_help-tooltip-bg-color-contextual);
}
:host([contextual]) .desktop.tooltip:after {
  background: var(--_help-tooltip-bg-color-contextual);
}
:host([contextual]) .desktop {
  background: var(--_help-tooltip-bg-color-contextual);
}
:host([contextual]) .desktop .description {
  margin-top: 0;
  color: var(--_help-tooltip-color-contextual-text);
}
:host([contextual]) .desktop .heading {
  color: var(--_help-tooltip-color-contextual-text);
}
:host([contextual]) .desktop .link {
  color: var(--_help-tooltip-color-contextual-link);
}

.description {
  margin-top: 0.5rem;
  color: var(--_help-tooltip-color);
}

.heading {
  overflow: hidden;
  color: var(--_help-tooltip-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${o(l.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${o(l.medium.fontWeight)});
  line-height: var(--lineHeightTypeMedium, ${o(i.typeMedium)});
  text-overflow: ellipsis;
  white-space: nowrap;
}
`,f=t`
:host {
  --_help-tooltip-bg-color:
    var(--bbva-help-tooltip--_ambient--bg-color,
      var(--bbva-help-tooltip--custom--primary-ambient--bg-color,
        ${b("colorPrimaryEmergentMainBackgroundDefault",h)}));
  --_help-tooltip-bg-color-contextual:
    var(--bbva-help-tooltip--_ambient--bg-color-contextual,
      var(--bbva-help-tooltip--custom--primary-ambient--bg-color-contextual,
        ${b("colorSecondaryEmergentMainBackgroundDefault",h)}));
  --_help-tooltip-color:
    var(--bbva-help-tooltip--_ambient--color,
      var(--bbva-help-tooltip--custom--primary-ambient--color,
        ${b("colorPrimaryEmergentMainText",h)}));
  --_help-tooltip-color-contextual-text:
    var(--bbva-help-tooltip--_ambient--color-contextual-text,
      var(--bbva-help-tooltip--custom--primary-ambient--color-contextual-text,
        ${b("colorSecondaryEmergentMainText",h)}));
  --_help-tooltip-link-color:
    var(--bbva-help-tooltip--_ambient--link-color,
      var(--bbva-help-tooltip--custom--primary-ambient--link-color,
        ${b("colorPrimaryEmergentMainLinkDefault",h)}));
  --_help-tooltip-color-contextual-link:
    var(--bbva-help-tooltip--_ambient--color-contextual-link,
      var(--bbva-help-tooltip--custom--primary-ambient--color-contextual-link,
        ${b("colorSecondaryEmergentMainLink",h)}));
  --_help-tooltip-link-pressed-color:
    var(--bbva-help-tooltip--_ambient--link-pressed-color,
      var(--bbva-help-tooltip--custom--primary-ambient--link-pressed-color,
        ${b("colorPrimaryEmergentMainLinkPressed",h)}));
  --_help-tooltip-bg-color-pressed:
    var(--bbva-help-tooltip--_ambient--bg-color-pressed,
      var(--bbva-help-tooltip--custom--primary-ambient--bg-color-pressed,
        ${b("colorPrimaryEmergentMainBackgroundPressed",h)}));
  --_help-tooltip-overlay-bg-color:
    var(--bbva-help-tooltip--_ambient--overlay-bg-color,
      var(--bbva-help-tooltip--custom--primary-ambient--overlay-bg-color,
        ${b("colorPrimaryAltSurfaceAmbientOverlay",h)}));
  --_help-tooltip-invoker-bg-color:
    var(--bbva-help-tooltip--_ambient--invoker-bg-color,
      var(--bbva-help-tooltip--custom--primary-ambient--invoker-bg-color,
        ${b("colorPrimaryAltSurfaceAmbientDefault",h)}));
}
`;const x=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-help-tooltip--_ambient--bg-color: initial;
    --bbva-help-tooltip--_ambient--color: initial;
    --bbva-help-tooltip--_ambient--link-color: initial;
    --bbva-help-tooltip--_ambient--link-pressed-color: initial;
    --bbva-help-tooltip--_ambient--bg-color-pressed: initial;
    --bbva-help-tooltip--_ambient--overlay-bg-color: initial;
    --bbva-help-tooltip--_ambient--invoker-bg-color: initial;
    --bbva-help-tooltip--_ambient--bg-color-contextual: initial;
    --bbva-help-tooltip--_ambient--color-contextual-text: initial;
    --bbva-help-tooltip--_ambient--color-contextual-link: initial;
  }
`,S=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-help-tooltip--_ambient--bg-color: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--bg-color,
      ${b("colorPrimaryAltEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--color,
      ${b("colorPrimaryAltEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--link-color: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--link-color,
      ${b("colorPrimaryAltEmergentMainLinkDefault",h)}
    );

    --bbva-help-tooltip--_ambient--link-pressed-color: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--link-pressed-color,
      ${b("colorPrimaryAltEmergentMainLinkPressed",h)}
    );

    --bbva-help-tooltip--_ambient--bg-color-pressed: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--bg-color-pressed,
      ${b("colorPrimaryAltEmergentMainBackgroundPressed",h)}
    );

    --bbva-help-tooltip--_ambient--bg-color-contextual: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--bg-color-contextual,
        ${b("colorSecondaryEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-text: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--color-contextual-text,
        ${b("colorSecondaryEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-link: var(
      --bbva-help-tooltip--custom--primary-alt-ambient--color-contextual-link,
        ${b("colorSecondaryEmergentMainLink",h)}
    );
  }
`,w=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-help-tooltip--_ambient--bg-color: var(
      --bbva-help-tooltip--custom--secondary-ambient--bg-color,
      ${b("colorSecondaryEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color: var(
      --bbva-help-tooltip--custom--secondary-ambient--color,
      ${b("colorSecondaryEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--link-color: var(
      --bbva-help-tooltip--custom--secondary-ambient--link-color,
      ${b("colorSecondaryEmergentMainLinkDefault",h)}
    );

    --bbva-help-tooltip--_ambient--link-pressed-color: var(
      --bbva-help-tooltip--custom--secondary-ambient--link-pressed-color,
      ${b("colorSecondaryEmergentMainLinkPressed",h)}
    );

    --bbva-help-tooltip--_ambient--bg-color-pressed: var(
      --bbva-help-tooltip--custom--secondary-ambient--bg-color-pressed,
      ${b("colorSecondaryEmergentMainBackgroundPressed",h)}
    );

    --bbva-help-tooltip--_ambient--invoker-bg-color: var(
      --bbva-help-tooltip--custom--secondary-ambient--invoker-bg-color,
      ${o(r.primaryCore)}
    );

    --bbva-help-tooltip--_ambient--bg-color-contextual: var(
      --bbva-help-tooltip--custom--secondary-ambient--bg-color-contextual,
        ${b("colorSecondaryEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-text: var(
      --bbva-help-tooltip--custom--secondary-ambient--color-contextual-text,
        ${b("colorSecondaryEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-link: var(
      --bbva-help-tooltip--custom--secondary-ambient--color-contextual-link,
        ${b("colorSecondaryEmergentMainLink",h)}
    );
  }
`,E=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-help-tooltip--_ambient--bg-color: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--bg-color,
      ${b("colorSecondaryAltEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--color,
      ${b("colorSecondaryAltEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--link-color: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--link-color,
      ${b("colorSecondaryAltEmergentMainLinkDefault",h)}
    );

    --bbva-help-tooltip--_ambient--link-pressed-color: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--link-pressed-color,
      ${b("colorSecondaryAltEmergentMainLinkPressed",h)}
    );

    --bbva-help-tooltip--_ambient--bg-color-pressed: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--bg-color-pressed,
      ${b("colorSecondaryAltEmergentMainBackgroundPressed",h)}
    );

    --bbva-help-tooltip--_ambient--invoker-bg-color: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--invoker-bg-color,
      ${o(r.primaryCore)}
    );

    --bbva-help-tooltip--_ambient--bg-color-contextual: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--bg-color-contextual,
        ${b("colorSecondaryAltEmergentMainBackgroundDefault",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-text: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--color-contextual-text,
        ${b("colorSecondaryAltEmergentMainText",h)}
    );

    --bbva-help-tooltip--_ambient--color-contextual-link: var(
      --bbva-help-tooltip--custom--secondary-alt-ambient--color-contextual-link,
        ${b("colorSecondaryAltEmergentMainLink",h)}
    );
  }
`;const $=m([Object.freeze({__proto__:null,primary:x,primaryAlt:S,secondary:w,secondaryAlt:E}),d]),T=Object.values($);class P extends(v(u(y(n)))){static get is(){return"bbva-help-tooltip"}static get scopedElements(){return{"bbva-type-text":g}}static get properties(){return{autoScrollActive:{type:Boolean,attribute:"auto-scroll-active"},autoScrollTime:{type:Number,attribute:"auto-scroll-time"},autoScrollPosition:{type:Number,attribute:"auto-scroll-position"},activeObserverScrollTooltipOverlay:{type:Boolean,attribute:"active-observer-scroll-tooltip-overlay"},autoScrollGetBoundingDetail:{type:String,attribute:"auto-scroll-get-bounding-detail"},autoScrollExtraBoundingDetailPosition:{type:Number,attribute:"auto-scroll-extra-bounding-detail-position"},heading:{type:String},headerTitleSize:{type:String,attribute:"header-title-size"},description:{type:String},linkText:{type:String,attribute:"link-text"},linkHref:{type:String,attribute:"link-href"},linkTarget:{type:String,attribute:"link-target"},verticalPlacement:{type:String,attribute:"vertical-placement"},horizontalPlacement:{type:String,attribute:"horizontal-placement"},opened:{type:Boolean,reflect:!0},centerPositionTooltip:{type:Boolean,attribute:"center-position-tooltip"},contextual:{type:Boolean},_autoVerticalPlacement:{type:String},_activeObserverScrollTooltipOverlay:{type:Boolean,state:!0},_desktop:{type:Boolean,state:!0},avoidClickable:{type:Boolean,attribute:"avoid-clickable"},avoidOpenedFocusIn:{type:Boolean,attribute:"avoid-opened-focus-in"},avoidOpenedMouseOver:{type:Boolean,attribute:"avoid-opened-mouse-over"},avoidAutoPositionTooltip:{type:Boolean,attribute:"avoid-auto-position-tooltip"},scrollElement:{type:String,attribute:"scroll-element"},_cleanScrollElement:{type:Object,state:!0}}}constructor(){super(),this.headerTitleSize="S",this.verticalPlacement="top",this.horizontalPlacement="left",this._autoVerticalPlacement="bottom",this.centerPositionTooltip=!1,this.contextual=!1,this._active=!1,this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.avoidClickable=!1,this.avoidAutoPositionTooltip=!1,this.autoScrollActive=!1,this.autoScrollTime=2e3,this.activeObserverScrollTooltipOverlay=!1,this._activeObserverScrollTooltipOverlay=!1,this.autoScrollPosition=0,this.autoScrollGetBoundingDetail="top",this.autoScrollExtraBoundingDetailPosition=0,this.avoidOpenedFocusIn=!1,this.avoidOpenedMouseOver=!1,this.scrollElement="window",this._cleanScrollElement=window}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._invoker=this.shadowRoot.querySelector(".invoker"),this._tooltip=this.shadowRoot.querySelector(".tooltip"),this.activeObserverScrollTooltipOverlay&&(this._observer=new _(this,{target:[this._invoker],callback:this._observerChange.bind(this),config:{threshold:.5},skipInitial:!1}))}_observerChange(t){this._activeObserverScrollTooltipOverlay=!t[0].isIntersecting}async updated(t){if(super.updated&&super.updated(t),t.has("opened")&&this._handleOpened(),t.has("verticalPlacement")||t.has("horizontalPlacement")||t.has("_autoVerticalPlacement")){const t=`${this.verticalPlacement||this._autoVerticalPlacement}-${this.horizontalPlacement}`;this.setAttribute("orientation",t)}}async _handleOpened(){this.opened?(await this.updateComplete,this._addListeners(),this.avoidAutoPositionTooltip||this._checkBounds(),this.autoScrollActive&&this._smoothScroll(this._invoker)):this._removeListeners()}_resolveElement(t){this._cleanScrollElement=t.split(".").reduce(((t,o)=>{if(o.includes("querySelector")){const e=o.match(/querySelector\(['"](.+?)['"]\)/);return e?t.querySelector(e[1]):void 0}if(o.includes("assignedElements")){const e=o.match(/\[(\d+)\]/),i=e?parseInt(e[1],10):null;return t.assignedElements()[i]}if(o.includes("shadowRoot"))return t.shadowRoot;if(o.includes("children")){const e=o.match(/\[(\d+)\]/),i=e?parseInt(e[1],10):null;return t.children[i]}return t&&t[o]}),window)}_smoothScroll(t){this._resolveElement(this.scrollElement);const o=this._cleanScrollElement,e=this._calculateTargetPosition(t),i="window"===this.scrollElement?null==o?void 0:o.scrollY:null==o?void 0:o.scrollTop;let l=null;const a=t=>{null===l&&(l=t);const r=t-l,n=this._ease(r,i,e);o.scrollTo(0,n),r<this.autoScrollTime&&requestAnimationFrame(a)};requestAnimationFrame(a)}_calculateTargetPosition(t){return this.autoScrollPosition||t.getBoundingClientRect()[this.autoScrollGetBoundingDetail]+this.autoScrollExtraBoundingDetailPosition}_ease(t,o,e){let i=t;return i/=this.autoScrollTime/2,i<1?e/2*i*i+o:(i-=1,-e/2*(i*(i-2)-1)+o)}static get styles(){return[k,f,T,s("bbva-help-tooltip-shared-styles")]}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"))}_isValidKey(t){return"Enter"===t||" "===t||"Escape"===t}onClick(){const t=this.shadowRoot.getElementById("tooltip");t.addEventListener("mousedown",(()=>{this.active=!0})),t.addEventListener("mouseup",(()=>{this.active=!1})),this._linkClick()}onKeyDown(t){this.linkText&&this._isValidKey(t.key)&&(this.active=!0,this._linkClick())}onKeyUp(t){this.linkText&&this._isValidKey(t.key)&&this.active&&(this.active=!1),this._isValidKey(t.key)&&"Escape"===t.key&&(this.opened=!1,this.setAttribute("style","--_help-tooltip-invoker-bg-color: transparent;"))}_checkBounds(){const t=this._invoker.getBoundingClientRect(),o=t.top,e=t.bottom,i=t.left,l=t.right,a=this._tooltip.offsetWidth,r=this._tooltip.offsetHeight,n=window.innerWidth,s=window.innerHeight,c={top:{check:o<r,update:"bottom"},"middle-top":{check:o<r,update:"middle-bottom"},"middle-bottom":{check:s-e<r,update:"middle-top"},bottom:{check:s-e<r,update:"top"}},p=this.verticalPlacement;c[p].check&&(this.verticalPlacement=c[p].update);const b={left:{check:i+a>n,update:"right"},right:{check:l-a<0,update:"left"},center:{check:i>=a/2&&n-l>=a/2,update:"center"}},h=this.horizontalPlacement;b[h].check&&(this.horizontalPlacement=b[h].update)}get _fireonclick(){return this.linkText&&""!==this.linkText}_addListeners(){document.addEventListener("keydown",this._windowEsc),this._fireonclick&&document.addEventListener("click",this._windowClick)}_removeListeners(){document.removeEventListener("keydown",this._windowEsc),this._fireonclick&&document.removeEventListener("click",this._windowClick)}_overlayClick(){this.dispatchEvent(new CustomEvent("help-tooltip-overlay-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("help-tooltip-link-click",{detail:!0,bubbles:!0,composed:!0}))}headerTitleTemplate(){return this.headerTitleSize?c`<bbva-type-text
          class="heading"
          size="${this.headerTitleSize}"
          font-weight="500"
          unset
          ellipsis
          data-tag-name="bbva-type-text"
          .text="${this.heading}"
        ></bbva-type-text>`:""}descriptionTemplate(){return this.description?c`<bbva-type-text
          class="description"
          size="S"
          unset
          ellipsis
          lines="3"
          .text="${this.description}"
        ></bbva-type-text>`:""}linkTemplate(){return this.linkText?c`<bbva-type-text
          variant="spotlight"
          size="2XS"
          class="link"
          elipsis
          lines="1"
          text="${this.linkText}"
          unset
        ></bbva-type-text>`:c``}_windowClick(t){t.preventDefault(),t.stopPropagation(),this.opened=!1,this._hasFocus=!1}_windowEsc(t){"Esc"===t.key&&(t.preventDefault(),t.stopPropagation(),this.opened=!1,this._hasFocus=!1)}_onClick(){this._fireonclick&&!this.avoidClickable&&(this.opened=!this.opened,this.dispatchEvent(new CustomEvent("help-tooltip-invoker-click",{detail:{opened:this.opened},bubbles:!0,composed:!0})))}_onMouseOver(){this._fireonclick||(this.opened=!this.avoidOpenedMouseOver,this.dispatchEvent(new CustomEvent("help-tooltip-invoker-mouse-over",{detail:!0,bubbles:!0,composed:!0})))}_onMouseOut(){this._fireonclick||this._hasFocus||(this.opened=!1,this.dispatchEvent(new CustomEvent("help-tooltip-invoker-mouse-out",{detail:!0,bubbles:!0,composed:!0})))}_onFocusIn(){this._hasFocus=!0,this._fireonclick||(this.opened=!this.avoidOpenedFocusIn)}_onFocusOut(){this._hasFocus=!1,this._fireonclick||(this.opened=!1)}render(){return c`
      <div
        id="overlay"
        class="overlay ${this._activeObserverScrollTooltipOverlay?"overlay-observer":""}"
        @click="${this._overlayClick}"
        @keyup="${this._overlayClick}"
      ></div>
      <div class="wrapper">
        <div
          class="invoker"
          @click="${this._onClick}"
          @focusin="${this._onFocusIn}"
          @focusout="${this._onFocusOut}"
          @mouseout="${this._onMouseOut}"
          @mouseover="${this._onMouseOver}"
        >
          <slot name="invoker" aria-describedby="tooltip" role="presentation"></slot>
        </div>
        <div
          class="tooltip ${p({desktop:this._desktop,"tooltip-observer":!this._activeObserverScrollTooltipOverlay&&this.activeObserverScrollTooltipOverlay})}"
          id="tooltip"
          role="tooltip"
          tabindex="${this.linkText?0:-1}"
          @click="${this.linkText&&this.onClick}"
          @keyup="${this._onKeyUp}"
          @keydown="${this._onKeyDown}"
          data-tag-name="tooltip"
        >
          <div class="content">
            ${this.headerTitleTemplate()} ${this.descriptionTemplate()}
            <slot></slot>
            ${this.linkTemplate()}
          </div>
        </div>
      </div>
    `}}export{P as B,$ as b};
