import{z as e,a8 as t,a9 as a,a as r,aJ as i,L as s,ak as o,h as d,g as n,ar as l,aa as c,aI as g,cO as b,b1 as h,dY as p,bD as v,bE as u,F as m,ag as f,dJ as y,aY as _,ad as k,an as x,aw as S}from"./952f98a9.js";import"./7f3d7ca9.js";import{f as $,c as E}from"./7fefad8c.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";var C=e`[ambient^=light] {
  --bbva-draggable-default-bg-placeholder: initial;
}
`;const L={dark:e`
    ${e`[ambient^=dark] {
  --bbva-draggable-default-bg-placeholder: var(--colorsPrimaryCore, ${t(a.primaryCore)});
}
`}
  `,light:e`
    ${C}
  `};var w=e`:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  min-height: 2.5rem;
  --_bbva-draggable-default-bg-placeholder: var(--bbva-draggable-default-dark-mode-bg-placeholder, var(--bbva-draggable-default-bg-placeholder, var(--colorsSecondary200, ${t(a.secondary200)})));
}
:host ::slotted(.placeholder) {
  background-color: var(--_bbva-draggable-default-bg-placeholder);
}

:host(:not([disabled])) {
  cursor: move;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;let P=0,D=0;class A extends(r(i(s))){static get is(){return"bbva-draggable-default"}constructor(){super(),this._draggingStarted=!1,this._draggingEle=null}static get styles(){return[super.styles,w,L.light,L.dark,o("bbva-draggable-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("dragover",this._onDragOver),this.addEventListener("touchmove",this._onDragOver),this.addEventListener("dragend",this._onDragEnd),this.addEventListener("touchend",this._onDragEnd),this.hasAttribute("role")||this.setAttribute("role","listbox")}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("dragover",this._onDragOver),this.removeEventListener("touchmove",this._onDragOver),this.removeEventListener("dragend",this._onDragEnd),this.removeEventListener("touchend",this._onDragEnd)}static swap(e,t){const a=e.parentNode,r=e.nextSibling===t?e:e.nextSibling;t.parentNode.insertBefore(e,t),a.insertBefore(t,r)}static isAbove(e,t){const a=e.getBoundingClientRect(),r=t.getBoundingClientRect();return a.top+a.height/2<r.top+r.height/2}static isOut(e,t,a){const r=e.getBoundingClientRect();return!(r.left<=t&&t<=r.right&&r.top<=a&&a<=r.bottom)}_onDragOver(e){if(e.preventDefault(),e.stopPropagation(),this._draggingEle=this._draggingEle?this._draggingEle:this.querySelector("[dragging]"),this._draggingEle){var t,a,r,i;const d=this._draggingEle.parentNode,n=this._draggingEle.getBoundingClientRect();var s,o;if(!this._draggingStarted)this._draggingStarted=!0,this._draggingEle.style.position="absolute",this._draggingEle.style.width=n.width,P=(null===(s=(e.touches||[])[0])||void 0===s?void 0:s.clientX)||e.clientX||0,D=(null===(o=(e.touches||[])[0])||void 0===o?void 0:o.clientY)||e.clientY||0,this._placeholder=document.createElement("div"),this._placeholder.classList.add("placeholder"),d.insertBefore(this._placeholder,this._draggingEle.nextSibling),this._placeholder.style.height=`${n.height}px`;const l=(null===(t=(e.touches||[])[0])||void 0===t?void 0:t.clientX)||e.clientX||0,c=(null===(a=(e.touches||[])[0])||void 0===a?void 0:a.clientY)||e.clientY||0,g=P-l,b=D-c;if(!A.isOut(this,g,b))return;P=(null===(r=(e.touches||[])[0])||void 0===r?void 0:r.clientX)||e.clientX||0,D=(null===(i=(e.touches||[])[0])||void 0===i?void 0:i.clientY)||e.clientY||0,this._draggingEle.style.top=this._draggingEle.offsetTop-b+"px",this._draggingEle.style.left=this._draggingEle.offsetLeft-g+"px";const h=this._draggingEle.previousElementSibling,p=this._placeholder.nextElementSibling;if(!document.elementFromPoint(P,D))return;if(h&&A.isAbove(this._draggingEle,h))return A.swap(this._placeholder,this._draggingEle),void A.swap(this._placeholder,h);p&&A.isAbove(p,this._draggingEle)&&(A.swap(p,this._placeholder),A.swap(p,this._draggingEle))}this.dispatchEvent(new CustomEvent("draggable-default-drag-over",{detail:!0,bubbles:!0,composed:!0}))}_onDragEnd(){var e,t;(this._draggingStarted=!1,this._draggingEle=null,this._placeholder)&&(null===(e=this._placeholder)||void 0===e||null===(t=e.parentNode)||void 0===t||t.removeChild(this._placeholder))}render(){return d`<div class="drop-zone">
      <slot></slot>
    </div>`}}n("colors.cool50");const z=new l;var M=e`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${t(a.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
}
${z.mediaRules()}`;const V=new l;var q=e`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${t(a.secondary300)});
}
${V.mediaRules()}`;const R=new l;const T={dark:e`
    ${e`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${t(a.secondary300)});
}
${R.mediaRules()}`}
  `,light:e`
    ${q}
  `};class B extends(r(s)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[M,T.light,T.dark,o("bbva-divider-shared-styles")]}render(){return d` <hr divider="${this.size}" /> `}}n("colors.cool40");var O=e`:host {
  display: block;
  box-sizing: border-box;
  min-height: 2.5rem;
  --_bbva-draggable-default-item-icon-color: var(--bbva-draggable-default-item-dark-mode-icon-color, var(--bbva-draggable-default-item-icon-color, var(--colorsSecondary500, ${t(a.secondary500)})));
  --_bbva-draggable-default-item-icon-color-pressed: var(--bbva-draggable-default-item-dark-mode-icon-color-pressed , var(--bbva-draggable-default-item-icon-color-pressed, var(--colorsPrimaryCore, ${t(a.primaryCore)})));
  --_bbva-draggable-default-item-text-color: var(--bbva-draggable-default-item-dark-mode-text-color, var(--bbva-draggable-default-item-text-color, var(--colorsSecondary600, ${t(a.secondary600)})));
  --_bbva-draggable-default-item-text-color-pressed: var(--bbva-draggable-default-item-dark-mode-text-color-pressed, var(--bbva-draggable-default-item-text-color-pressed, var(--colorsPrimaryCore, ${t(a.primaryCore)})));
  --_bbva-draggable-default-item-expandable-icon-color: var(--bbva-draggable-default-item-dark-mode-expandable-icon-color, var(--bbva-draggable-default-item-expandable-icon-color, var(--colorsPrimaryMedium, ${t(a.primaryMedium)})));
  --_bbva-draggable-default-item-expandable-icon-color-pressed: var(--bbva-draggable-default-item-dark-mode-expandable-icon-color-pressed, var(--bbva-draggable-default-item-expandable-icon-color-pressed, var(--colorsPrimaryCore, ${t(a.primaryCore)})));
  --_bbva-draggable-default-item-bg-color-pressed: var(--bbva-draggable-default-item-dark-mode-bg-color-pressed, var(--bbva-draggable-default-item-bg-color-pressed, var(--colorsSecondary100, ${t(a.secondary100)})));
  /* SKELETON */
  --_skeleton-quote-color: var(--bbva-draggable-default-item-dark-mode-skeleton-color, var(--bbva-draggable-default-item-skeleton-color, var(--colorsSecondary200, ${t(a.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-draggable-default-item-dark-mode-skeleton-bg, var(--bbva-draggable-default-item-skeleton-bg, transparent));
  --_skeleton-animated-layer-bg: var(--bbva-draggable-default-item-dark-mode-skeleton-animated-layer-bg, var(--bbva-draggable-default-item-skeleton-animated-layer-bg, var(--ambientsLight, ${t(g.light)})));
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host(:not([disabled])) {
  cursor: move;
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host([show-content-paddings]) .expandable-content {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
}

:host([show-title-paddings]) ::slotted([slot=header]),
:host([show-title-paddings]) [data-tag-name=bbva-text] {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 15) * 1em);
  min-width: 0;
}

.container {
  display: flex;
  align-items: center;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  min-height: 2.5rem;
}
.container > [data-tag-name=bbva-icon] {
  fill: var(--_bbva-draggable-default-item-icon-color);
}
.container .head {
  display: flex;
  flex: 1;
  align-items: center;
  justify-content: space-between;
  min-width: 0;
}
.container .head [data-tag-name=bbva-text] {
  color: var(--_bbva-draggable-default-item-text-color);
  min-width: 0;
}
.container .head > [data-tag-name=bbva-icon] {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1rem);
  fill: var(--_bbva-draggable-default-item-expandable-icon-color);
  min-width: 1.5rem;
}

button {
  background: none;
  border: 0;
  color: inherit;
  padding: 0;
}

:host([aria-disabled=true]) {
  opacity: 0.4;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg);
  background-size: 20px 20px;
  background-position: 16px 9px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  background: var(--_skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][expanded]) {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg, transparent);
  background-size: 20px 20px, 19px 19px;
  background-position: 16px 9px, calc(100% - 16px) 9px;
}

:host([dragging][draggable=true]:not([disabled])):host([draggable=true]), :host([dragging][draggable=true]:not([disabled])) .container {
  z-index: 1;
  background-color: var(--_bbva-draggable-default-item-bg-color-pressed);
}
:host([dragging][draggable=true]:not([disabled])) [data-tag-name=bbva-icon] {
  fill: var(--_bbva-draggable-default-item-icon-color-pressed);
}
:host([dragging][draggable=true]:not([disabled])) [data-tag-name=bbva-text] {
  color: var(--_bbva-draggable-default-item-text-color-pressed);
}
:host([dragging][draggable=true]:not([disabled])) .head [data-tag-name=bbva-icon] {
  fill: var(--_bbva-draggable-default-item-expandable-icon-color-pressed);
}

:host(:not([title])) ::slotted([slot=header]),
:host(:not([title])) .head {
  justify-content: flex-end;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`,F=e`[ambient^=light] {
  --bbva-draggable-default-item-icon-color: initial;
  --bbva-draggable-default-item-icon-color-pressed: initial;
  --bbva-draggable-default-item-text-color: initial;
  --bbva-draggable-default-item-text-color-pressed: initial;
  --bbva-draggable-default-item-expandable-icon-color: initial;
  --bbva-draggable-default-item-expandable-icon-color-pressed: initial;
  --bbva-draggable-default-item-bg-color-pressed: initial;
  --bbva-draggable-default-item-skeleton-color: initial;
  --bbva-draggable-default-item-skeleton-bg: initial;
  --bbva-draggable-default-item-skeleton-animated-layer-bg: initial;
}
`;const U={dark:e`
    ${e`[ambient^=dark] {
  --bbva-draggable-default-item-icon-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-draggable-default-item-icon-color-pressed: var(--colorsPrimaryMediumLight, ${t(a.primaryMediumLight)});
  --bbva-draggable-default-item-text-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-draggable-default-item-text-color-pressed: var(--colorsPrimaryMediumLight, ${t(a.primaryMediumLight)});
  --bbva-draggable-default-item-expandable-icon-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-draggable-default-item-expandable-icon-color-pressed: var(--colorsPrimaryMediumLight, ${t(a.primaryMediumLight)});
  --bbva-draggable-default-item-bg-color-pressed: var(--colorsPrimaryCoreDark, ${t(a.primaryCoreDark)});
  --bbva-draggable-default-item-skeleton-color: var(--colorsPrimaryCoreDark, ${t(a.primaryCoreDark)});
  --bbva-draggable-default-item-skeleton-bg: var(--colorsPrimaryCoreDarkened, ${t(a.primaryCoreDarkened)});
  --bbva-draggable-default-item-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${t(a.primaryCoreDarkened)});
}
`}
    ${T.dark}
    ${b.dark}
    ${h.dark}
  `,light:e`
    ${F}
    ${T.light}
    ${b.light}
    ${h.light}
  `};class I extends(r(s)){static get is(){return"bbva-draggable-default-item"}static get scopedElements(){const e=[m,f,B];return I.scopedElementsFromClasses(e)}static get properties(){return{disabled:{type:Boolean},icon:{type:String},accessibilityText:{type:String,attribute:"accessibility-text"},expanded:{type:Boolean,reflect:!0},dragging:{type:Boolean,reflect:!0},dividerSize:{type:String,attribute:"divider-size"},title:{type:String},titleLevel:{type:String,attribute:"title-level"},showTitlePaddings:{type:Boolean,attribute:"show-title-paddings"},showContentPaddings:{type:Boolean,attribute:"show-content-paddings"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.icon=p(),this.disabled=!1,this.accessibilityText="bbva-draggable-default-item-label",this.dragging=!1,this.dividerSize="fit",this.titleLevel="span",this.showTitlePaddings=!1,this.showContentPaddings=!1,this.loading=!1,delete this.href}static get styles(){return[O,U.light,U.dark,o("bbva-draggable-default-item-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabled||(this.setAttribute("draggable",this.isDraggable),this.hasAttribute("role")||this.setAttribute("role","option"),this.setAttribute("tabindex",0),this.addEventListener("dragstart",this._onDragStart),this.addEventListener("touchstart",this._onDragStart),this.addEventListener("dragend",this._onDragEnd),this.addEventListener("touchend",this._onDragEnd),this.addEventListener("drag",this._onDrag),this.addEventListener("touchmove",this._onDrag))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("dragstart",this._onDragStart),this.removeEventListener("touchstart",this._onDragStart),this.removeEventListener("dragend",this._onDragEnd),this.removeEventListener("touchend",this._onDragEnd),this.removeEventListener("drag",this._onDrag),this.removeEventListener("touchmove",this._onDrag)}firstUpdated(e){super.firstUpdated(e),!this.disabled&&this.isExpandable&&this.expanded&&!this.loading?(this._content=this.shadowRoot.querySelector(".expandable-content"),this._content.style.display="block"):this.setAttribute("aria-label",this.accessibilityText)}updated(e){super.updated(e),this.isDraggable&&!this.disabled?this.setAttribute("draggable","true"):this.setAttribute("draggable","false"),e.has("disabled")&&this.setAttribute("aria-disabled",this.disabled)}_onDragStart(){this.draggable&&(this.dragging=!0,this.setAttribute("aria-selected",!0),this.dispatchEvent(new CustomEvent("draggable-default-item-drag-start",{detail:!0,bubbles:!0,composed:!0})))}_onDragEnd(e){this.dragging=!1,this.setAttribute("aria-selected",!1),e.currentTarget.style.removeProperty("top"),e.currentTarget.style.removeProperty("left"),e.currentTarget.style.removeProperty("position"),this.dispatchEvent(new CustomEvent("draggable-default-item-drag-end",{detail:!0,bubbles:!0,composed:!0}))}_onHeaderClick(){this.expanded=!this.expanded,this._content.style.display=this.expanded?"block":"none",this.dispatchEvent(new CustomEvent("draggable-default-item-click",{detail:!0,bubbles:!0,composed:!0}))}get isExpanded(){if(void 0!==this.expanded){const e=this.expanded?u():v();return d`<bbva-icon .icon=${e} size="24"></bbva-icon>`}return""}get isExpandable(){return void 0!==this.expanded}get isDraggable(){return!(this.querySelectorAll('[data-tag-name="bbva-draggable-default-item"').length>0&&this.expanded)}get expandableHeader(){return d`
      <button
        class="head"
        tabindex=${this.disabled?-1:0}
        aria-controls="expandable-content"
        aria-disabled=${this.disabled}
        aria-label="${this.accessibilityText}"
        aria-expanded="${this.expanded}"
        @click="${this.isExpandable&&this._onHeaderClick}"
        @keydown="${e=>(32===e.keyCode||13===e.keyCode)&&this._onHeaderClick}"
      >
        ${this.title?d`<bbva-text
              ellipsis
              size="S"
              tag="${this.titleLevel}"
              font-weight="500"
              .text=${this.title}
            ></bbva-text>`:d`<slot name="header"></slot>`}
        ${this.isExpanded}
      </button>
    `}render(){return this.loading?d`<div class="skeleton"></div>`:d`
          <div class="container">
            <bbva-icon aria-hidden="true" .icon=${this.icon} size="24"></bbva-icon>
            ${this.title||this.isExpandable?this.expandableHeader:""}
          </div>
          <div class="expandable-content" id="expandable-content">
            <slot></slot>
          </div>
          ${"none"!==this.dividerSize?d`<bbva-divider .size=${this.dividerSize}></bbva-divider>`:""}
        `}}customElements.define(I.is,I);var j=e`:host {
  display: block;
  box-sizing: border-box;
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  background-color: var(--colorsSecondary100, ${t(a.secondary100)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.container {
  background-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  margin-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  margin-left: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  margin-right: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  box-shadow: 0 0.0625rem 0.1875rem 0 #0C0C0C33;
}

.card-container {
  margin-top: calc(((-4.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  margin-left: calc(((4.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(c.spacer)}))) / 16) * 1em);
  display: flex;
  flex-direction: column;
}

.title {
  color: var(--colorsPrimaryMedium, ${t(a.primaryMedium)});
  font-size: var(--fontSizeOptionsFontSize50, ${t(y.fontSize50)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${t(_.fontWeight40)});
  line-height: var(--lineHeightTypeMedium, ${t(k.typeMedium)});
  letter-spacing: 0;
}

.text-light {
  color: var(--colorsSecondary500, ${t(a.secondary500)});
  font-size: var(--fontSizeOptionsFontSize40, ${t(y.fontSize40)});
  font-weight: var(--fontWeightOptionsFontWeight10, ${t(_.fontWeight10)});
  line-height: var(--lineHeightTypeMedium, ${t(k.typeMedium)});
  letter-spacing: 0rem;
}

.description-list {
  display: flex;
  justify-content: space-between;
}

.first-column, .second-column {
  display: flex;
  flex-direction: column;
}

.second-column {
  align-items: flex-end;
}

.large-amount {
  color: var(--colorsSecondary600, ${t(a.secondary600)});
  font-size: var(--fontSizeOptionsFontSize60, ${t(y.fontSize60)});
  font-weight: var(--fontWeightOptionsFontWeight10, ${t(_.fontWeight10)});
  line-height: var(--lineHeightTypeMedium, ${t(k.typeMedium)});
  letter-spacing: 0;
}
`;class H extends(r(x(s))){static get is(){return"bbva-aggregation-draggable-list"}static get scopedElements(){return{"bbva-text":f,"bbva-amount":S,"bbva-draggable-default":A,"bbva-draggable-default-item":I}}static get properties(){return{initialInformation:{type:Array,attribute:!1},_cardStatus:{type:Array,attribute:!1},_confirmModified:{type:Boolean,attribute:!1},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},language:{type:String,attribute:"language"},ariaLabelList:{type:String,attribute:!1}}}constructor(){super(),this.initialInformation=[],this._cardStatus=[],this._confirmModified=!1,this.currencyCode="",this.localCurrency="",this.language="",this.ariaLabelList="lista"}firstUpdated(){this._cleanAuxiliar()}static get styles(){return[j,o("bbva-aggregation-draggable-list-shared-styles")]}static _getText(e,t,a){return d`
      <bbva-text
        class=${`ellipsis ${t}`}
        size="S"
        ?ellipsis=${a}
        text=${e}
        tag="span">
      </bbva-text>
    `}_getAmount(e,t,a){return d`
      <bbva-amount
        class=${a}
        variant=${t}
        amount=${e}
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}">
      </bbva-amount>
    `}_showCards(e,t,a,r){return d`
      <bbva-draggable-default-item
        id="${e}"
        class="container content-together"
        icon="${p()}"
        content-together divider-size="none"
      >
      <div class="card-container">
        ${H._getText(t,"title",!0)}
        <div class="description-list ellipsis">
          <div class="first-column ellipsis">
            ${H._getText(this.t("bbva-aggregation-draggable-list-saved-amount"),"text-light text-container",!0)}
            ${H._getText(this.t("bbva-aggregation-draggable-list-scheduled-amount"),"text-light text-container",!0)}
          </div>
          <div class="second-column">
            ${this._getAmount(a,"m","large-amount")}
            ${this._getAmount(r,"m","text-light")}
          </div>
        </div>
      </div>
      </bbva-draggable-default-item>
    `}_setConfirmModified(e){this._confirmModified=e}_cleanAuxiliar(){this._cardStatus=[]}clearAll(){this.initialInformation=[],this._cardStatus=[],this._confirmModified=!1}compareCardPositions(){const e=Boolean(this._cardStatus.find(((e,t)=>{const a=t+1;return e.id!==a})));this._setConfirmModified(e),this._stateMofification()}getDataChild(){const e=[...this.renderRoot.querySelector(".default").getElementsByTagName("bbva-draggable-default-item")];this._cardStatus=e.map(((e,t)=>{const a=t+1;return{id:e.getAttribute("id"),currentPosition:a}})),this.compareCardPositions()}sendAndResetSortedData(){this._cardStatus.length<1||(this._fireEvent("get-sorted-data",this._cardStatus),this._setConfirmModified(!1),this._stateMofification(),this._cleanAuxiliar())}_stateMofification(){this._confirmModified?this._fireEvent("modified-activate"):this._fireEvent("modified-disabled")}_fireEvent(e,t={}){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}render(){return d`
      <bbva-draggable-default class="default" role="listbox" aria-label="${this.ariaLabelList}">
          ${this.initialInformation.map((e=>d`
            ${this._showCards(e.id,e.alias,e.amount,e.amountSecondary)}
          `))}
      </bbva-draggable-default>
    `}}customElements.define(H.is,H);class X extends(x(s)){static get is(){return"bbva-manager-savings"}static get properties(){return{host:{type:String,attribute:!1},requiredToken:{type:String,attribute:!1},pocketsApiVersion:{type:String,attribute:!1},native:{type:Boolean,attribute:!1},_modal:{type:Boolean,attribute:!1},_controllerRequest:{type:Number,attribute:!1},_globalPocketsAPi:{type:Object,attribute:!1},_pocketsInfo:{type:Array,attribute:!1},_pockets:{type:Array,attribute:!1}}}constructor(){super(),this.host="",this.requiredToken="tsec",this.pocketsApiVersion="1",this.native=!1,this._modal=!1,this._controllerRequest=0,this._globalPocketsAPi={},this._pockets=[],this._pocketsInfo=[],this._pocketsUpdate=[]}firstUpdated(){this._globalPocketsAPi=this.renderRoot.querySelector(".pocketsDm")}reset(){this._modal=!1,this._controllerRequest=0,this._pockets=[],this._pocketsInfo=[],this._pocketsUpdate=[],$(this,"reset-button")}setUpdateData(e){this._pocketsUpdate=e.map((e=>this._pocketsInfo.filter((t=>t.priority===e.id)).map((t=>({...t,priority:e.currentPosition}))))).flat(),this.patchPockets()}setDataPocketsEvent(e){this._pocketsInfo=e,this._pockets=[...this._pockets,...e.map((e=>({id:e.priority,alias:e.alias,amount:E(e,"balances.0.unit.amount"),isScheduled:e.isScheduled,amountSecondary:E(e,"scheduledDeposit.depositAmount.amount")})))],$(this,"pockets-data",this._pockets)}setControllerRequest(e){this._controllerRequest=e}setActivateModal(){this._modal=!0}setDisabledModal(){this._modal=!1}setModalData(){if(this._modal){const e={code:"saving-CAUTION",selectedConfig:{className:"error",openMaximized:!1,iconOnlyFullHeight:!0,acceptBtLabel:"bbva-manager-savings-save-changes",cancelBtLabel:"bbva-manager-savings-exit-without-saving",onAcceptEvent:this.getPocketsOrder.bind(this),onCancelEvent:this.leaveOrderPockets.bind(this),cancelFromHeaderEvent:"continue-savings",template:{type:"paragraphs",values:[{icon:"coronita:alert",iconClass:"icon-size-24",class:"error"},{text:"bbva-manager-savings-exit-operative-warning-message"}]}}};$(this,"open-save-modal",e)}else $(this,"move-to-list")}getPocketsOrder(){$(this,"get-pockets-order")}leaveOrderPockets(){this.reset(),$(this,"reset-pockets-order"),$(this,"leave-order-pockets")}_setSuccessResponse(){this._pocketsUpdate.length>this._controllerRequest&&$(this,"service-control",this._controllerRequest),this._pocketsUpdate.length===this._controllerRequest&&($(this,"success-update-pockets",this._getToastSnackBarParams()),this._disabledSpinner(),this.setControllerRequest(0))}_getToastSnackBarParams(){return{id:1,message:this.t("bbva-manager-savings-success-ordering-pockets"),duration:3e3,backgroundColor:"#277A3E",textAlignment:1,textColor:"#FFFFFF",textSize:15,maxLines:10,position:"bottom",textMargins:{top:24,bottom:24,right:16,left:16},type:"success"}}_setFiledResponse(){$(this,"file-update-pockets",!0)}patchPockets(){this._activateSpinner();const e=[this._pocketsUpdate[this._controllerRequest]];this._globalPocketsAPi.patchPockets(e)}controlServiceRequest(e){this.setControllerRequest(e+1),this._pocketsUpdate.length>this._controllerRequest&&$(this,"continue-flow",!0)}_activateSpinner(){$(this,"activate-spinner",!0)}_disabledSpinner(){$(this,"disabled-spinner",!0)}cleanData(){this._pockets=[],this._modal=!1,this._controllerRequest=0}render(){return d`
      <bbva-dataprovider-savings
        class="pocketsDm"
        host="${this.host}"
        apiVersion="${this.pocketsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @update-pocket-success="${this._setSuccessResponse}"
        @update-pocket-error="${this._setFiledResponse}">
      </bbva-dataprovider-savings>
    `}}customElements.define(X.is,X);
