import{z as t,ap as i,an as e,L as a,aq as o,bw as r,i as n,bx as s,ak as l,h as c,av as b,bl as v}from"./952f98a9.js";import{R as m,S as p,u as d,_ as g,v as h,a0 as u}from"./216055dc.js";var f=t`
:host {
  --_list-swipe-invoker-bg-color: var(--bbva-list-swipe--_ambient--invoker-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--invoker-bg-color,
          ${m("colorPrimarySurfaceAmbientDefault",p)}));
  --_list-swipe-informative-bg-color: var(--bbva-list-swipe--_ambient--informative-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--informative-bg-color,
          ${m("colorPrimaryCtaMainBackgroundDefault",p)}));
  --_list-swipe-informative-bg-color-active: var(--bbva-list-swipe--_ambient--informative-bg-color-active,
      var(--bbva-list-swipe--custom--primary-ambient--informative-bg-color-active,
          ${m("colorPrimaryCtaMainBackgroundPressed",p)}));
  --_list-swipe-operative-bg-color: var(--bbva-list-swipe--_ambient--operative-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--operative-bg-color,
          ${m("colorPrimaryCtaMainBackgroundDefault",p)}));
  --_list-swipe-operative-bg-color-active: var(--bbva-list-swipe--_ambient--operative-bg-color-active,
      var(--bbva-list-swipe--custom--primary-ambient--operative-bg-color-active,
          ${m("colorPrimaryCtaMainBackgroundPressed",p)}));
  --_list-swipe-button-action-color: var(--bbva-list-swipe--_ambient--button-action-color,
      var(--bbva-list-swipe--custom--primary-ambient--button-action-color,
          ${m("colorPrimaryCtaMainTextDefault",p)}));
  --_list-swipe-button-action-warning-color: var(--bbva-list-swipe--_ambient--button-action-warning-color,
      var(--bbva-list-swipe--custom--primary-ambient--button-action-warning-color,
          ${m("colorPrimaryCtaNegativeTextDefault",p)}));
  --_list-swipe-warning-bg-color: var(--bbva-list-swipe--_ambient--warning-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--warning-bg-color,
          ${m("colorPrimaryCtaNegativeBackgroundDefault",p)}));
  --_list-swipe-warning-bg-color-active: var(--bbva-list-swipe--_ambient--warning-bg-color-active,
      var(--bbva-list-swipe--custom--primary-ambient--warning-bg-color-active,
          ${m("colorPrimaryCtaNegativeBackgroundPressed",p)}));
  --_list-swipe-actions-item-operative-error-bg-color: var(--bbva-list-swipe--_ambient--actions-item-operative-error-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--actions-item-operative-error-bg-color,
          ${m("colorPrimaryCtaNegativeBackgroundDefault",p)}));
  --_list-swipe-actions-item-operative-error-active-bg-color: var(--bbva-list-swipe--_ambient--actions-item-operative-error-active-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--actions-item-operative-error-active-bg-color,
          ${m("colorPrimaryCtaNegativeBackgroundPressed",p)}));
  --_list-swipe-skeleton-informative-quote-color: var(--bbva-list-swipe--_ambient--skeleton-informative-quote-color,
      var(--bbva-list-swipe--custom--primary-ambient--skeleton-informative-quote-color,
          ${m("colorPrimaryCtaMainTextPreloading",p)}));
  --_list-swipe-skeleton-error-quote-color: var(--bbva-list-swipe--_ambient--skeleton-error-quote-color,
      var(--bbva-list-swipe--custom--primary-ambient--skeleton-error-quote-color,
          ${m("colorPrimaryCtaNegativeTextPreloading",p)}));
  --_list-swipe-skeleton-error-bg-color: var(--bbva-list-swipe--_ambient--skeleton-error-bg-color,
      var(--bbva-list-swipe--custom--primary-ambient--skeleton-error-bg-color,
          ${m("colorPrimaryCtaNegativeBackgroundDefault",p)}));
  --_list-swipe-skeleton-operative-quote-color: var(--bbva-list-swipe--_ambient--skeleton-operative-quote-color,
      var(--bbva-list-swipe--custom--primary-ambient--skeleton-operative-quote-color,
          ${m("colorPrimaryCtaMainTextPreloading",p)}));
}
`;const _=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-list-swipe--_ambient--invoker-bg-color: initial;
    --bbva-list-swipe--_ambient--informative-bg-color: initial;
    --bbva-list-swipe--_ambient--informative-bg-color-active: initial;
    --bbva-list-swipe--_ambient--operative-bg-color: initial;
    --bbva-list-swipe--_ambient--operative-bg-color-active: initial;
    --bbva-list-swipe--_ambient--button-action-color: initial;
    --bbva-list-swipe--_ambient--button-action-warning-color: initial;
    --bbva-list-swipe--_ambient--warning-bg-color: initial;
    --bbva-list-swipe--_ambient--warning-bg-color-active: initial;
    --bbva-list-swipe--_ambient--actions-item-operative-error-bg-color: initial;
    --bbva-list-swipe--_ambient--actions-item-operative-error-active-bg-color: initial;
    --bbva-list-swipe--_ambient--skeleton-informative-quote-color: initial;
    --bbva-list-swipe--_ambient--skeleton-error-quote-color: initial;
    --bbva-list-swipe--_ambient--skeleton-error-bg-color: initial;
    --bbva-list-swipe--_ambient--skeleton-operative-quote-color: initial;
  }
`,w=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-list-swipe--_ambient--invoker-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--invoker-bg-color,
      ${m("colorPrimaryAltSurfaceAmbientDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--informative-bg-color,
      ${m("colorPrimaryAltCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color-active: var(
      --bbva-list-swipe--custom--primary-alt-ambient--informative-bg-color-active,
      ${m("colorPrimaryAltCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--operative-bg-color,
      ${m("colorPrimaryAltCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color-active: var(
      --bbva-list-swipe--custom--primary-alt-ambient--operative-bg-color-active,
      ${m("colorPrimaryAltCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--button-action-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--button-action-color,
      ${m("colorPrimaryAltCtaMainTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--button-action-warning-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--button-action-warning-color,
      ${m("colorPrimaryAltCtaNegativeTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--warning-bg-color,
      ${m("colorPrimaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color-active: var(
      --bbva-list-swipe--custom--primary-alt-ambient--warning-bg-color-active,
      ${m("colorPrimaryAltCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--actions-item-operative-error-bg-color,
      ${m("colorPrimaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-active-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--actions-item-operative-error-active-bg-color,
      ${m("colorPrimaryAltCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-informative-quote-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--skeleton-informative-quote-color,
      ${m("colorPrimaryAltCtaMainTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-quote-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--skeleton-error-quote-color,
      ${m("colorPrimaryAltCtaNegativeTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-bg-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--skeleton-error-bg-color,
      ${m("colorPrimaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-operative-quote-color: var(
      --bbva-list-swipe--custom--primary-alt-ambient--skeleton-operative-quote-color,
      ${m("colorPrimaryAltCtaMainTextPreloading",p)}
    );
  }
`,k=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-list-swipe--_ambient--invoker-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--invoker-bg-color,
      ${m("colorSecondarySurfaceAmbientDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--informative-bg-color,
      ${m("colorSecondaryCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-ambient--informative-bg-color-active,
      ${m("colorSecondaryCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--operative-bg-color,
      ${m("colorSecondaryCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-ambient--operative-bg-color-active,
      ${m("colorSecondaryCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--button-action-color: var(
      --bbva-list-swipe--custom--secondary-ambient--button-action-color,
      ${m("colorSecondaryCtaMainTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--button-action-warning-color: var(
      --bbva-list-swipe--custom--secondary-ambient--button-action-warning-color,
      ${m("colorSecondaryCtaNegativeTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--warning-bg-color,
      ${m("colorSecondaryCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-ambient--warning-bg-color-active,
      ${m("colorSecondaryCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--actions-item-operative-error-bg-color,
      ${m("colorSecondaryCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-active-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--actions-item-operative-error-active-bg-color,
      ${m("colorSecondaryCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-informative-quote-color: var(
      --bbva-list-swipe--custom--secondary-ambient--skeleton-informative-quote-color,
      ${m("colorSecondaryCtaMainTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-quote-color: var(
      --bbva-list-swipe--custom--secondary-ambient--skeleton-error-quote-color,
      ${m("colorSecondaryCtaNegativeTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-bg-color: var(
      --bbva-list-swipe--custom--secondary-ambient--skeleton-error-bg-color,
      ${m("colorSecondaryCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-operative-quote-color: var(
      --bbva-list-swipe--custom--secondary-ambient--skeleton-operative-quote-color,
      ${m("colorSecondaryCtaMainTextPreloading",p)}
    );
  }
`,y=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-list-swipe--_ambient--invoker-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--invoker-bg-color,
      ${m("colorSecondaryAltSurfaceAmbientDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--informative-bg-color,
      ${m("colorSecondaryAltCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--informative-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--informative-bg-color-active,
      ${m("colorSecondaryAltCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--operative-bg-color,
      ${m("colorSecondaryAltCtaMainBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--operative-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--operative-bg-color-active,
      ${m("colorSecondaryAltCtaMainBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--button-action-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--button-action-color,
      ${m("colorSecondaryAltCtaMainTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--button-action-warning-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--button-action-warning-color,
      ${m("colorSecondaryAltCtaNegativeTextDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--warning-bg-color,
      ${m("colorSecondaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--warning-bg-color-active: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--warning-bg-color-active,
      ${m("colorSecondaryAltCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--actions-item-operative-error-bg-color,
      ${m("colorSecondaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--actions-item-operative-error-active-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--actions-item-operative-error-active-bg-color,
      ${m("colorSecondaryAltCtaNegativeBackgroundPressed",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-informative-quote-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--skeleton-informative-quote-color,
      ${m("colorSecondaryAltCtaMainTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-quote-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--skeleton-error-quote-color,
      ${m("colorSecondaryAltCtaNegativeTextPreloading",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-error-bg-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--skeleton-error-bg-color,
      ${m("colorSecondaryAltCtaNegativeBackgroundDefault",p)}
    );
    --bbva-list-swipe--_ambient--skeleton-operative-quote-color: var(
      --bbva-list-swipe--custom--secondary-alt-ambient--skeleton-operative-quote-color,
      ${m("colorSecondaryAltCtaMainTextPreloading",p)}
    );
  }
`;const x=d([Object.freeze({__proto__:null,primary:_,primaryAlt:w,secondary:k,secondaryAlt:y}),g]),A=Object.values(x);var $=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: block;
  overflow: hidden;
  width: 100%;
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
  z-index: 1;
  top: 0;
  left: 0;
}
.left .sr-only {
  right: 4.0625rem;
  left: auto;
}

.invoker {
  position: relative;
  z-index: 1;
  width: 100%;
  background-color: var(--_list-swipe-invoker-bg-color);
  -webkit-touch-callout: none;
  transform: translate3d(var(--_translate), 0, 0);
  -webkit-user-select: none;
  user-select: none;
  will-change: transform;
}
.invoker.transition {
  transition: transform 0.2s;
}
.invoker:not(.not-translated).right {
  transform: translate3d(var(--_informative-width), 0, 0);
}
.invoker:not(.not-translated).right::before {
  position: absolute;
  z-index: 2;
  top: 0;
  left: 0;
  width: 3.5rem;
  height: 100%;
  background: linear-gradient(-90deg, rgba(2, 0, 36, 0) 0%, var(--_list-swipe-invoker-bg-color) 100%);
  content: "";
}
.invoker:not(.not-translated).left {
  transform: translate3d(var(--_operative-width), 0, 0);
}
.invoker:not(.not-translated).left::after {
  position: absolute;
  z-index: 2;
  top: 0;
  right: 0;
  width: 3.5rem;
  height: 100%;
  background: linear-gradient(90deg, rgba(2, 0, 36, 0) 0%, var(--_list-swipe-invoker-bg-color) 100%);
  content: "";
}

:host([focus-visible]) .invoker:focus {
  outline-offset: -0.0625rem;
}

:host(:not([loading])) ::slotted([slot=invoker]) {
  min-height: var(--bbva-list-swipe-min-height);
}

.actions-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}
.actions-wrapper [data-tag-name=bbva-button-action] {
  width: 5.5rem;
  max-width: none;
  justify-content: center;
  padding: 0.25rem 0.5rem;
  --bbva-button-action--_ambient--oval-background-color-active: transparent;
}
.actions-wrapper [data-tag-name=bbva-button-action][aria-disabled=true] {
  opacity: 1;
}

.actions {
  position: absolute;
  top: 0.0625rem;
  display: flex;
  height: 98%;
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
.actions-informative[warning] {
  background-color: var(--_list-swipe-warning-bg-color);
}
.actions-informative[warning][active] {
  background-color: var(--_list-swipe-warning-bg-color-active);
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
  display: flex;
  height: 100%;
  padding: 0;
  margin: 0;
}
.actions-item {
  display: flex;
  align-items: center;
  padding: 0;
  margin: 0;
}
.actions-item[warning] [data-tag-name=bbva-button-action] {
  --bbva-button-action--_ambient--color-active: var(--_list-swipe-button-action-warning-color);
  --bbva-button-action--_ambient--color: var(--_list-swipe-button-action-warning-color);
}
.actions-item [data-tag-name=bbva-button-action] {
  height: 100%;
  --bbva-button-action--_ambient--color-active: var(--_list-swipe-button-action-color);
  --bbva-button-action--_ambient--color: var(--_list-swipe-button-action-color);
}

:host([loading]) .skeleton {
  width: 5.5rem;
  height: 5rem;
}
:host([loading]) .actions-informative .actions-item {
  background: var(--_list-swipe-informative-bg-color);
}
:host([loading]) .actions-informative .actions-item .skeleton {
  background-color: var(--_list-swipe-skeleton-informative-quote-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 30px 15px, 12px 43px;
  mask-position: 30px 15px, 12px 43px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_list-swipe-informative-bg-color);
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
:host([loading]) .actions-informative .actions-item .skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_list-swipe-informative-bg-color);
  background-image: linear-gradient(var(--_list-swipe-skeleton-informative-quote-color) 100%, transparent 0);
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
:host([loading]) .actions-operative .actions-item {
  background: var(--_list-swipe-operative-bg-color);
}
:host([loading]) .actions-operative .actions-item .skeleton {
  background-color: var(--_list-swipe-skeleton-operative-quote-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 30px 16px, 12px 43px;
  mask-position: 30px 16px, 12px 43px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_list-swipe-operative-bg-color);
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
:host([loading]) .actions-operative .actions-item .skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_list-swipe-operative-bg-color);
  background-image: linear-gradient(var(--_list-swipe-skeleton-operative-quote-color) 100%, transparent 0);
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
:host([loading]) .actions-operative .actions-item[warning] .skeleton {
  background-color: var(--_list-swipe-skeleton-error-quote-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 30px 16px, 12px 43px;
  mask-position: 30px 16px, 12px 43px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  mask-size: 20px 20px, calc((55px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_list-swipe-skeleton-error-bg-color);
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
:host([loading]) .actions-operative .actions-item[warning] .skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_list-swipe-skeleton-error-bg-color);
  background-image: linear-gradient(var(--_list-swipe-skeleton-error-quote-color) 100%, transparent 0);
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

:host([loading][operative-warning]) .invoker .entity [data-tag-name=bbva-type-text] {
  color: var(--_list-swipe-skeleton-error-bg-color);
}
:host([loading][operative-warning]) .invoker .entity [data-tag-name=bbva-type-amount] {
  color: var(--_list-swipe-skeleton-error-bg-color);
}

:host([loading][operative-warning]) .actions-operative::after {
  background: var(--_list-swipe-skeleton-error-bg-color);
}

:host([loading][operative-warning]) .actions-operative::after,
:host([loading]) .actions-item[warning],
:host([loading]) .actions-item[warning] .skeleton::after {
  background-color: var(--_list-swipe-skeleton-error-bg-color);
}

:host([animate]:not([opening])) .invoker {
  transform: translate3d(initial, 0, 0);
  will-change: transform;
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
`;class P extends(i(h(e(a)))){static get is(){return"bbva-list-swipe"}static get scopedElements(){const t=[u];return P.scopedElementsFromClasses(t)}static get properties(){return{informativeActions:{type:Array,attribute:"informative-actions"},operativeActions:{type:Array,attribute:"operative-actions"},operativeWarning:{type:Boolean,attribute:"operative-warning"},threshold:{type:Number},iconSize:{type:Number,attribute:"icon-size"},opening:{type:String,reflect:!0},animate:{type:Boolean,reflect:!0},_hideTransition:{type:Boolean},_translate:{type:Number},_operativeWidth:{type:Number},_informativeWidth:{type:Number},_swipeDirectionRight:{type:Boolean},_swipeDirectionLeft:{type:Boolean},_opened:{type:Boolean},_textStatus:{type:String},_firstTime:{type:Boolean},loading:{type:Boolean}}}constructor(){super(),this.operativeActions=[],this.informativeActions=[],this.threshold=.4,this.iconSize=24,this._hideTransition=!1,this._translate=0,this._operativeWidth=0,this._informativeWidth=0,this._swipeDirectionRight=!1,this._swipeDirectionLeft=!1,this.operativeWarning=!1,this._opened=!1,this.animate=!1,this.loading=!1,this._accessibilityButtonActions="bbva-list-swipe-accessibility-button-actions",this._open="bbva-list-swipe-open",this._close="bbva-list-swipe-close",this._firstTime=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._invoker=this.shadowRoot.querySelector(".invoker"),this._srOnlySelector=this._invoker.querySelector(".sr-only"),o(this._invoker,"track",(t=>this._onTrack(t))),r(this._invoker,"pan-y")}updated(t){super.updated&&super.updated(t),this._informative=this.shadowRoot.querySelector(".actions-informative"),this._operative=this.shadowRoot.querySelector(".actions-operative"),this._informativeItems=this._informative.querySelectorAll('[data-tag-name="bbva-button-action"]'),this._operativeItems=this._operative.querySelectorAll('[data-tag-name="bbva-button-action"]'),requestAnimationFrame((()=>{this._informativeWidth=this._informative.offsetWidth,this._operativeWidth=this._operative.offsetWidth})),this._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}),this._defaultLeftOpened(),this._defaultRightOpened(),t.has("opening")&&this.opening&&(this._opened=!0,this._swipeDirectionRight="right"===this.opening,this._rightOpened(),this._leftOpened(),this._firstTime=!0),this._contextualTextManager(),this.opening||(this._informativeItems.length>0&&(P._hide(this._informative),this._informativeItems[0].blur()),this._operativeItems.length>0&&(P._hide(this._operative),this._operativeItems[0].blur())),(this.operativeActions.length>1||this.informativeActions.length>1&&0===this.operativeActions.length&&!this.opening)&&this._invoker.classList.add("large"),this.informativeActions.length>0&&0===this.operativeActions.length&&this._invoker.classList.add("informative")}static _show(t){n(t)&&t.removeAttribute("aria-hidden")}static _hide(t){n(t)&&t.setAttribute("aria-hidden","true")}_actionItemsState({informative:t,operative:i,tabindex1:e,tabindex2:a,ariadisabled1:o,ariadisabled2:r}){this.loading||(t.forEach((t=>{t.setAttribute("tabindex",e),t.setAttribute("aria-disabled",o)})),i.forEach((t=>{t.setAttribute("tabindex",a),t.setAttribute("aria-disabled",r)})))}static get styles(){return[s(".invoker:focus"),$,f,A,l("bbva-list-swipe-shared-styles")]}_defaultLeftOpened(){this._firstTime&&"left"===this.opening&&this._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:this.loading?"-1":"0",ariadisabled2:this.loading?"true":"false"})}_defaultRightOpened(){this._firstTime&&"right"===this.opening&&this._actionItemsState({informative:this._informativeItems,tabindex1:this.loading?"-1":"0",ariadisabled1:this.loading?"true":"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"})}_leftOpened(){"left"===this.opening&&this._opened&&this._operativeItems.length>0&&(P._show(this._operative),P._hide(this._informative),this._operativeItems[0].focus(),this._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:this.loading?"-1":"0",ariadisabled2:this.loading?"true":"false"}))}_rightOpened(){"right"===this.opening&&this._opened&&this._informativeItems.length>0&&(P._show(this._informative),P._hide(this._operative),this._informativeItems[0].focus(),this._actionItemsState({informative:this._informativeItems,tabindex1:this.loading?"-1":"0",ariadisabled1:this.loading?"true":"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}))}_contextualTextManager(){this._opened?this._textStatus=this.t(this._close):this._textStatus=this.t(this._open)}render(){const t={"--_translate":`${this._translate}px`,"--_operative-width":-1*this._operativeWidth+"px","--_informative-width":`${this._informativeWidth}px`},i={transition:!this._hideTransition,right:"right"===this.opening,left:"left"===this.opening},e={"right-dir":this._swipeDirectionRight,opened:this._opened};return c`
      <div
        class="invoker ${b(i)}"
        style="${v(t)}"
        @transitionend="${this._onInvokerTransitionEnd}"
        @animationend="${this._onInvokerAnimationEnd}"
        @keydown="${this._onInvokerKeydown}"
        tabindex="0"
      >
        <div class="container-slot">
          <slot name="invoker"></slot>
          ${this.informativeActions.length>0||this.operativeActions.length>0?c`<span class="sr-only"
                >${this.t(this._accessibilityButtonActions,{status:this._textStatus})}</span
              >`:""}
        </div>
      </div>
      <div class="actions-wrapper ${b(e)}">
        <div class="actions actions-informative">
          ${this.informativeActions.length?c`
                <div class="actions-list" role="list">
                  ${this.informativeActions.map(((t,i)=>i<2?this._actionItems(t,i,"informative"):""))}
                </div>
              `:""}
        </div>

        <div class="actions actions-operative">
          ${this.operativeActions.length?c`
                <div class="actions-list" role="list">
                  ${this.operativeActions.map(((t,i)=>this.operativeWarning&&i<2||i<3?this._actionItems(t,i,"operative",this.operativeWarning):""))}
                </div>
              `:""}
        </div>
      </div>
    `}_actionItems(t,i,e,a){return c`
      <div role="listitem" class="actions-item" ?warning="${t.warning||a}">
        ${this.loading?c`<div class="skeleton"></div>`:c`
              <bbva-button-action
                .icon="${t.icon}"
                .appPayIcon="${t.appPayIcon}"
                .iconSize="${this.iconSize}"
                .label="${t.label}"
                @click="${()=>this._onActionClick(t,i,e)}"
              ></bbva-button-action>
            `}
      </div>
    `}_onTrack(t){var i;if(null!=t&&null!==(i=t.detail)&&void 0!==i&&i.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dx);break;default:this._trackX(t.detail.dx)}}_trackStart(){this.setAttribute("dragging",""),this._invokerWidth=this._invoker.offsetWidth,this._opened=!0,this._operativeWidth=this._operative.offsetWidth,this._informativeWidth=this._informative.offsetWidth,this._setTrackReferences(this.opening),this.opening="",this._translate=this._startingPoint,this._hideTransition=!0}_setTrackReferences(t){return"right"===t?(this._rightLimit=0,this._leftLimit=0-this._operativeWidth-this._informativeWidth,this._leftThreshold=0-this._informativeWidth-this._operativeWidth*this.threshold,this._rightThreshold=0-this._informativeWidth*this.threshold,this._startingPoint=this._informativeWidth,void(this._midThreshold=-1*this._informativeWidth)):"left"===t?(this._rightLimit=this._informativeWidth+this._operativeWidth,this._leftLimit=0,this._leftThreshold=this._operativeWidth*this.threshold,this._rightThreshold=this._operativeWidth+this._informativeWidth*this.threshold,this._startingPoint=-1*this._operativeWidth,void(this._midThreshold=this._operativeWidth)):(this._rightLimit=this._informativeWidth,this._leftLimit=0-this._operativeWidth,this._leftThreshold=0-this._operativeWidth*this.threshold,this._rightThreshold=this._informativeWidth*this.threshold,this._startingPoint=0,void(this._midThreshold=0))}_trackX(t){this._translate=this._startingPoint+Math.max(this._leftLimit,Math.min(t,this._rightLimit)),this._swipeDirectionRight=t>=this._midThreshold}_trackEnd(t){this.removeAttribute("dragging",""),this._swipeDirectionRight=t>=this._midThreshold,this._hideTransition=!1,0===this._translate&&""!==this.opening?this._invoker.classList.add("not-translated"):this._invoker.classList.remove("not-translated"),this._translate=0,t<this._leftThreshold?(this.operativeActions.length>0||this.operativeWarning.length>0)&&(this.opening="left",this._invokerTrackOpening()):t>this._rightThreshold?this.informativeActions.length>0&&(this.opening="right",this._invokerTrackOpening()):this.opening=""}_invokerTrackOpening(){this.dispatchEvent(new CustomEvent(`bbva-list-swipe-track-${this.opening}`,{detail:this,bubbles:!0,composed:!0}))}_onInvokerTransitionEnd(){this.opening||(this._opened=!1,this._swipeDirectionRight=!1),this.dispatchEvent(new CustomEvent("bbva-list-swipe-end-transition",{detail:this,bubbles:!0,composed:!0}))}_onInvokerAnimationEnd(){this.dispatchEvent(new CustomEvent("bbva-list-swipe-animation-end"))}_onActionClick(t,i,e){this.dispatchEvent(new CustomEvent("list-swipe-action-click",{detail:{item:t,index:i,type:e},bubbles:!0,composed:!0}))}_onInvokerKeydown(t){t.composedPath()[0]===this._invoker&&("arrowright"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("right")),"arrowleft"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("left")))}_moveInvoker(t){const i=this.opening;if(t===i)return;let e;this._trackStart(),"right"===t&&(e="left"===i?this._operativeWidth-1:this._rightLimit),"left"===t&&(e="right"===i?0-this._informativeWidth+1:this._leftLimit),this._trackEnd(e)}}export{P as B,x as b};
