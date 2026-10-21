import{z as t,a8 as i,ac as e,ad as a,ab as o,ar as r,a9 as s,aa as n,b_ as l,a as c,aJ as h,cE as d,F as p,cF as v,b$ as b,ak as m,bx as g,h as f,bt as u,c0 as _,cG as y,g as k,ap as w,an as $,L as x,aq as S,bw as L,av as A,bl as I,cq as C,ci as T,cT as X,ah as W,cV as P,cW as z,cX as E,cY as R}from"./952f98a9.js";import{C as q}from"./216055dc.js";import{bh as D}from"./7f3d7ca9.js";const N=new r;var M=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${i(e.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${i(a.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(o.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${i(s.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${i(s.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

label {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(n.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${N.mediaRules()}`;var O=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new r).mediaRules()}`;const B=new r;const H={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${i(s.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${B.mediaRules()}`}
    ${l.dark}
  `,light:t`
    ${O}
    ${l.light}
  `};class F extends(c(h(d))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":p,"bbva-core-image":v,"bbva-badge-notification":b}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,M,m("bbva-button-action-shared-styles"),g(),H.light,H.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?f`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?f`<div class="app-pay-icon">${u[this.appPayIcon]}</div>`:f`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return f`
      ${this.notifications?f`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:f` ${this.getIcon} `}
      <label onclick="void(0)"> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}}k("colors.primarySubdued"),k("colors.primaryCoreLight");const j=new r;var V=t`:host {
  --_list-swipe-invoker-bg-color: var(--bbva-list-swipe-dark-mode-invoker-bg-color, var(--bbva-list-swipe-invoker-bg-color, var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)})));
  --_list-swipe-operative-bg-color: var(--bbva-list-swipe-dark-mode-operative-bg-color, var(--bbva-list-swipe-operative-bg-color, var(--colorsPrimaryCore, ${i(s.primaryCore)})));
  --_list-swipe-informative-bg-color: var(--bbva-list-swipe-dark-mode-informative-bg-color, var(--bbva-list-swipe-informative-bg-color, var(--colorsPrimaryMedium, ${i(s.primaryMedium)})));
  --_list-swipe-actions-item-operative-error-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-bg-color, var(--bbva-list-swipe-actions-item-operative-error-bg-color, var(--colorsTertiaryType1Medium, ${i(s.tertiaryType1Medium)})));
  --_list-swipe-actions-item-operative-error-active-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-active-bg-color, var(--bbva-list-swipe-actions-item-operative-error-active-bg-color, var(--colorsTertiaryType1Dark, ${i(s.tertiaryType1Dark)})));
  --_list-swipe-informative-bg-color-active: var(--bbva-list-swipe-dark-mode-informative-bg-color-active, var(--bbva-list-swipe-informative-bg-color-active, var(--colorsPrimaryCoreLight, ${i(s.primaryCoreLight)})));
  --_list-swipe-operative-bg-color-active: var(--bbva-list-swipe-dark-mode-operative-bg-color-active, var(--bbva-list-swipe-operative-bg-color-active, var(--colorsPrimaryCoreDark, ${i(s.primaryCoreDark)})));
  --_list-swipe-button-action-color: var(--bbva-list-swipe-dark-mode-button-action-color, var(--bbva-list-swipe-button-action-color, var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)})));
  display: block;
  box-sizing: border-box;
  width: 100%;
  position: relative;
  overflow: hidden;
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

:host([dragging]) {
  user-select: none;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  top: 0;
  left: 0;
  z-index: 1;
}
.left .sr-only {
  right: 4.0625rem;
  left: auto;
}

.invoker {
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
  position: relative;
  background-color: var(--_list-swipe-invoker-bg-color);
  will-change: transform;
  transform: translate3d(var(--_translate), 0, 0);
  z-index: 1;
}
.invoker.transition {
  transition: transform 0.2s;
}
.invoker.right {
  transform: translate3d(var(--_informative-width), 0, 0);
}
.invoker.left {
  transform: translate3d(var(--_operative-width), 0, 0);
}

:host([focus-visible]) .invoker:focus {
  outline-offset: -1px;
}

:host([loading]):after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${i(s.primaryCore)}))) 50%);
  background-color: var(--bbva-list-swipe-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, var(--colorsPrimaryCoreLight, ${i(s.primaryCoreLight)})));
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 10% 20px, calc(10% - 8px) 48px, 37% 20px, calc(37% + 16px) 48px, 63% 20px, calc(63% + 40px) 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host([animate]:not([opening])) .invoker {
  will-change: transform;
  transform: translate3d(initial, 0, 0);
}
:host([animate]:not([opening])) .invoker:not(.informative) {
  animation: panLeft 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker:not(.informative).large {
  animation-name: panLeftLarge;
}
:host([animate]:not([opening])) .invoker.informative {
  animation: panRight 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker.informative.large {
  animation-name: panRightLarge;
}

.actions-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}

[data-tag-name=bbva-button-action] {
  width: 5.5rem;
  max-width: none;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(n.spacer)}))) / 16) * 1rem);
  color: var(--_list-swipe-button-action-color);
}
[data-tag-name=bbva-button-action][aria-disabled=true] {
  opacity: 1;
}

.actions {
  position: absolute;
  top: 0;
  height: 100%;
  display: flex;
  align-items: center;
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
}
.actions-informative {
  left: 0;
  background-color: var(--_list-swipe-informative-bg-color);
}
.actions-informative [active] {
  background-color: var(--_list-swipe-informative-bg-color-active);
}
.actions-operative {
  right: 0;
  background-color: var(--_list-swipe-operative-bg-color);
}
.actions-operative [active] {
  background-color: var(--_list-swipe-operative-bg-color-active);
}
.actions-operative [warning] {
  background-color: var(--_list-swipe-actions-item-operative-error-bg-color);
}
.actions-operative [warning] [active] {
  background-color: var(--_list-swipe-actions-item-operative-error-active-bg-color);
}
.right-dir .actions-operative, .left-dir .actions-informative {
  visibility: hidden;
}
.actions-list {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  height: 100%;
}
.actions-item {
  margin: 0;
  padding: 0;
  display: flex;
  align-items: center;
}
.actions-item [data-tag-name=bbva-button-action] {
  height: 100%;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
@keyframes panLeft {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-86px);
  }
  30% {
    transform: translateX(-86px);
  }
  40% {
    transform: translateX(-86px);
  }
  50% {
    transform: translateX(-86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panLeftLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-172px);
  }
  30% {
    transform: translateX(-172px);
  }
  40% {
    transform: translateX(-172px);
  }
  50% {
    transform: translateX(-172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRight {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(86px);
  }
  30% {
    transform: translateX(86px);
  }
  40% {
    transform: translateX(86px);
  }
  50% {
    transform: translateX(86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRightLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(172px);
  }
  30% {
    transform: translateX(172px);
  }
  40% {
    transform: translateX(172px);
  }
  50% {
    transform: translateX(172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
${j.mediaRules()}`;class U extends(w(c($(x)))){static get is(){return"bbva-list-swipe"}static get scopedElements(){const t=[F];return U.scopedElementsFromClasses(t)}static get properties(){return{informativeActions:{type:Array,attribute:"informative-actions"},operativeActions:{type:Array,attribute:"operative-actions"},threshold:{type:Number},iconSize:{type:Number,attribute:"icon-size"},opening:{type:String},animate:{type:Boolean,reflect:!0},_transition:{type:Boolean},_translate:{type:Number},_operativeWidth:{type:Number},_informativeWidth:{type:Number},_swipeDirectionRight:{type:Boolean},_swipeDirectionLeft:{type:Boolean},_opened:{type:Boolean},_textStatus:{type:String},_firstTime:{type:String}}}constructor(){super(),this.operativeActions=[],this.informativeActions=[],this.threshold=.4,this.iconSize=24,this._transition=!0,this._translate=0,this.opening="",this._operativeWidth=0,this._informativeWidth=0,this._swipeDirectionRight=!1,this._swipeDirectionLeft=!1,this._opened=!1,this.animate=!1,this._accessibilityButtonActions="bbva-list-swipe-accessibility-button-actions",this._open="bbva-list-swipe-open",this._close="bbva-list-swipe-close",this._firstTime=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),requestAnimationFrame((()=>{this._informativeWidth=this._informative.offsetWidth,this._operativeWidth=this._operative.offsetWidth})),this._invoker=this.shadowRoot.querySelector(".invoker"),this._srOnlySelector=this._invoker.querySelector(".sr-only"),S(this._invoker,"track",(t=>this._onTrack(t))),L(this._invoker,"pan-y")}updated(t){super.updated&&super.updated(t),this._informative=this.shadowRoot.querySelector(".actions-informative"),this._operative=this.shadowRoot.querySelector(".actions-operative"),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),U._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}),this._defaultLeftOpened(),this._defaultRightOpened(),t.has("opening")&&this.opening&&(this._opened=!0,this._swipeDirectionRight="right"===this.opening,this._rightOpened(),this._leftOpened(),this._firstTime=!0),this._contextualTextManager(),this.opening||(this._informativeItems.length>0&&(U._hide(this._informative),this._informativeItems[0].blur()),this._operativeItems.length>0&&(U._hide(this._operative),this._operativeItems[0].blur())),(this.operativeActions.length>1||this.informativeActions.length>1&&0===this.operativeActions.length&&!this.opening)&&this._invoker.classList.add("large"),this.informativeActions.length>0&&0===this.operativeActions.length&&this._invoker.classList.add("informative")}static _actionItemsState({informative:t,operative:i,tabindex1:e,tabindex2:a,ariadisabled1:o,ariadisabled2:r}){t.forEach((t=>{t.setAttribute("tabindex",e),t.setAttribute("aria-disabled",o)})),i.forEach((t=>{t.setAttribute("tabindex",a),t.setAttribute("aria-disabled",r)}))}static _show(t){t&&t.removeAttribute("aria-hidden")}static _hide(t){t&&t.setAttribute("aria-hidden","true")}static get styles(){return[g(".invoker:focus"),V,m("bbva-list-swipe-shared-styles"),H.dark]}_defaultLeftOpened(){this._firstTime&&"left"===this.opening&&U._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"})}_defaultRightOpened(){this._firstTime&&"right"===this.opening&&U._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"})}_leftOpened(){"left"===this.opening&&this._opened&&(this._operativeItems.length>0||0===this._informativeItems.length)&&(U._show(this._operative),U._hide(this._informative),this._operativeItems[0].focus(),U._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"}))}_rightOpened(){"right"===this.opening&&this._opened&&(this._informativeItems.length>0||0===this._operativeItems.length)&&(U._show(this._informative),U._hide(this._operative),this._informativeItems[0].focus(),U._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}))}_contextualTextManager(){this._opened?this._textStatus=this.t(this._close):this._textStatus=this.t(this._open)}render(){const t={"--_translate":`${this._translate}px`,"--_operative-width":-1*this._operativeWidth+"px","--_informative-width":`${this._informativeWidth}px`},i={transition:this._transition,right:"right"===this.opening,left:"left"===this.opening},e={"right-dir":this._swipeDirectionRight,opened:this._opened};return f`
      <div
        class="invoker ${A(i)}"
        style="${I(t)}"
        @transitionend="${this._onInvokerTransitionEnd}"
        @keydown="${this._onInvokerKeydown}"
      >
        <slot name="invoker"></slot>
        ${this.informativeActions.length>0||this.operativeActions.length>0?f`<span class="sr-only"
              >${this.t(this._accessibilityButtonActions,{status:this._textStatus})}</span
            >`:""}
      </div>

      <div class="actions-wrapper ${A(e)}">
        <div class="actions actions-informative">
          ${this.informativeActions.length?f`
                <ul class="actions-list">
                  ${this.informativeActions.map(((t,i)=>this._actionItems(t,i,"informative")))}
                </ul>
              `:""}
        </div>
        <div class="actions actions-operative">
          ${this.operativeActions.length?f`
                <ul class="actions-list">
                  ${this.operativeActions.map(((t,i)=>this._actionItems(t,i,"operative")))}
                </ul>
              `:""}
        </div>
      </div>
    `}_actionItems(t,i,e){return f`
      <li class="actions-item" ?warning="${t.warning}">
        <bbva-button-action
          ambient="dark"
          .icon="${t.icon}"
          .iconSize="${this.iconSize}"
          .label="${t.label}"
          @click="${()=>this._onActionClick(t,i,e)}"
        ></bbva-button-action>
      </li>
    `}_onTrack(t){var i;if(null!=t&&null!==(i=t.detail)&&void 0!==i&&i.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dx);break;default:this._trackX(t.detail.dx)}}_trackStart(){this.setAttribute("dragging",""),this._invokerWidth=this._invoker.offsetWidth,this._opened=!0,this._operativeWidth=this._operative.offsetWidth,this._informativeWidth=this._informative.offsetWidth,this._setTrackReferences(this.opening),this.opening="",this._translate=this._startingPoint,this._transition=!1}_setTrackReferences(t){return"right"===t?(this._rightLimit=0,this._leftLimit=0-this._operativeWidth-this._informativeWidth,this._leftThreshold=0-this._informativeWidth-this._operativeWidth*this.threshold,this._rightThreshold=0-this._informativeWidth*this.threshold,this._startingPoint=this._informativeWidth,void(this._midThreshold=-1*this._informativeWidth)):"left"===t?(this._rightLimit=this._informativeWidth+this._operativeWidth,this._leftLimit=0,this._leftThreshold=this._operativeWidth*this.threshold,this._rightThreshold=this._operativeWidth+this._informativeWidth*this.threshold,this._startingPoint=-1*this._operativeWidth,void(this._midThreshold=this._operativeWidth)):(this._rightLimit=this._informativeWidth,this._leftLimit=0-this._operativeWidth,this._leftThreshold=0-this._operativeWidth*this.threshold,this._rightThreshold=this._informativeWidth*this.threshold,this._startingPoint=0,void(this._midThreshold=0))}_trackX(t){this._translate=this._startingPoint+Math.max(this._leftLimit,Math.min(t,this._rightLimit)),this._swipeDirectionRight=t>=this._midThreshold}_trackEnd(t){return this.removeAttribute("dragging",""),this._swipeDirectionRight=t>=this._midThreshold,this._transition=!0,this._translate=0,t<this._leftThreshold?(this.opening="left",void this._invokerTrackOpening()):t>this._rightThreshold?(this.opening="right",void this._invokerTrackOpening()):void(this.opening="")}_invokerTrackOpening(){this.dispatchEvent(new CustomEvent(`bbva-list-swipe-track-${this.opening}`,{detail:this,bubbles:!0,composed:!0}))}_onInvokerTransitionEnd(){this.opening||(this._opened=!1,this._swipeDirectionRight=!1)}_onActionClick(t,i,e){this.dispatchEvent(new CustomEvent("list-swipe-action-click",{detail:{item:t,index:i,type:e},bubbles:!0,composed:!0}))}_onInvokerKeydown(t){t.composedPath()[0]===this._invoker&&("arrowright"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("right")),"arrowleft"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("left")))}_moveInvoker(t){const i=this.opening;if(t===i)return;let e;this._trackStart(),"right"===t&&(e="left"===i?this._operativeWidth-1:this._rightLimit),"left"===t&&(e="right"===i?0-this._informativeWidth+1:this._leftLimit),this._trackEnd(e)}}customElements.define(U.is,U);var K=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.notification-read {
  --bbva-list-highlight-highlighted-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --_list-highlight-highlighted-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
}

[data-tag-name=bbva-list-highlight] {
  --bbva-badge-category-icon-color: var(--colorsPrimaryMedium, ${i(s.primaryMedium)});
}

[data-tag-name=bbva-list-swipe] {
  --_actions-item-operative-error-bg-color: var(--colorsTertiaryType1Dark, ${i(s.tertiaryType1Dark)});
  --_operative-bg-color: var(--colorsPrimaryMedium, ${i(s.primaryMedium)});
  --bbva-badge-category-icon-color: var(--colorsPrimaryMedium, ${i(s.primaryMedium)});
}

.icon-sales {
  --bbva-badge-category-icon-color: var(--bbva-darker-purple) ;
}

.black-badge {
  --bbva-badge-default-color: var(--colorsColorsSecondary600, ${i(s.colorsSecondary600)});
}

.golden-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType3Dark, ${i(s.tertiaryType3Dark)});
  --bbva-list-highlight-heading-dark-mode-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-amount-dark-mode-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
}

.black-list-header {
  --bbva-list-header-heading-color: var(--colorsColorsSecondary600, ${i(s.colorsSecondary600)});
}
`;class G extends(c(q(x))){static get is(){return"bbva-aggregation-swipe-list"}static get scopedElements(){return{"bbva-list-highlight":D,"bbva-list-movement":C,"bbva-list-swipe":U}}static get properties(){return{notifications:{type:Array},operativeActions:{type:Array,attribute:"operative-actions"},language:{type:String},type:{type:String},hideHeader:{type:Boolean},showDivider:{type:Boolean},notificationsList:{type:Boolean}}}constructor(){super(),import("./952f98a9.js").then((function(t){return t.hC})).then((({BbvaDivider:t})=>this.defineScopedElement("bbva-divider",t))),import("./7f3d7ca9.js").then((function(t){return t.ds})).then((({BbvaHeaderCategory:t})=>this.defineScopedElement("bbva-header-category",t))),this.notifications=[],this.operativeActions=[{icon:T(),label:"Eliminar",warning:!0}],this.type="highlight",this.hideHeader=!1,this.showDivider=!1,this.notificationsList=!1,T(),X(),W(),P(),z(),E(),R()}static get styles(){return[K,m("bbva-aggregation-swipe-list-shared-styles")]}_clickOnNotification(t){this.dispatchEvent(new CustomEvent("view-notification",{bubbles:!0,composed:!0,detail:t})),this._swipeAllHide()}_deleteNotification(t,i){const e=i.detail.item.customEvent||"delete-notification";this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t})),this._swipeAllHide()}_swipeAllHide(){const t=this.shadowRoot.querySelectorAll("bbva-list-swipe");t.forEach(((i,e)=>{t[e].opening="right"}))}_swipeOnNotification(t){const i=this.shadowRoot.querySelectorAll("bbva-list-swipe");i.forEach(((e,a)=>{i[a].id!==t.sendDate&&(i[a].opening="right")}))}_notifications(){return this.notifications.map((t=>f`
      ${this.hideHeader?f``:this._addNotificationsHeader(t)}
      ${this._addNotificationsList(t.notifications)}
    `))}_addNotificationsHeader(t){return f`
      <bbva-header-category
        text="${t.date}"
        variant="date"
      >
      </bbva-header-category>
    `}_highlightList(t){return f`
      ${"number"==typeof t.amount?f`
        <bbva-list-highlight
          data-id="${this.notificationsList?t.id:""}"
          id="${this.notificationsList?t.id:t.name}"
          .icon="${t.headerIcon}"
          icon-aria-label="${t.iconArialLabel}"
          class="${t.read?"notification-read":""} ${t.colorIcon?"icon-sales":""} ${t.blackBadge?"black-badge":""} ${t.goldenBadge?"golden-badge":""} ${t.blackListHeader?"black-list-header":""}"
          heading="${t.name}"
          link="${t.link}"
          slot="invoker"
          subtitles='${t.description}'
          category="${t.type}"
          category-icon="${t.icon}"
          text-category="${t.type}"
          badge="${t.badge}"
          amount="${t.amount}"
          language="${this.language}"
          local-currency="${t.currencyAmount}"
          currency-code="${t.currencyAmount}"
          @click="${()=>this._clickOnNotification(t)}"
        >
      </bbva-list-highlight>
      `:f`
      <bbva-list-highlight
        id="notification-text-${t.name}"
        class="${t.read?"notification-read":""} ${t.colorIcon?"icon-sales":""}"
        heading="${t.name}"
        .icon="${t.headerIcon}"
        icon-aria-label="Email"
        link="${t.link}"
        subtitles='${t.description}'
        category="${t.type}"
        text-category="${t.type}"
        category-icon="${t.icon}"
        slot="invoker"
        @click="${()=>this._clickOnNotification(t)}"
      ></bbva-list-highlight>
    `}`}_movementList(t){return f`
      <bbva-list-movement
        slot="invoker"
        card-title=${t.name}
        description=${t.description}
        .moreInfo=${t.type}
        @list-movement-item-click=${()=>this._clickOnNotification(t)}
      ></bbva-list-movement>
    `}_addNotificationsList(t){const i=t.length,e={highlight:"_highlightList",movement:"_movementList"}[this.type];return t.map(((t,a)=>f`
      <bbva-list-swipe id="${this.notificationsList?t.id:t.sendDate}"
        .operativeActions="${t.operativeActions?t.operativeActions:this.operativeActions}"
        @list-swipe-action-click="${i=>this._deleteNotification(t,i)}"
        @bbva-list-swipe-track-left="${()=>this.notificationsList?"":this._swipeOnNotification(t)}"
        @focus-visible-changed="${()=>this._swipeAllHide()}"
        >
        ${this[e](t)}
      </bbva-list-swipe>
      ${this.showDivider&&a!==i-1?f`<bbva-divider size="fit"></bbva-divider>`:f`<bbva-divider size="full"></bbva-divider>`}`))}render(){return f`
      <div class="container">
        ${this._notifications()}
      </div>
    `}}customElements.define(G.is,G);
