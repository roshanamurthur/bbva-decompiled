import{z as t,a8 as e,ab as r,ac as i,ad as a,ar as o,a9 as s,aa as n,b1 as l,a as c,an as b,aJ as d,L as v,ag as p,ak as h,bl as g,h as m,V as u,av as y,f,g as k,aI as x,bY as $,cE as _,aK as S,bx as w,i as L}from"./952f98a9.js";import"./7f3d7ca9.js";const T=new o;var z=t`:host {
  --_base-line-fill-color: var(--bbva-progress-timer-dark-mode-base-line-fill-color, var(--bbva-progress-timer-base-line-fill-color, none));
  --_base-line-stroke-color: var(--bbva-progress-timer-dark-mode-base-line-stroke-color, var(--bbva-progress-timer-base-line-stroke-color, var(--colorsSecondary200, ${e(s.secondary200)})));
  --_progress-line-fill-color: var(--bbva-progress-timer-dark-mode-progress-line-fill-color, var(--bbva-progress-timer-progress-line-fill-color, none));
  --_progress-line-stroke-color: var(--bbva-progress-timer-dark-mode-progress-line-stroke-color, var(--bbva-progress-timer-progress-line-stroke-color, var(--colorsPrimaryVariantMedium, ${e(s.primaryVariantMedium)})));
  --_time-color: var(--bbva-progress-timer-dark-mode-time-color, var(--bbva-progress-timer-time-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_slotted-color: var(--bbva-progress-timer-dark-mode-slotted-color, var(--bbva-progress-timer-slotted-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_progress-line-stroke-color-alert: var(--bbva-progress-timer-dark-mode-alert-progress-line-stroke-color, var(--bbva-progress-timer-alert-progress-line-stroke-color, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --_base-line-stroke-color-alert: var(--bbva-progress-timer-dark-mode-alert-base-line-stroke-color, var(--bbva-progress-timer-alert-base-line-stroke-color, var(--colorsSecondary200, ${e(s.secondary200)})));
  display: block;
  position: relative;
  box-sizing: border-box;
  padding: var(--bbva-progress-timer-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem));
}

:host([hide-paddings]) {
  padding-top: 0;
  padding-bottom: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper {
  display: flex;
  flex-direction: row;
  align-items: center;
}

.figure {
  position: relative;
  display: flex;
  justify-content: flex-end;
}

.base-line {
  fill: var(--_base-line-fill-color);
  stroke: var(--_base-line-stroke-color);
  opacity: var(--bbva-progress-timer-dark-mode-base-line-stroke-opacity, var(--bbva-progress-timer-base-line-stroke-opacity, 1));
}

.progress-line {
  transform: rotate(-90deg);
  fill: var(--_progress-line-fill-color);
  stroke: var(--_progress-line-stroke-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  transition: stroke-dashoffset 1s linear;
}

.time {
  position: absolute;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  font-size: var(--bbva-progress-timer-time-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-progress-timer-time-font-height, var(--lineHeightTypeSmall, ${e(a.typeSmall)}));
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  color: var(--_time-color);
}

.cvv {
  line-height: var(--lineHeightType3XLarge, ${e(a.type3XLarge)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
}

.description {
  display: flex;
}
.description.space {
  padding-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}
.vertical .description {
  display: flex;
  flex-direction: column;
}

* ::slotted(*) {
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
  text-align: center;
  color: var(--_slotted-color);
}

.wrapper.vertical {
  flex-direction: column;
}
.wrapper.vertical .figure {
  padding-right: 0;
  justify-content: center;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}
.wrapper.vertical .space {
  padding-left: 0;
}

:host([variant=alert]) {
  --_progress-line-stroke-color: var(--_progress-line-stroke-color-alert);
  --_base-line-stroke-color: var(--_base-line-stroke-color-alert);
  --bbva-progress-timer-base-line-stroke-opacity: var(--bbva-progress-timer-alert-base-line-stroke-opacity, 1);
}

:host([cvv]) .time {
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
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
}
${T.mediaRules()}`;const P=new o;var C=t`[ambient^=dark] {
  --bbva-progress-timer-base-line-stroke-opacity: 0.4;
  --bbva-progress-timer-base-line-stroke-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-progress-timer-time-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-progress-timer-slotted-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-progress-timer-progress-line-stroke-color: var(--colorsPrimaryVariant, ${e(s.primaryVariant)});
  --bbva-progress-timer-alert-progress-line-stroke-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-progress-timer-alert-base-line-stroke-color: var(--colorsSecondary200, ${e(s.secondary200)});
  --bbva-progress-timer-alert-progress-line-stroke-opacity: 1;
}
${P.mediaRules()}`;var F=t`[ambient^=light] {
  --bbva-progress-timer-base-line-stroke-opacity: initial;
  --bbva-progress-timer-base-line-stroke-color: initial;
  --bbva-progress-timer-time-color: initial;
  --bbva-progress-timer-slotted-color: initial;
  --bbva-progress-timer-progress-line-stroke-color: initial;
  --bbva-progress-timer-alert-progress-line-stroke-color: initial;
  --bbva-progress-timer-alert-base-line-stroke-color: initial;
  --bbva-progress-timer-alert-progress-line-stroke-opacity: initial;
}
${(new o).mediaRules()}`;const V={dark:t`
    ${l.dark}
    ${C}
  `,light:t`
    ${l.light}
    ${F}
  `};class W extends(c(b(d(v)))){static get is(){return"bbva-progress-timer"}static get scopedElements(){return{"bbva-text":p}}static get properties(){return{accessibilityTiming:{type:Number,attribute:"accessibility-timing"},baseLineWidth:{type:Number,attribute:"base-line-width"},cvv:{type:String,reflect:!0},progressLineWidth:{type:Number,attribute:"progress-line-width"},fillUp:{type:Boolean,attribute:"fill-up"},hideTime:{type:Boolean,attribute:"hide-time"},off:{type:Boolean,value:!1},size:{type:Number},showVertical:{type:Boolean,attribute:"show-vertical"},timeout:{type:Number},timeoutFormatted:{type:String,attribute:"timeout-formatted"},_timeLeft:{type:Number,attribute:!1},_radius:{type:Number,attribute:!1},_isVertical:{type:Boolean,attribute:!1},_hasContent:{type:Boolean,attribute:!1},timeAlert:{type:Number,attribute:"time-alert"},variant:{type:String,reflect:!0},hideRawNumber:{type:Boolean,attribute:"hide-raw-number"},maskChar:{type:String,attribute:"mask-char"},visibleChars:{type:Number,attribute:"visible-chars"},hidePaddings:{type:Boolean,attribute:"hide-paddings"}}}constructor(){super(),this.size=48,this.baseLineWidth=1,this.timeoutFormatted="m:ss",this.hideTime=!1,this.fillUp=!1,this.isRunning=!1,this.showVertical=!1,this._isVertical=!1,this._hasContent=!1,this._cvvFixedSize=160,this._cvvProgressLineWidth=6,this._defaultProgressLineWidth=4,this.accessibilityTiming=3e4,this.variant="",this.hideRawNumber=!1,this.maskChar="•••",this.visibleChars=0,this.hidePaddings=!1}update(t){const e=t.has("cvv");if((t.has("size")||e)&&(this.size=e?this._cvvFixedSize:this.size,this._radius=this.size/2-Math.max(this._renderProgressLineWidth,this.baseLineWidth)/2,this._setDashOffset()),t.has("timeout")){"number"==typeof this.timeout&&this.timeout%1e3==0&&this.timeout>0&&(this._timeLeft=this.timeout,this.off||this.start())}super.update&&super.update(t)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._animation&&clearInterval(this._animation)}updated(t){super.updated(t),this.updateViewState()}updateViewState(){let t=!1;this.showVertical||(t=!!this.cvv||this.divWrapper.clientWidth<=this.divDescription.offsetWidth+this.slotFigure.offsetWidth);const e=this.showVertical||t,r=this.divDescription.offsetWidth>0;this._isVertical!==e&&(this._isVertical=e),this._hasContent!==r&&(this._hasContent=r)}firstUpdated(t){super.firstUpdated(t),this.divWrapper=this.shadowRoot.querySelector(".wrapper"),this.divDescription=this.shadowRoot.querySelector(".description"),this.slotFigure=this.shadowRoot.querySelector(".figure")}static get styles(){return[super.styles,z,V.dark,V.light,h("bbva-progress-timer-shared-styles")]}get _position(){return this.size/2}get _viewBox(){return`0 0 ${this.size} ${this.size}`}get _circleLength(){return 2*this._radius*Math.PI}get _renderProgressLineWidth(){return this.progressLineWidth||(this.cvv?this._cvvProgressLineWidth:this._defaultProgressLineWidth)}get _accessibilityLeftTimeText(){return this._timeLeft!==this.timeout&&this._timeLeft%this.accessibilityTiming!=0||(this._accessibilityMinutes=moment.utc(this._timeLeft).minutes(),this._accessibilitySeconds=moment.utc(this._timeLeft).seconds()),this.t("bbva-progress-timer-accessibility-time"+(this.cvv?"-cvv":""),{minutes:this._accessibilityMinutes,seconds:this._accessibilitySeconds,cvv:this.cvv})}_getTimeLeft(){const t=this._endDate-Date.now();return t<0?0:1e3*Math.round(t/1e3)}start(){this._timeLeft&&(this._endDate=Date.now()+this.timeout,this._animation=setInterval(this._countDown.bind(this),1e3),this.isRunning=!0)}reset(){this.stop(),this._timeLeft=this.timeout,this._setDashOffset()}stop(){this.isRunning=!1,clearInterval(this._animation)}_countDown(){this._timeLeft=this._getTimeLeft(),0!==this._timeLeft?this._dashoffset=this._calculateDashoffset():(this._counterFinished(),this.stop()),this._timeLeft===this.timeAlert&&(this.variant="alert")}_setDashOffset(){this._dashoffset=this.fillUp?this._circleLength:0}_calculateDashoffset(t=1e3){const e=this._circleLength/this.timeout;return(this.fillUp?this._timeLeft-t:this.timeout-this._timeLeft+t)*e}static _sizeStyle(t,e){return g({width:`${t}px`,height:`${e}px`})}get _textTime(){return m`
      <div class="time" style="${W._sizeStyle(this.size,this.size)}">
        ${this.cvv?m`
              <bbva-text
                class="cvv"
                text=${u(this.cvv,this.maskChar,this.hideRawNumber,this.visibleChars)}
                size="3XL"
                alignment="center"
                tag="span"
              ></bbva-text>
            `:""}
        <span aria-hidden="true">${moment.utc(this._timeLeft).format(this.timeoutFormatted)}</span>
      </div>
    `}get _counter(){return m`
      <svg viewBox=${this._viewBox} style=${W._sizeStyle(this.size,this.size)}>
        <circle
          class="base-line"
          cx=${this._position}
          cy=${this._position}
          r=${this._radius}
          stroke-width="${this.baseLineWidth}px"
        ></circle>
        <circle
          class="progress-line"
          cx=${-this._position}
          cy=${this._position}
          r=${this._radius}
          stroke-width="${this._renderProgressLineWidth}px"
          stroke-dashoffset="${this._dashoffset}"
          style=${g({"stroke-dasharray":this._circleLength})}
        ></circle>
      </svg>
    `}render(){return m`
      <div class="wrapper ${y({vertical:this._isVertical})}" aria-hidden="true">
        <div class="figure" style="${W._sizeStyle(64+this.size/2,this.size)}">
          ${this.hideTime?"":this._textTime} ${this._counter}
        </div>
        <slot
          class="${y({description:!0,space:this._hasContent})}"
        ></slot>
      </div>
      <div role="timer" aria-live="assertive" aria-atomic="true" class="sr-only">
        ${this._accessibilityLeftTimeText}
      </div>
    `}_counterFinished(){this.dispatchEvent(new CustomEvent("progress-timer-counter-finish",{detail:!0,bubbles:!0,composed:!0}))}}var D={...f,bbvaProgressTimer:`\n  --bbva-progress-timer-dark-mode-base-line-stroke-opacity: 1;\n  --bbva-progress-timer-dark-mode-base-line-fill-color: none;\n  --bbva-progress-timer-dark-mode-base-line-stroke-color: ${k("colors.cool40")};\n  --bbva-progress-timer-dark-mode-progress-line-fill-color: none;\n  --bbva-progress-timer-dark-mode-progress-line-stroke-color: ${k("colors.primaryVariantMedium")};\n  --bbva-progress-timer-dark-mode-time-color: ${k("colors.primaryCoreLightened")};\n  --bbva-progress-timer-dark-mode-slotted-color: ${k("colors.primaryCoreLightened")};\n  --bbva-progress-timer-dark-mode-alert-progress-line-stroke-color: ${k("colors.tertiaryType1Light")};\n  --bbva-progress-timer-dark-mode-alert-base-line-stroke-color: ${k("colors.cool40")};\n  `};const M=new o;var B=t`[divider] {
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
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${e(s.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}
${M.mediaRules()}`;const q=new o;var E=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(s.secondary300)});
}
${q.mediaRules()}`;const R=new o;const X={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(s.secondary300)});
}
${R.mediaRules()}`}
  `,light:t`
    ${E}
  `};class N extends(c(v)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[B,X.light,X.dark,h("bbva-divider-shared-styles")]}render(){return m` <hr divider="${this.size}" /> `}}var H={bbvaDivider:`\n  --bbva-divider-dark-mode-color: ${k("colors.cool40")};\n  `},U=t`[ambient^=light] {
  --bbva-button-list-color: initial;
  --bbva-button-list-color: initial;
  --bbva-button-list-clip-box-bg-color: initial;
  --bbva-button-list-skeleton-color: initial;
  --bbva-button-list-subtext-color: initial;
  --bbva-button-list-clip-box-bg-color-active: initial;
  --bbva-button-list-color-active: initial;
  --bbva-button-list-clip-box-bg-color-warning: initial;
  --bbva-button-list-color-warning: initial;
  --bbva-button-list-color-warning-active: initial;
  --bbva-button-list-color-disabled: initial;
  --bbva-button-list-subtext-disabled: initial;
  --bbva-button-list-skeleton-color: initial;
  --skeleton-quote-color: initial;
  --bbva-button-list-skeleton-animated-layer-bg: initial;
}
`,I=t`[ambient^=dark] {
  --bbva-button-list-color: var(--colorsPrimarySubdued, ${e(s.primarySubdued)});
  --bbva-button-list-clip-box-bg-color: var(--colorsPrimaryMediumLight, ${e(s.primaryMediumLight)});
  --bbva-button-list-skeleton-color: var(--colorsPrimaryMedium, ${e(s.primaryMedium)});
  --skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(s.primaryCoreDark)});
  --bbva-button-list-subtext-color: var(--colorsSecondary100, ${e(s.secondary100)});
  --bbva-button-list-clip-box-bg-color-active: var(--colorsPrimaryMedium, ${e(s.primaryMedium)});
  --bbva-button-list-color-active: var(--colorsPrimaryMediumLight, ${e(s.primaryMediumLight)});
  --bbva-button-list-clip-box-bg-color-warning: var(--colorsSecondary100, ${e(s.secondary100)});
  --bbva-button-list-color-warning: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-button-list-clip-box-color-warning: var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)});
  --bbva-button-list-color-warning-active: var(--colorsPrimarySubduedLight, ${e(s.primarySubduedLight)});
  --bbva-button-list-bg-color-warning-active: var(--colorsSecondary100, ${e(s.secondary100)});
  --bbva-button-list-skeleton-animated-layer-bg: var(--ambientsDark, ${e(x.dark)});
}
`;const j={light:t`
    ${U}
    ${$.light}
    ${V.light}
  `,dark:t`
    ${I}
    ${$.dark}
    ${V.dark}
  `};var A=t`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  --_button-list-color: var(--bbva-button-list-dark-mode-color, var(--bbva-button-list-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)})));
  --bbva-progress-timer-time-font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  --bbva-progress-timer-time-font-height: var(--lineHeightType3XSmall, ${e(a.type3XSmall)});
  --bbva-progress-timer-margin: 0;
  --bbva-clip-box-bg-color: var(--bbva-button-list-dark-mode-clip-box-bg-color, var(--bbva-button-list-clip-box-bg-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)})));
  --_bg-color-clip-box-off: var(--bbva-button-list-dark-mode-clip-box-bg-color-off, var(--bbva-button-list-clip-box-bg-color-off, var(--colorsSecondary500, ${e(s.secondary500)})));
  --_bg-color-clip-box-active: var(--bbva-button-list-dark-mode-clip-box-bg-color-active, var(--bbva-button-list-clip-box-bg-color-active, var(--colorsPrimaryCore, ${e(s.primaryCore)})));
  --_color-active: var(--bbva-button-list-dark-mode-color-active, var(--bbva-button-list-color-active, var(--colorsPrimaryCoreDark, ${e(s.primaryCoreDark)})));
  --_bg-color-clip-box-warning: var(--bbva-button-list-dark-mode-clip-box-bg-color-warning, var(--bbva-button-list-clip-box-bg-color-warning, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --_color-clip-box-warning: var(--bbva-button-list-dark-mode-clip-box-color-warning, var(--bbva-button-list-clip-box-color-warning, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)})));
  --_color-warning: var(--bbva-button-list-dark-mode-color-warning, var(--bbva-button-list-color-warning, var(--colorsTertiaryType1, ${e(s.tertiaryType1)})));
  --_color-warning-active: var(--bbva-button-list-dark-mode-color-warning-active, var(--bbva-button-list-color-warning-active, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --_bg-color-warning-active: var(--bbva-button-list-dark-mode-bg-color-warning-active, var(--bbva-button-list-bg-color-warning-active, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --skeleton-quote-color: var(--bbva-button-list-skeleton-dark-mode-color, var(--bbva-button-list-skeleton-color, var(--colorsSecondary200, ${e(s.secondary200)})));
  --skeleton-quote-bg: var(--bbva-button-list-skeleton-dark-mode-bg-color, var(--bbva-button-list-skeleton-bg, transparent));
  --_bbva-button-list-skeleton-animated-layer-bg: var(--bbva-button-list-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-button-list-skeleton-animated-layer-bg, var(--ambientsLight, ${e(x.light)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host(:not([href])) {
  border: none;
  color: var(--_button-list-color);
  padding: var(--bbva-button-list-global-padding, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em));
}

:host([divider]) [data-tag-name=bbva-divider] {
  width: 100%;
  position: absolute;
  bottom: 0;
  left: 0;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-list {
  box-sizing: border-box;
  display: flex;
  align-items: center;
  min-height: 4rem;
}

.title {
  display: block;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.text {
  display: block;
  font-size: var(--typographyTypeXSmall, ${e(i.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${e(a.typeXSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  color: var(--bbva-button-list-dark-mode-subtext-color, var(--bbva-button-list-subtext-color, var(--colorsSecondary500, ${e(s.secondary500)})));
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.entity,
.clip-box {
  flex: none;
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem) 0;
  --_bg-color: var(--bbva-clip-box-bg-color);
}

.content {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
  text-align: left;
  overflow: hidden;
}
.content.timer {
  margin-top: -8px;
}

[data-tag-name=bbva-progress-timer] {
  width: 2.5rem;
}

:host([variant=left]),
:host([variant=right]) {
  width: 50%;
  float: left;
}

:host([variant=left]) .button-list {
  padding-right: 0;
}

:host([variant=right]) .button-list {
  flex-direction: row-reverse;
  padding-left: 0;
}
:host([variant=right]) .content {
  padding-left: 0;
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
  text-align: right;
}

:host([disabled]) {
  opacity: var(--bbva-button-list-entity-opacity, 0.4);
}

:host([active]) {
  color: var(--_color-active);
}
:host([active]) [data-tag-name=bbva-clip-box] {
  background: var(--_bg-color-clip-box-active);
}

:host([warning]),
:host(.warning) {
  color: var(--_color-warning);
}
:host([warning]) [data-tag-name=bbva-clip-box],
:host(.warning) [data-tag-name=bbva-clip-box] {
  --_bg-color: var(--_bg-color-clip-box-warning);
  color: var(--_color-clip-box-warning);
}

:host([multi-lines]) .title,
:host([multi-lines]) .text {
  white-space: normal;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  overflow: hidden;
}
:host([multi-lines]) .title {
  -webkit-line-clamp: 2;
}
:host([multi-lines]) .text {
  -webkit-line-clamp: 3;
}
:host([multi-lines]) .entity,
:host([multi-lines]) .clip-box,
:host([multi-lines]) .timer {
  align-self: flex-start;
}

:host([active][warning]),
:host([active].warning) {
  color: var(--_color-warning-active);
}
:host([active][warning]) [data-tag-name=bbva-clip-box],
:host([active].warning) [data-tag-name=bbva-clip-box] {
  background: var(--_bg-color-warning-active);
}

:host([off]) {
  --bbva-clip-box-bg-color: var(--_bg-color-clip-box-off);
  --bbva-clip-box-bg-dark-mode-color: var(--_bg-color-clip-box-off);
  --_bg-color-clip-box-active: var(--_bg-color-clip-box-off);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 4rem;
  width: 100%;
  background-image: radial-gradient( 40px 100%, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 40px 40px, calc((220px * 2) + (18px/ 2)) 18px;
  background-position: 16px 20px, 72px 32px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 100%;
  background: var(--_bbva-button-list-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
:host([loading]):host([variant=left]) {
  width: 50%;
  background-image: radial-gradient( 40px 100%, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 40px 40px, calc((70px * 2) + (18px/ 2)) 18px;
  background-position: 16px 20px, 72px 32px;
}
:host([loading]):host([variant=right]) {
  width: 50%;
  background-image: linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), radial-gradient( 40px 100%, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((70px * 2) + (18px/ 2)) 18px, 40px 40px;
  background-position: -62px 32px, 104px 20px;
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
`;class O extends(c(b(d(_)))){static get is(){return"bbva-button-list"}static get scopedElements(){return{"bbva-clip-box":S,"bbva-progress-timer":W,"bbva-divider":N}}static get properties(){return{entity:{type:String},entityText:{type:String,attribute:"entity-text"},entityVariant:{type:String,attribute:"entity-variant"},icon:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0},timeout:{type:Number},timeoutFormatted:{type:String,attribute:"timeout-formatted"},offTime:{type:Boolean,attribute:"off-time"},titleText:{type:String,attribute:"title-text"},text:{type:String},divider:{type:String,reflect:!0},ongoing:{type:Number},off:{type:Boolean,reflect:!0},variant:{type:String}}}constructor(){super(),this.loading=!1,this.text="",this.offTime=!1,this.timeoutFormatted="m:ss",this.type="button",this.divider="",this.off=!1}static get styles(){return[super.styles,A,h("bbva-button-list-shared-styles"),w(),j.dark,j.light]}firstUpdated(t){super.firstUpdated&&super.firstUpdated(),t.has("variant")&&"off"===this.variant&&(this.off=!0)}updated(t){t.has("ongoing")&&(this.timeout=this.ongoing)}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("click",this._clickHandler),this.addEventListener("keypress",this._keyPressHandler)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("click",this._clickHandler),this.removeEventListener("keypress",this._keyPressHandler)}_keyPressHandler(t){"off"!==this.variant||"Space"!==t.code&&"Enter"!==t.code||(this.off=!this.off),this._sendStateChangeEvent()}_clickHandler(){"off"===this.variant&&(this.off=!this.off),this._sendStateChangeEvent()}_sendStateChangeEvent(){this.dispatchEvent(new CustomEvent("button-list-state-change",{detail:"off"!==this.variant||{state:this.off?"off":"on"},bubbles:!0,composed:!0}))}get _renderIcon(){let t=null;return this.icon?t=m`
        <bbva-clip-box
          class="clip-box bitone"
          size="${this.iconSize||"medium"}"
          .icon="${this.icon}"
        >
        </bbva-clip-box>
      `:this.entity?t=m`
        <bbva-clip-box
          class="entity"
          size="${this.iconSize||"large"}"
          icon="${this.entity}"
          accessibility-text="${this.entityText}"
          variant="${L(this.entityVariant)}"
        >
        </bbva-clip-box>
      `:this.timeout&&(t=m`
        <bbva-progress-timer
          class="timer"
          .size="${this.iconSize||40}"
          .timeout="${this.timeout}"
          .timeoutFormatted="${this.timeoutFormatted}"
          .off=${this.offTime}
        >
        </bbva-progress-timer>
      `),t}get _renderDivider(){return m`
      ${""!==this.divider?m`<bbva-divider .size="${this.divider}"></bbva-divider>`:m``}
    `}render(){return m`
      <div class="button-list">
        ${this._renderIcon}
        <span class="content ${y({timer:!!this.timeout||!!this.ongoing})}">
          <b class="title">${this.t(this.titleText)}</b>
          <span class="text">${this.t(this.text)}</span>
        </span>
        ${this._renderDivider}
      </div>
      <div class="skeleton"></div>
      <slot></slot>
      ${this._action}
    `}}export{O as B,H as a,D as b,j as c};
