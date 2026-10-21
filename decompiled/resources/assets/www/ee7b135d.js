import{z as e,a8 as t,ab as i,ac as r,ad as s,an as a,L as o,ak as n,bl as l,h as m,V as c,av as b}from"./952f98a9.js";import{R as h,S as p,u as d,D as v,v as g,W as u,w as y,G as f}from"./216055dc.js";import"./7f3d7ca9.js";var k=e`
:host {
  --_progress-timer-base-line-stroke-color:
    var(--bbva-progress-timer--_ambient--base-line-stroke-color,
      var(--bbva-progress-timer--custom--primary-ambient--base-line-stroke-color,
        ${h("colorPrimarySurfaceAlternativeDefault",p)}));
  --_progress-timer-line-stroke-color:
    var(--bbva-progress-timer--_ambient--timer-line-stroke-color,
      var(--bbva-progress-timer--custom--primary-ambient--timer-line-stroke-color,
        ${h("colorPrimaryProcessInProgress",p)}));
  --_progress-timer-time-color:
    var(--bbva-progress-timer--_ambient--time-color,
      var(--bbva-progress-timer--custom--primary-ambient--time-color,
        ${h("colorPrimaryText01Default",p)}));
  --_progress-timer-line-stroke-color-alert:
    var(--bbva-progress-timer--_ambient--line-stroke-color-alert,
      var(--bbva-progress-timer--custom--primary-ambient--line-stroke-color-alert,
        ${h("colorPrimaryProcessAlert",p)}));
  --_progress-timer-skeleton-quote-color:
    var(--bbva-progress-timer--_ambient--skeleton-quote-color,
      var(--bbva-progress-timer--custom--primary-ambient--skeleton-quote-color,
        ${h("colorPrimarySurfaceAmbientPreloading",p)}));
  --_progress-timer-skeleton-animated-layer-bg:
    var(--bbva-progress-timer--_ambient--skeleton-animated-layer-bg,
      var(--bbva-progress-timer--custom--primary-ambient--skeleton-animated-layer-bg,
        ${h("colorPrimarySurfaceAmbientDefault",p)}));
}
`;const _=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-progress-timer--_ambient--base-line-stroke-color: initial;
    --bbva-progress-timer--_ambient--timer-line-stroke-color: initial;
    --bbva-progress-timer--_ambient--time-color: initial;
    --bbva-progress-timer--_ambient--line-stroke-color-alert: initial;
    --bbva-progress-timer--_ambient--skeleton-quote-color: initial;
    --bbva-progress-timer--_ambient--skeleton-animated-layer-bg: initial;
  }
`,x=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-progress-timer--_ambient--base-line-stroke-color: var(
      --bbva-progress-timer--custom--primary-alt-ambient--base-line-stroke-color,
      ${h("colorPrimaryAltSurfaceAlternativeDefault",p)}
    );

    --bbva-progress-timer--_ambient--timer-line-stroke-color: var(
      --bbva-progress-timer--custom--primary-alt-ambient--timer-line-stroke-color,
      ${h("colorPrimaryAltProcessInProgress",p)}
    );

    --bbva-progress-timer--_ambient--time-color: var(
      --bbva-progress-timer--custom--primary-alt-ambient--time-color,
      ${h("colorPrimaryAltText01Default",p)}
    );

    --bbva-progress-timer--_ambient--line-stroke-color-alert: var(
      --bbva-progress-timer--custom--primary-alt-ambient--line-stroke-color-alert,
      ${h("colorPrimaryAltProcessAlert",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-quote-color: var(
      --bbva-progress-timer--custom--primary-alt-ambient--skeleton-quote-color,
      ${h("colorPrimaryAltSurfaceAmbientPreloading",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-animated-layer-bg: var(
      --bbva-progress-timer--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${h("colorPrimaryAltSurfaceAmbientDefault",p)}
    );
  }
`,$=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-progress-timer--_ambient--base-line-stroke-color: var(
      --bbva-progress-timer--custom--secondary-ambient--base-line-stroke-color,
      ${h("colorSecondarySurfaceAlternativeDefault",p)}
    );

    --bbva-progress-timer--_ambient--timer-line-stroke-color: var(
      --bbva-progress-timer--custom--secondary-ambient--timer-line-stroke-color,
      ${h("colorSecondaryProcessInProgress",p)}
    );

    --bbva-progress-timer--_ambient--time-color: var(
      --bbva-progress-timer--custom--secondary-ambient--time-color,
      ${h("colorSecondaryText01Default",p)}
    );

    --bbva-progress-timer--_ambient--line-stroke-color-alert: var(
      --bbva-progress-timer--custom--secondary-ambient--line-stroke-color-alert,
      ${h("colorSecondaryProcessAlert",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-quote-color: var(
      --bbva-progress-timer--custom--secondary-ambient--skeleton-quote-color,
      ${h("colorSecondarySurfaceAmbientPreloading",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-animated-layer-bg: var(
      --bbva-progress-timer--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${h("colorSecondarySurfaceAmbientDefault",p)}
    );
  }
`,S=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-progress-timer--_ambient--base-line-stroke-color: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--base-line-stroke-color,
      ${h("colorSecondaryAltSurfaceAlternativeDefault",p)}
    );

    --bbva-progress-timer--_ambient--timer-line-stroke-color: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--timer-line-stroke-color,
      ${h("colorSecondaryAltProcessInProgress",p)}
    );

    --bbva-progress-timer--_ambient--time-color: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--time-color,
      ${h("colorSecondaryAltText01Default",p)}
    );

    --bbva-progress-timer--_ambient--line-stroke-color-alert: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--line-stroke-color-alert,
      ${h("colorSecondaryAltProcessAlert",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-quote-color: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--skeleton-quote-color,
      ${h("colorSecondaryAltSurfaceAmbientPreloading",p)}
    );

    --bbva-progress-timer--_ambient--skeleton-animated-layer-bg: var(
      --bbva-progress-timer--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${h("colorSecondaryAltSurfaceAmbientDefault",p)}
    );
  }
`;const w=d([Object.freeze({__proto__:null,primary:_,primaryAlt:x,secondary:$,secondaryAlt:S}),v]),P=Object.values(w);var L=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
}

.figure {
  position: relative;
  display: flex;
  width: 10rem;
  height: 10rem;
  justify-content: flex-end;
}

.base-line {
  fill: none;
  opacity: var(--bbva-progress-timer-base-line-stroke-opacity, 1);
  stroke: var(--_progress-timer-base-line-stroke-color);
}

.progress-line {
  fill: none;
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(i.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)});
  stroke: var(--_progress-timer-line-stroke-color);
  transform: rotate(-90deg);
  transition: stroke-dashoffset 1s linear;
}

.time {
  position: absolute;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  color: var(--_progress-timer-time-color);
  font-size: var(--bbva-progress-timer-time-font-size, var(--typographyTypeSmall, ${t(r.typeSmall)}));
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(i.medium.fontStyle)});
  line-height: var(--bbva-progress-timer-time-font-height, var(--lineHeightTypeSmall, ${t(s.typeSmall)}));
}

.cvv {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(i.medium.fontStyle)});
  line-height: var(--lineHeightType3XLarge, ${t(s.type3XLarge)});
}

.description {
  display: flex;
}
.description.space {
  padding-left: 0.5rem;
}
.vertical .description {
  display: flex;
  flex-direction: column;
  margin-top: 0.5rem;
}

* ::slotted(*) {
  color: var(--_progress-timer-time-color);
  font-size: var(--typographyTypeSmall, ${t(r.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(i.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${t(s.typeSmall)});
  text-align: center;
}

.wrapper.vertical {
  flex-direction: column;
}
.wrapper.vertical .figure {
  justify-content: center;
  padding-right: 0;
}
.wrapper.vertical .space {
  padding-left: 0;
}

:host([variant=alert]) {
  --_progress-timer-line-stroke-color: var(--_progress-timer-line-stroke-color-alert);
  --_base-line-stroke-color: var(--_base-line-stroke-color-alert);
  --bbva-progress-timer-base-line-stroke-opacity: var(--bbva-progress-timer-alert-base-line-stroke-color, 1);
}

:host([variant=vertical]) [data-tag-name=bbva-type-text] {
  font-size: var(--typographyTypeSmall, ${t(r.typeSmall)});
}

:host([cvv]) .time {
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(i.book.fontStyle)});
}
:host([cvv]) .cvv {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)});
}
:host([cvv]) .base-line {
  stroke: var(--_progress-timer-base-line-stroke-color);
  stroke-width: 6px;
}
:host([cvv]) .wrapper.vertical {
  height: 12rem;
}
:host([cvv]) .desktop {
  display: none;
}
:host([cvv]) .desktop .lines {
  display: none;
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

:host([loading]) {
  z-index: -999;
  overflow: hidden;
  width: 100%;
}
:host([loading]) .skeleton {
  display: flex;
  width: 100%;
  height: 3.125rem;
  align-items: center;
  justify-content: center;
}
:host([loading]) .skeleton .skeleton-timer {
  min-width: 48px;
  min-height: 48px;
  border: 3px solid var(--_progress-timer-skeleton-quote-color);
  border-radius: 50%;
  animation: circleLoading 1600ms 300ms infinite both;
}
:host([loading]) .skeleton .skeleton-description {
  width: 20%;
  height: 3.125rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 12px 12px;
  mask-position: 12px 12px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((80% * 2) + (16px/ 2)) 16px;
  mask-size: calc((80% * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading]) .skeleton .skeleton-description::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
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
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][show-vertical]) .skeleton {
  height: 5rem;
  flex-direction: column;
}
:host([loading][show-vertical]) .skeleton-description {
  width: 35%;
  height: 3.125rem;
}

:host([loading][show-vertical][variant=cvv]) .skeleton {
  height: 12.5rem;
}
:host([loading][show-vertical][variant=cvv]) .skeleton-description {
  width: 35%;
  height: 50px;
}
:host([loading][show-vertical][variant=cvv]) .skeleton-timer {
  min-width: 160px;
  min-height: 160px;
}

@keyframes circleLoading {
  from {
    opacity: 1;
  }
  50% {
    opacity: 0.8;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.4;
  }
  90% {
    opacity: 0.6;
  }
  100% {
    opacity: 1;
  }
}
`;class A extends(g(u(a(y(o))))){static get is(){return"bbva-progress-timer"}static get scopedElements(){return{"bbva-type-text":f}}static get properties(){return{accessibilityTiming:{type:Number,attribute:"accessibility-timing"},baseLineWidth:{type:Number,attribute:"base-line-width"},cvv:{type:String,reflect:!0},progressLineWidth:{type:Number,attribute:"progress-line-width"},fillUp:{type:Boolean,attribute:"fill-up"},hideTime:{type:Boolean,attribute:"hide-time"},off:{type:Boolean,value:!1},size:{type:Number},showVertical:{type:Boolean,attribute:"show-vertical"},timeout:{type:Number},timeoutFormatted:{type:String,attribute:"timeout-formatted"},_timeLeft:{type:Number,attribute:!1},_radius:{type:Number,attribute:!1},_isVertical:{type:Boolean,attribute:!1},_hasContent:{type:Boolean,attribute:!1},timeAlert:{type:Number,attribute:"time-alert"},variant:{type:String,reflect:!0},text:{type:String},hideRawNumber:{type:Boolean,attribute:"hide-raw-number"},loading:{type:Boolean,reflect:!0},maskChar:{type:String,attribute:"mask-char"},visibleChars:{type:Number,attribute:"visible-chars"},_desktop:{type:Boolean,attribute:!1}}}constructor(){super(),this.size=48,this.text="",this.baseLineWidth=1,this.timeoutFormatted="m:ss",this.hideTime=!1,this.fillUp=!1,this.off=!1,this.isRunning=!1,this.showVertical=!1,this._isVertical=!1,this._cvvFixedSize=160,this._hasContent=!1,this.loading=!1,this._cvvProgressLineWidth=6,this._defaultProgressLineWidth=4,this.accessibilityTiming=3e4,this.variant="",this.hideRawNumber=!1,this.maskChar="•••",this.visibleChars=0,this._desktop=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}update(e){const t=e.has("cvv");if((e.has("size")||t)&&(this.size=t?this._cvvFixedSize:this.size,this._radius=this.size/2-Math.max(this._renderProgressLineWidth,this.baseLineWidth)/2,this._setDashOffset()),e.has("timeout")){"number"==typeof this.timeout&&this.timeout%1e3==0&&this.timeout>0&&(this._timeLeft=this.timeout,this.off||this.start())}super.update&&super.update(e)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._animation&&clearInterval(this._animation)}updated(e){super.updated(e);let t=!1;const i=this.divWrapper||{},r=this.divDescription||{},s=this.slotFigure||{};this.showVertical||(t=!!this.cvv||i.clientWidth<=r.offsetWidth+s.offsetWidth+45),this._isVertical=this.showVertical||t,this._hasContent=r.offsetWidth>0}firstUpdated(e){super.firstUpdated(e),this.divWrapper=this.shadowRoot.querySelector(".wrapper"),this.divDescription=this.shadowRoot.querySelector(".description"),this.slotFigure=this.shadowRoot.querySelector(".figure")}static get styles(){return[super.styles,k,L,P,n("bbva-progress-timer-shared-styles")]}get _position(){return this.size/2}get _viewBox(){return`0 0 ${this.size} ${this.size}`}get _circleLength(){return 2*this._radius*Math.PI}get _renderProgressLineWidth(){return this.progressLineWidth||(this.cvv?this._cvvProgressLineWidth:this._defaultProgressLineWidth)}get _accessibilityLeftTimeText(){const e=[this.timeout,15e3,5e3];return(this._timeLeft%this.accessibilityTiming==0||e.includes(this._timeLeft))&&(this._accessibilityMinutes=moment.utc(this._timeLeft).minutes(),this._accessibilitySeconds=moment.utc(this._timeLeft).seconds()),this.t("bbva-progress-timer-accessibility-time"+(this.cvv?"-cvv":""),{minutes:this._accessibilityMinutes,seconds:this._accessibilitySeconds,cvv:this.cvv})}_getTimeLeft(){const e=this._endDate-Date.now();return e<0?0:1e3*Math.round(e/1e3)}start(){this._timeLeft&&(this._endDate=Date.now()+this.timeout,this._animation=setInterval(this._countDown.bind(this),1e3),this.isRunning=!0)}reset(){this.stop(),this._timeLeft=this.timeout,this._setDashOffset()}stop(){this.isRunning=!1,clearInterval(this._animation)}_countDown(){this._timeLeft=this._getTimeLeft(),0!==this._timeLeft?this._dashoffset=this._calculateDashoffset():(this._counterFinished(),this.stop()),this._timeLeft===this.timeAlert&&(this.variant="alert")}_setDashOffset(){this._dashoffset=this.fillUp?this._circleLength:0}_calculateDashoffset(e=1e3){const t=this._circleLength/this.timeout;return(this.fillUp?this._timeLeft-e:this.timeout-this._timeLeft+e)*t}static _sizeStyle(e,t){return l({width:`${e}px`,height:`${t}px`})}get _textTime(){return m`
      <div
        class="time"
        style="${A._sizeStyle(this._desktop||this.cvv?this.size:40,this._desktop||this.cvv?this.size:40)}"
      >
        ${!this._desktop&&this.cvv?m`
              <bbva-type-text
                unset
                class="cvv"
                text=${c(this.cvv,this.maskChar,this.hideRawNumber,this.visibleChars)}
                size="3XL"
                alignment="center"
                tag="span"
              ></bbva-type-text>
            `:""}
        <bbva-type-text
          unset
          size="${this._desktop||this.cvv?"S":"2XS"}"
          text="${moment.utc(this._timeLeft).format(this.timeoutFormatted)}"
        ></bbva-type-text>
      </div>
    `}get _counter(){return m`
      <svg
        viewBox="${this._viewBox}"
        style="${A._sizeStyle(this._desktop||this.cvv?this.size:40,this._desktop||this.cvv?this.size:40)}"
      >
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
          style="${l({"stroke-dasharray":this._circleLength})}"
        ></circle>
      </svg>
    `}render(){return m`
      ${this.loading?m`<div
            class="skeleton ${b({vertical:this._isVertical,variant:this.variant})} "
          >
            <div class="skeleton-timer"></div>
            <div class="skeleton-description"></div>
          </div>`:m`<div
              class="wrapper ${b({vertical:this._isVertical,desktop:this._desktop})}"
              aria-hidden="true"
              tabindex="-1"
            >
              <div
                class="figure"
                style="${A._sizeStyle(this._desktop||this.cvv?this.size:40,this._desktop||this.cvv?this.size:40)}"
              >
                ${this.hideTime?"":this._textTime} ${this._counter}
              </div>
              <bbva-type-text
                size="S"
                unset
                alignment="center"
                text=${this.text}
                class="${b({description:!0,space:this._hasContent,desktop:this._desktop})}"
              ></bbva-type-text>
            </div>
            <div role="timer" aria-live="assertive" class="sr-only">
              ${this._accessibilityLeftTimeText}
            </div>`}
    `}_counterFinished(){this.dispatchEvent(new CustomEvent("progress-timer-counter-finish",{detail:!0,bubbles:!0,composed:!0}))}}export{A as B};
